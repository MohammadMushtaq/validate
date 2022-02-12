package pharmacy.bean.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDirectory {

	public static void main(String[] args) {
		
		ApplicationContext spring= new ClassPathXmlApplicationContext("resource/spring1.xml");
		Charger ch= spring.getBean(Charger.class);
		
		
		System.out.println(ch.getVolts());
		System.out.println(ch.getColor());
		System.out.println(ch.isWorking());
		
		SolarWaterHeater sp= spring.getBean(SolarWaterHeater.class);
		
		System.out.println(sp.getBrand());
		System.out.println(sp.getCapacity());
		System.out.println(sp.getPrice());
		System.out.println(sp.isColdWater());
		
		ToothPaste toothPaste= spring.getBean(ToothPaste.class);
		System.out.println(toothPaste.isSalt());
		System.out.println(toothPaste.getBrandAmbassodor());
		
		
		Ups ups= spring.getBean(Ups.class);
		System.out.println(ups.getBackUpHour());
		System.out.println(ups.getChargeHour());
		System.out.println(ups.getCompany());
		System.out.println(ups.getType());
		System.out.println(ups.getWeight());
		
	}
}
