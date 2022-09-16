package com.bridgelabz;
import java.util.Scanner;
public class PrimeNumbers
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Up to Limit Number : ");
        int num = scanner.nextInt();
        System.out.println("Prime Numbers are : ");
        int i,j;
        for(i=1;i<=num;i++) {
            for(j=2;j<=i;j++) {
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.print(j+" ");
        }
    }
}
