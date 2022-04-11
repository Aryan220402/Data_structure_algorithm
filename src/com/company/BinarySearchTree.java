package com.company;
class  Node1{
    int key;
    Node1 left, right;
    public Node1(int item)
    {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree
{
   static Node1 root;
    static Node1 insertRec(Node1 root,int key)
    {
        if(root==null)
        {
            root=new Node1(key);
            return root;
        }
        if(key<root.key) {
            root.left = insertRec(root.left, key);
        }

        else if(key>root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;

    }

    static void insert(int key)
    {
        root = insertRec(root, key);
    }
     boolean Binarysearch(Node1 root, int key )
    {
        if(root==null ) {
            return false;
        }

        if (root.key==key){

            return true;
        }
        if(root.key<key)
        {
            return Binarysearch(root.right,key);
        }
        else
        {
            return Binarysearch(root.left,key);
        }
    }


     void delete(int key)
    {
        root = deleteRec(root, key);
    }
    Node1 deleteRec(Node1 root,int x)
    {
        if(root==null)

            return root;

        if(x<root.key)
        {
            root.left=deleteRec(root.left,x);
        }
        else if(x>root.key)
        {
            root.right=deleteRec(root.right,x);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            root.key=min(root.right);
            root.right=deleteRec(root.right,root.key);

        }
        return root;
    }
    int min(Node1 root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    public void inOrder(Node1 root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.key+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        BinarySearchTree obj=new BinarySearchTree();

        insert(8);
        insert(4);
        insert(12);
        insert(2);
        insert(6);
        insert(10);
        insert(15);
        insert(1);
        insert(3);
        insert(5);
        insert(7);
        insert(13);
        insert(17);
        obj.inOrder(root);
        System.out.println( obj.Binarysearch(root, 6));
        obj.delete(6);
        obj.inOrder(root);
        System.out.println( obj.Binarysearch(root, 6));

    }
}
