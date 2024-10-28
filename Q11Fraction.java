public class Q11Fraction {

    // a method to calculate the addition of two fractions
    public static void addition(int es, int ds, int ep, int dp) {
        
        // numerator and denominator for addition based on the formula given
        int numerator = (es * dp) + (ep * ds);
        int denominator = ds * dp;

        System.out.printf("%d/%d + %d/%d = %d/%d\n", es, ds, ep, dp, numerator, denominator);
    }

    // a method to calculate the multiplication  of two fractions
    public static void multiplication(int es, int ds, int ep, int dp) {
        
        // numerator and denominator for multiplication based on the formula given
        int numerator = es * ep;
        int denominator = ds * dp;

        System.out.printf("%d/%d * %d/%d = %d/%d\n", es, ds, ep, dp, numerator, denominator);
    }

    public static void main(String[] args){

        addition(1, 2, 1, 3);
        addition(1, 3, 3, 4);

        multiplication(1, 2, 2, 3);
        multiplication(1, 4, 2, 3);
    }
}
