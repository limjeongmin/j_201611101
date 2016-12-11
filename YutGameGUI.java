package com.sd.dice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class YutGameGUI extends JFrame implements ActionListener {
   JTextField p1Tf;
   JTextField p2Tf;
   JButton b1;
   JButton b2; 

   public YutGameGUI() {
      setTitle("The YutGame!");
      JPanel panel = new JPanel(new GridLayout(3,2));
      getContentPane().add(panel);
      
	  JLabel label=new JLabel();
      JLabel label1=new JLabel("Player 1");
      JLabel label2=new JLabel("Player 2");
      JLabel label3 = new JLabel("Who is the winner?");
	  
	  panel.setBackground(Color.ORANGE);
	  
      
      p1Tf=new JTextField(10);
      p2Tf=new JTextField(10);

      
      b1=new JButton("Start Game");
      b2=new JButton("Cancle");
      
      b1.addActionListener(this);
      b2.addActionListener(this);
	  
      
	  panel.add(label1);
      panel.add(label2);
      panel.add(label3);
      panel.add(p1Tf);
      panel.add(p2Tf);
      panel.add(b1);
      panel.add(b2);   
   }
   
   
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource();
      if (b == b1) {
            b1.setText("Start");
            String name1 = p1Tf.getText();
            String name2 = p2Tf.getText(); 
			YutGame yg=new YutGame();
            new YutGame().startGame(name1,name2);
            
            p1Tf.setText(p1Tf.getText());
            p2Tf.setText(p2Tf.getText());
             
            
			
         }
      
      else if (b == b2) {
         p1Tf.setText("");
         p2Tf.setText("");

         b1.setText("Replay");
   
      }
   }
   
   public static void main(String[] args) {
      YutGameGUI yggui = new YutGameGUI();
      yggui.setDefaultCloseOperation(EXIT_ON_CLOSE);
      yggui.pack();
      yggui.setVisible(true);
   }
}