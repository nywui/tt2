package net.androidis.sample3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.androidis.sample3.model.Login;
import net.androidis.sample3.repository.LoginRepository;
import net.androidis.sample3.service.ILoginService;


@Service
public class LoginService implements ILoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public Iterable<Login> findAllLogin()
	{
		return  loginRepository.findAll();
	}
	@Override
	public Login findLoginByUserName(String name)
	{
		//return loginRepository.findLoginByUserName(name);
		
		//loginRepository.
		//return loginRepository.findOne((long) 123);
		return loginRepository.findByUsername(name);
	}
	
}
