package com.company;
class Node2
{
    int key;
    Node2 next;
    Node2(int key)
    {
        this.key=key;
    }
}
public class linklist
{
    Node2 head;
    void insert(int d)
    {
        Node2 node=new Node2(d);
        if(head==null)
        {
            head=node;
            return;
        }
        Node2 temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        temp=node;
    }
     void traversal()
     {
        Node2 temp=head;
        while (temp!=null)
        {
            System.out.print(temp.key+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void evenodd()
    {
        Node2 odd=head;
        Node2 even=head.next;
        Node2 node=even;
        while(even!=null && odd!=null)
        {
             odd.next=even.next;
             odd=odd.next;
             even.next=odd.next;
             even=even.next;
        }
        odd.next=node;
    }

    public static void main(String[] args)
    {
        linklist obj=new linklist();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        System.out.println("Before");
        obj.traversal();
        System.out.println("After");
        obj.evenodd();
        obj.traversal();
    }
}
