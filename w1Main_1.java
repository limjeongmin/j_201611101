﻿void sayHello () {
    System.out.println("hello");
}

class Hello {
    String toWhom="world";
    Hello() {}
    void sayHello() {
        System.out.println("hello "+toWhom);
    }
}
Hello h=new Hello();
h.sayHello()
