package com.company;
import java.util.Scanner;
public class InsertionSort
{
    Scanner sc=new Scanner(System.in);
    void sort()
    {
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element in Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <n ; i++) {
            int temp=a[i];
            int j=i;
            while (j>0&& a[j-1]>temp)
            {
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        for (int i = 0; i < n; i++)
           {
                 System.out.print(a[i]+" ");
           }
        }

    public static void main(String[] args)
    {
        InsertionSort obj=new InsertionSort();
        obj.sort();
    }
}
