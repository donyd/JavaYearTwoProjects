/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unscripted.lottoapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.text.JTextComponent;

/**
 *
 * @author dONY
 */
public class LottoGUI extends JFrame {
 // <editor-fold defaultstate="collapsed" desc="private members for populating JFrame">
    private JPanel mainPanel;
    
    private JLabel lineOneLbl;
    private JLabel lineTwoLbl;
    private JLabel lineThreeLbl;
    
    private JTextField Ln1entry1;
    private JTextField Ln1entry2;
    private JTextField Ln1entry3;
    private JTextField Ln1entry4;
    private JTextField Ln1entry5;
    private JTextField Ln1entry6;
    
    private JTextField Ln2entry1;
    private JTextField Ln2entry2;
    private JTextField Ln2entry3;
    private JTextField Ln2entry4;
    private JTextField Ln2entry5;
    private JTextField Ln2entry6;
    
    private JTextField Ln3entry1;
    private JTextField Ln3entry2;
    private JTextField Ln3entry3;
    private JTextField Ln3entry4;
    private JTextField Ln3entry5;
    private JTextField Ln3entry6;
        
    
    private JLabel sampleTextLabel;
    
    private JButton startBtn;
    private JButton resetBtn;
    
    private JLabel imageLbl;
    private Image img;
    
    private int[][] userGuesses;
    
    // </editor-fold>
    
 //<editor-fold defaultstate="collapsed" desc="main constructor">  
    public LottoGUI(){
        userGuesses = new int[3][6];
        setSize(500, 400); // length, width
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.white);
        add(mainPanel);
        
        // First Line
        Ln1entry1 = new JTextField();
        Ln1entry1.setDocument(new JTextFieldCharLimit(2));
        Ln1entry1.addKeyListener(new checkUserEntryListener());
        Ln1entry1.addFocusListener(new userEntryFocusListener());
        
        Ln1entry2 = new JTextField();
        Ln1entry2.setDocument(new JTextFieldCharLimit(2));
        Ln1entry2.addKeyListener(new checkUserEntryListener());
        Ln1entry2.addFocusListener(new userEntryFocusListener());
        
        Ln1entry3 = new JTextField();
        Ln1entry3.setDocument(new JTextFieldCharLimit(2));
        Ln1entry3.addKeyListener(new checkUserEntryListener());
        Ln1entry3.addFocusListener(new userEntryFocusListener());
        
        Ln1entry4 = new JTextField();
        Ln1entry4.setDocument(new JTextFieldCharLimit(2));
        Ln1entry4.addKeyListener(new checkUserEntryListener());
        Ln1entry4.addFocusListener(new userEntryFocusListener());
        
        Ln1entry5 = new JTextField();
        Ln1entry5.setDocument(new JTextFieldCharLimit(2));
        Ln1entry5.addKeyListener(new checkUserEntryListener());
        Ln1entry5.addFocusListener(new userEntryFocusListener());
        
        Ln1entry6 = new JTextField();
        Ln1entry6.setDocument(new JTextFieldCharLimit(2));
        Ln1entry6.addKeyListener(new checkUserEntryListener());
        Ln1entry6.addFocusListener(new userEntryFocusListener());
        
        // Second Line
        Ln2entry1 = new JTextField();
        Ln2entry1.setDocument(new JTextFieldCharLimit(2));
        Ln2entry1.addKeyListener(new checkUserEntryListener());
        Ln2entry1.addFocusListener(new userEntryFocusListener());
        
        Ln2entry2 = new JTextField();
        Ln2entry2.setDocument(new JTextFieldCharLimit(2));
        Ln2entry2.addKeyListener(new checkUserEntryListener());
        Ln2entry2.addFocusListener(new userEntryFocusListener());
        
        Ln2entry3 = new JTextField();
        Ln2entry3.setDocument(new JTextFieldCharLimit(2));
        Ln2entry3.addKeyListener(new checkUserEntryListener());
        Ln2entry3.addFocusListener(new userEntryFocusListener());
        
        Ln2entry4 = new JTextField();
        Ln2entry4.setDocument(new JTextFieldCharLimit(2));
        Ln2entry4.addKeyListener(new checkUserEntryListener());
        Ln2entry4.addFocusListener(new userEntryFocusListener());
        
        Ln2entry5 = new JTextField();
        Ln2entry5.setDocument(new JTextFieldCharLimit(2));
        Ln2entry5.addKeyListener(new checkUserEntryListener());
        Ln2entry5.addFocusListener(new userEntryFocusListener());
        
