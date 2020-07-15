package HashTable;

public class SimpleHashTable {
private Employee[] hashtabl;

    public SimpleHashTable() {
        hashtabl = new Employee[10];
    }

    private int hashKey(String key){
        return key.length() % hashtabl.length;
    }

    public void put(String key,Employee emp){
        int hashKey = hashKey(key);
        if(occupied(hashKey)){
            int stopIndex = hashKey;
            if(hashKey == hashtabl.length-1){
                hashKey=0;
            }
            else {
                hashKey++;
            }
        while (occupied(hashKey) && hashKey != stopIndex){
            hashKey = (hashKey + 1) % hashtabl.length;
        }

        }


        if(hashtabl[hashKey] != null){
            System.out.println("Collision at idx -> " + hashKey);
        }else hashtabl[hashKey] = emp;
    }

    public boolean occupied(int index){
        return hashtabl[index] != null;
    }

    public Employee get(String key){
        int hashkey = hashKey(key);
        return hashtabl[hashkey];
    }
}
