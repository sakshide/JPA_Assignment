package com.cg.jpaauthor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Author20")
public class Author20 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	
	private int id;
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_author", joinColumns = { @JoinColumn(name = "author_id") }, inverseJoinColumns = { @JoinColumn(name = "book_isbn") })
	private Set<Book20> Book = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book20> getBook() {
		return Book;
	}

	public void setBook(Set<Book20> book) {
		Book = book;
	}

	public void addBook(Book20 book) {
		// TODO Auto-generated method stub
		this.getBook().add(book);
	}
	
	
}
