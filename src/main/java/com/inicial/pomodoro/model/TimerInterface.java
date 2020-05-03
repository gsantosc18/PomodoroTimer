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
public interface TimerInterface {
    public void start();
    public void stop();
    public void pause();
    public void resume();
    public void reset();
    public boolean isPaused();
    public void addListener(TimeEventInterface timeEventInterface);
}
