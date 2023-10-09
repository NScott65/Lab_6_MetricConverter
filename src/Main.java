import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double METERS_TO_MIlES = 0.00062137;
        double METERS_TO_FEET = 3.28084;
        double METERS_TO_INCHES = 39.37008;
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double in = 0;
        boolean done = false;

        do{
            System.out.println("Enter your distance in meters: ");
            if(scan.hasNextDouble()){
                meters = scan.nextDouble();
                if(meters > 0){

                    miles = meters * METERS_TO_MIlES;
                    feet = meters * METERS_TO_FEET;
                    in = meters * METERS_TO_INCHES;

                    System.out.printf("%-7s%8.2f", "Meters:", meters);
                    System.out.printf("\n%-7s%8.2f", "Miles:", miles);
                    System.out.printf("\n%-7s%8.2f", "Feet:", feet);
                    System.out.printf("\n%-7s%8.2f", "Inches:", in);

                    done = true;

                }else{
                    scan.nextLine();
                    System.out.println("Your input was invalid. Try Again.");
                }
            }else{
                scan.nextLine();
                System.out.println("Your input was invalid. Try Again.");
            }

        }while(!done);
    }
}