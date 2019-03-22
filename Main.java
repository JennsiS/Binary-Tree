import java.io.*;

public class Main {
    public static void main(String [] args) throws FileNotFoundException, IOException {

        BinaryTree arbol = new BinaryTree();

        File words = new File("C:\\Users\\Antonio\\Documents\\NetBeansProjects\\Lab-7\\Hoja_6_Arboles\\src\\hoja_7_arboles\\palabras");
        FileReader read = new FileReader(words);
        BufferedReader buff = new BufferedReader(read);

        String line;
        int contadorYLlave = 0;
    }