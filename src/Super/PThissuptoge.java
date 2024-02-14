package Super;

public class PThissuptoge {
    PThissuptoge()
    {
        System.out.println("Pcons");
    }

    PThissuptoge(int a)
    {
        System.out.println("Pts"+a);
    }
    public void ptest(){
        System.out.println("ptest");
    }


}
class CThissuptoge extends PThissuptoge{

    CThissuptoge() {
//        super(100);
//        this(100);
        System.out.println("Ccons");
    }

    CThissuptoge(int i)
    {
        this();
//       super(100);
   }

    public static void main(String[] args) {

        CThissuptoge c= new CThissuptoge(100);
    }
}
