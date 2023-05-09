package com.dlx.onemediapieceservlet.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.dlx.onemediapieceservlet.outils.EntityManagerSingleton;

public abstract class AbstractDao<T> implements Dao<T> {
	
	private   EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();
	
	public List<T> findAll(ArrayList<T> list){
		return this.em.createQuery("Select t FROM "+getTableName()+"t").getResultList();
		
	}
	
	public T find(long id) {
	
		return this.em.find(getClassName(), id);
	}
	
	public T save(T t) {
		
		try {
			this.em.getTransaction().begin();
			
			this.em.persist(t);
			
			this.em.getTransaction().commit();
			
			return t;
		} catch (Throwable e) {
			
			this.em.getTransaction().rollback();
			
			throw e;
		}
		
		
		
	}
	
	
	public T delete(T t) {
		
		try {
			this.em.getTransaction().begin();
			
			this.em.remove(t);
			
			this.em.getTransaction().commit();
			
			return t;
		} catch (Throwable e) {
			
			this.em.getTransaction().rollback();
			
			throw e;
		}
		
		
	}
	
	public T update(T t) {
		
		try {
			this.em.getTransaction().begin();
			
			this.em.merge(t);
			
			this.em.getTransaction().commit();
			
			return t;
		} catch (Throwable e) {
			
			this.em.getTransaction().rollback();
			
			throw e;
		}
		
	}
	
	public abstract String getTableName();
	
	public abstract Class<T> getClassName();

	
}
