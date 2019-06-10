package com.cg.jpaauthor.dao;

import javax.persistence.EntityManager;

import com.cg.jpaauthor.entities.AuthorDetails;

public class AuthorDaoImpl implements AuthorDao {

	private EntityManager entityManager;

	public AuthorDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public AuthorDetails getAuthorById(int id) {
		// TODO Auto-generated method stub
		AuthorDetails author = entityManager.find(AuthorDetails.class, id);
		return author;
	}

	@Override
	public void addAuthor(AuthorDetails author) {
		// TODO Auto-generated method stub
		entityManager.persist(author);
		
	}

	@Override
	public void removeAuthor(AuthorDetails author) {
		// TODO Auto-generated method stub
		entityManager.remove(author);
		
	}

	@Override
	public void updateAuthor(AuthorDetails author) {
		// TODO Auto-generated method stub
		entityManager.merge(author);
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
	}

}
