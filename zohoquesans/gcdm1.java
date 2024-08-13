
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       int n1 = 9, n2 = 12;

	        // Find the GCD of n1 and n2
	        int gcd = findGcd(n1, n2);

	        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);

    }
    public static int lcm(int a, int b)
    {
        int big = a>b?a:b;
        int small = a<b?a:b;
        int lcm = big;
        while(lcm % small != 0)
        {
            lcm+=big;
        }
        return lcm;
    }
    public static  int findGcd(int a, int b) {
        
    int GCD = a*b/lcm(a,b);
    return GCD;
        
    }
    
    
    
}
