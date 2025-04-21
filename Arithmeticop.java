import java.util.Scanner;
public class Arithmeticop 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer");
        int a=sc.nextInt();
        System.out.println("Enter first integer");
        int b=sc.nextInt();
        a+=b; 
        System.out.println("The Sum is : " + a);
        sc.close();
    }
}
