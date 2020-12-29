/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orangebank.exceptions;

/**
 *
 * @author Robson
 */
public class DuplicateKeyException extends RuntimeException{

    public DuplicateKeyException(String msg) {
        super(msg);
    }
    
    
    
}
