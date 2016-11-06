class RockScissorsPapper{
	String sel1, sel2;
	public RockScissorsPapper(String sel1, String sel2){
		this.sel1 =sel1;
		this.sel2 =sel2;
		rspGame(sel1,sel2);
	}
	
	public void rspGame(String sel1, String sel2){
		if (sel1.equals("s") && sel2.equals("r")) {
			System.out.println("sel2 won");
		}
			else if (sel1.equals("s") && sel2.equals("p")){
				System.out.println("sel1 won");
			}
			else{
				System.out.println("oh, draw!");
			}
		else if(sel1.equals("r") && sel2.equals("p")) {
			System.out.println("sel2 won");
		}
			else if (sel1.equals("r") && sel2.equals("s")){
				System.out.println("sel1 won");
			}
			else{
				System.out.println("oh, draw!");
			}
		else if(sel1.equals("p") && sel2.equals("s")) {
			System.out.println("sel2 won");
		}
			else if (sel1.equals("p") && sel2.equals("r")){
				System.out.println("sel1 won");
			}
			else{
				System.out.println("oh, draw!");
			}
		}
	public static void main(String[] args) {
		String sel1 = "r";
		String sel1 = "s";
		String sel1 = "p";
		String sel2 = "r";
		String sel2 = "s";
		String sel2 = "p";
			
		System.out.println("sel = " + sel1, "sel = " + sel2);
		RockScissorsPapper rps =new RockScissorsPapper(sel1, sel2);
			
	}
}
	
		

			