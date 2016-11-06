class Multiple{
	public void multiple(){
		int sum=0;
		for (int i=0; i<1000; i++){
			if (i%3==0){
				sum +=i;
			}
			else if (i%5==0){
				sum +=i;
			}	
			else{
			}
		}
		public static void main(String[] args){
			Multiple m=new Multiple();
			m.multiple();
			System.out.println("Sum = " + sum);
		}
	}
}