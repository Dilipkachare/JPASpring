package Dilip.com.Jpa;



import java.time.chrono.AbstractChronology;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Dilip.com.Jpa.Dao.PlayerRepo;
import Dilip.com.Jpa.Entity.Athletes;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		
		PlayerRepo athlets= context.getBean(PlayerRepo.class);
		
		Athletes p1=new Athletes(101 , "Ms. Dhoni" , "Cricket" , 41 , "India");
		athlets.save(p1);
		Athletes p2=new Athletes(102 , "Jaisawal" , "Cricket" , 20 , "India");
		Athletes p3=new Athletes(103 , "Buttler" , "Cricket" , 35 , "Englend");
		Athletes p4=new Athletes(104 , "Ronaldo" , "Foot-Ball" , 30 , "America");
		Athletes p5=new Athletes(105 , "messi" , "Foot-Ball" , 32 , "USA");
		Athletes p6=new Athletes(106 , "decock" , "Cricket" , 35 , "South-Afrrica");
		Athletes p7=new Athletes(107 , "Kohali" , "Cricket" , 36 , "India");
		Athletes p8=new Athletes(108 , "Dev" , "Kabbadi" , 25 , "USA");
		Athletes p9=new Athletes(109 , "Markram" , "Cricket" , 35, "South-Africa");
		Athletes p10=new Athletes(110 , "R. Sharama" , "Cricket" , 45, "India");
		
		athlets.saveAll(Arrays.asList(p2 , p3 ,p4 ,p5  ,p6 ,p7 , p8 ,p9 , p10));
		


		List<Athletes> plyr=athlets.findAll();
		for( Athletes tabledata : plyr) {
			System.out.println(tabledata);
		}
	}

}
