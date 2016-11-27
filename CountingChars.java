import java.util.*;

class CountChars {
	static Map countChars(String str) {
		Map<String, Integer> wc = new HashMap<String, Integer>();
		
		void countChars(Stirng strs){
		
		char[] letters=strs.toCharArray();
		String s;
		
		for(char C : strarry) {
			s=Character.toString(c);
			if(wc.containsKey(s)) {
				wc.put(s, wc.get(s) + 1);
			}
			else{
			wc.put(s,1);
			}
		}
		System.out.println(wc);
		}
		
		public static void main(Stirng[] args){
			String letters="sangmyung university";
			new CountChars().countChars(letters);
		}
	}
}	