package Dilip.com.firstSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Dilip.com.Spring.enity.AccountsPk;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Table;

@Component
public class SendMailAppStart implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Application is started to send the mail....");

		@Table(name = "BANK_ACCOUNTS")
		public class Account {

			@Column(name = "BRANCH_NAME")
			private String branchName;

			@Column(name = "MIN_BAL")
			private Double minBal;

			@EmbeddedId
			private AccountsPk accPk;

	}
	

}
