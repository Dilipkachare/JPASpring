package Dilip.com.appliacation.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Employee_Data")

public class Employee {
	
	@Id
	@Column (name = "Employee_Id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column (name = "Employee_Name")
	private String empName;
	
	@Column (name = "Employee_Salary")
	private Double empSalary;


}
