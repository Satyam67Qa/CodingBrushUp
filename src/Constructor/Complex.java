package Constructor;

public class Complex {
    // Class data members
    private double re, im;

    // Constructor
    public Complex(double re, double im)
    {
        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }

    public Complex() {
        
    }

    public Complex(Complex c1) {
    }
}

