package net.androidis.sample3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.androidis.sample3.model.Account;
import net.androidis.sample3.repository.AccountRepository;
import net.androidis.sample3.service.IAccountService;


@Service
public class AccountService implements IAccountService{

	@Autowired
	AccountRepository accountRepository;
	
	
	
	@Override
	public Account findAccountByUserName(String userName) {
		// TODO Auto-generated method stub
		
		return accountRepository.findAccountByUserName(userName);
	}
	
	
	

}
