package String;

 final class Immutable {
    //steps(imutable object) class object should not alter
    // make the class final (so it will not inheritae)
    // make varible final and private
    // initialize variavle through the const
    // use only getter & do not use setter

     final private int i;
     final private int j;

     public int getJ() {
         return j;
     }

     public int getI() {
         return i;
     }

     public Immutable(int i, int j) {
         this.i = i;
         this.j = j;
     }

     public static void main(String[] args) {
         Immutable i= new Immutable(12,20);
         System.out.println(i.getI()+i.getJ());
         System.out.println(i.getI());
         System.out.println(i.getJ());

     }

     //
 }
