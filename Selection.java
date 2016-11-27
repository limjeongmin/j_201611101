package com.sd.ch8;
import java.util.*;
public class Selection{
	Arraylist<Rectangle> Arr= new Arraylist<Rectangle>;
	Selection(){}
	
	public void select(Rectangle r){
		r.setSelected(true);
		Arr.add(r);
		System.out.println('Selected "+ r.isSelected);
	}
	
	public static void main(String[] args){
		Rectangle r=new Rectangle(20.0,30.0);
		Cube c=new Cube(20.0,30.0,40.0);
		Selection s=new Selection();
		s.select(r);
		s.select(c);
		s.print();
	}
	
	public void print(){
		for(Rectangle r:sArr){
			System.out.println(r.toString());
		}
	}