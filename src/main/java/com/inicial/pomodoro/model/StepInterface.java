/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.model;

import javax.swing.JLabel;

/**
 *
 * @author myhouse
 */
public interface StepInterface {
    public void setStatus(JLabel label);
    public void setNumber(JLabel label);
    public void nextStep();
    public void reset();
    public void addListener(StepEventInterface listener);
}
