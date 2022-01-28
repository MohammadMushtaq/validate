package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.transaction.Transaction;


import com.xworkz.util.SingletonEMFUtil;
import com.xworkz.vendor.entity.VendorEntity;
import javax.persistence.Query;

public class VendorDAOImpl implements VendorDAO{

	@Override
	public void save(VendorEntity vendorEntity) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(vendorEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}
		
	}

	@Override
	public boolean validateAndLogin(String loginName, String password) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			
			Query query = entityManager.createNamedQuery("validateAndLogin");
					
			query.setParameter("name", loginName);
			query.setParameter("pass", password);
			
			 Object obj= query.getSingleResult();
			
			if(obj!= null) {
				
				return true;
			}
			
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		
		} finally {
			entityManager.close();
		}
		return false;
	}

	@Override
	public boolean validateByEmail(String email) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			
			Query query = entityManager.createNamedQuery("validateByeEmail");
					
			query.setParameter("email", email);
	
			 Object obj= query.getSingleResult();
			
			if(obj!= null) {
				
				return true;
			}
						
		} catch (PersistenceException e) {
			e.printStackTrace();
		
		} finally {
			entityManager.close();
		}
		return false;
	}

	@Override
	public void updatePasswordByEmail(String email, String password) {
		
		
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			
			entityManager.getTransaction().begin();	
			
			Query query = entityManager.createNamedQuery("updatePasswordByEmail");
			
			query.setParameter("email", email);
			query.setParameter("pass", password);
			Object o= query.executeUpdate();
			
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}	
	}
}
