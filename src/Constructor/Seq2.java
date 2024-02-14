package Constructor;

public class Seq2 {

    public static void main(String[] args) {
        System.out.println("main");
    }

    static {
        Seq2 s1=new Seq2();
        System.out.println("SIB");
        s1.mtest();
    }

    {
        System.out.println("IIB");
    }

    Seq2(){
        System.out.println("cons");
    }

    public void mtest(){
        System.out.println("method");
    }
}


// op>> iib,cons,sib,method,main