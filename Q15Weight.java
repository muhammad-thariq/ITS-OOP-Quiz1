// File: Q15Weight.java
public class Q15Weight {

    private double pounds;
    private double kilograms;

    // constructor
    Q15Weight (double pounds) {
        this.pounds = pounds;
        kilograms = this.convertToKilograms();
    }

    // getters
    public double getPounds() {
        return pounds;
    }
    public double getKilograms() {
        return kilograms;
    }

    // converter method (pounds -> kg)
    public double convertToKilograms() {
        return pounds * 0.45359237;
    }
}    
