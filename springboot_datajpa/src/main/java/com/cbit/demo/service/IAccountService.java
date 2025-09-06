package com.cbit.demo.service;

import com.cbit.demo.entity.Account;

public interface IAccountService {
	public void saveAccount(Account acc);
	public void getAllAccounts();
	public void getAccountDetailsById(int id);
	public void deleteAccountById(int id);
	public void updateAccount(Account a);
}
