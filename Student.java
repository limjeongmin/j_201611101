import java.util.ArrayList;
import java.util.Collections;

public class Student{
	private String name;
	private int stdNum;
	
	Student(String name,int stdNum){
		this.name=name;
		this.stdNum=stdNum;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args){
		ArrayList<String> snl=new ArrayList<String>();
		Student s1=new Student("LJM",201611101);
		Student s2=new Student("KMH",201611057);
		
		snl.add(s1.getName());
		snl.add(s2.getName());
		Collections.sort(snl);
		System.out.println(snl);
	}
}
		