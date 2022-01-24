package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonEMFUtil {

	public static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

static {
	System.out.println("entry of emf");
	entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz.tourist");
	System.out.println("adding in the db");
}
}
