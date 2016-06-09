/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author p1506348
 */
public class AppearTokenEffect extends Effect {

    /**
     * 
     * @param line
     * @param column
     * @param game 
     * Joue un jeton au hasard sur le plateau. 
     */
    @Override
    public void playEffect(int line, int column, Game game) {
        int rand=(int) (Math.random() * ( 10 - 0 ));
        game.playMove(rand);
    }
    
}
