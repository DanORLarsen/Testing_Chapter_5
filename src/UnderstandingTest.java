import java.util.Scanner;

public class UnderstandingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        for (int count = 0; count < 5; count++){
            int number1 = (int)(Math.random()*50);
            int number2 = (int)(Math.random()*50);


            System.out.print("What is " + number1 + "+" + number2 + "? ");
            int anwser = sc.nextInt();

            if (number1 + number2 == anwser){
                System.out.println("Correct");
                i++;
            }
                else {
                System.out.println("Wrong");
                }

        }

        System.out.println("You got " + i + " Right out of 5");
/*
        int i = 1;
        int sum = 0;
        for (sum = 0; sum < 10000; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

*/


    }



}
