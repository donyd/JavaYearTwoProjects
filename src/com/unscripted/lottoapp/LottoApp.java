/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unscripted.lottoapp;
import javax.swing.JOptionPane;
/**
 *
 * @author Donal D'silva
 */
public class LottoApp {
    public static void main(String[] args){
        Lotto myGame = new Lotto();
        
        myGame.getUserTry();
        myGame.checkUserEntries();
        myGame.showResults();
        
        
        
    }
    
}