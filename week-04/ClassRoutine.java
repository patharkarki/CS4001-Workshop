import java.util.Scanner;

public class ClassRoutine
{
    public static void main (String [] args) {
        Scanner scan= new Scanner (System.in);
        
        System.out.println("Enter today day: ");
        String day= scan.nextLine();
        
        switch (day){
            case "sunday": 
                System.out.println(" Information System 'l' and digital logic 'l' "); break; 
            case "monday":
                System.out.println (" Computer hardware 'l' and programming 'l' "); break;
            case "tuesday":
                System.out.println (" computer hardware 't' and programming 't' "); break;
            case "wednesday":
                System.out.println (" information system 't' and digital logic 't' "); break;
            case "thursday": 
                System.out.println (" information system 'w' and digital logic 'w' "); break;
            case "friday":
                System.out.println (" programming 'w' and computer hardware 'w' "); break; 
            case "saturday":
                System.out.println (" no class today" ); break; 
            
            default: 
                System.out.println (" invalid day");
        }
    }
}