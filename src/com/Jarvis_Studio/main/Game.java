package com.Jarvis_Studio.main;

import com.Jarvis_Studio.handler.ActionHandler;
import com.Jarvis_Studio.handler.Handler;
import com.Jarvis_Studio.handler.KeyHandler;
import com.Jarvis_Studio.handler.MouseHandler;
import com.Jarvis_Studio.window.Render;
import com.Jarvis_Studio.window.Window;

/**
 *This is a Game Engine to facilitate the development of games in java...
 * @see java.lang.Runnable
 * @author Marcus Flavio
 */

public class Game implements Runnable{

    public Window window;
    public Render render;

    private Thread thread;
    private boolean isRunning;

    public static KeyHandler keyHandler;
    public static MouseHandler mouseHandler;
    public static ActionHandler actionHandler;
    public static Handler handler;


    public Game (){
        window = new Window("Engine",240,160,3);
        render = new Render();
        window.addKeyboard(keyHandler);
        window.addMouse(mouseHandler);

    }
    public static void main(String[] args){
        Game game = new Game();
        game.start();
    }
    public void tick(){


    }
    public synchronized void start(){
        thread = new Thread(this,"Engine");
        thread.start();
        isRunning = true;

    }
    public synchronized void stop(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isRunning = false;
    }
    @Override
    public void run() {
        long lasTime = System.nanoTime();
        double timer = System.currentTimeMillis();

        double amountOfTicks = 60f;
        double ns = 1000000000/amountOfTicks;

        double delta = 0,frames = 0,ticks = 0;

        while (isRunning){
            //Window.canvas.requestFocus();
            long now = System.nanoTime();
            delta += (now-lasTime)/ns;
            lasTime = now;
            boolean shouldRender = true;
            if(delta >= 1){
                ticks++;
                delta--;
                shouldRender = true;
                tick();
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(shouldRender){
                render.draw();
                frames++;
            }
            if(System.currentTimeMillis() - timer >= 1000){
                timer += 1000;
                System.out.println(ticks+" ticks, "+frames+" fps");
                frames = 0;
                ticks = 0;
            }

        }
        stop();

    }
}
