package com.cbit.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbit.demo.entity.Account;
import com.cbit.demo.repo.AccountRepo;

@Service
public class AccountServiceImpl implements IAccountService{

	@Autowired
	private AccountRepo accountRepo;

	@Override
	public void saveAccount(Account acc) {
		Account a = accountRepo.save(acc);
		if(a!=null)
			System.out.println("Account Details Saved");
		else
			System.out.println("Account Details Insertion Failed");
	}

	@Override
	public void getAllAccounts() {
		List<Account> accList = accountRepo.findAll();
		for(Account a:accList) {
			System.out.println(a.getId()+"   "+a.getAccountHolderName()+"  "+a.getAccountNo()+"   "+a.getAccountBalance());
		}
	}

	@Override
	public void getAccountDetailsById(int id) {
		Optional<Account> opt = accountRepo.findById(id);
		if(opt.isPresent()) {
			Account a = opt.get();
			System.out.println(a.getId()+"  "+a.getAccountHolderName()+"   "+a.getAccountNo()+"   "+a.getAccountBalance());
		}else {
			System.out.println("No Account Exist");
		}
	}

	@Override
	public void deleteAccountById(int id) {
		Optional<Account> opt = accountRepo.findById(id);
		if(opt.isPresent()) {
			accountRepo.deleteById(id);
			System.out.println("Account Deleted Successfully");
		}else {
			System.out.println("Account Not Found To Delete");
		}
	}

	@Override
	public void updateAccount(Account a) {
		Optional<Account> opt = accountRepo.findById(a.getId());
		if(opt.isPresent()) {
			accountRepo.save(a);
			System.out.println("Account Updated Successfully");
		}else {
			System.out.println("Account Not Found To Update");
		}
	}
}
