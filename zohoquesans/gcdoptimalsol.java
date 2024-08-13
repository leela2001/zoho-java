
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
    public static int findGcd(int a, int b)
    {
        
        
		// Euclidean Algorithm 
		/*
		 Eg, n1 = 20, n2 = 15:

		gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)

		gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)

		gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)

		gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)

		Hence, return 5 as the gcd.
		 */
        
        
        
    if(b>a)
    {
        int temp = a;
        a=b;
        b=temp;
    }
    if(a==0||b==0)
    {
        if(a!=0)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    return findGcd(a-b,b);
        
    }
    
    
    
}
