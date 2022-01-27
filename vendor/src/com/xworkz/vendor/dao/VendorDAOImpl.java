package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.transaction.Transaction;

import com.xworkz.util.SingletonEMFUtil;
import com.xworkz.vendor.entity.VendorEntity;

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
	

}
