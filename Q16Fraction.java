public class Q16Fraction {

    private int numerator;
    private int denominator;
    
    public Q16Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // getters 
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    // method for converting into a string
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    // methods for adding two fractions using formula given in (Q11fraction) and convert into a string
    public String getProduct(Q16Fraction other) {
        return this.numerator * other.numerator + "/" + this.denominator * other.denominator;
    }
    // methods for multiplate two fractions using formula given in (Q11fraction) and convert into a string
    public String getSum(Q16Fraction other) {   
        return ((this.numerator * other.denominator) + (other.numerator * this.denominator)) + "/" + this.denominator * other.denominator; 
    }
    
}