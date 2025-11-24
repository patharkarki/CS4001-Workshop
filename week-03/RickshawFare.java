import java.util.Scanner; 

public class RickshawFare
{
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter the distance from curren location to destination");
        double distance= scan.nextDouble();
        
        System.out.println("Enter the time it will take");
        double time= scan.nextDouble();
        
        System.out.println("Is the customer local? (yes/no) ");
        String islocal= scan.next();
        
        System.out.println("Is it the night time? (yes/no) ");
        String isnight= scan.next();
        
        // fare details
        double basefare= 50;
        double perkilometer= 10*distance;
        double perminute= 5*time;
        
        // inital fare
        double total= basefare + perkilometer + perminute;
        
        // 10% discount if local and distance is more than 10km
        total= (islocal.equals("yes") && distance> 10) ? 
        total - (total * 0.10) : total; 
        
        // night surcharge 20% extra
        total =(isnight.equals("yes") ) ?
        total = total + (total * 0.20) : total;
        
        System.out.println("Final Fare: Rs. " + total); // display final fare
        
        scan.close();
        
    }
}