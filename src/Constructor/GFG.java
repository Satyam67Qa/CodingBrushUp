package Constructor;

// Class 2
// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of above class
        // inside main() method
        Complex c1 = new Complex(10, 15);

        // Note: compiler error here
         Complex c2 = new Complex(c1);

        System.out.println(c1);
    }
}
