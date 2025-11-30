import java.util.Scanner;

public class SellingPrice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter marked price ");
        double markedprice = scan.nextDouble();

        System.out.print("Enter category A,B,C,D ");
        String category = scan.next();

        double discountrate= 0;

        switch (category) {
            case "A":
                discountrate = 0.60;
                break;

            case "B":
                discountrate = 0.40;
                break;

            case "C":
                discountrate = 0.20;
                break;

            case "D":
                discountrate = 0.10;
                break;

            default:
                System.out.println(" Wrong Categegory ");
                
                
        }

        double sellingprice= markedprice- (markedprice * discountrate);
       
        System.out.println(" The final selling price is: " + sellingprice);
    }
}

