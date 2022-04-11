package com.company;
class Node1{
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
    Node1 root;
    void insert(int key)
    {
        root = insertRec(root, key);
    }
    Node1 insertRec(Node1 root,int key)
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
            return               Binarysearch(root.right,key);
        }else {

      return    Binarysearch(root.left,key);
    }}
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
       obj.root.right.right.right=new Node1(17);
        obj.insert(8);
        obj.insert(4);
        obj.insert(12);
        obj.insert(2);
        obj.insert(6);
        obj.insert(10);
        obj.insert(15);
        obj.insert(1);
        obj.insert(3);
        obj.insert(5);
        obj.insert(7);
        obj.insert(13);
        obj.insert(17);
obj.inOrder(obj.root);
        System.out.println( obj.Binarysearch(obj.root, 4));

    }
}
