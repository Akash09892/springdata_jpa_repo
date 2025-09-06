package com.cbit.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbit.demo.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer>{

}