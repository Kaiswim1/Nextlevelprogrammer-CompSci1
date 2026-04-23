public class LoopsIfs{
    public static void main(String[] args) {

        System.out.println("=== STEP 1: Simple IF ===");
        int x = 5;

        System.out.println("x = " + x);

        if (x > 3) {
            System.out.println("x is greater than 3");
        }

        System.out.println("\n=== STEP 2: IF / ELSE ===");
        int y = 2;

        System.out.println("y = " + y);

        if (y > 3) {
            System.out.println("y is greater than 3");
        } else {
            System.out.println("y is NOT greater than 3");
        }

        System.out.println("\n=== STEP 3: ELSE IF ===");
        int z = 10;

        System.out.println("z = " + z);

        if (z < 5) {
            System.out.println("z is less than 5");
        } else if (z < 10) {
            System.out.println("z is less than 10");
        } else {
            System.out.println("z is 10 or greater");
        }

        System.out.println("\n=== STEP 4: FOR LOOP ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop i = " + i);
        }

        System.out.println("\n=== STEP 5: LOOP WITH IF ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Checking " + i);

            if (i % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }

        System.out.println("\n=== STEP 6: MULTIPLE CONDITIONS ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Divisible by 3 AND 5");
            } else if (i % 3 == 0) {
                System.out.println("Divisible by 3");
            } else if (i % 5 == 0) {
                System.out.println("Divisible by 5");
            } else {
                System.out.println("Not divisible by 3 or 5");
            }
        }

        System.out.println("\n=== STEP 7: NESTED IF ===");
        for (int i = 8; i <= 12; i++) {
            System.out.println("Number: " + i);

            if (i > 10) {
                System.out.println("Greater than 10");

                if (i % 2 == 0) {
                    System.out.println("Also EVEN");
                } else {
                    System.out.println("Also ODD");
                }
            } else {
                System.out.println("10 or less");
            }
        }

        System.out.println("\n=== DONE ===");
    }
}