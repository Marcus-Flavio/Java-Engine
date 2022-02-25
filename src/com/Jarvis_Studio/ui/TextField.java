package com.Jarvis_Studio.ui;

import javax.swing.*;
import java.awt.*;

public class TextField {
    public JTextField jTextField;

    public TextField(Rectangle rectangle, int caracteres){
        jTextField = new JTextField(caracteres);
        jTextField.setEditable(true);
        jTextField.setBounds(rectangle);
    }

    public void setSize(int width,int height){
        jTextField.setSize(new Dimension(width,height));
    }
    public void setLocation(int x,int y){jTextField.setLocation(x,y);}

    public void setColor(Color color){
        jTextField.setBackground(color);
    }

    public void setFont(Font font){jTextField.setFont(font);}
    public void setFontColor(Color color){jTextField.setForeground(color);}

    public void setText(String text){jTextField.setText(text);}
    public String getText(){return jTextField.getText();}


    public void add(JFrame frame){
        frame.add(jTextField);
    }
    public void remove(JFrame frame){
        frame.remove(jTextField);
    }


}
