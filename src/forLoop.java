import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        //Objective, count from 1 to 100
        for (int j = 1; j < 101; j++)
        {
            System.out.println(j);
    }

        Scanner input = new Scanner(System.in);
        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            number = input.nextInt();
            sum += number;
        }
        System.out.println("sum is " + sum);
        System.out.println("count is " + count);




}}
