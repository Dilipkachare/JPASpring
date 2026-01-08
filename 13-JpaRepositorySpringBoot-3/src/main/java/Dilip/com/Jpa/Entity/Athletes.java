package Dilip.com.Jpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "athletes_info")
public class Athletes {
	
	@Id
	@Column (name = "athletes_id")
	private Integer id;
	@Column (name = "athletes_names")
	private String name;
	@Column (name = "athletes_games")
	private String game;
	private Integer age;
	private String country;
}
