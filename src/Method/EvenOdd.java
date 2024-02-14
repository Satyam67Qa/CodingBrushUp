package Method;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class EvenOdd {

    public static void main(String[] args) {
        EvenOdd EO = new EvenOdd();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        EO.findEvenOdd(number);
    }
    public static void findEvenOdd(int n){

        if(n%2==0)
        {
            System.out.println("Even Nuo");
        }
        else {
            System.out.println("Odd Nuo");
        }

    }
}
