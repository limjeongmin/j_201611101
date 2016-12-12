package com.sd.gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
  JTextField radiusTf1;
  JTextField areaTf2;
  JButton b1;
  JButton b2;
  public CalcAreaGUIMain2() {
    JPanel panel=new JPanel(new GridLayout(3,2));
    getContentPane().add(panel);
    JLabel label1=new JLabel("radius");
    JLabel label2=new JLabel("area");
    radiusTf1=new JTextField(10);
    areaTf2=new JTextField(10);
    b1=new JButton("calc");
    b2=new JButton("cancle");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b1.setPreferredSize(new Dimension(40,40));
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
  }
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
	if(b == b1){
		b.setText("result");
		Double r=Double.parseDouble(radiusTf1.getText());
		areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
	}
	else if (b==b2){
		radiusTf1.setText("");
		areaTf2.setText("");
	}
  }
  public static void main(String[] args){
    CalcAreaGUIMain2 c=new CalcAreaGUIMain2();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
	c.pack();
    c.setVisible(true);
  }	
} 