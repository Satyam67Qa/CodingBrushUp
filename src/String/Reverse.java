package String;

public class Reverse {
    public static void main(String[] args) {

        String s1= "Testing";
        // gives this total length of char
        System.out.println(s1.length());
        // gives the index of char
        System.out.println(s1.length()-1);
        // logic if want to rev
        for (int i=s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }

        System.out.println();
        //

        for (int i =0;i<=s1.length()-1;i++){
            System.out.print(s1.charAt(i));
        }
    }
}
