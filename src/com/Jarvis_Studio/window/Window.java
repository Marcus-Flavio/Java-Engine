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
    public void addKeyboard(KeyHandler keyHandler){
        canvas.addKeyListener(keyHandler);
    }
    public void addMouse(MouseHandler mouseHandler){
        canvas.addMouseListener(mouseHandler);
    }

    public static Canvas getCanvas(){
        return canvas;
    }
    public static int getHeight() {
        return height;
    }
    public static int getWidth() {
        return width;
    }
    public static int getScale(){
        return scale;
    }
}
