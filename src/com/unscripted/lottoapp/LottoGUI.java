/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unscripted.lottoapp;

import java.awt.BorderLayout;
import java.awt.Color;
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


/**
 *
 * @author dONY
 */
public class LottoGUI extends JFrame {
    private JPanel mainPanel;
    private JPanel userEntry;
        
 // textboxes to receive user entry
    private JTextField entryOne;
    private JTextField entryTwo;
    private JTextField entryThree;
    private JTextField entryFour;
    private JTextField entryFive;
    private JTextField entrySix;
        
    private JLabel lineOneLbl;
    private JTextField lineOneTxtfield;
    
    private JLabel lineTwoLbl;
    private JTextField lineTwoTxtfield;
    
    private JLabel lineThreeLbl;
    private JTextField lineThreeTxtfield;
    
    private JLabel sampleTextLabel;
    
    
    private JButton startBtn;
    private JButton confirmBtn;
    
    private JLabel imageLbl;
    private Image img;
    
    /*
        Constructor    
    */
    public LottoGUI(){
        setSize(500, 400); // length, width
        setLocationRelativeTo(null);
        

       
        
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.white);
        add(mainPanel);
        
        entryOne = new JTextField();
        entryOne.setDocument(new JTextFieldCharLimit(2));
        entryOne.addKeyListener(new checkUserEntryListener());
        entryOne.addFocusListener(new userEntryFocusListener());
        
        entryTwo = new JTextField();
        entryTwo.setDocument(new JTextFieldCharLimit(2));
        entryTwo.addKeyListener(new checkUserEntryListener());
        entryTwo.addFocusListener(new userEntryFocusListener());
        
        entryThree = new JTextField();
        entryThree.setDocument(new JTextFieldCharLimit(2));
        entryThree.addKeyListener(new checkUserEntryListener());
        entryThree.addFocusListener(new userEntryFocusListener());
        
        entryFour = new JTextField();
        entryFour.setDocument(new JTextFieldCharLimit(2));
        entryFour.addKeyListener(new checkUserEntryListener());
        entryFour.addFocusListener(new userEntryFocusListener());
        
        entryFive = new JTextField();
        entryFive.setDocument(new JTextFieldCharLimit(2));
        entryFive.addKeyListener(new checkUserEntryListener());
        entryFive.addFocusListener(new userEntryFocusListener());
        
        entrySix = new JTextField();
        entrySix.setDocument(new JTextFieldCharLimit(2));
        entrySix.addKeyListener(new checkUserEntryListener());
        entrySix.addFocusListener(new userEntryFocusListener());
        
        // Set bounds
        
        
        mainPanel.add(entryOne);
        mainPanel.add(entryTwo);
        mainPanel.add(entryThree);
        mainPanel.add(entryFour);
        mainPanel.add(entryFive);
        mainPanel.add(entrySix);
        
        
        lineOneLbl = new JLabel("Line One");
        lineOneLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        lineOneTxtfield = new JTextField();
        
        lineTwoLbl = new JLabel("Line Two");
        lineTwoLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        lineTwoTxtfield = new JTextField();
        
        lineThreeLbl = new JLabel("Line Three");
        lineThreeLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
        lineThreeTxtfield = new JTextField();
        
        imageLbl = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/images/lotto3.png")).getImage();
        imageLbl.setIcon(new ImageIcon(img));
        
        
        sampleTextLabel = new JLabel("Pick your numbers");
        sampleTextLabel.setFont(new Font("Open Sans", Font.BOLD, 12));
        
        
        startBtn = new JButton("Play!");
        startBtn.setFont(new Font("Open Sans", Font.BOLD, 20));
        
        confirmBtn = new JButton("Add Line");
        confirmBtn.setFont(new Font("Open Sans", Font.BOLD, 11));
        
                        
        // set bounds
        imageLbl.setBounds(-40, 0, 333, 112);  // x, y, width, height; panel 600x400
        lineOneLbl.setBounds(25, 130, 85, 30); // x, y, width, height
        lineTwoLbl.setBounds(25, 160, 85, 30);
        lineThreeLbl.setBounds(25, 190, 85, 30);
        confirmBtn.setBounds(335, 102, 90, 30);
        
        
        sampleTextLabel.setBounds(25, 102, 140, 30);  // x, y, width, height
        entryOne.setBounds(155, 105, 25, 25);
        entryTwo.setBounds(185, 105, 25, 25);
        entryThree.setBounds(215, 105, 25, 25);
        entryFour.setBounds(245, 105, 25, 25);
        entryFive.setBounds(275, 105, 25, 25);
        entrySix.setBounds(305, 105, 25, 25);
        
      
        //startBtn.setBounds(NULL, NULL, 150, 100);
        mainPanel.add(lineOneLbl);
        mainPanel.add(lineTwoLbl);
        mainPanel.add(lineThreeLbl);
        mainPanel.add(sampleTextLabel);
        
        mainPanel.add(confirmBtn);
        mainPanel.add(imageLbl);

        //this.pack();
        //mainPanel.add(startBtn, BorderLayout.SOUTH);
       
    } 
    /*    
        end of constructor LottoGUI
    */

    public JLabel getLogo(){
        return this.imageLbl;
        
    }
    
    public JButton getStartButton(){
        return this.startBtn;
    }
    
    public class startGameActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    } // end of class
    
    public class checkUserEntryListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
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
    }
    
    public class userEntryFocusListener implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            e.getComponent().setBackground(Color.green);
        }

        @Override
        public void focusLost(FocusEvent e) {
            e.getComponent().setBackground(Color.white);
        }
        
    }
   
}
            
            
            

    

