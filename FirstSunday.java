import java.util.Calendar;

class FirstSunday{
	int aYear;
	int bYear;
	int times;

	public FirstSunday(){
		aYear=1901;
		bYear=2000;
		times=0;
	}
	
	public void firstsunday(){
		for(int i=aYear; i<=bYear; i++){
			for(int j=0; j<12; j++){
				Calendar c=Calendar.getInstance();
				c.set(i,j,1);
				if(c.get(Calendar.DAY_DF_WEEK)==1)
					times++;
			}
		}
		System.out.println("The First Sunday in 20th contury is" + times+ "times");
	}
	
	public static void main(String[] args){
		FirstSunday fd=new FirstSunday();
		fd.firstsunday();
	}
}
	