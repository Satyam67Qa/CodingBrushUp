package Super;

public class Vehicle {

    Vehicle()
    {
        System.out.println("we searching companys which is create the vehicle");
    }
    Vehicle(int a)
    {
        System.out.println("there are "+a+ " type of vehicle company");
    }




}
class Auto extends Vehicle{


    public Auto(int i) {

//      super(100);
        System.out.println("Which create "+i+ "model of the autos");

    }
    Auto()
    {
        super(1000);
    }
    Auto(float km)
    {
        this(30);
        System.out.println("mileage of auto is "+km);

    }


    public static void main(String[] args)
    {

        Auto a2 =new Auto(10);
        Auto a1=new Auto();

//        Auto a2 =new Auto();
    }
}
