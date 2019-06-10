package com.cg.jpaauthor.client;

import java.util.Scanner;

import com.cg.jpaauthor.entities.AuthorDetails;
import com.cg.jpaauthor.service.AuthorService;
import com.cg.jpaauthor.service.AuthorServiceImpl;

public class Main {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		int choice = 0;
		AuthorService service = new AuthorServiceImpl();
		//Debug this program as Debug -> Debug as Java Application
		try(Scanner sc = new Scanner(System.in))
		{
			int id;
			String fname,lname,mname;
			long phone;
			do
				
			{
				System.out.println("1-Add Author : ");
				System.out.println("2-Update Author: ");
				System.out.println("3-Remove Author");
				System.out.println("Enter choice : ");
				choice = sc.nextInt();
				
				switch(choice)
				{
				case 1 : 
					
					System.out.println("enter Firstname");
					fname = sc.next();
					System.out.println("enter Middlename");
					mname = sc.next();
					System.out.println("enter Lastname");
					lname = sc.next();
					System.out.println("enter Phone");
					phone = sc.nextLong();
					AuthorDetails author = new AuthorDetails();
					author.setFirstName(fname);
					author.setMiddleName(mname);
					author.setLastName(lname);
					author.setPhoneNo(phone);
					service.addAuthor(author);
					break;
				case 2 : 
					System.out.println("enter Id to update");
					id = sc.nextInt();
					AuthorDetails authorUpdate;
					authorUpdate = service.findAuthorById(id);
					if(authorUpdate == null)
					{
						System.out.println("Author with Id " + id + " is missing ");
					}
					else
					{
						System.out.println("Enter Phone");
						phone = sc.nextLong();
						authorUpdate.setPhoneNo(phone);
						service.updateAuthor(authorUpdate);
						System.out.println("Update Successfull...");
					}
					break;
				case 3 : 
					System.out.println("enter Id to delete");
					id = sc.nextInt();
					AuthorDetails authorDelete;
					authorDelete = service.findAuthorById(id);
					if(authorDelete == null)
					{
						System.out.println("Author with Id " + id + " is missing ");
					}
					else
					{
						service.removeAuthor(authorDelete);
						System.out.println("Delete Successfull...");
					}
					break;
				
				}
				System.out.println("Do you want to continue 1-yes 0-No");
				choice = sc.nextInt();
			}while(choice != 0);
		}
		
	
		
		
		System.out.println("End of program...");
		
	}
}
