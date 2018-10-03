public class Chap5_19 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < i; j++)
                System.out.println("1+");

        System.out.println("Number of sout statements (minus this one) " + (1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1+
                1));


                // Display the table heading
                System.out.println("           Multiplication Table");

                // Display the number title
                System.out.print("    ");
                for (int j = 1; j <= 9; j++)
                    System.out.print("   " + j); //Gets executed for each line then adds the spaces and goes further

                System.out.println("\n-----------------------------------------");

                // Print table body
                for (int i = 1; i <= 9; i++) {
                    System.out.print(i + " | ");
                    for (int j = 1; j <= 9; j++) {
                        // Display the product and align properly
                        System.out.printf("%4d", i * j);
                        //Make the count and does the multiplication for each full line before going to the next.
                    }
                    System.out.println();
                }


    }
}
