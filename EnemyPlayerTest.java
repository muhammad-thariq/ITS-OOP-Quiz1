import java.util.Scanner;

public class EnemyPlayerTest {
    /**
    we are creating two classes (Enemy, Player)
    the method attack() is to attack opposing class
    the method takeDamage() is a method that will be called if the class is attacked

    we just need to add opposing class to the attack method parameter
    and the attack method will called the  takeDamage for the oppsing class 
    */
    public static void main(String[] args) {


        // test class 
        Player player = new Player("Thariq", 100, 75, 50);
        Enemy enemy = new Enemy("Faiz", 100, 100, 25);

        // attacking Enemy
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", enemy.getName(), enemy.getHealth(), enemy.getDefense());
        player.attack(enemy);
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", enemy.getName(), enemy.getHealth(), enemy.getDefense());
        
        // attacking Player
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", player.getName(), player.getHealth(), player.getDefense());
        enemy.attack(player);
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", player.getName(), player.getHealth(), player.getDefense());
            
        // death condition
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", enemy.getName(), enemy.getHealth(), enemy.getDefense());
        player.attack(enemy);
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", enemy.getName(), enemy.getHealth(), enemy.getDefense());
        

        // input test class 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter player name: ");
        player.setName(scanner.next());

        System.out.print("enter player health: ");
        player.setHealth(scanner.nextInt());

        System.out.print("enter player power: ");
        player.setPower(scanner.nextInt());
        
        System.out.print("enter player defense: ");
        player.setDefense(scanner.nextInt());

        System.out.print("enter enemy name: ");
        enemy.setName(scanner.next());

        System.out.print("enter enemy health: ");
        enemy.setHealth(scanner.nextInt());

        System.out.print("enter enemy power: ");
        enemy.setPower(scanner.nextInt());
        
        System.out.print("enter enemy defense: ");
        enemy.setDefense(scanner.nextInt());
        
        // attacking Enemy
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", enemy.getName(), enemy.getHealth(), enemy.getDefense());
        player.attack(enemy);
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", enemy.getName(), enemy.getHealth(), enemy.getDefense());
        
        // attacking Player
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", player.getName(), player.getHealth(), player.getDefense());
        enemy.attack(player);
        System.out.printf("%s\nhealth: %d\ndefense :%d\n", player.getName(), player.getHealth(), player.getDefense());
        
        
        scanner.close();
    }
}