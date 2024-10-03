import java.util.Objects;
import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        boolean validInput = false;
        boolean done = false;
        double temp = 0;
        double convertedTemp = 0;
        String unit;
        String repeat;
        do {
            do {
                System.out.print("What unit is the temperature you are inputting? (C/F): ");
                Scanner in = new Scanner(System.in);
                unit = in.next();
                if(Objects.equals(unit, "C") || Objects.equals(unit, "F"))
                {
                    validInput = true;
                }
            } while(!validInput);
            validInput = false;
            System.out.print("What is the temperature? : ");
            Scanner in = new Scanner(System.in);
            temp = in.nextDouble();
            if(Objects.equals(unit, "C")) {
                convertedTemp = (temp * ((double) 9 /5) + 32);
                System.out.println("The temperature you inputted is " + temp + " degrees C");
                System.out.println("The equivalent temperature is " + convertedTemp + " degrees F");
            }
            else {
                convertedTemp = (temp - 32) * ((double) 5 /9);
                System.out.println("The temperature you inputted is " + temp + " degrees F");
                System.out.println("The equivalent temperature is " + convertedTemp + " degrees C");
            }
            do {
                System.out.print("Would you like to convert another number? (Y/N): ");
                Scanner in2 = new Scanner(System.in);
                repeat = in2.next();
                if (Objects.equals(repeat, "Y")) {
                    validInput = true;
                }
                else{
                    System.out.print("Goodbye!");
                    validInput = true;
                    done= true;
                }
            } while(!validInput);
        } while(!done);
    }
}
