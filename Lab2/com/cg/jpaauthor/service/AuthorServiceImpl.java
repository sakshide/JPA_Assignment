package com.cg.jpaauthor.service;

import com.cg.jpaauthor.dao.AuthorDao;
import com.cg.jpaauthor.dao.AuthorDaoImpl;

import com.cg.jpaauthor.entities.AuthorDetails;

public class AuthorServiceImpl implements AuthorService {

	private AuthorDao dao;

	public AuthorServiceImpl() {
		dao = new AuthorDaoImpl();
	}

	@Override
	public void addAuthor(AuthorDetails author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public AuthorDetails findAuthorById(int id) {
		// no need of transaction, as it's an read operation
		AuthorDetails author = dao.getAuthorById(id);
		return author;
	}

	@Override
	public void updateAuthor(AuthorDetails author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();

	}

	@Override
	public void removeAuthor(AuthorDetails author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();

	}
}
