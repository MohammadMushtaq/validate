package pharmacy.bean;


import java.awt.dnd.DragGestureEvent;
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
		
		Purifier pu= spring.getBean("purifier", Purifier.class);
		pu.cleanWater();
		
		Purifier pu1= spring.getBean("purifier1", Purifier.class);
		pu1.cleargems();
		
		Steamer steamer = spring.getBean("steamer", Steamer.class);
		steamer.nobalize();
		
		Steamer steamer1 = spring.getBean("steamer1", Steamer.class);
		steamer1.nobalizerWorking();
		
		Tissue tissue = spring.getBean("tissue",Tissue.class);
		tissue.clean();
		
		Tissue tissue1 = spring.getBean("tissue1",Tissue.class);
		tissue1.removedirt();
		
		Oximeter oximeter = spring.getBean("oximeter",Oximeter.class);
		oximeter.detectVirus();
		
		Oximeter oximeter1 = spring.getBean("oximeter1",Oximeter.class);
		oximeter1.oximeterWorking();
		
		Paint paint = spring.getBean("paint",Paint.class);
		paint.coloring();
		
		Paint paint1 = spring.getBean("paint1",Paint.class);
		paint1.painting();
		
		Sanitizer sanitizer = spring.getBean("sanitizer",Sanitizer.class);
		sanitizer.killgems();
		
		Sanitizer sanitizer1 = spring.getBean("sanitizer1",Sanitizer.class);
		sanitizer1.purify();
		
		Mask mask= spring.getBean("mask",Mask.class);
		mask.preventDust();
		
		Mask mask1= spring.getBean("mask1",Mask.class);
		mask1.protect();
		
		Juice juice = spring.getBean("juice",Juice.class);
		juice.drink();
		
		Juice juice1 = spring.getBean("juice",Juice.class);
		juice1.giveEnergy();
		
				 
	}

}
