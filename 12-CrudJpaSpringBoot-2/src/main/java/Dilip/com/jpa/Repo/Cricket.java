package Dilip.com.jpa.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Dilip.com.jpa.entity.Team;

public interface Cricket extends JpaRepository<Team, Integer> {

	@Query(value = "from Team")
	public List<Team> getAllTeamHql();

	@Query(value = "Select * from Team", nativeQuery = true)
	public List<Team> getAllTeamSql();

	@Query("from Team where owner = :Oname")
	List<Team> getTeamByOwner(@Param("Oname") String Oname);
	
    @Query("from Team where name = :tname and city = :cname")
    List<Team> getAllTeamsByNameAndCity(
            @Param("tname") String tname,
            @Param("cname") String cname
    );

}
