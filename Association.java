import java.util.*;


public class Association<K,V> implements Map.Entry<K,V> {

    protected K key; 
    protected V value;
    private HashMap<K,V> association;

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }
	
    public Association() {
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
