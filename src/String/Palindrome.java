package String;

public class Palindrome {

    public static void main(String[] args) {
        //method split
//        String s1 = "I want to run";
//        String[]s2=s1.split(" ");
//        System.out.println(s2[0]);

        //length

        //charAt >> any specific letter
//        System.out.println(s1.charAt(0));
        //
        //startsWith();endsWith();

        String s3= "madam";
        //size of the String
        int j =s3.length()-1;
        int size=s3.length()-1;
        // for travel
        for(int i=0;i<s3.length();i++){
            //compare the String with char index
            if(s3.charAt(i)==s3.charAt(j))
            {
                --j;
               if(i==size)
               {
                   System.out.println("palindrome");
               }
            }else {
                   System.out.println("not palindrome");
                   break;
               }
            }
        }












    }

