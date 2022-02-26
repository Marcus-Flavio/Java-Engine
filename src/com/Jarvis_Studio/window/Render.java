package com.Jarvis_Studio.window;

import com.Jarvis_Studio.main.ID;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Render{
    private final Canvas canvas;
    private final BufferedImage image;

    private Graphics g;
    private BufferStrategy bs;

    private final int width,height;
    private int scale;
    /**
     * Render Constructor
     */
    public Render() {
        canvas = Window.getCanvas();

        width = Window.getWidth();
        scale = Window.getScale();
        height = Window.getHeight();

        image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    }
    public void draw(){
        initGraphics();
        if(bs != null) {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, width, height);
            showGraphics();
        }
    }
    public void initGraphics(){
        bs = canvas.getBufferStrategy();
        if(bs == null) {
            canvas.createBufferStrategy(3);
            return;
        }
        g = image.getGraphics();
    }
    public void clearGraphics(){
        g.dispose();
    }
    public void showGraphics(){
        clearGraphics();
        g = bs.getDrawGraphics();
        g.drawImage(image,0,0,width*scale,height*scale,null);
        bs.show();
    }

}
