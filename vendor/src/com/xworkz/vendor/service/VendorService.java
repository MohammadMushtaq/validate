package com.xworkz.vendor.service;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorService {

	boolean validateAndSave(VendorEntity entity);
	
	boolean validateLoginAndPassword(String loginName,String password);
	
		void validateEmailAndChangePassword(String email,String newPassword);
}

