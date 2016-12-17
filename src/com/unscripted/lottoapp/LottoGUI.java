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
import java.awt.Image;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 *
 * @author dONY
 */
public class LottoGUI extends JFrame {
    private JPanel gamePanel;
    
        
    private JLabel lineOneLbl;
    private JTextField lineOneTxtfield;
    
    private JLabel lineTwoLbl;
    private JTextField lineTwoTxtfield;
    
    private JLabel lineThreeLbl;
    private JTextField lineThreeTxtfield;
    
    private JLabel sampleTextLabel;
    private JTextField sampleTextField;
    
    private JButton startBtn;
    private JButton confirmBtn;
    
    private JLabel imageLbl;
    private Image img;
    
    public LottoGUI(){
        setSize(600, 400);
        setLocationRelativeTo(null);
                        
        gamePanel = new JPanel();
        gamePanel.setLayout(null);
        gamePanel.setBackground(Color.white);
        add(gamePanel);
        
        lineOneLbl = new JLabel("Line One");
        lineOneTxtfield = new JTextField();
        
        lineTwoLbl = new JLabel("Line Two");
        lineTwoTxtfield = new JTextField();
        
        lineThreeLbl = new JLabel("Line Three");
        
        lineThreeTxtfield = new JTextField();
        
        imageLbl = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/images/lotto3.png")).getImage();
        imageLbl.setIcon(new ImageIcon(img));
        
        
        sampleTextLabel = new JLabel("Pick your numbers");
        sampleTextField = new JTextField(12);
        
        startBtn = new JButton("Play!");
        startBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
        
        confirmBtn = new JButton("Confirm");
        confirmBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        
        
        
        // set bounds
        imageLbl.setBounds(-40, 0, 333, 112);  // x, y, width, height; panel 600x400
        lineOneLbl.setBounds(25, 130, 60, 30); // x, y, width, height
        lineTwoLbl.setBounds(25, 160, 60, 30);
        lineThreeLbl.setBounds(25, 190, 60, 30);
        confirmBtn.setBounds(295, 100, 80, 30);
        
        
        sampleTextLabel.setBounds(25, 100, 140, 30);
        sampleTextField.setBounds(145, 100, 150, 30);
        
        
        //startBtn.setBounds(NULL, NULL, 150, 100);
        
        gamePanel.add(lineOneLbl);
        gamePanel.add(lineTwoLbl);
        gamePanel.add(lineThreeLbl);
        gamePanel.add(sampleTextLabel);
        gamePanel.add(sampleTextField);
        gamePanel.add(confirmBtn);
        gamePanel.add(imageLbl);

        
        //gamePanel.add(startBtn, BorderLayout.SOUTH);
       
        
        
    } // end of constructor LottoGUI
    
      
    public JButton getStartButton(){
        return this.startBtn;
    }
    
    public class startGameActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
}
