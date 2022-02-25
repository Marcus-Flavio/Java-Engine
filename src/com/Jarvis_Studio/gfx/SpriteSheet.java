package com.Jarvis_Studio.gfx;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteSheet {
    public static BufferedImage spriteSheet;
    public SpriteSheet(String path){
        try {
            spriteSheet = ImageIO.read(getClass().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public BufferedImage getSubImage(int x,int y, int width,int height){
        return spriteSheet.getSubimage(x,y,width,height);
    }
}
