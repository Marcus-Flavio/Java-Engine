package com.Jarvis_Studio.ui;

import javax.swing.*;
import java.awt.*;

public class Label {
    public JLabel jlabel;

    /**
     *Label Constructor
     * @param rectangle Set the Bounds of the Label
     * <code>new Rectangle(int x,int y)<code/>
     */
    public Label(Rectangle rectangle){
        jlabel = new JLabel();
        jlabel.setBounds(rectangle);
    }
    /**
     * Sets the size of the Label
     * @param width Width of the Label
     * @param height Height of the Label
     * @throws Exception in case of invalid value
     */
    public void setSize(int width,int height){
        jlabel.setSize(new Dimension(width,height));
    }
    /**
     * Sets the location of the button
     * @param x LocationX of the Button
     * @param y LocationY of the Button
     * @throws Exception in case of invalid value
     */
    public void setLocation(int x,int y){jlabel.setLocation(x,y);}

    /**
     * Sets the text of the Label
     * @param text Text of the Label
     * @throws Exception in case of invalid value
     */
    public void setText(String text){
        jlabel.setText(text);
    }
    /**
     * Sets the icon of the Label
     * @param image Icon of the Label
     * @throws Exception in case of invalid value
     */
    public void setIcon(ImageIcon image){
        jlabel.setIcon(image);
    }
    /**
     * Sets the color of the Label
     * @param color Color of the Label
     * @throws Exception in case of invalid value
     */
    public void setColor(Color color){
        jlabel.setBackground(color);
    }
    /**
     * Sets the font of the Label
     * @param font Font of the Label
     * @throws Exception in case of invalid value
     */
    public void setFont(Font font){jlabel.setFont(font);}
    /**
     * Sets the font color of the Label
     * @param color FontColor of the Label
     * @throws Exception in case of invalid value
     */
    public void setFontColor(Color color){jlabel.setForeground(color);}
    /**
     * Add the Label to the screen
     * @param frame Window
     * @throws Exception in case of invalid value
     */
    public void add(JFrame frame){
        frame.add(jlabel);
    }
    /**
     * Add the Label to the screen
     * @param frame Window
     * @throws Exception in case of invalid value
     */
    public void remove(JFrame frame){
        frame.remove(jlabel);
    }

}
