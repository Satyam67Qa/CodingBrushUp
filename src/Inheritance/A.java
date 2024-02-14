package Inheritance;

public class A {
    static int i = 10;
}

 class B extends A{
    public static void main(String[] args) {
        B b1= new B();
        System.out.println(b1.i);

        System.out.println(B.i);

    }
}
