package Arrays;

public class MultiDeArrays2 {
    public static void main(String[] args) {
        //row 3, col 2
        int a[][]=new int[3][2];

        //initiation value

        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;

       // int b[][]={{100,200},{300,400},{500,600}};

        // find the number of row

        System.out.println(a.length);
        System.out.println("===============");
        //find the number of cols
        System.out.println(a[0].length);
        System.out.println("===============");
        //nested loop:
             for (int i=0;i<a.length;i++)// outer loop for row
             {
                 for (int j=0;j<a[i].length;j++)//inner loop for col
                 {

                     System.out.println(a[i][j]);
                 }

        }
        System.out.println("===============");

             // using for each.enhanced

        for (int r[]:a) // here store all the rows data one by one row
        {
            for (int i:r) //read one by one data
            {
                System.out.println(i);

            }

        }
    }
}
