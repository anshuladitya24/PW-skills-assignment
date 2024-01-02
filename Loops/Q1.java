//Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print the sum of natural numbers: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum till entered natural number is: "+sum);
    }
}
