package com.sd.dice;

public class Mal extends Dice{
	
	private String mal=null;
	
	public int roll() {
		setNum((int)(Math.random() * 6)+1);
		setting();
		return getNum();	
	}
	
	public void setting(){
		if(getNum() == 0){
			mal= "yut";
		}
		else if(getNum() == 1){
			mal="do";
		}
		else if(getNum() == 2){
			mal="gae";
		}
		else if(getNum() == 3){
			mal="gul";
		}
		else if(getNum() == 4){
			mal="mo";
		}
		else if(getNum()==5){
			mal="backdo";
		}
	}
	public String addYut(){
		return this.mal;
	}
}