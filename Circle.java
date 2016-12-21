package com.sd.ch8;

import java.math.*;

public class Circle extends Point{
	private double radius;
	public double area;
	
	public Circle(int x,int y,double r){
		super();
		radius = r;
	}
	public double getArea(){
		double area= radius*radius*Math.PI;
		return area;
	}
	public void calcArea(){
		System.out.println("Area is "+ area);
	}
	public static void main(String[] args){
		Circle c =new Circle(10,10,20);
		c.getArea();
		c.calcArea();
	}
}