package com.bankpk.Banking.service;

import com.bankpk.Banking.dto.AccountDto;
import com.bankpk.Banking.enitity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id1);
    AccountDto deposit(Long id1 , double amount);
    AccountDto withdraw(Long id1, double amount);
    List<AccountDto>getAllAccount();
    void deleteAccount(Long id1);
}
