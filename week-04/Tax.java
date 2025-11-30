import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = scan.nextDouble();

        double tax = 0;

        if (income <= 500000) {
            tax = income * 0.01;
        }
        else if (income <= 700000) {
            tax = 500000 * 0.01 
                + (income - 500000) * 0.10;
        }
        else if (income <= 1000000) {
            tax = 500000 * 0.01 
                + 200000 * 0.10 
                + (income - 700000) * 0.20;
        }
        else if (income <= 2000000) {
            tax = 500000 * 0.01 
                + 200000 * 0.10 
                + 300000 * 0.20 
                + (income - 1000000) * 0.30;
        }
        else if (income <= 5000000) {
            tax = 500000 * 0.01 
                + 200000 * 0.10 
                + 300000 * 0.20 
                + 1000000 * 0.30 
                + (income - 2000000) * 0.36;
        }
        else { 
            tax = 500000 * 0.01 
                + 200000 * 0.10 
                + 300000 * 0.20 
                + 1000000 * 0.30 
                + 3000000 * 0.36
                + (income - 5000000) * 0.39;
        }

        
        System.out.println("Annual Income: NPR " + income);
        System.out.println("Total Tax Payable: NPR " + tax);
        
        scan.close();
    }
}
