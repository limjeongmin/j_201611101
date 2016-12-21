package com.sd.ch8;

public class sayHello{

	private String name;
	
	public sayHello(String name){
		this.name=name;
	}
	
	public void Hello(){
		System.out.println("Say hello"+ name);
	}
	
	public static void main(String[] args){
	
		sayHello[] h=new sayHello[6];
		h[0]= new sayHello("ljm");
		h[1]= new sayHello("ljm1");
		h[2]= new sayHello("ljm2");
		h[3]= new sayHello("ljm3");
		h[4]= new sayHello("ljm4");
		h[5]= new sayHello("ljm5");
		for(sayHello e:h){
			e.Hello();
		}
	}
}
		