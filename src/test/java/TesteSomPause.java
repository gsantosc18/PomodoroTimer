
import com.inicial.pomodoro.model.PauseSound;
import com.inicial.pomodoro.model.SoundAbstract;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myhouse
 */
public class TesteSomPause {
    public static void main(String[] args) {
        SoundAbstract s = new PauseSound();        
        s.reproduzir();
    }
}
