/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.view;
import com.inicial.pomodoro.model.ConfigCronometroEvent;
import javax.swing.JFrame;

/**
 *
 * @author myhouse
 */
public class ConfigCronometroFrame extends JFrame{
    private ConfigCronometroPanel panel;
    private static ConfigCronometroFrame app = new ConfigCronometroFrame() ;
    
    private ConfigCronometroFrame(){
        panel = new ConfigCronometroPanel();
                
        setSize(panel.getPreferredSize());
        
        setContentPane(panel);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static ConfigCronometroFrame init()
    {
        return app;
    }
    
    public void addListener(ConfigCronometroEvent cronometroEvent)
    {
        this.panel.addListener(new ConfigCronometroEvent() {
            @Override
            public void onSave(int tarefa, int pausa, int longaPausa) {
                app.setVisible(false);
                cronometroEvent.onSave(tarefa, pausa, longaPausa);
            }
        });
    }
}
