package Casting;

public class Downcast {

    public static void main(String[] args) {


        long l = 128;
        byte b =  (byte) l;
//        byte b =  (byte) (int)l;
        System.out.println(b);
    }
}
