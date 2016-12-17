/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unscripted.lottoapp;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
/**
 *
 * @author Donal D'silva
 */
public class LottoApp {
    public static void main(String[] args){
       // Lotto myGame = new Lotto();
        
        
      //System.out.println(myGame.showArrayContent(myGame.getSecretNo()));
        
     // myGame.getUserTry();
        
     // System.out.println(myGame.showArrayContent(myGame.getUserGuesses()));
        
     // myGame.checkUserEntries();
     // myGame.showResults();
        
        LottoGUI newGame = new LottoGUI();
        
        newGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        newGame.setVisible(true);
        
        JButton start = newGame.getStartButton();
                
        //newGame.add(title, BorderLayout.NORTH);
        newGame.add(start, BorderLayout.SOUTH);
        

        
       
        
      
        
    }
    
}