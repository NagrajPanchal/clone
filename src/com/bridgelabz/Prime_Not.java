// Prime Number or Not
package com.bridgelabz;
import java.util.Scanner;
public class Prime_Not
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();
        int count =0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
