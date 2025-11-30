import java.util.Scanner;

public class GPA{
    public static void main (String [] args){
        Scanner scan= new Scanner (System.in);
        
        System.out.println("Enter your GPA");
        double gpa= scan.nextDouble();
        
    if (gpa <0 && gpa> 4) {
        System.out.println(" Invalid GPA");
    }
    else if (gpa > 3.60 && gpa <= 4)
    {
        System.out.println(" Your grade is: A+");
    }
    else if (gpa > 3.20 && gpa <= 3.60) {
        System.out.println(" Your grade is: A");
    }
    else if ( gpa > 2.80 && gpa <= 3.20) {
        System.out.println(" Your grade is: B+");
    }
    else if (gpa > 2.40 && gpa <= 2.80) {
        System.out.println(" Your grade is: B");
    }
    else if (gpa > 2.00 && gpa <= 2.40) {
        System.out.println(" Your grade is: C+");
    }
    else if (gpa > 1.6 && gpa <= 2.00) {
        System.out.println(" Your grade is: c");
    }
    else if ( gpa > 1.4 && gpa <=1.6) {
        System.out.println(" Your grade is: D");
    }
    else {
        System.out.println(" Your are fail");
    }
  
    scan.close();

}
}