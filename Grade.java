class Grade{
	char result;
	char grade(double score){
		if(90<= score && score <=100){
			result = 'A';
			return result;
		}
		else if(80<= score && socre<90){
			reslut = 'B'
			return reslut;
		}
		else if(70<= score && score<80){
			reslut = 'C'
			return reslut;
		}
		else if(60<= score && score<70){
			reslut = 'D';
			return reslut;
		}
		else{
			reslut = 'F';
			return reslut;
		}
	}
	void yourGrade(char x){
		System.out.println("Your grade is" +x);
	}
	public static void main(String[] args){
		Grade g=new Grade();
		double[] marks = {91.0, 87.0, 57.0, 68.0, 77.0, 43.0};
		for(double m:marks){
			char r = g.grade(m);
			g.yourGrade(r);
		}
	}
}