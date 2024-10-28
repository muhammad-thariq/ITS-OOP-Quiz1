import java.util.Scanner;

public class Q16FractionTest {

    // we just need to create a new object and call the method(getPorduct() and  getSum()) it will automatically return strings
    public static void main(String[] args) {

        // test class
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);
        
        System.out.println(f2.getProduct(f1));
        System.out.println(f2.getSum(f1));
        
        System.err.println();
        
        // test input class 
        Scanner scanner  = new Scanner(System.in);

        // read input
        
        System.out.print("your first numerator : ");
        int numerator1 = scanner.nextInt();
        System.out.print("your first denominator : ");
        int denominator1 = scanner.nextInt();
        System.out.print("your second numerator : ");
        int numerator2 = scanner.nextInt();
        System.out.print("your second denominator : "); 
        int denominator2 = scanner.nextInt();
        
        Q16Fraction f3 = new Q16Fraction(numerator1,denominator1);
        Q16Fraction f4 = new Q16Fraction(numerator2,denominator2);

        System.out.println(f3.getProduct(f4));
        System.out.println(f3.getSum(f4));
        
        scanner.close();
    }
}