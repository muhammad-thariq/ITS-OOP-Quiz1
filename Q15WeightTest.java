import java.util.Scanner;

public class Q15WeightTest {

    // we just need to create a constructor that have properties(pounds, weight) and converts the pounds into weights
    public static void main(String[] args) {

        // test class
        Q15Weight weight1 = new Q15Weight(100);

        System.out.println("pounds : "+ weight1.getPounds()+ "\nkilo : " + weight1.getKilograms());

        // input test class
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nHow many times you want to input the data : ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter your weight in pounds : ");
            Q15Weight weight = new Q15Weight(scanner.nextDouble());
            System.out.println("\nPounds : "+ weight.getPounds()+ "\nkilo : " + weight.getKilograms());
        }

        scanner.close();
    }
}