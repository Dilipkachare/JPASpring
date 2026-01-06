package Dilip.com.jap.enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "Employee_Info")
public class Employee {
	
	@jakarta.persistence.Id
	@Column (name="Eployee_ID")
	private int Id;
	
	@Column (name = "Eployee_Name")
	private String name;
	
	@Column
	private String role;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		return ("id ::"+Id +"  Name ::"+ name+ "   Role ::" + role);
	}
	

}
