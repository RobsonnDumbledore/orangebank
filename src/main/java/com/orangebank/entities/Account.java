/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orangebank.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Robson
 */
@Getter
@Setter
@Entity
@Table(name = "account")
@NoArgsConstructor
public class Account implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "name required")
    private String name;
    
    @CPF
    @Column(unique = true)
    @NotEmpty(message = "cpf required")
    private String cpf;
    
    @Email
    @Column(unique = true)
    @NotEmpty(message = "email required")
    private String email;
    
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "dateOfBirth required")
    private LocalDate dateOfBirth;

    public Account(Long id, String name, String cpf, String email, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
}
