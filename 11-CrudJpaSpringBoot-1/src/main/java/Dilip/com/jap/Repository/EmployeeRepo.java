package Dilip.com.jap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import Dilip.com.jap.enitity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
