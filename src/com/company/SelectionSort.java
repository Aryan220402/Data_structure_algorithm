package com.company;
import java.util.Scanner;
public class SelectionSort
{
    Scanner sc=new Scanner(System.in);
    void sort()
    {
        System.out.println("Enter the SIze of Array" );
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element in Array");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.print("Sorted :");
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
            System.out.print(" "+t);
        }

    }

    public static void main(String[] args)
    {
        SelectionSort obj=new SelectionSort();
        obj.sort();
    }
}
