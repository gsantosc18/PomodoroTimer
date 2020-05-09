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
public class Step implements StepInterface {
    
    private JLabel status;
    private JLabel number;
    private StepEventInterface listener;
    
    private String[] steps;
    private int contStep = 0;
    private int contPause = 0;
    private int position = 0;
    
    public static String STEP = "Step";
    public static String PAUSE = "Pause";
    public static String LONGPAUSE = "Long Pause";
    
    public Step() {
        steps = new String[]{STEP,PAUSE,STEP,PAUSE,STEP,PAUSE,STEP,LONGPAUSE};
    }

    @Override
    public void setStatus(JLabel label) {
        this.status = label;
    }

    @Override
    public void setNumber(JLabel label) {
        this.number = label;
    }

    @Override
    public void nextStep() {
        int p = nextPosition();
        String lb = steps[p];
        String n = "";
        
        if(lb.equals(STEP)) {
            contStep++;
            n = String.valueOf(contStep+1);
        } else if(lb.equals(PAUSE)){
            contPause++;
            n = String.valueOf(contPause);
        } else if(lb.equals(LONGPAUSE)){
            contPause = 0;
            contStep = -1;
            position = -1;
        }
        
        if(listener != null)
            listener.onChange(lb, contStep, contPause);
        
        this.status.setText(lb);
        this.number.setText(n);
    }

    @Override
    public void reset() {
        contPause = 0;
        contStep = -1;
        position = -1;
        this.status.setText(STEP);
        this.number.setText(String.valueOf(1));
    }

    @Override
    public void addListener(StepEventInterface listener) {
        this.listener = listener;
    }
    
    private int nextPosition()
    {
        position++;
        return position;
    }    
}
