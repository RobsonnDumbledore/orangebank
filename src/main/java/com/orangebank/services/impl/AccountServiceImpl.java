/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orangebank.services.impl;

import com.orangebank.entities.Account;
import com.orangebank.exceptions.DuplicateKeyException;
import com.orangebank.repositories.AccountRepository;
import com.orangebank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Robson
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public Account create(Account account) {
        validate(account);
        return repository.save(account);
    }

    @Override
    public boolean existsAccountByCpf(String cpf) {
        return repository.existsAccountByCpf(cpf);
    }

    @Override
    public boolean existsAccountByEmail(String email) {
        return repository.existsAccountByEmail(email);
    }

    private void validate(Account account) {
        if (existsAccountByCpf(account.getCpf())) {
            throw new DuplicateKeyException("cpf already registered");
        } else if (existsAccountByEmail(account.getEmail())) {
            throw new DuplicateKeyException("email already registered");
        }
    }

}
