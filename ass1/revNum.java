import java.util.Scanner;
public class revNum{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number to be reversed: ");
        int n=sc.nextInt();
        // System.out.println(n);
        int rev=0;
        int rem;
        while(n>0){
            rem=(n%10);
            rev=(rev*10)+rem;
            n/=10;
        }
        System.out.println("Reverse =" + rev);
    }
}