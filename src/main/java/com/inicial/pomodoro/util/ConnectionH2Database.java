/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 320099352
 */
public class ConnectionH2Database {
    private ConnectionH2Database() {}
    
    public static EntityManagerFactory getConnection() {
        return Persistence.createEntityManagerFactory("com.inicial_Pomodoro_jar_1.0PU");
    }
}
