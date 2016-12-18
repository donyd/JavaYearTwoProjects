/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unscripted.lottoapp;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author dONY
 */
public class JTextFieldCharLimit extends PlainDocument {
    private int limit;
    
    public JTextFieldCharLimit(int limitation){
        this.limit = limitation;
    }
        
    public void insertString(int offset, String str, AttributeSet set) throws BadLocationException
    {
        if(str == null){
         return;   
        } else if ((getLength() + str.length()) <= limit){
            str = str;
            super.insertString(offset, str, set);
        }
    }
    
}
