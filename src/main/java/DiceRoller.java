import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {

        Random unseed1 = new Random();
        Random unseed2 = new Random();
        Random unseed3 = new Random();

        Random seeded = new Random(67);
        int dice1, dice2, dice3, dice4;
        dice1 = unseed1.nextInt(6)+1;
        dice2= unseed2.nextInt(6)+1;
        dice3 = unseed3.nextInt(6)+1;
        dice4 = seeded.nextInt(6)+1;

        System.out.println("Unseeded Die 1: " + dice1);
        System.out.println("Unseeded Die 2: " + dice2);
        System.out.println("Unseeded Die 3: " +dice3);
        System.out.println("Seeded Die: "+ seeded.nextInt(6+1));



        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        
        // TODO: Generate random integers for dice rolls
        
        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        
        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
