import java.util.Scanner;

//Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x=sc.nextInt();
        System.out.print("Enter second number: ");
        int y=sc.nextInt();
        int g=(x>y)?x:y;
        int gcd=1;
        for (int i=1;i<=g;i++){
            if(x%i==0 && y%i==0){
                if (i>gcd){
                    gcd=i;
                }
            }
        }
        System.out.println("GCD of these two numbers: "+gcd);
    }
}
