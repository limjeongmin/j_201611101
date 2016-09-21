# j1_201611101
class Subway {
    int line;
    void run() {    System.out.println("4 lines runs");
    }
}
Subway mySub=new Subway();
mySub.run()

class Subway {
    int line;
    void run() {    System.out.println(line+"  lines runs");
    }
    void setLine(int l)  {
        line=l;
    }
}
Subway mySub=new Subway();
mySub.setLine(8);
mySub.run();
