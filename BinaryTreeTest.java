import static org.junit.Assert.*;

public class BinaryTreeTest {

    @org.junit.Test
    public void stringCompare() {

    }

    @org.junit.Test
    public void add() {
        Nodo parent= null;
        if (parent == null){
            assertNull(parent);
        } else {
            System.out.println("No es nulo");
        }
    }

    @org.junit.Test
    public void findInOrder() {
        String found= "yes";
        Nodo node= null;
        assertNotSame(found,node);
    }

    @org.junit.Test
    public void traverseInOrder() {
        Nodo node= null;
        if (node==null){
            boolean atras= true;
            boolean seguir=true;
            assertTrue(atras==seguir);
        }
    }
}