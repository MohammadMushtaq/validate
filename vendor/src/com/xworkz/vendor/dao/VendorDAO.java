package com.xworkz.vendor.dao;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorDAO {

	void save(VendorEntity vendorEntity);

	boolean validateAndLogin(String loginName,String password);
	boolean validateByEmail(String email);
	void updatePasswordByEmail(String email , String password);
	
}
