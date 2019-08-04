package net.androidis.sample3.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import net.androidis.sample3.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long>{
	
	@Query(value= "SELECT * FROM account WHERE username = ?1", nativeQuery = true)
	public Account findAccountByUserName(String userName);

}
