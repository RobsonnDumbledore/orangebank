/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orangebank.errors;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Robson
 */
@Getter
@Setter
@NoArgsConstructor
public class SubError {

    private String field;
    private String message;

    public SubError(String field, String message) {
        this.field = field;
        this.message = message;
    }
    
}
