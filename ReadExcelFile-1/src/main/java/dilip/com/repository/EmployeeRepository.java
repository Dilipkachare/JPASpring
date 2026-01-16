package dilip.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dilip.com.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