        Ln2entry6 = new JTextField();
        Ln2entry6.setDocument(new JTextFieldCharLimit(2));
        Ln2entry6.addKeyListener(new checkUserEntryListener());
        Ln2entry6.addFocusListener(new userEntryFocusListener());
        
        // Line Three
        Ln3entry1 = new JTextField();
        Ln3entry1.setDocument(new JTextFieldCharLimit(2));
        Ln3entry1.addKeyListener(new checkUserEntryListener());
        Ln3entry1.addFocusListener(new userEntryFocusListener());
        
        Ln3entry2 = new JTextField();
        Ln3entry2.setDocument(new JTextFieldCharLimit(2));
        Ln3entry2.addKeyListener(new checkUserEntryListener());
        Ln3entry2.addFocusListener(new userEntryFocusListener());
        
        Ln3entry3 = new JTextField();
        Ln3entry3.setDocument(new JTextFieldCharLimit(2));
        Ln3entry3.addKeyListener(new checkUserEntryListener());
        Ln3entry3.addFocusListener(new userEntryFocusListener());
        
        Ln3entry4 = new JTextField();
        Ln3entry4.setDocument(new JTextFieldCharLimit(2));
        Ln3entry4.addKeyListener(new checkUserEntryListener());
        Ln3entry4.addFocusListener(new userEntryFocusListener());
        
        Ln3entry5 = new JTextField();
        Ln3entry5.setDocument(new JTextFieldCharLimit(2));
        Ln3entry5.addKeyListener(new checkUserEntryListener());
        Ln3entry5.addFocusListener(new userEntryFocusListener());
        
        Ln3entry6 = new JTextField();
        Ln3entry6.setDocument(new JTextFieldCharLimit(2));
        Ln3entry6.addKeyListener(new checkUserEntryListener());
        Ln3entry6.addFocusListener(new userEntryFocusListener());
        
       // Other Layout
        lineOneLbl = new JLabel("Line One");
        lineOneLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        
        lineTwoLbl = new JLabel("Line Two");
        lineTwoLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        
        lineThreeLbl = new JLabel("Line Three");
        lineThreeLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        
        imageLbl = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/images/lotto3.png")).getImage();
        imageLbl.setIcon(new ImageIcon(img));
       
        sampleTextLabel = new JLabel("Pick your numbers");
        sampleTextLabel.setFont(new Font("Open Sans", Font.BOLD, 12));
        
        startBtn = new JButton("Play!");
        startBtn.setFont(new Font("Open Sans", Font.BOLD, 20));
        startBtn.addActionListener(new startGameActionListener());
        
        resetBtn = new JButton("Reset");
        resetBtn.setFont(new Font("Open Sans", Font.PLAIN, 11));
        resetBtn.addActionListener(new resetButtonActionListener());
                       
        // Set Bounds
        imageLbl.setBounds(-40, 0, 333, 112);  // x, y, width, height; panel 600x400
        lineOneLbl.setBounds(25, 130, 85, 30); // x, y, width, height
        lineTwoLbl.setBounds(25, 160, 85, 30);
        lineThreeLbl.setBounds(25, 190, 85, 30);
        resetBtn.setBounds(25, 230, 90, 30);
        
        sampleTextLabel.setBounds(25, 102, 140, 30);  // x, y, width, height
        Ln1entry1.setBounds(155, 135, 25, 25);
        Ln1entry2.setBounds(185, 135, 25, 25);
        Ln1entry3.setBounds(215, 135, 25, 25);
        Ln1entry4.setBounds(245, 135, 25, 25);
        Ln1entry5.setBounds(275, 135, 25, 25);
        Ln1entry6.setBounds(305, 135, 25, 25);
        
        Ln2entry1.setBounds(155, 165, 25, 25);
        Ln2entry2.setBounds(185, 165, 25, 25);
        Ln2entry3.setBounds(215, 165, 25, 25);
        Ln2entry4.setBounds(245, 165, 25, 25);
        Ln2entry5.setBounds(275, 165, 25, 25);
        Ln2entry6.setBounds(305, 165, 25, 25);
        
        Ln3entry1.setBounds(155, 195, 25, 25);
        Ln3entry2.setBounds(185, 195, 25, 25);
        Ln3entry3.setBounds(215, 195, 25, 25);
        Ln3entry4.setBounds(245, 195, 25, 25);
        Ln3entry5.setBounds(275, 195, 25, 25);
        Ln3entry6.setBounds(305, 195, 25, 25);
      
