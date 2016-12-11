package com.sd.dice;
import java.util.Scanner;

import javax.swing.JFrame;

public class YutGame{
	int[] a=new int[4];
	
		Player p1; 
		Player p2; 
		
	
		public void startGame(String name1,String name2) { 
			Player p1 = new Player(name1); 
			Player p2 = new Player(name2); 
			p1.play(); 
			p2.play(); 
		int n=2;
		YutGame yg=new YutGame();
		while(p1.getNum()<50 && p2.getNum()<50){
			if(n%2==0){
				yg.reset();
				yg.show(yg.check());
				p1.addNum(yg.check());
				System.out.println( p1.getName()+": "+p1.getNum());
				while(yg.check()==4|yg.check()==5){
					yg.reset();
					yg.show(yg.check());
					p1.addNum(yg.check());
					System.out.println(p1.getName()+":"+p1.getNum());
				}
				n=n+1;
			}
			else{
				yg.reset();
				yg.show(yg.check());
				p2.addNum(yg.check());
				System.out.println(p2.getName()+": "+p2.getNum());
				while(yg.check()==4|yg.check()==5){
					yg.reset();
					yg.show(yg.check());
					p2.addNum(yg.check());
					System.out.println(p2.getName()+": "+p2.getNum());
				}
				n=n+1;
			}
		}
		if (p1.getNum()==50){
			System.out.println(p1.getName()+" win!");
		}
		else{
			System.out.println(p2.getName()+" win!");
		}
		}
	
	public int check(){
		int num=0;
		for(int n:a)
			if(n==1)
				num=num+1;
		if(num==0){
			return 4;
		}
		if(num==1){
			return 1;
		}
		if(num==2){
			return 2;
		}
		if(num==3){
			return 3;
		}
		if(num==4){
			return 5;
		}
		return 0;
	}
	
	public void reset(){
		for(int i=0;i<4;i++){
			a[i]=(int)(Math.random()*1000)%2;
		}
	}
	
	public void show(int num){
		if(num == 0){
			System.out.println("Yuk");
		}
		else if(num == 1){
			System.out.println("do");
		}
		else if(num == 2){
			System.out.println("gae");
		}
		else if(num == 3){
			System.out.println("girl");
		}
		else if(num == 4){
			System.out.println("mo");
		}
		else if(num ==5){
			System.out.println("backdo");
		
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("What is player1's name?");
        String name1=sc.nextLine();
        System.out.println("What is player2's name?");
        String name2=sc.nextLine();
		new YukGame().startGame(name1,name2);
	}	
}

