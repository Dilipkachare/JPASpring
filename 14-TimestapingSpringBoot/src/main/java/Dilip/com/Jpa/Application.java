package Dilip.com.Jpa;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Dilip.com.Jpa.Repository.plyerRepo;
import Dilip.com.Jpa.entity.plyer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		
	  plyerRepo repository =context.getBean(plyerRepo.class);
	  plyer p1=new plyer();
	 
	  p1.setName("Ganbhir");
	  p1.setGame("Cricket");
	  p1.setAge(38);
	  p1.setCountry("India");
	  repository.save(p1);
	  
	  plyer p2=new plyer();
	 
	  p2.setName("Rohit");
	  p2.setGame("Cricket");
	  p2.setAge(35);
	  p2.setCountry("India");
	  repository.save(p2);
	  
	  List<plyer> plyers= repository.findAll();	 
	  for (plyer p : plyers) {
		System.out.println(p);
		
		  plyer p3=new plyer();
		  p3.setName("Dilip");
		  p3.setGame("Cricket");
		  p3.setAge(31);
		  p3.setCountry("India");
		  repository.save(p3);
	}
	  
	}

}
