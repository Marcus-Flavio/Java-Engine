package com.Jarvis_Studio.ui;

import javax.swing.*;
import java.awt.*;

public class Label {
    public JLabel jlabel;

    public Label(Rectangle rectangle){
        jlabel = new JLabel();
        jlabel.setBounds(rectangle);
    }
    public void setSize(int width,int height){
        jlabel.setSize(new Dimension(width,height));
    }
    public void setLocation(int x,int y){jlabel.setLocation(x,y);}

    public void setText(String text){
        jlabel.setText(text);
    }
    public void setIcon(ImageIcon image){
        jlabel.setIcon(image);
    }
    public void setColor(Color color){
        jlabel.setBackground(color);
    }

    public void setFont(Font font){jlabel.setFont(font);}
    public void setFontColor(Color color){jlabel.setForeground(color);}

    public void add(JFrame frame){
        frame.add(jlabel);
    }
    public void remove(JFrame frame){
        frame.remove(jlabel);
    }

}
