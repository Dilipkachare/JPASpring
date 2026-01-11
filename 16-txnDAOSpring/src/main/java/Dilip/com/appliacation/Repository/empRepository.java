package Dilip.com.appliacation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Dilip.com.appliacation.entity.Employee;

public interface empRepository extends JpaRepository<Employee, Integer> {

}
