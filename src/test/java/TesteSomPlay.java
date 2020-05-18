
import com.inicial.pomodoro.model.SoundAbstract;
import com.inicial.pomodoro.model.StepSound;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myhouse
 */
public class TesteSomPlay {
    public static void main(String[] args) {
        SoundAbstract s = new StepSound();
        s.reproduzir();
    }
}
