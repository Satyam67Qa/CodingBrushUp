package Super;

public class A {
    int i =10;
    static int j=20;
    public void test1(){
        System.out.println("test");
    }
}

class B extends A{
    public static void main(String[] args) {
        B b1= new B();
        b1.test();
       // System.out.println(super.test1(); we can not use this super in the static method
    }
    public void test(){
        super.test1(); // we can use super keywords
        System.out.println(super.i);
        System.out.println(super.j);
    }
}
