import ch.aplu.turtle.*;

public class P3_TurtleTracksMain {
	static void drawSquareFrom(double[][]tracks) {
		Turtle t1=new Turtle();
		t1.penup();
		for(double[] t:tracks){
			t1.pendown();
			t1.moveTo(t[0],t[1]);
		}
	}
	public static void main(String[] args){
		double tracks[][]={{100,100},{200,100},{200,200},{100,200},{100,100}};
		drawSquareFrom(tracks);
	}
}
		
		