/**
 * The superclass that contain attributes for ALL players.
 */
public class Player {
    //Fields
    //Feel free to add your own stats just like last activity.
    private int x, y, health;
    private char gridLetter;




    //Constructors
    public Player(int x, int y, char gridLetter){
        this.x=x;
        this.y=y;
        this.gridLetter = gridLetter;
        this.health=100;
        placeOnGrid();
    }

    private void enforceBounds(){
        if(this.x < 0)this.x=0;
        if(this.x > Board.length-1) this.x = Board.length-1;
        if(this.y < 0)this.y=0;
        if(this.y > Board.length-1) this.y = Board.length-1;
    }

    private void removeFromGrid(){
        Board.grid[this.x][this.y] = '.';
    }

    //Watch out for ArrayIndexOutOfBoundsExceptions
    private void placeOnGrid(){
        Board.grid[this.x][this.y] = this.gridLetter;
    }

    public char getGridLetter() {
        return gridLetter;
    }

    //Methods
    public void goTo(int x, int y){
        removeFromGrid();
        this.x = x;
        this.y = y;
        enforceBounds();
        placeOnGrid();
    }

    public void goToRandom(){
        /**
         * We must use the (int) cast here since Math.round() returns a long integer, and the goTo method requires normal "int" integers.
         A long is just an integer with more memory allocated to it so it can be smaller or larger.
         int Minimum: -2,147,483,648 (-2^31)
         int Maximum: 2,147,483,647 (2^31 - 1)
         long Minimum: -9,223,372,036,854,775,808 (-2^63)
         long Maximum: 9,223,372,036,854,775,807 (2^63 - 1)
        */
        goTo( (int) Math.round(Math.random() * 14), (int) Math.round(Math.random() * 14));
    }

    public void changeYBy(int i){
        removeFromGrid();
        y+=i;
        enforceBounds();
        placeOnGrid();
    }

    public void changeXBy(int i){
        removeFromGrid();
        x+=i;
        enforceBounds();
        placeOnGrid();
    }

    public void printStats(){
        System.out.print("Player: "+this.gridLetter+"'s "); //Not println,
        System.out.println("Health: "+health);
    }

    /**
     * Create your own custom move
     * You can rename this method to something more fitting.
     * Try to make your move balanced. Balanced games are more fun!
     * Magic move ideas:
     * 1. Explosion (make all surrounding squares do damage to players
     * 2. Walls (Leave a row of walls to block other players)
     * 3. Spells (Remove a random command from your opponent's menu)
     * 4. Mines (Leave a mine on a square that does a lot of damage)
     * 5. Clones (Create an army of clones to confuse the opponent)
     * 6. Freeze/Wound (Prevent a player of your choice from either moving or attacking)
     * 7. Invisibility spell. (Hide the players location for the turn)
     * 8. Spend health to gain an extra attack
     * 9. Damage Link: Until next turn, all players take the same amount of damage as you.
     *
     */
    public void magicMove(){
        //TODO: write your code here
    }

    /**
     * This will fire a downwards laser beam. Great if multiple players are on a file.
     * If any players
     * @param: all players on the board. This is required if we want our move to directly affect other players.
     */
    public void downLaserBeam(Player[] players){
        for (int i = y+1; i < Board.length-1; i++) {
            for(Player p: players){
                if(p.getX() == x && p.getY() == i){
                    p.changeHealth(-10);
                }
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void changeHealth(int amount) {
        this.health += amount;
    }
}
