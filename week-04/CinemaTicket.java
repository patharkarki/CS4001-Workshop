import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter age group (Child / Adult / Senior): ");
        String agegroup = scan.nextLine();

        System.out.print("Enter movie language (Nepali / Hindi / English): ");
        String movielanguage = scan.nextLine();

        System.out.print("Are you a student? (yes/no): ");
        String studentinput = scan.nextLine();
        boolean isstudent = studentinput.equals("yes");

        System.out.print("Is today a festival day? (yes/no): ");
        String festivalinput = scan.nextLine();
        boolean isfestival = festivalinput.equals("yes");

        double baseprice = 0;

        switch (agegroup) {
            case "Child":
                baseprice = 150;
                break;

            case "Adult":
                baseprice = 250;
                break;

            case "Senior":
                baseprice = 200;
                break;

            default:
                System.out.println("Invalid age group!");
                return;
        }

        switch (movielanguage) {
            case "Nepali":
                break;

            case "Hindi":
                baseprice = baseprice + 50;
                break;

            case "English":
                baseprice = baseprice + 100;
                break;

            default:
                System.out.println("Invalid movie language!");
                return;
        }

        double finalprice = baseprice;

        if (isstudent) {
            finalprice = finalprice - finalprice * 0.20;
        }

      
        if (isfestival) {
            finalprice = finalprice - finalprice * 0.15;
        }
        
        System.out.println("Base Price: Rs. " + baseprice);
        System.out.println("Student Discount: " + (isstudent ? "Applied" : "Not Applied"));
        System.out.println("Festival Discount: " + (isfestival ? "Applied" : "Not Applied"));
        System.out.println("Final Ticket Price: Rs. " + finalprice);
        
        scan.close();
    }
}
