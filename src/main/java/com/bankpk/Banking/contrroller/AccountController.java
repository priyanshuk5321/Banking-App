package com.bankpk.Banking.contrroller;


import com.bankpk.Banking.dto.AccountDto;
import com.bankpk.Banking.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //add account to rest api
    @PostMapping("/create")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);

    }
    //get the account rest api

    @GetMapping("/{id1}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id1){
        AccountDto accountDto= accountService.getAccountById(id1);
        return ResponseEntity.ok(accountDto);
    }
    // deposit Rest api
 @PutMapping("/{id1}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id1,
                                              @RequestBody Map<String, Double>request){
        Double amount = request.get("amount");
        AccountDto accountDto= accountService.deposit(id1,amount);
        return ResponseEntity.ok(accountDto);
    }
// withdraw Rest api

    @PutMapping("{id1}/withdraw")
    public ResponseEntity<AccountDto>Withdeaw(@PathVariable Long id1,
                                              @RequestBody Map<String ,Double>request){
        double amount = request.get("amount");
        AccountDto accountDto=accountService.withdraw(id1,amount);
        return ResponseEntity.ok(accountDto);

    }
    // get All Accounts Rest Api
    @GetMapping
    public  ResponseEntity<List<AccountDto>>getAllAcount(){
        List<AccountDto>accounts =accountService.getAllAccount();
        return ResponseEntity.ok(accounts);

    }

    //delete account Rest Api
    @DeleteMapping("/{id1}")
    public ResponseEntity<String>deleteAccounts(@PathVariable Long id1){
        accountService.deleteAccount(id1);
        return ResponseEntity.ok("ACOOUNT IS DELETE ");
    }
}
