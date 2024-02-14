package Prepost;

public class pp5 {
    public static void main(String[] args)
    {
        pp5 p = new pp5();
        p.fun1();
        p.fun2();
        p.fun3();
    }
        public void fun1(){
        int x=010;
        int i = x++;
        System.out.println("x="+x);
        System.out.println("i="+i);
    }

    public void fun2()
    {
        int ch = 'A';

        System.out.println(ch++);
    }

    public void fun3()
    {
        char ch = 'A';

        System.out.println(++ch);
    }

    }

