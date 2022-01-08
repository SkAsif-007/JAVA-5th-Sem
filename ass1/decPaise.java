import java.util.Scanner;
public class decPaise{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Price: ");
        float n=sc.nextFloat();
        System.out.print("Price in Paise: ");
        n=n*100;
        System.out.println((int)n);
    }
}