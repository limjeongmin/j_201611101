package com.sd.DiceGame; 
import com.sd.DiceGame.*; 
class Dice { 
private int num = 0; 
public void roll() {   
num = (int) (Math.random() * 6)+1;
} 
public int getNum() {
return this.num;  
} 
} 
