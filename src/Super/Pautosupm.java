package Super;

public class Pautosupm {

    public void test(){
        System.out.println("Ptest");
    }
    Pautosupm(){
        System.out.println("PCcons");
   }

    Pautosupm(int i){
        System.out.println("P value "+i);
    }

}
class Cautosupm extends Pautosupm{

//    Cautosupm ()
//    {
//        super(100);
//        System.out.println("CCcons");
//
//    }

    public static void main(String[] args) {

        Cautosupm  c =new Cautosupm();

        //c.test();
    }

    Cautosupm ()
    {
        super(100);
        System.out.println("CCcons");

    }

}
