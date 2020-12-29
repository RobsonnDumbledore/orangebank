/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orangebank.repositories;

import com.orangebank.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Robson
 */
public interface AccountRepository extends JpaRepository<Account, Long>{
    boolean existsAccountByCpf(String cpf);
    boolean existsAccountByEmail(String email);
}
