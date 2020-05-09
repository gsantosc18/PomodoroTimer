/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.model;

/**
 *
 * @author myhouse
 */
public class StepSound extends SoundAbstract {

    @Override
    public Sound getSom() {
        return new Sound(){
            @Override
            public String getResource() {
                return "sounds/beep-08b.wav";
            }
        };
    }
    
}
