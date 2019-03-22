
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18731
 * @date 19/03/19
 * @name BinaryTree.java
 * <p>Clase que permite la implementacion de un binary tree </p>
 * Fuentes utilizada:
 * baeldung. (20 de diciembre del 2018). Implementing a Binary Tree in Java. Extraido de: https://www.baeldung.com/java-binary-tree
 * GeeksforGeeks. (2019). Compare two Strings in Java. Extraido de: https://www.geeksforgeeks.org/compare-two-strings-in-java/
 * */
  

public class BinaryTree {
    Palabras <String,String> value;
    BinaryTree left;
    BinaryTree right;
    BinaryTree root;
    
      public BinaryTree(Palabras <String,String>  value) {
        this.value = value;
        right = null;
        left = null;
    }
    
    private  BinaryTree addRecursive( BinaryTree current, Palabras <String,String>  value) {
       int num=stringCompare(current.value.getKey(), value.getKey());
        if (value == null) {
             new BinaryTree(value);
        }
        else if (num<0){
            current.left = addRecursive(current.left, value);
       }else if (num>0){
           current.right = addRecursive(current.right, value);
       }else{
        // value already exists
        return current;
    }  
       return current;
    }
    public void add(Palabras <String,String> value) {
    root = addRecursive(root, value);
}
    
   
 /*

    private Nodo deleteRecursive(Nodo current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go here
        } 
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }
*/
    

    public void traverseInOrder( BinaryTree tree) {
        if (tree != null) {
            traverseInOrder(tree.left);
            System.out.print(" " + tree.value);
            traverseInOrder(tree.right);
        }
    }
    public void traversePreOrder(BinaryTree tree) {
        if (tree != null) {
            System.out.print(" " + tree.value);
            traversePreOrder(tree.left);
            traversePreOrder(tree.right);
        }
    }
    public void traversePostOrder( BinaryTree tree) {
        if (tree != null) {
            traversePostOrder(tree.left);
            traversePostOrder(tree.right);
            System.out.print(" " + tree.value);
        }
    }
/*
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right!= null) {
                nodes.add(node.right);
            }
        }
    }
    */
    
    public String findInOrder(BinaryTree tree, String toLookFor) {
        String foundSomething = "not found";

        if (tree != null) {
            if (tree.value.getKey().equals(toLookFor)){
                return tree.value.getValue();
            }else {
                foundSomething = findInOrder(tree.left, toLookFor);
                if (foundSomething.compareTo("not found") == 0){
                    foundSomething = findInOrder(tree.right, toLookFor);
                }
            }
        }
        return foundSomething;
    }
    
     public static int stringCompare(String str1, String str2) 
    { 
  
        int l1 = str1.length(); 
        int l2 = str2.length(); 
        int lmin = Math.min(l1, l2); 
  
        for (int i = 0; i < lmin; i++) { 
            int str1_ch = (int)str1.charAt(i); 
            int str2_ch = (int)str2.charAt(i); 
  
            if (str1_ch != str2_ch) { 
                return str1_ch - str2_ch; 
            } 
        } 
  
         
        if (l1 != l2) { 
            return l1 - l2; 
        } 
  
        // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else { 
            return 0; 
        } 
    } 
    
   
    
    }