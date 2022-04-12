package com.company;

public class BinarySearch
{
    int search(int a[],int l,int r, int x)
    {
        if(l<=r)
        {
        int mid=(l+r)/2;

        if(a[mid]==x)
        {
            return mid;
        }
        if(a[mid]>x)

          return search(a,l,mid-1,x);

        else
            return search(a,mid+1,r,x);

        }
        return -1;

    }
    public static void main(String[] args)
    {
        BinarySearch obj=new BinarySearch();
        int a[]={1,2,3,4,5};
        int n= a.length;
        int x=3;
       int result= obj.search(a,0,n-1,x);
        if (result == -1)
        {
            System.out.println("Element not present");
        }
        else
        {
            System.out.println("Element found at index " + result);
        }
    }
}
