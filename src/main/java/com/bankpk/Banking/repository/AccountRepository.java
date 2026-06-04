package com.bankpk.Banking.repository;

import com.bankpk.Banking.enitity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
