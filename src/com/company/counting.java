package com.company;
import java.util.Scanner;
public class counting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        int[] a =new int[n];
        System.out.println("Enter the Elements in Array :  ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b =new int[n];
        int k=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>k)
                k=a[i];
        }
        int[] c =new int[k+1];
        for(int i=0;i<k+1;i++){
            c[i]=0;
        }
        for(int j=0;j<n;j++){
            c[a[j]]=c[a[j]]+1;
        }
        for(int i=1;i<k+1;i++){
            c[i]=c[i]+c[i-1];
        }
        for(int j=n-1;j>=0;j--){
            b[c[a[j]]-1]=a[j];
            c[a[j]]=c[a[j]]-1;
        }
        System.out.print("After Sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
