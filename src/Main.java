import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int count = 0;
        while (count != 11) {
            System.out.println("Current count ="+count+" Welcome to Java!");
            count++;
        }
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number that will be counted up to 10: ");
        int i = sc.nextInt();

        while (i !=11){
            System.out.println("i count at: " + i);
            i++;}




            Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}



