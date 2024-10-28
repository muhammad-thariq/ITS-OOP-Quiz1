public class Q12Time {

    // a method to print the typecasted time and add leading zero 
    public static void printTime(double hours, double minutes) {

        if (hours < 10) {
            System.out.print("0");
        }
        System.out.print((int) hours + ":");
        
        if (minutes < 10) {
            System.out.print("0");
        }
        System.out.print((int) minutes + " = ");

    }

    // a method to calculate the degree of the clock hand 
    public static void calculateDegree(double hours, double minutes) {

        printTime(hours, minutes);

        // converting hours to 0-11 format and minutes to 0-59 format
        hours %= 12;
        minutes %= 60;

        // using double datatype for more accurate results
        double 
        // + (minutes / 2) minutes divided by 2 for additional degree, caused by minutes
        hourDegree = (hours * 30) + (minutes / 2),
        // (60 - minutes) to determine the minutes between the minute hand from the 12 o'clock position (reversed clockwise)
        minuteDegree = (60 - minutes) * 6,
        totalDegree = hourDegree + minuteDegree;

        // correcting the degree if it goes beyond 360 degree
        totalDegree %= 360;

        // typecasting to int and rounding down the totalDegree
        System.out.println((int) totalDegree+"°");
        
    }

    public static void main(String[] args) {

        calculateDegree(9, 00);
        calculateDegree(3, 00);
        calculateDegree(18, 00);
        calculateDegree(2, 30);
        calculateDegree(4, 41);

    }
}
    