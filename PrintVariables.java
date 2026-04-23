public class PrintVariables {

    public static void main(String[] args) {

        System.out.println("=== STEP 1: VALUES ===");

        System.out.println(5);
        System.out.println(10);
        System.out.println(5 + 10);


        System.out.println("\n=== STEP 2: VARIABLES ===");

        int age = 25;
        System.out.println("Age: " + age);

        age = 30;
        System.out.println("New Age: " + age);


        System.out.println("\n=== STEP 3: USING VARIABLES ===");

        int number = 10;
        System.out.println("number = " + number);
        System.out.println("number + 5 = " + (number + 5));
        System.out.println("number * 2 = " + (number * 2));


        System.out.println("\n=== STEP 4: COMPARISONS ===");

        System.out.println("Is 5 > 3 ? " + (5 > 3));
        System.out.println("Is 10 == 7 ? " + (10 == 7));

        int x = 8;
        System.out.println("Is x > 5 ? " + (x > 5));


        System.out.println("\n=== STEP 5: BOOLEANS ===");

        boolean isAdult = false;
        System.out.println("isAdult = " + isAdult);

        isAdult = true;
        System.out.println("isAdult changed to = " + isAdult);


        System.out.println("\n=== STEP 6: BOOLEAN EXPRESSIONS ===");

        boolean result1 = 5 > 3;
        System.out.println("5 > 3 = " + result1);

        boolean result2 = 10 < 4;
        System.out.println("10 < 4 = " + result2);

        boolean result3 = result1 && result2;
        System.out.println("result1 AND result2 = " + result3);


        System.out.println("\n=== STEP 7: PUTTING IT TOGETHER ===");

        int score = 85;
        boolean passed = score >= 70;

        System.out.println("Score: " + score);
        System.out.println("Passed? " + passed);


        System.out.println("\n=== DONE ===");
    }
}