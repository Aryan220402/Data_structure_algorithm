package com.company;
//class Node2{
//    int key;
//    Node2 left, right;
//
//    public Node2(int item)
//    {
//        key = item;
//        left = right = null;
//    }
//}
public class BST
{
//    Node1 root;
    void min(Node1 root)
    {
        if(root==null)
        {
            System.out.println("Tree is empty");
            return;
        }

        if(root.left == null)
        {
            System.out.println( root.key);
        }
        else
        {
            min(root.left);
        }
    }
    void max(Node1 root)
    {
        if(root==null)
        {
            System.out.println("Tree is empty");
            return;
        }

        if(root.right == null)
        {
            System.out.println( root.key);
        }
        else
        {
            max(root.right);
        }
    }
    public static void main(String[] args) {
        BST b=new BST();
        BinarySearchTree.insert(8);
        BinarySearchTree.insert(4);
        BinarySearchTree.insert(12);
        BinarySearchTree.insert(2);
        BinarySearchTree.insert(6);
        BinarySearchTree.insert(10);
        BinarySearchTree.insert(15);
        BinarySearchTree.insert(1);
        BinarySearchTree.insert(3);
        BinarySearchTree.insert(5);
        BinarySearchTree.insert(7);
        BinarySearchTree.insert(13);
        BinarySearchTree.insert(17);
        b.min(BinarySearchTree.root);
        b.max(BinarySearchTree.root);
    }
}
