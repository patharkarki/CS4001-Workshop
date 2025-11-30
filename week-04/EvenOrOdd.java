import java.util.Scanner; 

public class EvenOrOdd
{
    public static void main (String [] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter a number");
        int numb= scan.nextInt();
        
        if (numb % 2 == 0) {
            System.out.println(" The number is even");
            
        }
        else {
            System.out.println(" The number is odd");
        }
        
        scan.close();
        
        
    }
}