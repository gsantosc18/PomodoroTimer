/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inicial.pomodoro.model.icon;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author myhouse
 */
public abstract class IconFactory {
    public abstract IconInterface getIcon(String icon);
    
    public ImageIcon build(String icon, int width, int height) throws IOException{
        IconInterface iconInterface = getIcon(icon);
        File file = new File(iconInterface.getPath());
        return new ImageIcon(new ImageIcon(file.getCanonicalPath()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }
    
    public ImageIcon build(String icon) throws IOException {
        return build(icon, 15, 15);
    }
}
