package Dilip.com.appliacation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Dilip.com.appliacation.entity.Account;
import Dilip.com.appliacation.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
