//TRV19ECO32
//HisanaThasneem
import java.util.Scanner;
public class AbsoluteValue
{
   public static void main(String[] args)
   {
      int n;
      int abs;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      n = sc.nextInt();
      if(n>0)
        abs = n;
      else
        abs = -1 * n;
      System.out.print("absolute  of the given number:" + abs);
   }

}