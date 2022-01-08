import java.util.Scanner;
public class gcdhcf{
    static int gcd(int a,int b){
            if(b==0) return a;
            return gcd(b,a%b);
        }
    static int lcm(int a,int b){
        return ((a*b)/gcd(a,b));
    }
        
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
}