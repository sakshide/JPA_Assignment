package com.cg.jpaauthor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Book20")
public class Book20 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int isbn;

	private String title;
	private double price;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "Book")
	private Set<Author20> author = new HashSet<>();

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Author20> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author20> author) {
		this.author = author;
	}

}
