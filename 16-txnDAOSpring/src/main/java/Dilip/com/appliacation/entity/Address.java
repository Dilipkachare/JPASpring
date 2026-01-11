package Dilip.com.appliacation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "Employee_Address")
public class Address {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "Employee_ID")
	private Integer id;
	@Column (name = "Employee_City")
	private String city;
	@Column (name = "Employee_State")
	private String State;
	@Column (name = "Employee_PostalCode")
	private Integer code;

}
