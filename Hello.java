package com.sd.ch8:

public class Hello{
	private String name;
	public Hello(String name){
		this.name =name;
	}
	
	public void sayHello() {
		System.out.println("Hello" + name);
	}
	
	public static void main(String[] args){
		Hello[] h=new Hello[5];
		h[0]=new Hello("jml1")
		h[1]=new Hello("jml2")
		h[2]=new Hello("jml3")
		
		for (int i=0;i<h.length;i++){
			System.out.println(h[i]);
			h[i].sayHello();
		}
	}
}