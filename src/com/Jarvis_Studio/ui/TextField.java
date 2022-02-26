package com.Jarvis_Studio.ui;

import javax.swing.*;
import java.awt.*;

public class TextField {
    public JTextField jTextField;

    /**
     *TextField Constructor
     * @param rectangle Set the Bounds of the TextField
     * <code>new Rectangle(int x,int y)<code/>
     * @param caracteres Set the amount of characters in the TextField
     */
    public TextField(Rectangle rectangle, int caracteres){
        jTextField = new JTextField(caracteres);
        jTextField.setEditable(true);
        jTextField.setBounds(rectangle);
    }
    /**
     * Sets the size of the TextField
     * @param width Width of the TextField
     * @param height Height of the TextField
     * @throws Exception in case of invalid value
     */
    public void setSize(int width,int height){
        jTextField.setSize(new Dimension(width,height));
    }
    /**
     * Sets the location of the TextField
     * @param x LocationX of the TextField
     * @param y LocationY of the TextField
     * @throws Exception in case of invalid value
     */
    public void setLocation(int x,int y){jTextField.setLocation(x,y);}
    /**
     * Sets the color of the TextField
     * @param color Color of the TextField
     * @throws Exception in case of invalid value
     */
    public void setColor(Color color){
        jTextField.setBackground(color);
    }
    /**
     * Sets the font of the TextField
     * @param font Font of the TextField
     * @throws Exception in case of invalid value
     */
    public void setFont(Font font){jTextField.setFont(font);}
    public void setFontColor(Color color){jTextField.setForeground(color);}
    /**
     * Sets the text of the TextField
     * @param text Text of the TextField
     * @throws Exception in case of invalid value
     */
    public void setText(String text){jTextField.setText(text);}
    /**
     * Gets the text of the TextField
     * @return  text a <code>string<code/>
     */
    public String getText(){return jTextField.getText();}

    /**
     * Add the TextField to the screen
     * @param frame Window
     * @throws Exception in case of invalid value
     */
    public void add(JFrame frame){
        frame.add(jTextField);
    }
    /**
     * Remove the TextField to the screen
     * @param frame Window
     * @throws Exception in case of invalid value
     */
    public void remove(JFrame frame){
        frame.remove(jTextField);
    }


}
