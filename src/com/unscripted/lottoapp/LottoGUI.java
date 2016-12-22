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
    Lotto inGame = new Lotto();
    
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
    private JButton saveBtn;
    private JButton loadBtn;
    
    private JLabel imageLbl;
    private Image img;
    
    private int[][] userGuesses;
    
    // </editor-fold>
    
 //<editor-fold defaultstate="collapsed" desc="main constructor">  
    public LottoGUI(){
        userGuesses = new int[3][6];
        setSize(375, 350); // width, height
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.white);
        add(mainPanel);
        
        
        // <editor-fold defaultstate="collapsed" desc="field level setup">        
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
//</editor-fold>        

     // Other Layout Elements
        lineOneLbl = new JLabel("Line One");
        lineOneLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        
        lineTwoLbl = new JLabel("Line Two");
        lineTwoLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        
        lineThreeLbl = new JLabel("Line Three");
        lineThreeLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        
     // Get image file to add to JLabel
        imageLbl = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/resources/lotto3.png")).getImage();
        imageLbl.setIcon(new ImageIcon(img));
       
        sampleTextLabel = new JLabel("Pick your numbers");
        sampleTextLabel.setFont(new Font("Open Sans", Font.BOLD, 12));
        
        startBtn = new JButton("Play!");
        startBtn.setFont(new Font("Open Sans", Font.BOLD, 20));
        startBtn.addActionListener(new startGameActionListener());
        
        saveBtn = new JButton("Save Numbers");
        saveBtn.setFont(new Font("Open Sans", Font.PLAIN, 11));
        saveBtn.addActionListener(new btnSaveLoadListener());
        
        loadBtn = new JButton("Load Numbers");
        loadBtn.setFont(new Font("Open Sans", Font.PLAIN, 11));
        loadBtn.addActionListener(new btnSaveLoadListener());
                       
        // Set Bounds
        imageLbl.setBounds(-40, 0, 333, 112);  // x, y, width, height; panel 600x400
        lineOneLbl.setBounds(25, 130, 85, 30); // x, y, width, height
        lineTwoLbl.setBounds(25, 160, 85, 30);
        lineThreeLbl.setBounds(25, 190, 85, 30);
        
        saveBtn.setBounds(25, 230, 155, 30);
        loadBtn.setBounds(175, 230, 155, 30);
        
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
        
        
        mainPanel.add(imageLbl);
        mainPanel.add(saveBtn);
        mainPanel.add(loadBtn);
        
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
            
            inGame.setUserGuesses(0, 0, Ln1entry1);
            inGame.setUserGuesses(0, 1, Ln1entry2);
            inGame.setUserGuesses(0, 2, Ln1entry3);
            inGame.setUserGuesses(0, 3, Ln1entry4);
            inGame.setUserGuesses(0, 4, Ln1entry5);
            inGame.setUserGuesses(0, 5, Ln1entry6);
            
            inGame.setUserGuesses(1, 0, Ln2entry1);
            inGame.setUserGuesses(1, 1, Ln2entry2);
            inGame.setUserGuesses(1, 2, Ln2entry3);
            inGame.setUserGuesses(1, 3, Ln2entry4);
            inGame.setUserGuesses(1, 4, Ln2entry5);
            inGame.setUserGuesses(1, 5, Ln2entry6);
            
            inGame.setUserGuesses(2, 0, Ln3entry1);
            inGame.setUserGuesses(2, 1, Ln3entry2);
            inGame.setUserGuesses(2, 2, Ln3entry3);
            inGame.setUserGuesses(2, 3, Ln3entry4);
            inGame.setUserGuesses(2, 4, Ln3entry5);
            inGame.setUserGuesses(2, 5, Ln3entry6);
            
           // JOptionPane.showMessageDialog(null, inGame.showArrayContent(inGame.getUserGuesses()));
            inGame.checkUserEntries();
            inGame.showResults();
        }
        
    } // END: startGameActionListener()
    
    public class checkUserEntryListener implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Only numbers between 1 - 47");
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
            
            
            if (userInput < 1 || userInput > 47) {
                comp.setBackground(Color.white); 
                JOptionPane.showMessageDialog(mainPanel, "Please enter a number between 1 and 47");
                comp.setText(""); 
            } else {
                
                e.getComponent().setBackground(Color.white);  
            }                
        }
    }  // end of userEntryFocusListener

    
    public class btnSaveLoadListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == saveBtn){
                int[] list = new int[18];
                
                list[0] = Integer.parseInt(Ln1entry1.getText());
                list[1] = Integer.parseInt(Ln1entry2.getText());
                list[2] = Integer.parseInt(Ln1entry3.getText());
                list[3] = Integer.parseInt(Ln1entry4.getText());
                list[4] = Integer.parseInt(Ln1entry5.getText());
                list[5] = Integer.parseInt(Ln1entry6.getText());
                
                list[6] = Integer.parseInt(Ln2entry1.getText());
                list[7] = Integer.parseInt(Ln2entry2.getText());
                list[8] = Integer.parseInt(Ln2entry3.getText());
                list[9] = Integer.parseInt(Ln2entry4.getText());
                list[10] = Integer.parseInt(Ln2entry5.getText());
                list[11] = Integer.parseInt(Ln2entry6.getText());
                
                list[12] = Integer.parseInt(Ln3entry1.getText());
                list[13] = Integer.parseInt(Ln3entry2.getText());
                list[14] = Integer.parseInt(Ln3entry3.getText());
                list[15] = Integer.parseInt(Ln3entry4.getText());
                list[16] = Integer.parseInt(Ln3entry5.getText());
                list[17] = Integer.parseInt(Ln3entry6.getText());
                inGame.saveGame(list);
            } else if (e.getSource() == loadBtn){
               // int[] loaded = inGame.loadGame();
                
//                Ln1entry1.setText(toString(loaded[0]));
//                Ln1entry2.setText(toString(loaded[1]));
                Ln1entry3.getText();
                Ln1entry4.getText();
                Ln1entry5.getText();
                Ln1entry6.getText();
                
                Ln2entry1.getText();
                Ln2entry2.getText();
                Ln2entry3.getText();
                Ln2entry4.getText();
                Ln2entry5.getText();
                Ln2entry6.getText();
                
                Ln3entry1.getText();
                Ln3entry2.getText();
                Ln3entry3.getText();
                Ln3entry4.getText();
                Ln3entry5.getText();
                Ln3entry6.getText();
                
                
            }
        }
        
    } // end of btnSaveLoadListener 
    
// </editor-fold>
}

