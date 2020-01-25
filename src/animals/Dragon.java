package animals;
/**
 * Dragon class
 * @author nathan
 * @version 1.0
 */
public class Dragon {


    //Deleted all the comments this is a new one O_o
    //hello again
    //Helloooooooooooooooooooooooooo
    //hello
    private String name;
    private String specialMove;
    private double health;
    private double weight;
    private boolean hungry;

    /**
     * Default constructor with predefined values 
     */
    public Dragon() {

        name = "Dragon Of DarkLight"; //Big dragon //spews dark purple flames // All black body with red eyes
        specialMove = "Dark Ascension Flame Beam";
        health = 100_000; // hp
        weight = 80_000; // pounds
        hungry = false;

    }

    /**
     * 
     * @param name The "Name" of the dragon object
     * @param specialMove The "Special Move" the dragon object wields
     * @param health The "Health Level" of the dragon object
     * @param weight The "Weight" of the dragon object
     * @param hungry The "Hungry" state of the dragon object. 
     */
    public Dragon(String name, String specialMove, double health, double weight, boolean hungry) {
        this.name = name;
        this.specialMove = specialMove;
        this.health = health;
        this.weight = weight;
        this.hungry = hungry;

        if (name.length() == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Name\" of the dragon to nothing try again..\n\n");
        }

        if (specialMove.length() == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Special\" move of the dragon to nothing try again..\n\n");
        }

        if (health < 0 || health == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Health\" of the dragon to \"0\" or a \"negative value\" try again..\n\n");
        }
        if (weight < 0 || weight == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Weight\" of the dragon to \"0\" or a \"negative value\" try again..\n\n");
        }
    }

    // GETTERS
    /**
     * This method returns the "Name" of the dragon object
     * @return Returns a "String" Value. The value represents that represents the
     * "Name" of the dragon object
     */
    public String getName() {
        return this.name;
    }

    /**
     * This method returns the "Special Move" of the dragon object
     * 
     * @return Returns a "String" value. the value represents the "Special Move" 
     * of the dragon object
     */
    public String getSpecialMove() {
        return this.specialMove;
    }

    /**
     * This method returns the "Health Level" of the dragon object
     * 
     * @return Returns a "double" value. the value represents the "Health Level"
     * of the dragon object.
     */
    public double getHealth() {
        return this.health;
    }

    /**
     * This method returns the "Weight" of the dragon object.
     * 
     * @return Returns a "double" value. the value represents the "Weight" of the
     * dragon object.
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * This method returns the a Boolean value that states if the dragon object
     * is "Hungry"
     * @return Returns a "double" value. The value represents the "Hungry" state
     * of the dragon object 
     */
    public boolean getHungry() {
        return this.hungry;
    }

    // SETTERS
    public void setName(String name) {

        if (name.length() == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Name of the dragon\" to nothing try again...\n\n");
        }
        this.name = name;

    }

    public void setSpecialMove(String specialMove) {

        if (specialMove.length() == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Special move of the dragon\" to nothing try again...\n\n");
        }
        this.specialMove = specialMove;

    }

    public void setHealth(double health) {

        if (health < 0 || health == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Health of the dragon\" to \"0\" or a \"negative value\" try again...\n\n");
        }
        this.health = health;
    }

    public void setWeight(double weight) {

        if (weight < 0 || weight == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Weight of the dragon\" to \"0\" or a \"negative value\" try again...\n\n");
        }
        this.weight = weight;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    // DISPLAY AND EQUALS
    @Override
    public String toString() {
        return String.format(
                "%n%nDRAGON STATS:%n--------------%nHealth Level: %.2f%nName: %s%nSpecial Move: %s%nWeight: %.2f%nHungry: %b%n",
                this.health, this.name, this.specialMove, this.weight, this.hungry);

    }

    public boolean equals(Dragon dragon) {

        return this.name.equalsIgnoreCase(dragon.getName())
                && this.specialMove.equalsIgnoreCase(dragon.getSpecialMove()) && this.health == dragon.getHealth()
                && this.name.equals(dragon.getName()) && this.weight == dragon.getWeight()
                && this.hungry == dragon.getHungry();

    }
    

}
