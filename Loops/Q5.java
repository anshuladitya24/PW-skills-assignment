import java.util.Scanner;

//Write a Java program to generate and print the first 'n' terms of the Fibonacci series.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms of the Fibonacci series you want: ");
        int n=sc.nextInt();
        long pre=0,post=1,res;
        if (n==1){
            System.out.println(pre);
        }
        else if(n<=0){
            System.out.println("Invalid");
        }
        else{
            System.out.println(pre);
            System.out.println(post);
            for (int i = 3; i <= n; i++) {
                res=pre+post;
                System.out.println(res);
                pre=post;
                post=res;
            }

        }
    }
}
