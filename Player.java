package com.sd.DiceGame;
import com.sd.DiceGame.*;
public class Player { 
private String name=null; 
private int num=0; 
public Player(String _name) { 
name=_name; 
} 
public void play() { 
Dice d=new Dice();
d.roll();
int num1=d.getNum();
d.roll()
int num2=d.getNum(); 
d.roll();
num=num1+num2;
System.out.printIn(name+"Turn on"+num1+num2+"="+num);this.num=d.getNum(); 
} 
public String getName() { 
return this.name; 
} 
public int getNum() { 
return this.num; 
} 
} 
