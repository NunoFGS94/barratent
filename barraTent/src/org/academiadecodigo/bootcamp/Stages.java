package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 19/02/2019.
 */
public abstract class Stages {

    private Picture background;

    //pokemon list

    public void setUnlocked(boolean unlocked) {
        isUnlocked = unlocked;
    }

    public abstract boolean isUnlocked();

    private boolean isUnlocked;

    public abstract void init();


    public abstract void drawStage();

    public abstract void hideStage();

    public abstract void startPokemon();





}
