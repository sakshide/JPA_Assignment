package com.cg.jpaauthor.service;

import com.cg.jpaauthor.entities.AuthorDetails;



public interface AuthorService {

		public abstract void addAuthor(AuthorDetails author);

		public abstract void updateAuthor(AuthorDetails author);

		public abstract void removeAuthor(AuthorDetails author);

		public abstract AuthorDetails findAuthorById(int id);

	}
