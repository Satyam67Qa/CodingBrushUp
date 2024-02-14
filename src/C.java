public class C {
   static C c1;
    int i;
    public static void main(String[] args) {
      c1=new C();
        System.out.println(c1.i);
        c1.test();
    }
    public  static void test(){

        System.out.println(c1.i);
    }
}
