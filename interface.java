interface p{
    int a=0;
    public void m1();
}

interface p1 extends p{
    int b=1;
    public void m2();
}

interface p2 extends p{
    int c=2;
    public void m3();
}
//here we can use inheritance properties extends

interface p12 extends p1,p2{
    int d=3;
    public void m4();
}
//In interface, extends with multiple interface

class Q implements p12{
    public void m4(){
        System.out.println("p12 called..." + d);
    }
    public void m3(){
        System.out.println("p2 called..."+c);
    }
    public void m2(){
        System.out.println("p1 called..."+b);
    }
    public void m1(){
        System.out.println("p called..."+a);
    }
}
//interface implements by class

class Main{
    public static void main(String[] args) {
        Q q = new Q(); //object
        q.m4();
        q.m3();
        q.m2();
        q.m1();
    }
}
