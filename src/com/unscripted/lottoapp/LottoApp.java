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
 * @author Donal D'silva
 */
public class LottoApp {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Program variables
        int[] secretNo = new int[6];
        int range = 46;
        int userNumOfTriesAllowed = 3;
        String results = new String();
        // 
        int[][] userGuesses = new int[3][6]; 
        
        // Guesses per line
        int lineOneGuessedRight = 0;
        int lineTwoGuessedRight = 0;
        int lineThreeGuessedRight = 0;
        
        
        // Early prototyping: Move to separate class | a static method 
        // Array of randomly generated numbers between 1 - 47
        for (int i = 0; i < secretNo.length; i++){
            secretNo[i] = (int)((Math.random() * range) + 1);
        }
        
        // For testing & debugging random number generation
        // System.out.println(Arrays.toString(secretNo));
        //System.out.println("This is from the static random generator: " + Arrays.toString(SecretNumberGenerator()));
        
        // Get User Input only between 1 - 47
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
        
        // For testing & debugging user input
       /*for (int[] showArray: userGuesses){
            System.out.println(Arrays.toString(showArray)); 
        }*/
          
        
        // Process
        // Check user entered numbers per line with numbers in SecretNo Array
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
        
        // Output number of guesses and if the user won anything + SecretNo
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
    
    
     // Gets the user input and displays the current line and number
    public static int getUserInput(int i, int j){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number " + (j + 1) + 
                         " for line " + (i + 1) +  ". One number only once per line"));
    }
    
    // Creates a single String representation of user array inputs for display purposes
    public static String ArrayBuilder(int[][] array){
            StringBuilder userEntry = new StringBuilder();
            for(int[] showArray: array){
                userEntry.append(Arrays.toString(showArray)).append("\n");
            }
            return userEntry.toString();
        }
    
    // Prevent duplicate numbers from appearing in secret random array
    /* public static int[] SecretNumberGenerator(){
        final int RANGE = 46;
        int[] secretNo = new int[6];
        int[] duplicateChk = new int[6];
        int cache = 0;
        
        // int numCheck = (int)((Math.random() * RANGE) +1);
        
        for(int i = 0; i < secretNo.length; i++){
            for(int j = 0; i < (i + 1); j++){
                cache = (int) ((Math.random() * RANGE) + 1);
                secretNo[i] = cache;
                duplicateChk[i] = cache + 1;
                if (secretNo[i] != duplicateChk[i]){
                    secretNo[i] = cache;
                }
                duplicateChk[i] = cache;
            }
        }
        return secretNo;
    }*/
    
}
