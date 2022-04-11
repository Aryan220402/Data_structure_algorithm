package com.company;
import java.util.*;
class Node{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
class BinaryTree
{
    Node root;
    BinaryTree() { root = null; }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    void printPreorder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    int printheight(Node root)
    {
        if(root==null) {

            return 0;
        }
        int l=printheight(root.left);
        int  r=printheight(root.right);
        return Math.max(l, r)+1;
    }
    void levelOrder(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode==null)
            {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(currNode.key+" ");
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right !=null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }
    int CountOfNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftNodes=CountOfNode(root.left);
        int rightNodes=CountOfNode(root.right);
        return leftNodes+rightNodes+1;
    }
    int SumOfNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftSum=SumOfNode(root.left);
        int rightSum=SumOfNode(root.right);
        return leftSum+rightSum+root.key;
    }
    int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int DL=diameter(root.left);
        int DR=diameter(root.right);
        int Diameter=printheight(root.left)+printheight(root.right)+1;
        return Math.max(Diameter,Math.max(DL,DR));
    }
    void printPostorder()
    {
        printPostorder(root);
    }
    void printInorder()
    {
        printInorder(root);
    }
    void printPreorder()
    {
        printPreorder(root);
    }

    void  printheight()
    {
        System.out.println(  printheight(root));

    }
    void levelOrder()
    {
        levelOrder(root);
    }
    void CountOfNode()
    {
        System.out.println(CountOfNode(root));
    }
    void SumOfNode()
    {
        System.out.println(SumOfNode(root));
    }
    void diameter()
    {
        System.out.println(diameter(root));
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
        System.out.println("\nHeight traversal of binary tree is ");
        tree.printheight();
        System.out.println("\nLevel traversal of binary tree is ");
        tree.levelOrder();
        System.out.println("\nCount Of Node traversal of binary tree is ");
        tree.CountOfNode();
        System.out.println("\nSum Of Node traversal of binary tree is ");
        tree.SumOfNode();
        System.out.println("\nDiameter Of Tree traversal of binary tree is ");
        tree.diameter();

    }
}
