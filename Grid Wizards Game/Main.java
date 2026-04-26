import java.util.*; // the * will import all java classes from the .util folder


public class Main {

    //Private fields outside the main method can be accessed on this file anywhere.
    private static int playerTurn;
    private static Board board;

    public static void main(String[] args) {
        System.out.println("Welcome to the WIZARDS the board game");
        System.out.println("Each Wizard will have their own special move");

        Scanner sc = new Scanner(System.in);
        board = new Board();
        playerTurn = 0;
        String response = "";

        while(true){
            board.print();
            board.printAllStats();

            System.out.println("It is currently player "+board.players[playerTurn].getGridLetter()+"'s turn \n");
            System.out.println("Time to move your player!");
            displayMoves();
            response = sc.next();
            handleMoves(response);

            System.out.println("\nIt is still "+board.players[playerTurn].getGridLetter()+"'s turn, now attack\n");
            response = sc.next();
            handleAttacks(response);
            //Modulus (Remainder of division operator) Once playerTurn reaches 3, it goes back to 0. 0,1,2,3,0,1,2,3,0,1,2,3 etc...
            playerTurn = (playerTurn + 1) % 4;
        }

    }

    private static void displayMoves(){
        System.out.println("Type <1>: GO TO random position");
        System.out.println("Type <x,5>: Change X by 5 steps (You can have a different amount of steps including negative)");
        System.out.println("Type <y,3>: Change Y by 3 steps (You can have a different amount of steps including negative)\n");
    }

    private static void displayAttacks(){
        System.out.println("Type <beam>: Change X by 5 steps (You can have a different amount of steps including negative)");
    }


    private static void handleMoves(String currentResponse){
        if(currentResponse.equals("1")) {
            board.players[playerTurn].goToRandom();
        }
        if(currentResponse.startsWith("x")){
            //Convert a string "5" into an integer 5 using Integer.parseInt()
            //String.split("...") https://www.w3schools.com/java/ref_string_split.asp
            board.players[playerTurn].changeXBy(Integer.parseInt(currentResponse.split(",")[1]));
        }
        if(currentResponse.startsWith("y")){
            board.players[playerTurn].changeYBy(Integer.parseInt(currentResponse.split(",")[1]));
        }
    }

    private static void handleAttacks(String currentResponse){
        if(currentResponse.equalsIgnoreCase("beam")) {
            board.players[playerTurn].downLaserBeam(board.players);
        }
        //TODO: Add your own command handlers for your attacks
    }



}
