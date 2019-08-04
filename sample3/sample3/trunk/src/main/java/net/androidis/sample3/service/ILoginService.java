package net.androidis.sample3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.androidis.sample3.model.Login;



public interface ILoginService {
	
	public Iterable<Login> findAllLogin();	
	public Login findLoginByUserName(String name);
	

}
