import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++)
        {
            for(int col= 1; col<=row; col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
