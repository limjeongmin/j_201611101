public class StringTriangle{
	String s1,s2;
	StringBuffer sb;
	
	public StringTriangle(){
		s1="*";
		s2=" ";
		sb= new StringBuffer();
	}
	
	public void triangle(int n){
		for(int i =0; i<n; i++) {
			for(int j=n; j>i; j--)
				sb.append(s2);
			for(int j=0; j<(2*i -1); j++)
				sb.append(s1);;
			
			System.out.printf("%s\n", sb.toString());
			sb.delete(0, sb.length());
		}
	}
	
	public statci void main(String[] args){
		StringTriangle st =new StringTriangle();
		st.triangle(7);
	}
}