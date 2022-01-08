import java.util.Scanner;
public class sumDig{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the integer number: ");
        int n=sc.nextInt();
        // System.out.println(n);
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        System.out.println("sum = "+sum);
    }
}