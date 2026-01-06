package Dilip.com.jap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.List;
import Dilip.com.jap.Repository.EmployeeRepo;
import Dilip.com.jap.enitity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepo employeeRepo = context.getBean(EmployeeRepo.class);

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Krushana");
		e1.setRole("Devloper");

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Dilip");
		e2.setRole("Devloper");

		employeeRepo.saveAll(List.of(e1, e2));
		System.out.println("Info inserted........");

		Employee emp = employeeRepo.findById(2).get();
		System.out.println("data fetch sucssfully......");
		System.out.println(emp);

		List<Employee> emp2 = (List<Employee>) employeeRepo.findAllById(List.of(1, 2));
		System.out.println("Multiple data fetch sucssfully......");
		for (Employee e : emp2) {
			System.out.println(e);

		}

		List<Employee> emp1 = (List<Employee>) employeeRepo.findAll();
		System.out.println("All data Located sucssfully......");
		for (Employee e : emp1) {
			System.out.println(e);

		}

		Long countingEmployees = (Long) employeeRepo.count();
		System.out.println("Total Employees :: " + countingEmployees);

		boolean avilable = employeeRepo.existsById(3);
		if (avilable) {
			System.out.println("employee is present");
		} else {
			System.out.println("employee data is not available");
		}

		employeeRepo.deleteById(1);
		System.out.println("Employee data Deleted");

		employeeRepo.deleteAllById(List.of(1, 2));
		System.out.println("Employees deleted successfully");

		employeeRepo.deleteAll();
		System.out.println("All Employees deleted successfully");

		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("Kiran");
		e3.setRole("Devloper");

		Employee e4 = new Employee();
		e4.setId(104);
		e4.setName("Sahil");
		e4.setRole("Devloper");

		employeeRepo.saveAll(List.of(e3, e4));
		System.out.println("Info inserted........");

       
	}

}
