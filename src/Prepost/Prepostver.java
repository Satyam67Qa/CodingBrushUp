package Prepost;

public class Prepostver {

    public static void main(String[] args) {

        Prepostver pp1 = new Prepostver();
        pp1.prepost1();
        pp1.prepost2();
        pp1.prepost3();
        pp1.prepost4();
        pp1.prepost5();


        int i = 10;
        int j = i++ + i++ + ++i; // 10++ + 11++ + 13
        int k = i-- + --i; // 13-- + 11

        System.out.println("Value of i >>>" + i); //11
        System.out.println("Value of j >>>" + j); // 58
        System.out.println("Value of k >>>" + k);
    }

////            {
//                int a=11, b=22, c;
//
//                c = a + b + a++ + b++ + ++a + ++b;
//
//                System.out.println("a="+a);
//                System.out.println("b="+b);
//                System.out.println("c="+c);
////            }
        {
            int e = 1, f = 2, g = 3;

            int m = e-- - f-- - g--; // 1-- - 2-- - 3-- //

            System.out.println("i=" + e);
            System.out.println("j=" + f);
            System.out.println("k=" + g);
            System.out.println("m=" + m);
        }


        {
            int a = 1, b = 2;

            System.out.println(--b - ++a + ++b - --a); // 1 - 2 + 2 - 1 === 0
        }

        {
            int X=19, Y=29, Z;

            Z = X-- - X++ + --Y - ++Y + --X - Y-- + ++X - Y++;

            //19-- - 18++ + 28 - 29 + 18 - 29-- + 19 - 28++

            System.out.println("i="+X);// 19
            System.out.println("j="+Y);// 30
            System.out.println("k="+Z);
        }

        {
            int o = 11;

           // int p = --(o++);// syntax ...  Because, ++ or — can’t be nested [ –(i++) ].
        }


    public void prepost1()

        {
            int m = 0, n = 0;

            int p = --m * --n * n-- * m--;

             // -1 * -1 * -1-- * -1-- >> 1


            System.out.println(p);
        }

    public void prepost2()
    {
        int a=1;

        a = a++ + ++a * --a - a--;
          // 1++ + 3 * 2 - 2-- >>>
        System.out.println(  "o/p prepost2 "+a);
    }

    public void prepost3()
    {
        //int a = 11++;   Compile time error : ++ or — can’t be applied to constants.

        //System.out.println(a);
    }

    public void prepost4()
    {
        int m=1010, n=1010;

        System.out.println("o/p prepost4 "+m++ / ++n * n-- / --m);
        //1010++ / 1011 * 1011-- / 1010 >> 0

    }

    public void prepost5()

    {
        int x = 001, y=010, z=100;

        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
              // 0 + 10++ - 100-- - 98 + 12 - -1 + 12-- - -2

        System.out.println("o/p p5");
        System.out.println("x="+x); // -2
        System.out.println("y="+y); // 11
        System.out.println("z="+z); // 98
        System.out.println("i="+i);
    }




}
