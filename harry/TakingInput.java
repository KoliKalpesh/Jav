package harry;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        // System.out.println("Addition of two nummbers");
        System.out.println("taking input from user :");
        Scanner sc =new Scanner(System.in);
        // System.out.println("Enter number 1 :");
        // int a = sc.nextInt();
        // System.out.println("Enter number 2 :");
        // int b= sc.nextInt();
        // int sum = a+b;
        // System.out.println("Sum is :"+ sum);
        boolean b1= sc.hasNextInt();
        System.out.println(b1);
    }
    
}
