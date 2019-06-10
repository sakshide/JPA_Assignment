package com.cg.jpaauthor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		Book20 AutoBiography = new Book20();
		AutoBiography.setIsbn(18);
		AutoBiography.setTitle("abcd");
		AutoBiography.setPrice(250.50);

		 Book20 Philosopy = new Book20();
		 Philosopy.setIsbn(11);
		 Philosopy.setTitle("efgh");
		 Philosopy.setPrice(520.50);
		
		 Book20 Fiction = new Book20();
		 Fiction.setIsbn(3);
		 Fiction.setTitle("ijkl");
		 Fiction.setPrice(350.50);

		Author20 auth1 = new Author20();
		auth1.setId(210);
		auth1.addBook(AutoBiography);
		 auth1.addBook(Philosopy);
		 auth1.addBook(Fiction);
		
		 Author20 auth2 = new Author20();
		 auth2.setId(201);
		 auth2.addBook(Philosopy);
		 auth2.addBook(Fiction);
		 auth2.addBook(AutoBiography);

		em.persist(auth1);
		 em.persist(auth2);

		System.out
				.println("Added Author along with Author details to database.");

		transaction.commit();
		em.close();
		factory.close();
	}
}
