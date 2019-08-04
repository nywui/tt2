package net.androidis.sample3.service;

import net.androidis.sample3.model.Account;

public interface IAccountService {

	public Account findAccountByUserName(String userName);
}
