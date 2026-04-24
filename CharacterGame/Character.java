public class Character {

    // =========================
    // Fields (Attributes)
    // =========================

    // The character's name (set when created)
    //TODO: Add your fields
    private String name;

    // Health starts at 100 by default
    private int health = 100;


    // =========================
    // Constructor
    // =========================

    /**
     * Constructor:
     * Used to set up a new Character object.
     * Name must be provided when creating the object.
     * Since multiple characters could have different names, we want to make the user able to
     * TODO: Add the changeable fields to the constructor.
     */
    public Character(String name){
        this.name = name;
    }


    // =========================
    // Methods (Behavior)
    // =========================

    /**
     * Reduces health by a given amount.
     * Ensures health never goes below 0.
     */
    public void decreaseHealth(int byHowMuch){
        health -= byHowMuch;

        if (health < 0) {
            health = 0;
        }
    }

    public void increaseHealth(int byHowMuch){
        //TODO:
    }


    // =========================
    // Setters (Modify Fields)
    // =========================

    /**
     * Changes the character's name.
     * Useful if we want to rename a character later.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the character's health directly.
     * Useful for healing or game resets.
     */
    public void setHealth(int health){
        this.health = health;

        // Optional safety check to keep health valid
        if (this.health < 0) {
            this.health = 0;
        }
    }


    // =========================
    // Getters (Access Fields)
    // =========================

    /**
     * Returns the character's name
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the character's current health
     */
    public int getHealth(){
        return health;
    }
}