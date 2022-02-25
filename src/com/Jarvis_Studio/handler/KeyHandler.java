package com.Jarvis_Studio.handler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key  = e.getKeyCode();
        /*
        switch (key){
            case KeyEvent.VK_ENTER:
                break;
        }
         */
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        /*
        switch (key){
            case KeyEvent.VK_ENTER:
                break;
        }
         */
    }
}
