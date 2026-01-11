package Dilip.com.appliacation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Dilip.com.appliacation.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
