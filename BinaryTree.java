
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
class Node {
   Association <String,String> value;
    Node left;
    Node right;
 
    Node(  Association <String,String>value) {
        this.value = value;
        right = null;
        left = null;
    }
}
public class BinaryTree {
 
    Node root;
 
    
    private Node addRecursive(Node current, Association <String,String> value) // parametro de asociacion 
    {
        int num= stringCompare(current.value.getKey(), value.getKey() ); //metodo
    if (current == null) {
        return new Node(value);
    }
    
    //Si va antes osea es <0
 
    if (num<0) {
        current.left = addRecursive(current.left, value);
        
       // Lo agrega a la derecha 
    } else if (num>0) {
        current.right = addRecursive(current.right, value);
    } else {
        // value already exists
        return current;
    }
 
    return current;
}
    public void add(Association <String,String> value) {
    root = addRecursive(root, value);
}
    
 /*   private boolean containsNodeRecursive(Node current, String value) {
    if (current == null) {
        return false;
    } 
    if (value == current.value) {
        return true;
    } 
    return value < current.value
      ? containsNodeRecursive(current.left, value)
      : containsNodeRecursive(current.right, value);
}*/
 /* public boolean containsNode(int value) {
    return containsNodeRecursive(root, value);
}*/
/*
    private Node deleteRecursive(Node current, String value) {
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

    public void delete(String value) {
        root = deleteRecursive(root, value);
    }
*/
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

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