package Dilip.com.appliacation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dilip.com.appliacation.Repository.addrRepo;
import Dilip.com.appliacation.Repository.empRepository;
import Dilip.com.appliacation.entity.Address;
import Dilip.com.appliacation.entity.Employee;
import jakarta.transaction.Transactional;
import lombok.Data;

@Service
@Data
public class EmployeeService {
	@Autowired
	private empRepository employee;
	@Autowired
	private addrRepo address;
	
	/*
	 * @Autowired public EmployeeService( Employee employee , Address address) {
	 * this.employee=employee; this.address=address; }
	 */
	
	@Transactional (rollbackOn = Exception.class)
	public void saveData() {
		Employee emp=new Employee();
		emp.setEmpName("Dilip");
		emp.setEmpSalary(2500.50);
		
		employee.save(emp);
		
		int i = 10/0;
		
		Address addinfo =new Address();
		addinfo.setCity("Aurangabad");
		addinfo.setState("MH");
		addinfo.setCode(431001);
		
		address.save(addinfo);	
		
	}


}