        //startBtn.setBounds(NULL, NULL, 150, 100);
        mainPanel.add(lineOneLbl);
        mainPanel.add(lineTwoLbl);
        mainPanel.add(lineThreeLbl);
        mainPanel.add(sampleTextLabel);
        
        mainPanel.add(resetBtn);
        mainPanel.add(imageLbl);
        
        mainPanel.add(Ln1entry1);
        mainPanel.add(Ln1entry2);
        mainPanel.add(Ln1entry3);
        mainPanel.add(Ln1entry4);
        mainPanel.add(Ln1entry5);
        mainPanel.add(Ln1entry6);
        
        mainPanel.add(Ln2entry1);
        mainPanel.add(Ln2entry2);
        mainPanel.add(Ln2entry3);
        mainPanel.add(Ln2entry4);
        mainPanel.add(Ln2entry5);
        mainPanel.add(Ln2entry6);
        
        mainPanel.add(Ln3entry1);
        mainPanel.add(Ln3entry2);
        mainPanel.add(Ln3entry3);
        mainPanel.add(Ln3entry4);
        mainPanel.add(Ln3entry5);
        mainPanel.add(Ln3entry6);

        //this.pack();
        //mainPanel.add(startBtn, BorderLayout.SOUTH);
       
    } // END: Constructor
// </editor-fold>    
    
    
    /**************************************************        
    START: Helper Methods
    **************************************************/
    
    public JLabel getLogo(){
        return this.imageLbl;
        
    }
    
    public JButton getStartButton(){
        return this.startBtn;
    }
    
    
    /**************************************************    
    END: Helper Methods
    **************************************************/
    
    
// <editor-fold defaultstate="collapsed" desc="Event Listeners">
    public class startGameActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Lotto myGame = new Lotto();
            myGame.setUserGuesses(0, 0, Ln1entry1);
            myGame.setUserGuesses(0, 1, Ln1entry2);
            myGame.setUserGuesses(0, 2, Ln1entry3);
            myGame.setUserGuesses(0, 3, Ln1entry4);
            myGame.setUserGuesses(0, 4, Ln1entry5);
            myGame.setUserGuesses(0, 5, Ln1entry6);
            
            myGame.setUserGuesses(1, 0, Ln2entry1);
            myGame.setUserGuesses(1, 1, Ln2entry2);
            myGame.setUserGuesses(1, 2, Ln2entry3);
            myGame.setUserGuesses(1, 3, Ln2entry4);
            myGame.setUserGuesses(1, 4, Ln2entry5);
            myGame.setUserGuesses(1, 5, Ln2entry6);
            
            myGame.setUserGuesses(2, 0, Ln3entry1);
            myGame.setUserGuesses(2, 1, Ln3entry2);
            myGame.setUserGuesses(2, 2, Ln3entry3);
            myGame.setUserGuesses(2, 3, Ln3entry4);
            myGame.setUserGuesses(2, 4, Ln3entry5);
            myGame.setUserGuesses(2, 5, Ln3entry6);
            
           // JOptionPane.showMessageDialog(null, myGame.showArrayContent(myGame.getUserGuesses()));
            myGame.checkUserEntries();
            myGame.showResults();
        }
        
    } // END: startGameActionListener()
    
    public class checkUserEntryListener implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
                    getToolkit().beep();
                    //JOptionPane.showMessageDialog(null, "Only numbers between 1 - 47");
                    e.consume();
                }
        }

        @Override
        public void keyPressed(KeyEvent e) {
           return;
        }

        @Override
        public void keyReleased(KeyEvent e) {
            return;
        }
    } // end of checkUserEntryListener
    
    public class userEntryFocusListener implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            e.getComponent().setBackground(Color.green);
        }

        @Override
        public void focusLost(FocusEvent e) {
         // getUserEntry(Integer.parseInt(e.getComponent().getName().toString()));
         
         // JOptionPane.showMessageDialog(null, comp.getText());
            JTextField comp = (JTextField)e.getComponent();           
            int userInput = Integer.parseInt(comp.getText());
            int[] inputCache = new int[18];
            
            if (userInput < 1 || userInput > 47) {
                JOptionPane.showMessageDialog(mainPanel, "Please enter a number between 1 and 47");
                comp.setText(""); 
                comp.setBackground(Color.white);
            } else {
                e.getComponent().setBackground(Color.white);  
            }                
        }
    }  // end of userEntryFocusListener
    
    public class resetButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Toasty!");
        }
    }
// </editor-fold>
}

