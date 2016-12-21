package com.sd.ch8;
public class Rectangle{  
	protected double width;  
	protected double length;
	protected boolean isSelected;
	public Rectangle(double l, double w){  
		length=l;  
		width=w;  
	}  
	public double getLength(){  
		return this.length;  
	}  
	public double getWidth(){  
		return this.width;  
	}  
	public void setSelected(boolean b){  
		this.isSelected=b;  
	}  
	public boolean getSelected(){
		return isSelected;
	}  
}