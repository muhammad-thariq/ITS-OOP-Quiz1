public class Q14ComplexNumber {
    private int real;
    private int imaginary;
    
    // constructor
    public Q14ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // method to add two complex numbers returning an object
    public Q14ComplexNumber addition(Q14ComplexNumber other) {
        return new Q14ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // method to subtract two complex numbers returning an object
    public Q14ComplexNumber subtraction(Q14ComplexNumber other) {
        return new Q14ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // method to subtract two complex numbers returning an object
    public Q14ComplexNumber multiplication(Q14ComplexNumber other) {
        return new Q14ComplexNumber(this.real * other.real - this.imaginary * other.imaginary, this.real * other.imaginary + this.imaginary * other.real);
    }

    //getters
    public int getReal() {
        return real;
    }
    public int getImaginary() {
        return imaginary;
    }

    // method to convert complex number
    public String toString() {
        // returning string (java automatically converts int into string)
        return getReal() + " + " + getImaginary() +"i";
    }
}
