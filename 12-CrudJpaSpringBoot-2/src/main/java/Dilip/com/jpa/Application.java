package Dilip.com.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Dilip.com.jpa.Repo.Cricket;
import Dilip.com.jpa.entity.Team;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);


		Cricket cric1 = context.getBean(Cricket.class);

		Team a1 = new Team(01, "RCB", "Nitin", " Banglore");
		cric1.save(a1);
		Team a2 = new Team(02, "MI", "Ambani", "Mumbai");
		Team a3 = new Team(03, "CSK", "Dilip", "Chenni");
		Team a4 = new Team(04, "SRH", "Krushna", "Hyderabad");
		Team a5 = new Team(05, "Pune", "Ambani", "Mumbai");
		Team a6 = new Team(06, "MI@", "Nitin", "Chenni");
		Team a7 = new Team(07, "SRH@", "Om", "Hyderabad");
		 cric1.saveAll(Arrays.asList(a2 , a3 , a4 , a5 ,a6 , a7));
		 

		List<Team> teams = cric1.getAllTeamHql();

		teams.forEach(Team -> {
			System.out.println(Team);
		});

		System.out.println("*******************************************************");

		List<Team> tims = cric1.getAllTeamSql();
		tims.forEach(Team -> {
			System.out.println(Team);
		});
		
		System.out.println("*******************************************************");
		
        List<Team> ownerTeams = cric1.getTeamByOwner("Nitin");
        ownerTeams.forEach(Team -> {
			System.out.println(Team);
		});
        
		System.out.println("*******************************************************");

        List<Team> teamsCity= cric1.getAllTeamsByNameAndCity("RCB", "Hyderabad");
        teamsCity.forEach(Team ->{
        	System.out.println(Team);
        });
		


	}

}
