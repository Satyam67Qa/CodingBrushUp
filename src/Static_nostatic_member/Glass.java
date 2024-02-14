package Static_nostatic_member;

public class Glass {

    static int quatity=4;
    String col="red";

    public static void main(String[] args) {
        Glass g1 = new Glass();
        int hight = 2;
        String shape = "circle ";

        System.out.println(quatity);
        System.out.println("hight " + hight);
        System.out.println("shape " + shape);
        System.out.println(g1.col);
        g1.test1();
        Glass.test2();

        Glass g2 = new Glass();

        int hight1 = 2;
        String shape1 = "circle ";

        System.out.println("hight " + hight1);
        System.out.println("shape " + shape1);

        System.out.println(g2.col);

    }
    public void test1(){

            System.out.println(" non static method ");
        }

    public static void test2(){
        System.out.println("static method ");
    }
    }

