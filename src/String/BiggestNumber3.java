package String;

public class BiggestNumber3 {
    public static void main(String[] args) {
        String s1= "tesing timeeeeeee run";
        String [] s2 = s1.split(" ");
        String teamp = null ;
        if(s2[0].length()>s2[1].length()&&
                s2[0].length()>s2[2].length()) {
            teamp = s2[0];
        }
        if(s2[1].length()>s2[0].length()&&
                s2[1].length()>s2[2].length()) {
            teamp = s2[1];
        }
        if(s2[2].length()>s2[0].length()&&
                s2[2].length()>s2[1].length()) {
            teamp = s2[2];
        }
        if(teamp!=null) {
            System.out.println("The biggest word is: " + teamp);
        }else {
            System.out.println("both words are same");
        }
        }




    }

