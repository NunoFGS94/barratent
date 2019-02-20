package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 17/02/2019.
 */
public class Background {

    private Picture background;
    private static int stage;
    private boolean locked;
    /*
    public Background(int stage, boolean locked){
        this.stage = stage;
        this.locked=locked;
    }*/

    public void init(){

        System.out.println(" Background init");

        switch (stage){
            //Base
            case 0: background= new Picture(10,10,"bg.jpg");
            break;
            case 1: background= new Picture(10,10,"bg2.jpg");
            break;
            case 2: background= new Picture(10,10,"bg3.jpg");
            break;
            default: // Victory Screen
        }
         background.draw();

    }

    public void hide(){
        background.delete();
    }


}
