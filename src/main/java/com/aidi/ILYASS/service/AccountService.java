package com.aidi.ILYASS.service;

import java.security.Principal;

import com.aidi.ILYASS.domain.PrimaryAccount;
import com.aidi.ILYASS.domain.PrimaryTransaction;
import com.aidi.ILYASS.domain.SavingsAccount;
import com.aidi.ILYASS.domain.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
