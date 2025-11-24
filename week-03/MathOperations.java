
public class MathOperations
{
    public static void main (String [] args) {
        
        // arithmetic operator 
        int a =10;
        int b = 8;
        int c= a+b;
        System.out.println("The addition of two numbers: " + c);
        int d = a-b;
        System.out.println("The substraction of two numbers: " + d);
        int e= a/b;
        System.out.println("The division of two numbers: " +e);
        int f= a*b;
        System.out.println("The multiplication of two numbers: " +f);
        int g= a%b;
        System.out.println("The Modulus of two numbers: " +g);
        
        // incremnet
        int h= a++; // post-increment
        System.out.println(h);
        System.out.println(a);
        int i= ++b; //pre-increment 
        System.out.println(i);
        System.out.println(b);
        
        // relational operator
        boolean j= a==b;
        System.out.println (j);
        boolean k= a!=b;
        System.out.println (k);
        boolean l= a>b;
        System.out.println(l);
        boolean m= a<b;
        System.out.println(m);
        
        // logical operators 
        boolean n= true;
        boolean o= false;
        boolean p= (n && o);
        System.out.println(p);
        boolean q= (n||o);
        System.out.println(q);
        boolean r= (!n);
        System.out.println(r);
        
        //assigment 
        int num=5;
         num +=5;
        System.out.println(num); //output 10
        num *=2; 
        System.out.println(num); //output 30
        
        //ternary operator 
        int s= 9;
        String t= (s%2 ==0) ? "Even" : "Odd";
        System.out.println(s + " is "  + t); //output odd
        
        //bitwise operators 
        int u= 5;
        int v=3;
        int and= a&b;
        System.out.println(and);
        int or= a|b;
        System.out.println(or);
        int xor= a^3;
        System.out.println(xor);
        
    }
}