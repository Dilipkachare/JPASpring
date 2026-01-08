package Dilip.com.Jpa.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Dilip.com.Jpa.Entity.Athletes;
/*spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
*/

public interface PlayerRepo extends JpaRepository<Athletes, Integer> {

}
