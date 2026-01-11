package Dilip.com.appliacation;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Dilip.com.appliacation.Service.EmployeeService;
import Dilip.com.appliacation.Service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		
		/*
		 * UserService userService= context.getBean(UserService.class);
		 * userService.saveUser();
		 */
		EmployeeService employeeService= context.getBean(EmployeeService.class);
		employeeService.saveData();
	}

}
