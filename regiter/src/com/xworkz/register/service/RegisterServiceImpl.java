package com.xworkz.register.service;

import com.xworkz.register.dao.RegisterDao;
import com.xworkz.register.entity.RegisterEntity;

public class RegisterServiceImpl implements RegisterService{

	private RegisterDao dao ;
	public RegisterServiceImpl(RegisterDao dao) {
		this.dao= dao;
	} 
	
	@Override
	public boolean validateAndSave(RegisterEntity entity) {
		try {
			boolean valid = true;
			
			if(entity.getUserName()!=null&&entity.getUserName().length()>4 &&
					entity.getUserName().length()<=25) {
				valid=true;
			}else {
				System.out.println("username is wrong");
				System.out.println("must be >4&<25");
				
				return false;
			}
			if(entity.getEmail()!=null&&entity.getEmail().length()>6 &&
					entity.getEmail().length()<=25) {
				valid=true;
			}else {
				System.out.println("email is wrong");
				System.out.println("must be >6&<25");
				return false;
			}
			if(entity.getPassword()!=null&&entity.getPassword().length()>=8 &&
					entity.getPassword().length()<=36) {
				valid=true;
			}else {
				System.out.println("password is wrong");
				System.out.println("must be >6&<36");
				return false;
			}if(entity.getMobileNo()!=0 &&String.valueOf(entity.getMobileNo()).length()==10) {
				valid=true;
			}else {
				System.out.println("mobile num is wrong");
				System.out.println("must be 10 digit");
				return false;
			}
			if(entity.getCity()!=null&&entity.getCity().length()>6 &&
					entity.getCity().length()<=25) {
				valid=true;
			}else {
				System.out.println("city is wrong");
				System.out.println("must be >6&<25");
				return false;
			}if(entity.getCountry()!=null&&entity.getCountry().length()>3 &&
					entity.getUserName().length()<=56) {
				valid=true;
			}else {
				System.out.println("country is wrong");
				System.out.println("must be >3&<56");
				return false;
			}
			if(valid)dao.save(entity);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

}
