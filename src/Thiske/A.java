package Thiske;

public class A {
    int i ;

    public static void main(String[] args) {

        A a1 = new A();
        a1.test();

    }
    public void test()

    {
        int i=10;

        this.i=i;

        System.out.println(this.i);

    }
}
