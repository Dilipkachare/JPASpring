package Dilip.com.firstSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SendMailAppStart implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Application is started to send the mail....");
	}
	

}
