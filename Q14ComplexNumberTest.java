import java.util.Scanner;

public class Q14ComplexNumberTest {
    
    public static void main(String[] args) {
        
        // test class
        Q14ComplexNumber complex1 = new Q14ComplexNumber(1, 2);
        Q14ComplexNumber complex2 = new Q14ComplexNumber(3, 4);
        
        // Q14ComplexNumber result; is a object to store the result of complex number operation (addition/subtraction/multiplication)
        Q14ComplexNumber result;
        
        result = complex1.addition(complex2);
        System.out.println("addition: " + result.toString());
        
        result = complex1.subtraction(complex2);
        System.out.println("subtraction: " + result.toString());
        
        result = complex1.multiplication(complex2);
        System.out.println("multiplication: " + result.toString());
        
        // input test class
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nEnter your first complex numbers");
        System.out.print("Enter the real part of complex number : ");
        int real = scanner.nextInt();
        System.out.print("Enter the imaginary part of complex number : ");
        int imaginary = scanner.nextInt();
        Q14ComplexNumber complex3 = new Q14ComplexNumber(real, imaginary);
        
        System.out.println("\nEnter your second complex numbers");
        System.out.print("Enter the real part of complex number : ");
        real = scanner.nextInt();
        System.out.print("Enter the imaginary part of complex number : ");
        imaginary = scanner.nextInt();
        Q14ComplexNumber complex4 = new Q14ComplexNumber(real, imaginary);
        
        System.out.print("\nHow many tiems you want to do the operation : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("choose your operation \n\t1. addition\n\t2. subtraction\n\t3. multiplication");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    result = complex3.addition(complex4);
                    System.out.println("addition: " + result.toString());
                    break;
                    
                case 2:
                    result = complex3.subtraction(complex4);
                    System.out.println("subtraction: " + result.toString());
                    break;
                    
                    case 3:
                    result = complex3.multiplication(complex4);
                    System.out.println("multiplication: " + result.toString());
                
                default:
                    break;
            }
        }
        scanner.close();
    }
}