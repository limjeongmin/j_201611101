class Subway{
	int line;
	void run()[
		System.out.println(line+"lines runs");
	}
	void setLine(int l){
		line=l;
	}

	Subway mySub=new Subway();
	mySub.setLine(3);
	mySub.run();
}