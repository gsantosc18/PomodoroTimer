/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.model.icon;

/**
 *
 * @author myhouse
 */
public class MaterializeIconFactory extends IconFactory {

    @Override
    public IconInterface getIcon(String icon) {
        switch(icon) {
            case "setting": 
                return new SettingIcon();
            case "play":
                return new Playicon();
            case "pause":
                return new PauseIcon();
            case "stop":
                return new StopIcon();
            case "next":
                return new NextIcon();
            case "delete":
                return new DeleteIcon();
            case "delete-sweep":
                return new DeleteSweepIcon();
            case "refresh":
                return new RefreshIcon();
            default: return null;
        }
    }
    
}
