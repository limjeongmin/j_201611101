class LeapYear{
	public void leapYear(int[] year){
		for(int y:year){
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) {
				System.out.printf("%d is leap year\n"+ y);								
			} 
			else{		
				System.out.println("%d is not leapyear"+y);
			}		
		}
	}		
	public static void main(String[] args){
		int[] year={1869, 1997, 2002, 2016, 1711};
		LeapYear ly=new LeapYear();
		ly.leapyear(year);
	}
}
