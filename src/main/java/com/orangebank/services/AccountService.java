/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orangebank.services;

import com.orangebank.entities.Account;

/**
 *
 * @author Robson
 */
public interface AccountService {
    public Account create(Account account);
    public boolean existsAccountByCpf(String cpf);
    public boolean existsAccountByEmail(String email);
}
