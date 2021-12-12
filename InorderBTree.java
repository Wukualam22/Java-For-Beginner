package mr.cloud;

import java.util.Stack;

class InorderBTree{
    static class Node{
        int key;
        Node left, right;
        Node(int item){
            key = item;
            left = right = null;
        }
        
        static Node getNode(int key){
            return new Node(key);
        }
    }
    
    Node root;
    InorderBTree(){
        root = null;
    }
    
    InorderBTree(int item){
        root = new Node(item);
    }
    
    Node insert(Node node, int key){
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        }
        if (key > node.key) {
            node.right = insert(node.right, key);
        }
        if (key == node.key) {
            System.out.println("Already exist");
        }
        
        return node;
    }
    void insert(int key){
        insert(root, key);
    }
    
    static void inorderR(Node node){
        if (node == null) return;
        if (node.left != null) inorderR(node.left);
        System.out.print(node.key + " ");
        if (node.right != null) inorderR(node.right);
    }
    void inorderR(){
        inorderR(root);
    }
    
    void inorderI(Node node){
        Stack<Node> nodes = new Stack<>();
        while (!nodes.isEmpty() || node != null) {
            if (node != null) {
                nodes.push(node);
                node = node.left;
            } else {
                node = nodes.pop();
                System.out.print(node.key + " ");
                node = node.right;
            }
        }
    }
    void inorderI(){
        inorderI(root);
    }
    
    static void inorderRShow(Node node){
        if (node == null) return;
        System.out.print(node.key);
        if (node.left != null) {
            System.out.print("<");
            inorderRShow(node.left);
        }
        System.out.print("="+node.key + " ");
        if (node.right != null) {
            System.out.print(">");
            inorderRShow(node.right);
        }
    }
    void inorderRShow(){
        inorderRShow(root);
    }
    
    void inorderIShow(Node node){
        Stack<Node> nodes = new Stack<>();
        while (!nodes.isEmpty() || node != null) {
            System.out.print(nodes.size()+">");
            if (node != null) {
                nodes.push(node);
                node = node.left;
            } else {
                node = nodes.pop();
                System.out.print("="+node.key + " ");
                node = node.right;
            }
        }
    }
    void inorderIShow(){
        inorderIShow(root);
    }
    
    public static void main(String[] args) {
        InorderBTree tree = new InorderBTree(11);
        tree.insert(6);
        tree.insert(21);
        tree.insert(2);
        tree.insert(10);
        tree.insert(1);
        tree.insert(4);
        tree.insert(9);
        tree.insert(17);
        tree.insert(19);
        
        System.out.print("inorder dengan recursion\t: ");
        tree.inorderR();
        System.out.println();
        System.out.print("Step-by-step: ");
        tree.inorderRShow();
        System.out.println();
        
        System.out.print("inorder dengan iterator\t\t: ");
        tree.inorderI();
        System.out.println();
        System.out.print("Step-by-step: ");
        tree.inorderIShow();
        System.out.println();
    }
}