
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = sc.nextInt();
        for(int row = 1; row<=2*n; row++)
        {
            int conditionsp= row>n?row-n:n-row;
            for(int sp = 1; sp <= conditionsp; sp++)
            {
                System.out.print("_");//  space for organize
            }
            int condition=row>n?2*n-row:row;
            for(int col= 1; col<=condition; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
