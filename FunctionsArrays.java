public class FunctionsArrays {

    public static void main(String[] args) {

        System.out.println("=== STEP 1: ARRAYS ===");

        int[] numbers = {3, 7, 10, 15, 22};

        System.out.println("First number: " + numbers[0]);
        System.out.println("Second number: " + numbers[1]);


        System.out.println("\n=== STEP 2: LOOP THROUGH ARRAY ===");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }


        System.out.println("\n=== STEP 3: USING IF WITH ARRAY ===");

        for (int i = 0; i < numbers.length; i++) {

            int n = numbers[i];

            if (n % 2 == 0) {
                System.out.println(n + " is EVEN");
            } else {
                System.out.println(n + " is ODD");
            }
        }


        System.out.println("\n=== STEP 4: FUNCTIONS ===");

        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);


        System.out.println("\n=== STEP 5: FUNCTION WITH LOOP ===");

        printArray(numbers);


        System.out.println("\n=== STEP 6: FUNCTION WITH LOGIC ===");

        checkEvenOdd(numbers);


        System.out.println("\n=== STEP 7: BUILDING SOMETHING STRONGER ===");

        int total = sumArray(numbers);
        System.out.println("Total of all numbers: " + total);

        int biggest = findMax(numbers);
        System.out.println("Largest number: " + biggest);
    }


    // ===== FUNCTIONS =====

    public static int add(int a, int b) {
        return a + b;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value: " + arr[i]);
        }
    }

    public static void checkEvenOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is EVEN");
            } else {
                System.out.println(arr[i] + " is ODD");
            }
        }
    }

    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}