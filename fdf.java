import java.util.ArrayList;
class fdf{
	static ArrayList<Integer> arr=new ArrayList<Integer>();
	fdf(){
		DivideNumbers();
		sumList();
		System.out.println("1~1000의 수 중 4로 나눠지고 5로 나눠지지 않는 수의 합=%d\n" ,sumList())
		}
		
		
	void DivideNumbers(ArrayList<Integer> arr){
		for (i=1;i<=1000;i++) {
			if (i%4==0 && i%5!=0) {
			arr.add(i);
		}
	}
	System.out.println(arr);
	}
	
	
	int sumList(Arraylist<Integer> arr){
		int sum=0;
		int maxiter=arr.size();
		for(int j=0; j<maxiter; j++){
			sum+=mylist.get(j);
		}
		return sum;
	}
			
	public static void main(String[] args) {
		fdf d=new fdf();
		d.DivideNumbers(arr);
		System.out.println("Sum is" +n.sumList(arr));
	}
}
		