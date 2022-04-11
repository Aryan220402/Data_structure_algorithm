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
        System.out.println( obj.Binarysearch(root, 4));

    }
}
