
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
       
        BinaryTree arbol= new BinaryTree();
         try{
                String dicc= null;
                String ingles= null;
                String espa= null;
                String nombre= "";
                String temp="";
           
                FileReader fileReader = new FileReader("C:\\Users\\bff_n_000\\Desktop\\diccionario.txt");
                BufferedReader doc = new BufferedReader(fileReader);
                while((dicc = doc.readLine()) != null) {
                Association  asociacion= new Association();
                ingles= dicc.substring(dicc.indexOf("(")+1, dicc.indexOf(","));
                espa=dicc.substring(dicc.indexOf(",")+1, dicc.indexOf(")"));
                asociacion.put(ingles,espa);
                System.out.println(ingles);
                System.out.println(espa);
                arbol.add(asociacion);
                temp = temp + dicc + "\n";

                
                }
                 doc.close();
              
                System.out.println(arbol);
             
        }
            catch(FileNotFoundException ex) {
                System.out.println("No es posible abrir" + "diccionario.txt" + "'");                
            }
                
        
        
    }
    
}