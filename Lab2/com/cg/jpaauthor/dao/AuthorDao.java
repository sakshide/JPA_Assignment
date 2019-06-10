package com.cg.jpaauthor.dao;

import com.cg.jpaauthor.entities.AuthorDetails;


public interface AuthorDao {

		public abstract AuthorDetails getAuthorById(int id);

		public abstract void addAuthor(AuthorDetails author);

		public abstract void removeAuthor(AuthorDetails author);

		public abstract void updateAuthor(AuthorDetails author);

		public abstract void commitTransaction();

		public abstract void beginTransaction();

}
