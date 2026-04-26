public class Character {

    // =========================
    // Fields (Attributes)
    // =========================

    private String name;
    private int health = 100;
    private int stamina = 100;
    private int age;

    // Default-initialized stats
    private int strength = 10;
    private int intelligence = 10;
    private int luck = 5;

    // Constructor-initialized stats
    private int gold;
    private int reputation;
    private int mana;

    // =========================
    // Constructor
    // =========================

    public Character(String name, int age, int gold, int reputation, int mana){
        this.name = name;
        this.age = age;
        this.gold = gold;
        this.reputation = reputation;
        this.mana = mana;
    }

    // =========================
    // Health Methods
    // =========================

    public void decreaseHealth(int byHowMuch){
        health -= byHowMuch;
        if (health < 0) health = 0;
    }

    public void increaseHealth(int byHowMuch){
        health += byHowMuch;
        if (health > 100) health = 100;
    }

    // =========================
    // Strength Methods
    // =========================

    public void increaseStrength(int amount){
        strength += amount;
    }

    public void decreaseStrength(int amount){
        strength -= amount;
        if (strength < 0) strength = 0;
    }

    // =========================
    // Intelligence Methods
    // =========================

    public void increaseIntelligence(int amount){
        intelligence += amount;
    }

    public void decreaseIntelligence(int amount){
        intelligence -= amount;
        if (intelligence < 0) intelligence = 0;
    }

    // =========================
    // Luck Methods
    // =========================

    public void increaseLuck(int amount){
        luck += amount;
    }

    public void decreaseLuck(int amount){
        luck -= amount;
        if (luck < 0) luck = 0;
    }

    // =========================
    // Gold Methods
    // =========================

    public void addGold(int amount){
        gold += amount;
    }

    public void spendGold(int amount){
        gold -= amount;
        if (gold < 0) gold = 0;
    }

    // =========================
    // Reputation Methods
    // =========================

    public void increaseReputation(int amount){
        reputation += amount;
    }

    public void decreaseReputation(int amount){
        reputation -= amount;
    }

    // =========================
    // Mana Methods
    // =========================

    public void useMana(int amount){
        mana -= amount;
        if (mana < 0) mana = 0;
    }

    public void restoreMana(int amount){
        mana += amount;
    }

    // =========================
    // Getters
    // =========================

    public String getName(){ return name; }
    public int getHealth(){ return health; }
    public int getStrength(){ return strength; }
    public int getIntelligence(){ return intelligence; }
    public int getLuck(){ return luck; }
    public int getGold(){ return gold; }
    public int getReputation(){ return reputation; }
    public int getMana(){ return mana; }
}
