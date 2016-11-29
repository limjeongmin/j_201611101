package com.sd.ch8;
import com.sd.ch8;
import java.math.*;

public class Circle extends Point{
	private double radius;
	public double area;
	public Circle(int x,int y,double r){
		super(x,y);
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
		Circle c=new Circle(10.0,10.0,20.0);
		c.getArea();
		c.clacArea();
	}
}