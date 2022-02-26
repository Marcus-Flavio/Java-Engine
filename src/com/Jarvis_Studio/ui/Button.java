package com.Jarvis_Studio.ui;

import com.Jarvis_Studio.handler.ActionHandler;

import javax.swing.*;
import java.awt.*;


public class Button {
    public JButton jbutton;
    /**
     *Button Constructor
     * @param rectangle Set the Bounds of the Button
     * <code>new Rectangle(int x,int y)<code/>
     */
    public Button(Rectangle rectangle){
        jbutton = new JButton();
        jbutton.setBounds(rectangle);
    }
    /**
     * Sets the size of the button
     * @param width Width of the Button
     * @param height Height of the Button
     * @throws Exception in case of invalid value
     */
    public void setSize(int width,int height){
        jbutton.setSize(new Dimension(width,height));
    }
    /**
     * Sets the size of the button
     * @param x LocationX of the Button
     * @param y LocationY of the Button
     * @throws Exception in case of invalid value
     */
    public void setLocation(int x,int y){jbutton.setLocation(x,y);}
    /**
     * Sets the size of the button
     * @param text Text of the Button
     * @throws Exception in case of invalid value
     */
    public void setText(String text){
        jbutton.setText(text);
    }
    /**
     * Sets the size of the button
     * @param image Icon of the Button
     * @throws Exception in case of invalid value
     */
    public void setIcon(ImageIcon image){
        jbutton.setIcon(image);
    }
    /**
     * Sets the size of the button
     * @param color Color of the Button
     * @throws Exception in case of invalid value
     */
    public void setColor(Color color){
        jbutton.setBackground(color);
    }

    public void addActionHandler(ActionHandler actionHandler){
        jbutton.addActionListener(actionHandler);
    }
    /**
     * Add the Button to the screen
     * @param frame Window
     * @throws Exception in case of invalid value
     */
    public void add(JFrame frame){
        frame.add(jbutton);
    }
    /**
     * Remove the Button on the screen
     * @param frame Window
     * @throws Exception in case of invalid value
     */
    public void remove(JFrame frame){
        frame.remove(jbutton);
    }

}
