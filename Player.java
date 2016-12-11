package com.sd.dice;

public class Player{
	private String name;
	private int num;
	
	public Player(String s) {
		name =s;
		num=0;
	}
	public void play(){
		Dice d=new Dice();
		d.roll();
		int num1=d.getNum();
		d.roll();
		int num2=d.getNum();
		d.roll();
		num=num1+num2;
		System.out.println(name+ "Turn on"+num1+num2+"="+num);this.num=d.getNum();
	}	
	public void addNum(int a){
		num=num +a;
	}
	public int getNum(){
		return num;
	}
	public String getName(){
		return this.name;
	}
	public int getScore(){
		int score=0;
		score=score+1;
		return score;
	}
}