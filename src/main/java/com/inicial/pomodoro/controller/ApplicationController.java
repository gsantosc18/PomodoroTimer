/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.controller;

import com.inicial.pomodoro.view.ApplicationFrame;

/**
 *
 * @author myhouse
 */
public class ApplicationController {
    public static void main(String[] args) {
        ApplicationFrame applicationFrame = ApplicationFrame.getInstance();
        applicationFrame.pack();
        applicationFrame.setVisible(true);
    }
}
