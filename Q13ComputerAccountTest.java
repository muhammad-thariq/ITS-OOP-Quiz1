import java.util.Scanner;

public class Q13ComputerAccountTest {
    /**
     * 
    create properties/fields, constructors, and methods in Q13ComputerAccount
    create objects in Q13ComputerAccountTest to call the public methods from Q13ComputerAccount 
    
    */    
    
    public static void main(String[] args) {
        
        // creating object 
        Q13ComputerAccount computerAccount = new Q13ComputerAccount("Muhammad Thariq Darobi","MThariqD","atmin123");
        
        // calling Q13ComputerAccount methods through object
        
        //test class
        computerAccount.printRealName();
        computerAccount.printUserName();
        computerAccount.printPassword();
        
        computerAccount.changePassword("kucinghitam123");
        computerAccount.printPassword();
        
        // input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nHow many times you want to input the data? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter RealName: ");
            String RealName = scanner.next();
            System.out.print("Enter UserName: ");
            String UserName = scanner.next();
            System.out.print("Enter Password: ");
            String Password = scanner.next();
            
            Q13ComputerAccount computerAccountInput = new Q13ComputerAccount(RealName,UserName,Password);
            
            computerAccountInput.printRealName();
            computerAccountInput.printUserName();
            computerAccountInput.printPassword();
            
            System.out.print("Enter Password: ");
            String newPassword = scanner.next();
    
            computerAccountInput.changePassword(newPassword);
            computerAccountInput.printPassword();            
        }
        

        scanner.close();
    }
}