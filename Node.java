// Nodo de un BST
//Extraido de: https://www.geeksforgeeks.org/construct-bst-from-given-preorder-traversa/

class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}