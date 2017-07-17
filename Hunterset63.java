# Hunterset63
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hunterset63
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=input.nextInt();
    ArrayList<Integer> ar=new ArrayList<Integer>();
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++)
    {
      ar.add(input.nextInt());
    }
    System.out.println("Output:");
        for(int j=0;j<n-1;j++)
        {
        ar.remove(0);
        System.out.print(Collections.max(ar)+" ");
        }
     System.out.print(0);
  }

}
