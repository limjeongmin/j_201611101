package com.sd.DiceGame;
import com.sd.DiceGame.*;
class DiceGame{
private Player p1;
private Player p2;
public void startGame(){
p1=new Player("A");
p2=new Player("B");
p1.play();
p2.play();
if (p1.getNum() > p2.getNum()){
System.out.println(p1.getName()+"won");
} 
else if (p1.getNum() == p2.getNum()) {
System.out.println("draw");
}
else {
System.out.pritnln(p2.getName() + "won");
}
public static void main(String[] args){
DiceGame d=new DiceGame();
d.startGame();
}
}