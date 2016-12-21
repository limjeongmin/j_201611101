class MakeTriangle{
	StringBuffer sbuf=new StringBuffer();
	String s="*";
	String b=" ";
	void makeTriangle(){
		for(int i=0;i<6;i++){
			for(int j=0;j<i;j++){
				sbuf.append(b);
			}
			for(int k;k<(11-(2*i));k++){
				sbuf.append(s);
			}
			
			System.out.prinf("%s\n",sbuf.toString());
			sbuf.delete(0,sbuf.length());
		}
	}
	
	public static void main(String[] args){
		new MakeTriangle().makeTriangle();
	}
}