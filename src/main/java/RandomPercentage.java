import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        Random rand = new Random();
        Random seed = new Random(67);

        double perRand = rand.nextDouble();
        double perSeed = seed.nextDouble();


        System.out.printf("Unseeded Random: %.2f%%%n", perRand * 100);
        System.out.printf("Seeded Random: %.2f%%%n", perSeed * 100);

        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        
        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
    }
}