package Dilip.com.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import Dilip.com.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
