package Constructor;

public class Exeseq {

    int i = 10;

    {
        System.out.println(i);
    }

    static {
        System.out.println("Static block -2"); // static inilization block
    }

    public  static int test3()
    {
        int i=10;
        System.out.println("run static methd");
        return 30;






    }

    public static void main(String[] args) {
        System.out.println(" start main");
        Exeseq ex1 = new Exeseq();
        System.out.println(Exeseq.test3());
        System.out.println(ex1);
        ex1.test3();
        System.out.println(" end main");
        Exeseq ex2 = new Exeseq();
        ex1.test2();
        ex2.test3();
    }

    static {
        System.out.println("Static block -1"); // static inilization block
    }

    {
        System.out.println(" IIB");// instance inilization block
    }
    Exeseq(){
        System.out.println(" from constr ");
    }

    public void test2(){
        System.out.println("run method");
    }

}

//ANS>> ssb,sm,10,iib,fc,em
// Run seq pro>. >> run which ever first Static ib >> main if check object>> then run which ever first iib >> con>>method>>

// si2,si1,sm,10,iib,fc,rsm,30,em,


