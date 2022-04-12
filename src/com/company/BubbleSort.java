package com.company;
import java.util.Scanner;
public class BubbleSort
{
    Scanner sc = new Scanner(System.in);
    void sort()
    {
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in Arrays");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Sorted : ");
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        BubbleSort obj=new BubbleSort();
        obj.sort();
    }
}