package com.bankpk.Banking.mapper;

import com.bankpk.Banking.dto.AccountDto;
import com.bankpk.Banking.enitity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account =new Account(
                accountDto.getId1(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;

    }
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto= new AccountDto(
                account.getId1(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
