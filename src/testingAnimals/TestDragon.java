/*This program creates an array of "dragons" and for each dragon object the program retrieves 
user input and sets each datafield of the dragon object. It then compares the first dragon
 object with the second dragon object in the array and will display the dragon 
objects the user created with corresponding titles for the datafields*/

package testingAnimals;

import java.util.InputMismatchException;
import java.util.Scanner;
import animals.Dragon;

public class TestDragon {

    public static void main(String[] args) {
        
        
        

      
        Scanner input = new Scanner(System.in);

        // Array of dragons, which is an array of objects or references
        Dragon[] dragons = new Dragon[2];

        for (int i = 0; i < dragons.length; i++) {

            System.out.printf("%nDRAGON #%d%n", i + 1);

            dragons[i] = createDragon(input); // This method "createDragon" creates a dragon object and returns its
                                              // reference so I dont need to create a dragon object 

            input = new Scanner(System.in); // reset buffer

        }

        // loop through the array and display each dragon object
        for (int i = 0; i < dragons.length; i++) {
            System.out.printf("%n%nDragon #%d: ", i + 1);
            System.out.print(dragons[i]);
        }

        // Compare each dragon
        System.out.printf("%n%nAre the dragons, \"%s\" and \"%s\" the same dragon ? %b", dragons[0].getName(),
                dragons[1].getName(), dragons[0].equals(dragons[1]));

        input.close();

    }

    // STATIC METHODS
    // Retrieve user input
    private static String getInput(Scanner input, String prompt) {

        System.out.print(prompt);

        String value = input.nextLine().trim();

        return value;
    }

    // This method creates a dragon object and returns its reference. User input
    // values are used as arguments for data fields of the object.
    private static Dragon createDragon(Scanner input) {

        String name;
        String specialMove;
        double health;
        double weight;
        boolean hungry;

        // Dragon object
        Dragon dragon = new Dragon();

        // 1 - Health (make into void method)
        boolean isValid = true; // control variable
        while (isValid) {

            System.out.printf("WELCOME TO DESIGN YOUR OWN DRAGON%n---------------------------------%n");

            try {
                health = Double.parseDouble(getInput(input, "Enter Dragons health: "));
                dragon.setHealth(health);

                isValid = false;
            } catch (NumberFormatException ex1) {
                System.out.print("\n\nCAUTION:  You can not enter a null value "
                        + "OR a string value for the \"Dragons Health\"\n\n");
                input = new Scanner(System.in);
            } catch (IllegalArgumentException ex2) {
                System.out.print(ex2.getMessage());
                input = new Scanner(System.in);
            }

        }

        // 2 - Name (make into void method)
        isValid = true; // reset control variable
        while (isValid) {
            try {
                name = getInput(input, "Enter Dragons Name: ");
                dragon.setName(name);

                isValid = false;
            } catch (IllegalArgumentException ex5) {
                System.out.print(ex5.getMessage());
                input = new Scanner(System.in);
            }
        }

        // 3 - Special Move (make into void method)
        isValid = true; // reset control variable
        while (isValid) {
            try {
                specialMove = getInput(input, "Enter Dragons Special Move: ");
                dragon.setSpecialMove(specialMove);

                isValid = false;
            } catch (IllegalArgumentException ex6) {
                System.out.print(ex6.getMessage());
                input = new Scanner(System.in);
            }
        }

        // 4 - Weight (make into void method)
        isValid = true; // reset control variable
        while (isValid) {

            try {
                weight = Double.parseDouble(getInput(input, "Enter Dragons Weight: "));
                dragon.setWeight(weight);

                isValid = false;
            } catch (NumberFormatException ex3) {
                System.out.print("\n\nCAUTION:  You can not enter a null value "
                        + "OR a string value for the \"Dragons Weight\"\n\n");
                input = new Scanner(System.in);
            } catch (IllegalArgumentException ex4) {
                System.out.print(ex4.getMessage());
                input = new Scanner(System.in);
            }
        }

        // 5 - Hungry (make into void method)
        isValid = true; // reset control variable
        while (isValid) {
            try {

                System.out.print("Is the Dragons Hungry (true/false or TRUE/FALSE): ");
                hungry = input.nextBoolean();

                dragon.setHungry(hungry);

                isValid = false;
            } catch (InputMismatchException ex8) {
                System.out.print("\n\nCAUTION:  You can not enter a null value, a numeric value, "
                        + "or anything other string value besides \"true/false or TRUE/FALSE\" "
                        + "for the \"Dragons Hunger\"\n\n");
                input = new Scanner(System.in);
            }
        }

        return dragon;

    }
}