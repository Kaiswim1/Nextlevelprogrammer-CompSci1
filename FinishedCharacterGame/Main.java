import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);

        Character player = new Character("Hero", 18, 50, 0, 30);

        System.out.println("Welcome, " + player.getName() + "!");
        System.out.println("Your adventure begins...\n");

        // =========================
        // CHOICE 1
        // =========================
        System.out.println("You see a dark forest and a small village.");
        System.out.println("1) Enter forest");
        System.out.println("2) Go to village");

        int choice1 = ask.nextInt();

        if (choice1 == 1) {
            System.out.println("You fight a wild beast!");
            player.decreaseHealth(20);
            player.increaseStrength(5);
        } else {
            System.out.println("You help villagers.");
            player.increaseReputation(10);
            player.addGold(20);
        }

        // =========================
        // CHOICE 2
        // =========================
        System.out.println("\nYou find a mysterious book.");
        System.out.println("1) Read it");
        System.out.println("2) Ignore it");

        int choice2 = ask.nextInt();

        if (choice2 == 1) {
            System.out.println("You gain knowledge!");
            player.increaseIntelligence(5);
            player.useMana(10);
        } else {
            System.out.println("You move on safely.");
            player.increaseLuck(2);
        }

        // =========================
        // CHOICE 3
        // =========================
        System.out.println("\nA thief tries to rob you!");
        System.out.println("1) Fight");
        System.out.println("2) Bribe");

        int choice3 = ask.nextInt();

        if (choice3 == 1) {
            System.out.println("You defeat the thief!");
            player.increaseStrength(3);
            player.decreaseHealth(10);
        } else {
            System.out.println("You pay him off.");
            player.spendGold(15);
        }

        // =========================
        // CHOICE 4
        // =========================
        System.out.println("\nYou find a magical fountain.");
        System.out.println("1) Drink");
        System.out.println("2) Save it");

        int choice4 = ask.nextInt();

        if (choice4 == 1) {
            System.out.println("You feel energized!");
            player.increaseHealth(30);
            player.restoreMana(20);
        } else {
            System.out.println("You sell the location.");
            player.addGold(40);
            player.increaseReputation(5);
        }

        // =========================
        // FINAL STATS
        // =========================
        System.out.println("\n=== FINAL STATS ===");
        System.out.println("Health: " + player.getHealth());
        System.out.println("Strength: " + player.getStrength());
        System.out.println("Intelligence: " + player.getIntelligence());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("Gold: " + player.getGold());
        System.out.println("Reputation: " + player.getReputation());
        System.out.println("Mana: " + player.getMana());
    }
}
