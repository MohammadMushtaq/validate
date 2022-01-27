package com.xworkz.register.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.register.entity.RegisterEntity;
import com.xworkz.util.SingletonEMFUtil;

public class RegeisterDAOImpl implements RegisterDao{

	@Override
	public void save(RegisterEntity entity) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}
		
	}

}
