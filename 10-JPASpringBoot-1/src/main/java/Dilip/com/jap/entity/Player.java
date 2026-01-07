package Dilip.com.jap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CRICKET_PLAYER")

public class Player {
 
	@Id
	@Column (name ="PLAYER_ID")
	private Integer ply_id;
	@Column (name = "PLAYER_NAME")
	private String ply_Name;
	@Column (name = "PLAYER_AGE")
	private Integer ply_Age;
	
	public Integer getPly_id() {
		return ply_id;
	}

	public void setPly_id(Integer ply_id) {
		this.ply_id = ply_id;
	}

	public String getPly_Name() {
		return ply_Name;
	}

	public void setPly_Name(String ply_Name) {
		this.ply_Name = ply_Name;
	}

	public Integer getPly_Age() {
		return ply_Age;
	}

	public void setPly_Age(Integer ply_Age) {
		this.ply_Age = ply_Age;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	private String Location;

}
