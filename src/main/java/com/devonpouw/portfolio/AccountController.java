package com.devonpouw.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@CrossOrigin
@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @PostMapping("accounts")
    public Account createAccount(@RequestBody AccountRequestDTO accountDTO) {
        return accountService.createAccount(accountDTO.getUsername(), accountDTO.getPassword(), accountDTO.getNickname());
    }
}