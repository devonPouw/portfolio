package com.devonpouw.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




    @Service
    public class AccountService {
        private final AccountRepository accountRepository;
    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
        public Account createAccount(String username, String password, String nickname) {
            Account account = new Account();
            account.setUsername(username);
            account.setPassword(password);
            account.setNickname(nickname);

            return accountRepository.save(account);
        }
    }