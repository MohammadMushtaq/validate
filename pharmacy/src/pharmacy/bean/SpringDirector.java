package pharmacy.bean;


import java.util.Locale;

import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDirector {
	
	
	public static void main(String[] args) {
		
		String xmlFilePath="resource/spring.xml";
	
		
		ApplicationContext spring= new ClassPathXmlApplicationContext(xmlFilePath);
		
		 Laptop path= spring.getBean(Laptop.class);
		// path.start();
		 
		 Doctor doctorpath = spring.getBean(Doctor.class);
		// doctorpath.treat();
		 
		 Corona coronaPath = spring.getBean(Corona.class);
		//  coronaPath.happy();
		  
		 Minister minister = spring.getBean(Minister.class);
		// minister.corruption();
		 
			
		String  stringPath = spring.getBean(String.class);
		Locale TEAM = new Locale("upper");
		System.out.println(stringPath.toUpperCase(TEAM));
		
		
//		Integer i= 7;
//		Integer in= spring.getBean(Integer.class);
//		System.out.println(i.toString());
//		
//		Boolean b=true;
//		Boolean b1=spring.getBean(Boolean.class);
//		
				 
	}

}
