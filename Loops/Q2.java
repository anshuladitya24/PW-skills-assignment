import java.util.Scanner;

//Write a Java program to print a multiplication table for a given number 'n'.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number whose multiplication table you want to print: ");
        int n=sc.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
