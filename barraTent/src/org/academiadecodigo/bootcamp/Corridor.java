package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 19/02/2019.
 *
 * Instantiate all the backgrounds and shows them in a switch case with the 1,2,3,4,5,6 keys
 *
 *
 */
public class Corridor implements KeyboardHandler {

    //Instantiate backgrounds
    private Stages attic = new Attic();
    private Background base = new Background();
    CatchScreen catchScreen;
    private Stages stages;


    private Picture corridor1 = new Picture(10,10,"corr1.jpg");
    private Picture corridor2 = new Picture(10,10,"corr2.jpg");
    private Picture corridor3 = new Picture(10,10,"corr3.jpg");

    private boolean stageIsOngoing=false;

    //chooses witch corridor to show

    public Corridor() throws InterruptedException{


        corridor1.draw();
        boolean bool;


        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent onePressed = new KeyboardEvent();
        onePressed.setKey(KeyboardEvent.KEY_1);
        onePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(onePressed);

        KeyboardEvent twoPressed = new KeyboardEvent();
        twoPressed.setKey(KeyboardEvent.KEY_2);
        twoPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(twoPressed);

        while (true) {
            System.out.print("");
            if (stageIsOngoing) {
                stages.init();
                catchScreen = new CatchScreen();
                bool=catchScreen.init();
                if(bool){
                    stages.hideStage();
                }
                stageIsOngoing=false;
            }
        }

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_1) {
            //Go to base
            System.out.println("1111111111111111");

            base.init();
            stageIsOngoing=true;

        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_2) {
            //Go to attic
            stages=attic;
            stageIsOngoing=true;

        }
    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

