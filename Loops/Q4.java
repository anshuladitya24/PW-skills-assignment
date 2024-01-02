import java.util.Scanner;

//Write a Java program to check if a given string is a palindrome or not using a loop.
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String n=sc.next();
        int flag=1;
        int size=n.length()-1;
        for (int i=0;i<=size;i++){
            if (n.charAt(i)!=n.charAt(size-i)){
                System.out.println("This string is not a palindrome! ");
                flag=0;
                break;
            }
        }
        if (flag==1){
            System.out.println("This string is a palindrome!");
        }
    }
}
