import java.util.Calendar;

public class FirstDay{
	public void date()[
		Calendar c= Calendar.getInstance();
		int sum=0;
		for(int i =1901; i<=2000; i++){
			for(int j=0;j<12;j++){
				c.set(i,j,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					sum++;
				}
			}
		}
		System.out.prinfln("The First Day"+sum);
	}
	public static void main(String[] args){
		new FirstDay().date();