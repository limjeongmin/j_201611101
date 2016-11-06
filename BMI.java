class BMI {
	public String yourbmi(float weight, float height) {
		float bmi=(float) weight/(height *height);
		System.out.printf("bmi = %.1f\n", bmi);
		
		if (bmi >= 18.5 && bmi<=24.99) {
			return "normal weight";
		} 
		else if (bmi >= 25 && bmi<=29.9) {
			return "overweight" ;
		}
		else if (bmi >= 30 && bmi<=40) {
			return "obesity";
		}
		else{
			return "error";
		}
	}
	public static void main(String[] args) {
		float weight = (float)75.0;
		float height = (float)1.7;
		BMI b=new BMI();
		String comp = b.yourbmi(weight,height);
		System.out.prinf("Your weight = %.1f kg and height = %.1f m is %s\n", weight, height, comp)
	}
}

