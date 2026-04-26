public class Board {

    //Public fields can be accessed across all files.
    //The static keyword is used for items that are SHARED across the program.
    //Since there is only one grid and each player is on the same grid, using static is appropriate here.
    //If we were to have multiple grids in our game, then static would not be appropriate here.
    public static char[][] grid = new char[15][15];
    public static int length = grid.length;

    public Player[] players;

    public Board(){
        initBoard();
        players = new Player[]{
                new Player(1, 1, 'p'),
                new Player(13, 13, 'x'),
                new Player(1, 13, 'j'),
                new Player(13, 1, 'r')
        };
    }

    private void initBoard(){
        for (int i = 0; i < grid.length;  i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[j][i] = '.';
            }
        }
    }

    public void print(){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[j][i]+"  ");
            }
            System.out.println();
        }
    }

    public void printAllStats(){
        //For each loop, rather than iterate through an x amount of times with a standard for loop,
        //You can loop through each element of a Collection.
        for(Player p : players){
            p.printStats();
        }
    }


}
