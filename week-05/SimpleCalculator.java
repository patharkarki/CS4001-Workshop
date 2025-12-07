import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        
        boolean loop = true;
        while (loop) {
            
            System.out.println("Enter fisrt number");
            int num1 = scan.nextInt();
            
            System.out.println("Enter second number");
            int num2 = scan.nextInt();
            
            scan.nextLine();
            
            System.out.println("Enter arithmetic operation (+,-,*,/)");
            String symbol = scan.nextLine();
            
            double result=0;
            switch (symbol) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid Symbol");
                    continue;
            }
            System.out.println( result );
            
            System.out.println(" Want to continue? (y/n)");
            String choice= scan.nextLine();
            
            if (choice.equals ("n")) {
                loop = false;
            }
        }
        
        
        
        
    }
}