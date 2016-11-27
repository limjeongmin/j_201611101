public class ReverseHello{
	void reverse(String word){
		char[] chArr=word.toCharArray();
		StringBuilder sd=new StringBuilder();
		for(int i=chArr.length-1;i>=0;i--){
			sd.append(chArr[i]);
		}
		System.out.println(sd);
	}
	public static void main(String[] args){
		String hello="hello";
		new ReverseHello().reversehello(hello);
	}
}