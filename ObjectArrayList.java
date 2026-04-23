import java.util.ArrayList;

public class ObjectArrayList {

    public static void main(String[] args) {

        System.out.println("=== STEP 1: OBJECTS ===");

        Student s1 = new Student("Alice", 90);
        Student s2 = new Student("Bob", 75);

        System.out.println(s1.name + " has score " + s1.score);
        System.out.println(s2.name + " has score " + s2.score);


        System.out.println("\n=== STEP 2: ARRAY LIMITATION ===");

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        System.out.println("Array size is fixed at: " + students.length);

        // This would crash if we tried to go beyond size
        // students[2] = new Student("Charlie", 88);


        System.out.println("\n=== STEP 3: ARRAYLIST ===");

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);

        System.out.println("ArrayList size: " + studentList.size());


        System.out.println("\n=== STEP 4: ADDING OBJECTS ===");

        studentList.add(new Student("Charlie", 88));
        studentList.add(new Student("Diana", 95));

        System.out.println("ArrayList size after adding: " + studentList.size());


        System.out.println("\n=== STEP 5: LOOP THROUGH ARRAYLIST ===");

        for (int i = 0; i < studentList.size(); i++) {

            Student s = studentList.get(i);

            System.out.println(s.name + " score: " + s.score);

            if (s.score >= 80) {
                System.out.println("-> Passed");
            } else {
                System.out.println("-> Needs improvement");
            }
        }


        System.out.println("\n=== STEP 6: REMOVING ===");

        studentList.remove(1); // removes Bob

        System.out.println("After removal, size: " + studentList.size());

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).name);
        }


        System.out.println("\n=== STEP 7: WHY NOT ARRAYS? ===");

        System.out.println("Arrays:");
        System.out.println("- Fixed size");
        System.out.println("- Cannot easily add/remove");

        System.out.println("\nArrayList:");
        System.out.println("- Can grow");
        System.out.println("- Can remove items easily");


        System.out.println("\n=== DONE ===");
    }
}


// ===== BASIC OBJECT CLASS =====
class Student {

    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}