import java.util.Scanner;

public class Positive
{
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int numb= scan.nextInt();
        
        if (numb > 0) {
            System.out.println(" The number is positive");
        }
        else if (numb < 0) {
            System.out.println(" The number is negative");
        }
        else {
            System.out.println(" The number is zero");
        }
        
        scan.close();
        
    }
}