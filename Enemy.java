public class Enemy {
    
    String name;
    int health;
    int power;
    int defense;
    
    // constructor
    public Enemy(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void attack(Player player) {
        player.takeDamage(this);
    }
    public void takeDamage(Player player) {
        
        //subtract the defense 
        setDefense(this.defense - player.power);

        // if defense is less than or equal to 0, the player health is subtracted since defense will be minus 
        if (getDefense() <= 0) {
            setHealth(this.health += this.defense);

            // if health becomes less than or equal to 0, the player dies
            if (getHealth() <= 0) {
                System.out.println(this.name +" died!");
                setHealth(0);
            }
            setDefense(0);
        }
    }
}
