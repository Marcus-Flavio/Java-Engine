package com.Jarvis_Studio.ui;

import com.Jarvis_Studio.handler.ActionHandler;

import javax.swing.*;
import java.awt.*;


public class Button {
    public JButton jbutton;
    public Button(Rectangle rectangle){
        jbutton = new JButton();
        jbutton.setBounds(rectangle);
    }
    public void setSize(int width,int height){
        jbutton.setSize(new Dimension(width,height));
    }
    public void setLocation(int x,int y){jbutton.setLocation(x,y);}

    public void setText(String text){
        jbutton.setText(text);
    }
    public void setIcon(ImageIcon image){
        jbutton.setIcon(image);
    }
    public void setColor(Color color){
        jbutton.setBackground(color);
    }

    public void addActionHandler(ActionHandler actionHandler){
        jbutton.addActionListener(actionHandler);
    }
    public void add(JFrame frame){
        frame.add(jbutton);
    }
    public void remove(JFrame frame){
        frame.remove(jbutton);
    }

}
