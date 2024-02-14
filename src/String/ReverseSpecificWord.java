package String;

import java.util.Map;

public class ReverseSpecificWord {
    // in case of multiple word rev than add the REV more
    static String Rev=" ";
    static String temp= null;

    public static void main(String[] args) {
        String s1= "run time call";
        //login seprate the words and store in array
        String s2 []= s1.split(" ");
        // find the words in the array with index
//        System.out.println(s2[0]);
//        System.out.println(s2[1]);
//        System.out.println(s2[2]);
        //here compering the sting using .equal method
        if(s2[0].equals("run")){
            //login for rev
            for (int i=s2[0].length()-1;i>=0;i--){

                Rev=Rev+s2[0].charAt(i);
            }
            // here login creating the string with word position which i want to rev
            temp=Rev+" "+s2[1]+" "+s2[2];

        }
        if(s2[1].equals("run")){
            //login for rev
            for (int i=s2[1].length()-1;i>=0;i--){

                Rev=Rev+s2[1].charAt(i);
            }
            // here login creating the string with word position which i want to rev
            temp=s2[0]+" "+Rev+" "+s2[2];


        }
        if(s2[2].equals("run")){
            //login for rev
            for (int i=s2[2].length()-1;i>=0;i--){

                Rev=Rev+s2[2].charAt(i);
            }
            // here login creating the string with word position which i want to rev

            temp=s2[0]+" "+s2[1]+" "+Rev;

        }
        System.out.println(temp);



    }

}
