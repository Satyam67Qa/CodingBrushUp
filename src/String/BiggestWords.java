package String;

public class BiggestWords {
    public static void main(String[] args) {
        String s1= "testing timettt";
        // here we split the word and store in the array
        String [] s2= s1.split(" ");
        System.out.println(s2[0]);
        System.out.println(s2[1]);
        //to store the word
        String temp =null;
        // compare the word with length
        if(s2[0].length()>s2[1].length()){
            temp=s2[0];
        }
        if(s2[1].length()>s2[0].length()){
            temp=s2[1];
        }
        // if both word are same and  we not add the if condition ,then it will give me the null value
        if(temp!=null) {
            System.out.println("The biggest word is: " + temp);
        }else {
            System.out.println("both words are same");
        }
    }
}
