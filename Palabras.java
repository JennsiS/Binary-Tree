import java.util.*;


public class Palabras<K,V> implements Map.Entry<K,V> {

    private K key; 
    private V value;
    private HashMap<K,V> association;

    public Palabras(K key, V value) {
        this.key = key;
        this.value = value;
    }
	
    public Palabras() {
		association = new HashMap<K,V>();
    }
    
    public V getValue(){
        return value;
    }

    public K getKey() {
        return key;
    }

    public V setValue(V val) {
        V prevValue = value;
        value = val;
        return prevValue;
    }
    
    public void put(K key, V value){
            this.key = key;
            this.value = value;
            association.put(key,value);
            
        
	}
	
	public V get(Object key){
		return association.get(key);
	}
}
