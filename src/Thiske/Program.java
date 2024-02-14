package Thiske;

public class Program {
        int a;
        int b;
        Program(int a , int b)
        {
            this.a = a;
            this.b = b;
        }

        public void show()
        {
            System.out.println("a = " + a + "b=" + b);
        }


        public static void main (String []args)
        {

            Program p1 = new Program(10, 20);
            p1.show();

        }
    }


