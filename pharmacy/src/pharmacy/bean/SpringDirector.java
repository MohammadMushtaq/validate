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
		int name=stringPath.hashCode();
		System.out.println(name);
		
		Tablet tab = spring.getBean("tablet",Tablet.class);
		tab.cure();
		Tablet tab1 = spring.getBean("tablet1",Tablet.class);
		tab1.preventvirus();
		
		Purifier pu= spring.getBean(Purifier.class);
		pu.cleanWater();
		
		Purifier pu1= spring.getBean(Purifier.class);
		pu1.cleargems();
				 
	}

}
