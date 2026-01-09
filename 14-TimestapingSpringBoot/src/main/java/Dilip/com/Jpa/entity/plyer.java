package Dilip.com.Jpa.entity;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class plyer {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "athletes_id")
	private Integer id;
	@Column (name = "athletes_names")
	private String name;
	@Column (name = "athletes_games")
	private String game;
	private Integer age;
	private String country;
	
	@CreationTimestamp 
	@Column (name = "Created_By" , updatable = false)
	private LocalDateTime CreationDate;
	
	@UpdateTimestamp
	@Column (name = "Updated_By" , insertable = false)
	private LocalDateTime UpdatedDate;

}
