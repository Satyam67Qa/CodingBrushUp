package Numbers;

public class IncrementalWhile {
    public static void main(String[] args) {
        int i= 1;

        // incremental number
        while (i<=10)// check the condition
        {
            System.out.println(i);
            i++;
        }
        System.out.println("--------------------");
          int j=2;
        //even number
        while (j<=10){
            System.out.println(j);
            j+=2;
        }
        System.out.println("--------------------");
        int k=1;
        //odd  number
        while (k<=10){
            System.out.println(k);
            k+=2;
        }
    }
}
