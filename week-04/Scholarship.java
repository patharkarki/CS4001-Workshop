
import java.util.Scanner; 

public class Scholarship
{
    public static void main (String [] args) {
        Scanner scan= new Scanner (System.in);
        
        System.out.println(" Enter your GPA (0.0 - 4.0: )");
        double gpa= scan.nextDouble();
        
        System.out.println("Enter your attendance : %");
        double attendance= scan.nextDouble();
        
        System.out.println("Enter your attitude score (1-10): ");
        double attitude = scan.nextDouble();
        
        if (gpa >= 3.2 && gpa <= 4) {
            
            if (attendance > 80 && attendance <= 100) {
                
                if (attitude >5 && attitude <= 10) {
                    
                    System.out.println("You are eligible for scholarship");
                }
                
                }
            }
        
            else {
                    System.out.println("You are not eligible for scholarship");
                }
       
                scan.close();
                
        } 
    }
