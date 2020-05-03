/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author myhouse
 */
public class ApplicationFrame extends JFrame {
    private static ApplicationFrame applicationFrame = null;
    
    private ApplicationFrame() {
        CronometroPanel cronometroView = new CronometroPanel();
        TarefaPanel tarefaPanel = new TarefaPanel();
        
        add(cronometroView,BorderLayout.WEST);
        add(tarefaPanel,BorderLayout.CENTER);
        
        setSize(new Dimension(800,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static ApplicationFrame getInstance()
    {
        if(applicationFrame == null) {
            applicationFrame = new ApplicationFrame();
        }
        return applicationFrame;
    }
}
