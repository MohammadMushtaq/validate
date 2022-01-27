package com.xworkz.vendor.service;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorServiceImpl implements VendorService{
private VendorDAO dao;

public VendorServiceImpl(VendorDAO dao) {
	this.dao= dao;
}
	
	@Override
	public boolean validateAndSave(VendorEntity entity) {
		boolean valid=false;
		
		if(entity.getName()!=null &&entity.getName().length()>4 
				&& entity.getName().length()<30) {
			valid=true;
		}else {System.out.println("invalid name");
		System.out.println("name should >4&<30");
		return false;
		}
		if(entity.getEmail()!=null && entity.getEmail().isEmpty() &&entity.getEmail().contains("@")||entity.getEmail().contains(".com")||entity.getEmail().contains(".org")){
			valid = true;
		}else {System.out.println("invalid email");
		System.out.println("must contain @/.com/.org/.in");
		return false;
		}
		if(entity.getLoginName()!=null && entity.getLoginName().length()>=8 && entity.getLoginName().length()<=12) {
			valid = true;
		}
		else {
			System.out.println("not valid login name");
			System.out.println("must be >8&<12");
			return false;
		}
		if(entity.getPassword()!=null && entity.getPassword().length()>=5 && entity.getPassword().length()<=13) {
			valid= true;
		}
		else {
			System.out.println("invalid password name");
			System.out.println("must be >5&<13");
			return false;
		}
		if(entity.getAddress()!=null && entity.getAddress().length()>=5 && entity.getAddress().length()<=55) {
			valid= true;
		}
		else {
			System.out.println("invalid address");
			System.out.println("must be >5&<55");
			return false;
		}
		if(entity.getGstNo()!=null && entity.getGstNo().length()>12 &&entity.getGstNo().length()<14) {
			valid= true;
		}
		else {
			System.out.println("invalid gstno");
			System.out.println("must be = 13");
			return false;
		}
		if(entity.getCreatedBy()!=null && entity.getCreatedBy().length()>3 && entity.getCreatedBy().length()<=13) {
			valid= true;
		}
		else {
			System.out.println("invalid name");
			System.out.println("must be > 3 & < 13");
			return false;
		}
		if(entity.getCreatedAt()!=null) {
			valid= true;
		}
		else {
			System.out.println("invalid c ");
			return false;
		}
//		if(entity.getUpdatedby()!=null && entity.getUpdatedby().length()>3 && entity.getUpdatedby().length()<=13) {
//			valid= true;
//		}
//		else {
//			System.out.println("invalid name");
//			System.out.println("must be > 3 & < 13");
//			return false;
//		}
//		if(entity.getUpdatedAt()!=null) {
//			valid= true;
//		}
//		else {
//			System.out.println("invalid ");
//			return false;
//		}
		if(valid)dao.save(entity);
		valid=true;
		
		return false;
	}
	
	

}
