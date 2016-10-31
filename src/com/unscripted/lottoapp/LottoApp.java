/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unscripted.lottoapp;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dONY
 */
public class LottoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] secretNo = new int[6];
        int range = 46;
        int userNumOfTriesAllowed = 3;
        int[][] userGuesses = new int[3][6];
        int lineOneGuessedRight = 0;
        int lineTwoGuessedRight = 0;
        int lineThreeGuessedRight = 0;
        
        
        // early prototyping: Move to separate class | a static method 
        for (int i = 0; i < secretNo.length; i++){
            secretNo[i] = (int)((Math.random() * range) + 1);
        }
        
        System.out.println(Arrays.toString(secretNo));
        
        // Input
        // getUserInput()
        while(userNumOfTriesAllowed > 0){
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 6; j++){
                   userGuesses[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your number: You have 6 ")); 
                }
                userNumOfTriesAllowed--;
            }
            
        }
        for(int[] showArray: userGuesses)
        System.out.println(Arrays.toString(showArray));
        
        // Process
        // checkLotto()
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 6; j++){
                if (i == 0 && secretNo[j] == userGuesses[i][j]){
                    lineOneGuessedRight++;
                } else if (i == 1 && secretNo[j] == userGuesses[i][j]){
                    lineTwoGuessedRight++;
                } else if (i == 2 && secretNo[j] == userGuesses[i][j]){
                    lineThreeGuessedRight++;
                }
            }
        }
        
        // Output
        JOptionPane.showMessageDialog(null, "You guessed " + lineOneGuessedRight + " on line 1\n" +
                lineTwoGuessedRight + " on line 2 and\n" + lineThreeGuessedRight + " on line 3");
        
        
    }
    
}
