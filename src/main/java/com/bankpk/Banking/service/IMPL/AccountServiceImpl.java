package com.bankpk.Banking.service.IMPL;

import com.bankpk.Banking.dto.AccountDto;
import com.bankpk.Banking.enitity.Account;
import com.bankpk.Banking.mapper.AccountMapper;
import com.bankpk.Banking.repository.AccountRepository;
import com.bankpk.Banking.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository=accountRepository;

    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMapper.mapToAccount(accountDto);
        Account saveAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }

    @Override
    public AccountDto getAccountById(Long id1) {
        Account account= accountRepository
                .findById(id1)
                .orElseThrow(()-> new RuntimeException("Account dose not exists"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id1, double amount) {

        Account account= accountRepository
                .findById(id1)
                .orElseThrow(()-> new RuntimeException("Account dose not exists"));

        double total =account.getBalance() + amount;
        account.setBalance(total);
        Account savedAccount=accountRepository.save(account);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto withdraw(Long id1, double amount) {

        Account account= accountRepository
                .findById(id1)
                .orElseThrow(()-> new RuntimeException("Account dose not exists"));

        if(account.getBalance()<amount){
            throw new RuntimeException("insuffcient amount");
        }
        double total = account.getBalance()- amount;
        account.setBalance(total);
        Account savedAccount=accountRepository.save(account);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllAccount() {

        List<Account>accounts=accountRepository.findAll();
        return accounts.stream().map((account)->AccountMapper.mapToAccountDto(account))
               .collect(Collectors.toList());

    }

    @Override
    public void deleteAccount(Long id1) {
        Account account= accountRepository
                .findById(id1)
                .orElseThrow(()-> new RuntimeException("Account dose not exists"));

        accountRepository.deleteById(id1);

    }


}
