/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Timer implements TimerInterface {
    private Thread background = null;
    private JLabel IO = null;
    private TimeEventInterface timeEventInterface = null;
        
    private int contador;
    private boolean paused;
    
    public Timer(JLabel io) {
        IO = io;
        contador = 0;
        paused = false;
    }

    @Override
    public void start() {
        if(background == null) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    try {
                        while(true) {
                            Thread.sleep(1000);
                            if(isPaused()) continue;
                            contador++;
                            IO.setText(segToHours(contador));
                            if(timeEventInterface != null)
                            timeEventInterface.onChange(Timer.this,contador);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            background = new Thread(r);
            background.start();
        }
    }

    @Override
    public void stop() {
        if (background != null) {
            background.stop();
        }
    }

    @Override
    public void pause() {
        paused = true;
    }
    
    
    @Override
    public void resume() {
        paused = false;
    }

    @Override
    public void reset() {
        contador = 0;
        IO.setText("00:00");
    }

    @Override
    public boolean isPaused() {
        return this.paused;
    }
    
    private String segToHours(int time)
    {
        int minutos = time / 60,
            segundos = time % 60;
        
        return (minutos<10?"0"+minutos:minutos)+":"+(segundos<10?"0"+segundos:segundos);
    }

    @Override
    public void addListener(TimeEventInterface timeEventInterface) {
        this.timeEventInterface = timeEventInterface;
    }
}
