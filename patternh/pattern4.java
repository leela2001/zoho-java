// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++)
        {
            for(int sp = 1; sp <= row-1; sp++)
            {
                System.out.print("_ ");//  space for organize
                
            }
            for(int col= row; col<=n; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
