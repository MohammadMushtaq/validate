package com.xworkz.company.dao;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import com.xworkz.company.entity.CompanyEntity;

public class CompanyDAOImplements implements CompanyDAO{

	@Override
	public void create(CompanyEntity entity) {
		System.out.println("invoked create dao method");
		
		System.out.println(entity);
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CompanyEntity.class);
		SessionFactory factory= configuration.buildSessionFactory();
		if(factory!=null) {
			Session session = factory.openSession();
			Transaction trans= session.beginTransaction();
			session.save(entity);
			 trans.commit();
			 session.close();			
		}
		 factory.close();
	}
	
	

}
