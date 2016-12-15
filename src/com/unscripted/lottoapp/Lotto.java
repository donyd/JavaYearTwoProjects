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
public class Lotto {
    private int[] secretNo = new int[6];
    private int range;
    private int userNumOfTriesAllowed;
    private String results = new String();
    private int lineOneGuessedRight;
    private int lineTwoGuessedRight;
    private int lineThreeGuessedRight;
    private int[][] userGuesses;
    
    // Constructore
    public Lotto(){
        this.secretNo = this.Randomizer();
        this.range = 46;
        this.userNumOfTriesAllowed = 3;
        this.lineOneGuessedRight = 0;
        this.lineTwoGuessedRight = 0;
        this.lineThreeGuessedRight = 0;
        this.userGuesses = new int[3][6];
    }
    
    private int[] Randomizer(){
        for (int i = 0; i < secretNo.length; i++){
            secretNo[i] = (int) ((Math.random() * range) + 1);
        }
        return secretNo;
    }
    
    public void getUserTry(){
          while(userNumOfTriesAllowed > 0){
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 6; j++){
                    int input = getUserInput(i, j);
                    while (input < 1 || input > 47){
                        JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 47");
                        input = getUserInput(i, j);
                    }
                    userGuesses[i][j] = input;
                }
                userNumOfTriesAllowed--;
            }
            
        }
    }
    
    private int getUserInput(int i, int j){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number " + (j + 1) + 
                         " for line " + (i + 1) +  ". One number only once per line"));
    }
    
    
    // Check user entered numbers per line with numbers in SecretNo Array
    public void checkUserEntries(){
             for(int i = 0; i < 3; i++){  // line number
            for(int j = 0; j < 6; j++){  // second loop to iterate through 2D array
                for(int k = 0; k < 6; k++){ // third loop to place focus on each index of secretNo
                    if (i == 0 && secretNo[k] == userGuesses[i][j]){
                        lineOneGuessedRight++;
                    } else if (i == 1 && secretNo[k] == userGuesses[i][j]){
                        lineTwoGuessedRight++;
                    } else if (i == 2 && secretNo[k] == userGuesses[i][j]){
                        lineThreeGuessedRight++;
                    }
                }
                
            }
        }
    } // end of method checkUsesrEntries()
       
    // Output number of guesses and if the user won anything + SecretNo
    public void showResults(){
        JOptionPane.showMessageDialog(null, "You guessed " + lineOneGuessedRight + " on line 1\n" +
                lineTwoGuessedRight + " on line 2 and\n" + lineThreeGuessedRight + " on line 3");
        
        if (lineOneGuessedRight == 3 || lineTwoGuessedRight == 3 || lineThreeGuessedRight == 3){
            JOptionPane.showMessageDialog(null, "You guessed three numbers right\n You win € 50!");
        } else if (lineOneGuessedRight == 4 || lineTwoGuessedRight == 4 || lineThreeGuessedRight == 4){
            JOptionPane.showMessageDialog(null, "You guessed four numbers right\n You win € 250!!");
        } else if (lineOneGuessedRight == 5 || lineTwoGuessedRight == 5 || lineThreeGuessedRight == 5){
            JOptionPane.showMessageDialog(null, "You guessed five numbers right\n You win € 250,000!!!");
        } else if (lineOneGuessedRight == 6 || lineTwoGuessedRight == 6 || lineThreeGuessedRight == 6){
            JOptionPane.showMessageDialog(null, "You guessed six numbers right\n You win € 4 million!!!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry you didn't win anything. Good luck with the next game");
            JOptionPane.showMessageDialog(null, "The winning numbers were\n" + Arrays.toString(secretNo) + "\n" +
                    "Your numbers were:\n" + ArrayBuilder(userGuesses));
            
          /*  for(int[] showArray: userGuesses){
                JOptionPane.showMessageDialog(null, "You entered " + Arrays.toString(showArray));
            }*/
                        
        }
    }
    
     private String ArrayBuilder(int[][] array){
            StringBuilder userEntry = new StringBuilder();
            for(int[] showArray: array){
                userEntry.append(Arrays.toString(showArray)).append("\n");
            }
            return userEntry.toString();
        }
      
}
