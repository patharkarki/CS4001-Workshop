import java.util.Scanner;

public class FixedDepositNIB {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String loop = "yes";
        
        while (loop.equals("yes")) {
            
            System.out.print("Enter deposit amount (Min Rs. 1000): ");
            double principal = scan.nextDouble();
            
            while (principal < 1000) {
                System.out.print("Amount must be at least Rs. 1000. Enter again: ");
                principal = scan.nextDouble();
            }
            
            System.out.print("Enter interest rate (8-12%): ");
            double rate = scan.nextDouble();
            
            while (rate < 8 || rate > 12) {
                System.out.print("Rate must be between 8-12%. Enter again: ");
                rate = scan.nextDouble();
            }
            
            System.out.print("Enter duration in years (Max 5): ");
            int years = scan.nextInt();
            
            while (years <= 0 || years > 5) {
                System.out.print("Duration must be between 0-5 years. Enter again: ");
                years = scan.nextInt();
            }
            
            double processingFee = principal * 0.5 / 100;
            double actualPrincipal = principal - processingFee;
            
            
            double monthlyRate = rate / 12 / 100;
            int months = (years * 12);
            double maturityAmount = actualPrincipal;
            
            int i = 0;
            while (i < months) {
                maturityAmount = maturityAmount + (maturityAmount * monthlyRate);
                i++;
            }
            
            double interest = maturityAmount - actualPrincipal;
            
            System.out.println("Principal: Rs. " + principal);
            System.out.println("Processing Fee (0.5%): Rs. " + processingFee);
            System.out.println("Actual Principal: Rs. " + actualPrincipal);
            System.out.println("Interest Rate: " + rate + "%");
            System.out.println("Duration: " + years + " years");
            System.out.println("Interest Earned: Rs. " + interest);
            System.out.println("Maturity Amount: Rs. " + maturityAmount);
           
            
            System.out.print("Calculate another FD? (yes/no): ");
            loop = scan.next();
            System.out.println();
        }
        
        System.out.println("Thank you!");
        scan.close();
    }
}