import java.util.Scanner;
public class BegEnd 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Starting number");
        int BEG = scanner.nextInt();
        System.out.println("Enter the Ending number");
        int END = scanner.nextInt();
        System.out.println("Numbers are :");
        for(int i = END; i >= BEG ; i--)
        {
            System.out.println(i+" ");
        }
        scanner.close();
    }
}
