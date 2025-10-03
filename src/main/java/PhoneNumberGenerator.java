import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();

        int areaCode1 = rand.nextInt(8);
        int areaCode2 = rand.nextInt(8);
        int areaCode3 = rand.nextInt(8);
        int secondThree = rand.nextInt(743);
        int lastThree = rand.nextInt(1000);


        System.out.print(areaCode1);
        System.out.print(areaCode2);
        System.out.print(areaCode3);
        System.out.print("-");
        System.out.print(String.format("%03d", secondThree));
        System.out.print("-");
        System.out.print(String.format("%03d", lastThree));

        // TODO: Create Random object for phone number generation
        
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        
        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
    }
}
