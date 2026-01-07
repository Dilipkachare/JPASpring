package Dilip.com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id
    @Column(name = "Team_Id")
    private int id;

    @Column(name = "Team_Name")
    private String name;

    @Column
    private String owner;

    @Column(name = "Team_City")
    private String city;
}
