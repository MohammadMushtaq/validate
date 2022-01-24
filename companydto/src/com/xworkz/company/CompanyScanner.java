package com.xworkz.company;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyDAOImplements;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyScanner {

	public static void main(String[] args) {

		CompanyEntity companyEntity = new CompanyEntity();
		
		companyEntity.setId(1);
		companyEntity.setName("Google");
		companyEntity.setType("MNC");
		companyEntity.setDomain("software");
		companyEntity.setWebsite("www.google.com");
		
		CompanyDAO companyDAO = new CompanyDAOImplements();
		
		companyDAO.create(companyEntity);

	}

}
