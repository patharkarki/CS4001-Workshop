import java.util.Scanner; 

public class GradeEvaluator
{
    public static void main(String [] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter the grade");
        double grade = scan.nextDouble();
        
        String abc= (grade >=40) ? "Pass" : "Fail";
        
        System.out.println(abc);
    }
}