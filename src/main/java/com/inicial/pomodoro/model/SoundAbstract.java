/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.model;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.SwingUtilities;

/**
 *
 * @author myhouse
 */
public abstract class SoundAbstract {
    private Sound som;
    
    public abstract Sound getSom();
    
    public void reproduzir(){
        som = getSom();        
        String resource = som.getResource();        
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(resource));
            DataLine.Info info = new DataLine.Info(Clip.class, audioInputStream.getFormat());
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioInputStream);
            clip.loop(0);
            // Para a execução (senão o programa termina antes de você ouvir o som)
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {}
            });
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("Erro ao executar SOM!");
        }
    }
    
}
