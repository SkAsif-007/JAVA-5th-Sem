import java.util.Scanner;
public class tempConv{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Temperature: ");
        float f=sc.nextFloat();
        System.out.println("Temp in F: "+f);
        float c=(f-32)*5/9;
        System.out.println("Temp in C: "+c);
    }
}