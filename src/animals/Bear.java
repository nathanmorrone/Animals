/*MENTAL NOTE: I may want to reset the attributes to zero BEFORE throwing the exceptions depending on the problem or scenario */

package animals;

/**
 * This class defines the animal object "Bear" and its characteristics
 *
 * @version 1.0
 * @author Nathan Morrone
 */
public class Bear {

    private String name;
    private String specialMove;
    private double health;
    private double weight;
    private boolean hungry;

    /**
     * A default constructor with predefined values for the data fields
     * of a bear object
     */
    public Bear() {

        name = "Great Bear Of The North"; //Hes got a shield and a mace and some armor
        specialMove = "Mace Shockwave";
        health = 70_000; // hp
        weight = 55_000; // pounds
        hungry = false;

    }

    /**
     * A constructor that takes multiple arguments that make up a bear object
     *
     * @param name The "Name" of the bear object.
     * @param specialMove The "Special Move" the bear object wields.
     * @param health The "Health Level" of the bear object
     * @param weight The "Weight" of the bear object
     * @param hungry "true" if the bear object is hungry "false" if the bear
     * object is not hungry
     */
    public Bear(String name, String specialMove, double health, double weight, boolean hungry) {
        this.name = name;
        this.specialMove = specialMove;
        this.health = health;
        this.weight = weight;
        this.hungry = hungry;

        if (name.length() == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You cannot set the \"Name of the bear\" to nothing try again...\n\n");
        }
        if (specialMove.length() == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You cannot set the \"Special Move of the bear\" to nothing try again...\n\n");
        }
        if (health < 0 || health == 0) {
            throw new IllegalArgumentException(
                    "\n\nAUTION: You cannot set the \"Health of the bear\" to \"0\" or a \"negative value\" try again...\n\n");
        }
        if (weight < 0 || weight == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Weight of the bear\" to \"0\" or a \"negative value\" try again...\n\n");
        }

    }

    // GETTERS
    
/**
 * This method returns the "Name" of the bear object
 * @return 
 */
    public String getName() {
        return this.name;
    }

    /**
     * This method returns the "Special Move" of the bear object
     *
     * @return Returns a "String" value. The value states the "Special Move" the
     * bear object wields.
     */
    public String getSpecialMove() {
        return this.specialMove;
    }

    /**
     * This method returns the "Health Level" of the bear object
     *
     * @return Returns a "Double" value. The value states the "health" of the
     * bear object
     */
    public double getHealth() {
        return this.health;
    }

    /**
     * This method returns the "Weight" of the bear object
     *
     * @return Returns a "Double" value. The value states the "weight" of the
     * bear object
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * This method returns a Boolean value which clarifies the "Hungry" state of
     * the bear object
     *
     * @return Returns a "Boolean value". The value states "true" if the bear
     * object is hungry, "false" if the bear object is not hungry.
     */
    public boolean getHungry() {
        return this.hungry;
    }

    // SETTERS
    
    
    /**
     * This method is used to set the "Name" of the bear object
     *
     * @param name The <b>Name</b> of the bear object.
     * @exception IllegalArgumentException 
     * If the user sets the name of the bear object to a null value.
     */
    public void setName(String name) {

        if (name.length() == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You cannot set the \"Name of the bear\" to nothing try again...\n\n");
        }
        this.name = name;
    }

    /**
     * This method is used to set the "Special Move" of the bear object
     *
     * @param specialMove The "Special Move" the bear object wields.
     */
    public void setSpecialMove(String specialMove) {

        if (specialMove.length() == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You cannot set the \"Special Move of the bear\" to nothing try again...\n\n");
        }

        this.specialMove = specialMove;
    }

    /**
     * This method is used to set the "Health" of the bear object
     *
     * @param health The "Health Level" of the bear object
     */
    public void setHealth(double health) {

        if (health < 0 || health == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You cannot set the \"Health of the bear\" to \"0\" or a \"negative value\" try again...\n\n");
        }
        this.health = health;
    }

    /**
     * This method is used to set the "Weight" of the bear object
     *
     * @param weight The "Weight" in Kilograms, of the bear object
     */
    public void setWeight(double weight) {

        if (weight < 0 || weight == 0) {
            throw new IllegalArgumentException(
                    "\n\nCAUTION: You can not set the \"Weight of the bear\" to \"0\" or a \"negative value\" try again...\n\n");
        }
        this.weight = weight;
    }

    /**
     * This method is used to set the "Hungry" state of the bear object
     *
     * @param hungry "true" if the bear object is hungry "false" if the bear
     * object is not hungry
     */
    public void setHungry(boolean hungry) {

        this.hungry = hungry;
    }

    // DISPLAY & EQUALS
    @Override
    public String toString() {
        return String.format(
                "%n%nBEAR STATS%n-----------%nHealth Level: %.2f%nName: %s%nSpecial Move: %s%nWeight: %.2f%nHungry: %b%n",
                this.health, this.name, this.specialMove, this.weight, this.hungry);

    }

    public boolean equals(Bear bear) {
        return this.name.equalsIgnoreCase(bear.getName()) && this.specialMove.equalsIgnoreCase(bear.getSpecialMove())
                && this.health == bear.getHealth() && this.weight == bear.getWeight()
                && this.hungry == bear.getHungry();
    }
}
