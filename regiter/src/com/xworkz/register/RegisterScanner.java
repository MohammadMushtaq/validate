package com.xworkz.register;


import com.xworkz.register.dao.RegeisterDAOImpl;
import com.xworkz.register.dao.RegisterDao;
import com.xworkz.register.entity.RegisterEntity;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;

public class RegisterScanner {

	public static void main(String[] args) {
		
		RegisterEntity registerEntity = new RegisterEntity("Md Mushtaq", "mushtaq.xworkz@gmail.com", "mush@123", "bangalore", "india", 9448766667l, true);
		RegisterEntity registerEntity1 = new RegisterEntity("naveen", "naveen.xworkz@gmail.com", null, "bangalore", "india", 9448766667l, true);

		
		RegisterDao dao = new RegeisterDAOImpl();
		
		RegisterService registerService = new RegisterServiceImpl(dao);
		registerService.validateAndSave(registerEntity);
		
	}
}
