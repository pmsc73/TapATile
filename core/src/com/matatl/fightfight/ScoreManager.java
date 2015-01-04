package com.matatl.fightfight;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.matatl.fightfight.camera.OrthoCamera;

/**
 * Created by Philip on 1/3/2015.
 */
public class ScoreManager {
    private int hiScore;
    private static int score;
    private static int multiplier;
    OrthoCamera camera;
    private final static String HI_SCORE_KEY = "ff_hiScore";
    public ScoreManager(OrthoCamera camera, Preferences prefs) {
        this.camera = camera;
        this.hiScore = prefs.getInteger(HI_SCORE_KEY);
        init();
    }
    public void init(){
        score = 0;
        multiplier = 1;
    }
    public void render(SpriteBatch sb) {

    }
    public static void incrementScore(){
        score = score + multiplier;
        System.out.println(score);
    }
    public static void incrementMultiplier(){
        if(multiplier < 5)
            multiplier++;
        System.out.println(score);
    }
    public static void resetMultiplier(){
        multiplier = 1;
        System.out.println(score);
    }
    public static boolean safe(){
        System.out.println(score);
        if(multiplier > 1)
            return true;
        return false;
    }
    public int getScore(){
        return score;
    }

    public int getHiScore() {
        return hiScore;
    }

    public void setHiScore(int hiScore) {
        this.hiScore = hiScore;
    }
}
