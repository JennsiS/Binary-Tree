
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

class Nodo{
	Palabras <String,String> value;
	Nodo left;
	Nodo right;	
	public Nodo(Palabras <String,String>  value){
		this.value = value;
		left = null;
		right = null;
	}
}

public class BinaryTree 
{
    public static  Nodo root;
	public BinaryTree(){
		this.root = null;
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
    
    
    public void add(Palabras <String,String> value)
    {
		Nodo newNodo = new Nodo(value);
		if(root==null)
		{
			root = newNodo;
			return;
		}
		Nodo current = root;
		Nodo parent = null;
		while(true)
		{
			parent = current;
                        int num=stringCompare(current.value.getKey(), value.getKey());
			if(num<0){				
				current = current.left;
				if(current==null){
					parent.left = newNodo;
					return;
				}
			}else
			{
				current = current.right;
				if(current==null)
				{
					parent.right = newNodo;
					return;
				}
			}
		}
	}
    

}
 
    