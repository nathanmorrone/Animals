package testingAnimals;


import java.util.Scanner;
import animals.Bear;



public class TestBear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Import from different package
        Bear bear = new Bear();

        bear.getName();
        
        //Import using Explicit class path from difffernt package
        animals.Dragon dragon = new animals.Dragon();
        
        dragon.getName();
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Assigns user input to 5 parameters of a bear object
        char keepGoing = 'Y';
        while (keepGoing == 'Y') {

            // Ask user if they would like to enter in another bear
            System.out.printf("%n%nWould you like to enter another bears stats ? (Y/N): ");
            keepGoing = input.next().toUpperCase().charAt(0);

            input = new Scanner(System.in);


            if (keepGoing == 'N') {
                System.out.printf("%n%nExiting program..............");
                break;
            }

        }

        input.close();
    }
}