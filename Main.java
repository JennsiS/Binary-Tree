
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
        
       
       
         try{
                String dicc= null;
                String ingles= null;
                String espa= null;
                String nombre= "";
                String temp="";
                int cont=0;
           
                FileReader fileReader = new FileReader("diccionario.txt");
                BufferedReader doc = new BufferedReader(fileReader);
                while((dicc = doc.readLine()) != null) {
                Palabras asociacion= new Palabras();
                ingles= dicc.substring(dicc.indexOf("(")+1, dicc.indexOf(","));
                espa=dicc.substring(dicc.indexOf(",")+1, dicc.indexOf(")"));
                asociacion.put(ingles,espa);
                System.out.println(ingles);
                System.out.println(espa);
                BinaryTree arbol= new BinaryTree(asociacion);
                    if (cont==0){
                     arbol.add(asociacion);
                    }else{
                      arbol.add(asociacion);
                    }
                
                temp = temp + dicc + "\n";
                cont++;
                }
                 doc.close();
               // arbol.traverseInOrder(asociacion)
             
        }
            catch(FileNotFoundException ex) {
                System.out.println("No es posible abrir" + "diccionario.txt" + "'");                
            }
                
        
        
    }
    
}