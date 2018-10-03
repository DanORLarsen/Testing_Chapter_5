import java.lang.*;
import java.util.Scanner;

public class FutureTuition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired value: ");
        int desiredValue = sc.nextInt();
        double tuition = 10000; //year 0
        int year = 0;


        while (tuition < desiredValue)
            {tuition = tuition * 1.07; year++;}
        System.out.println("Tuition will be double in " + year + " years");
        System.out.printf("Tuition will be $" + tuition + " in %1d years", year); //Kan ikke få f til at virke
    }
}
