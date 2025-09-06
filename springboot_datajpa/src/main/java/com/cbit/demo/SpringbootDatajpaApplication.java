package com.cbit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cbit.demo.entity.Account;
import com.cbit.demo.service.IAccountService;

@SpringBootApplication
public class SpringbootDatajpaApplication implements CommandLineRunner{

	@Autowired
	private IAccountService iAccountService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	    Account acc = new Account();
	    acc.setId(52); //Exists
	    acc.setAccountHolderName("Mahesh");
	    acc.setAccountNo("847436252363");
	    acc.setAccountBalance(35000);//New Value
	    
		//iAccountService.saveAccount(acc);
	    //iAccountService.getAllAccounts();
	    //iAccountService.getAccountDetailsById(10);
	    //iAccountService.deleteAccountById(1);
	    
	    iAccountService.updateAccount(acc);
	}
}
