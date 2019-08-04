package net.androidis.sample3.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import net.androidis.sample3.model.Login;



@Repository
public interface LoginRepository extends CrudRepository<Login, Long>{
	
//	public Login findLoginByUserName(String userName);
	
	@Query(value = "SELECT * FROM login2 WHERE username = ?1", nativeQuery = true)
	public Login findByUsername(String userName);
	
	
	

//	public Iterable<Login> findAllLogin();

}
