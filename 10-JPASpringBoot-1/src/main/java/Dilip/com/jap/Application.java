package Dilip.com.jap;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Dilip.com.jap.Repo.PlayerRepository;
import Dilip.com.jap.entity.Player;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		PlayerRepository plyer = context.getBean(PlayerRepository.class);
//		System.out.println(plyer.getClass().getName());

		Player p2 = new Player();
		p2.setPly_id(104);
		p2.setPly_Name("Gopal");
		p2.setPly_Age(25);
		p2.setLocation("Parbhani");

		Player p3 = new Player();
		p3.setPly_id(103);
		p3.setPly_Name("Vaishanavi");
		p3.setPly_Age(23);
		p3.setLocation("Nagpur");

//		plyer.saveAll(p1);  // Upsert method
		plyer.saveAll(List.of(p2, p3));
		System.out.println("data inserted.....");

	}

}
