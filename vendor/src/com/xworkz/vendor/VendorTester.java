package com.xworkz.vendor;

import java.time.LocalDateTime;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.dao.VendorDAOImpl;
import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImpl;

public class VendorTester {

	public static void main(String[] args) {

		VendorEntity vendorEntity = new VendorEntity("arifas", "arif@gmail.com", "mohamaadarif", "arif@123", "ward no 34 bellary", "1234567891234","mushtaq", LocalDateTime.now());
		VendorEntity vendorEntity1 = new VendorEntity("anilreddy", "anil@gmail.org", "anil kumar", "anil453", "h.no 54 bangalore", "ASF56789123FH","mushtaq", LocalDateTime.now());
		VendorEntity vendorEntity2 = new VendorEntity("krishna", "krishna@gmail.com", "krishnamraju", "krish@124", "street no -34 devinagar hospet", "BDF56789123Gk","ahamad", LocalDateTime.now());
		VendorEntity vendorEntity3 = new VendorEntity("mishra", "mishra@.org", "mishra babu", "mishra@653", "islampur old hubli", "NSO56789123JT","prashant", LocalDateTime.now());
		VendorEntity vendorEntity4 = new VendorEntity("vamshi", "vamshik@gmail.com", "vamshikrishn", "vasmi@456", "h.no4 ward 42 belguam", "GTR56789123ID","mushtaq", LocalDateTime.now());

		VendorDAO vendorDAO = new VendorDAOImpl();
		
		VendorService vendorService = new VendorServiceImpl(vendorDAO);
		vendorService.validateAndSave(vendorEntity4);
		
	}

}
