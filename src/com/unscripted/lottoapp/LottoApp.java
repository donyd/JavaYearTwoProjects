/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unscripted.lottoapp;

import java.util.Arrays;

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
        
        for (int i = 0; i < secretNo.length; i++){
            secretNo[i] = (int)((Math.random() * range) + 1);
        }
        
        System.out.println(Arrays.toString(secretNo));
        
        
    }
    
}
