
public class DefaultValues
{
    // instance varaibles without value 
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    boolean g;
    char h;
    
    public static void main(String [] args){
        
        DefaultValues abc= new DefaultValues(); // object 
        
        System.out.println(abc.a);
        System.out.println(abc.b);
        System.out.println(abc.c);
        System.out.println(abc.d);
        System.out.println(abc.e);
        System.out.println(abc.f);
        System.out.println(abc.g);
        System.out.println(abc.h);
        
        /* This wouldnot work for local variable beacuse you need to assign value 
          to local varaibles while creating otherwise it will give compile time error.
         */
        
    }
}