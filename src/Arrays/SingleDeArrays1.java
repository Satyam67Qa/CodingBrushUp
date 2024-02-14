package Arrays;

public class SingleDeArrays1 {
    public static void main(String[] args) {
      // int a[]= new int[5] ;//arrays with the size 5
        int a[]={10,20,304,40,50};

        //size of the arrays
        System.out.println(a.length);
        System.out.println("===============");
        //any specific value from the array
        System.out.println(a[2]);
        System.out.println("===============");
        //using for loop
        for (int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
        System.out.println("===============");
        //using for each
        for (int x:a) {
            System.out.println(x);

        }
    }








}
