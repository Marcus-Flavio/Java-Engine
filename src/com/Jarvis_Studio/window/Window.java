package com.Jarvis_Studio.window;

import com.Jarvis_Studio.handler.KeyHandler;
import com.Jarvis_Studio.handler.MouseHandler;



import javax.swing.*;
import java.awt.*;

public class Window{
    private static int width = 0;
    private static int height = 0;
    private static int scale = 0;

    private final String title;

    public static JFrame frame;
    public static Canvas canvas;

    /**
     * Game window settings
     * @param title Title of the window
     * @param width Width of the window
     * @param height Height of the window
     * @param scale Scale the size of the screen
     * @throws Exception in case of invalid value
    */
     public Window(String title, int width,int height,int scale){
        this.title = title;
        this.width = width;
        this.height = height;
        this.scale = scale;

        frame = new JFrame();
        canvas = new Canvas();
        initFrame();


    }
    public void initFrame(){
        canvas.setSize(new Dimension(width*scale,height*scale));
        frame.add(canvas);

        frame.setTitle(title);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setVisible(true);

    }
    /**
     *Sets the KeyboardHandler
     * @param keyHandler Handler the Keyboards Inputs
     */
    public void addKeyboard(KeyHandler keyHandler){
        canvas.addKeyListener(keyHandler);
    }
    /**
     *Sets the MouseHandler
     * @param mouseHandler Handler the Mouse Inputs
     */
    public void addMouse(MouseHandler mouseHandler){
        canvas.addMouseListener(mouseHandler);
    }
    /**
     *Gets the canvas of the screen
     * @return a <code>canvas</code>
     */
    public static Canvas getCanvas(){
        return canvas;
    }
    /**
     *Gets the screen height
     * @return a <code>integer</code>
     */
    public static int getHeight() {
        return height;
    }
    /**
     *Gets the screen width
     * @return a <code>integer</code>
     */
    public static int getWidth() {
        return width;
    }
    /**
     *Gets the screen scale
     * @return a <code>integer</code>
     */
    public static int getScale(){
        return scale;
    }
}
