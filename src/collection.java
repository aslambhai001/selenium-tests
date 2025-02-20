public class collection {
    
import java.util.Set;
import java.util.HashSet;
// Set : A collection of unique elements.
public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element, will not be added

        System.out.println(set); // Output: [Apple, Banana, Cherry]
    }
}
//---------------------------------------------------------------------------------------------------------------
public class CombinedExample {
// HashSet : A set using a hash table; unordered and allows null.
    public static void main(String[] args) {      
        Set<String> hashSet = new HashSet<>();           
        hashSet.add("Orange");                                 // HashSet Example
        hashSet.add("Grape");
        hashSet.add("Apple");
        hashSet.add(null);
        System.out.println("HashSet: " + hashSet);
//-------------------------------------------------------------------------------------------------------------------------------------
// TreeSet : A sorted set using a tree structure
      Set<String> treeSet = new TreeSet<>();      // TreeSet Example
        treeSet.add("Orange");
        treeSet.add("Grape");
        treeSet.add("Apple");
        // treeSet.add(null); // This would throw a NullPointerException
        System.out.println("TreeSet: " + treeSet);
        //HashSet output: [null, Grape, Orange, Apple] 
        //TreeSet output: [Apple, Grape, Orange]
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
    public class CombinedMapExample {
    public static void main(String[] args) {
        // HashMap Example
//HashMap: Unordered, allows null keys and values, and uses a hash table for storage.
        Map<String, Integer> hashMap = new HashMap<>();  
        hashMap.put("Orange", 10);
        hashMap.put("Grape", 5);
        hashMap.put("Apple", 20);
        hashMap.put(null, 15); // Adding null key
        hashMap.put("Banana", null); // Adding null value
        System.out.println("HashMap: " + hashMap);
        //output:HashMap: {null=15, Grape=5, Apple=20, Orange=10, Banana=null}

    // TreeMap: Sorted by keys, does not allow null keys, and uses a tree structure for storage.
 // TreeMap Example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Orange", 10);
        treeMap.put("Grape", 5);
        treeMap.put("Apple", 20);
        // treeMap.put(null, 15); // This would throw a NullPointerException
        treeMap.put("Banana", null); // Adding null value
        System.out.println("TreeMap: " + treeMap);
        //ouput:TreeMap: {Apple=20, Banana=null, Grape=5, Orange=10}  
    }
//A List is an ordered collection that allows duplicate elements. 
// It is an interface in Java, and common implementations include ArrayList, LinkedList, and Vector.
//set
public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Duplicate element, allowed in List

        System.out.println(list); // Output: [Apple, Banana, Cherry, Apple]
    }
//A LinkedList is a list implementation that uses a doubly linked list to store elements.
//  It is efficient for frequent insertions and deletions but slower for random access.
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Bird");
        linkedList.addFirst("Fish"); // Add to the beginning
        linkedList.addLast("Elephant"); // Add to the end
System.out.println(linkedList); // Output: [Fish, Dog, Cat, Bird, Elephant]
    }
// An ArrayList is a resizable array-based implementation of the List interface.
//  It provides fast random access but is slower for insertions and deletions in the middle of the list.
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Orange");
        arrayList.add("Grape");
        arrayList.add("Apple");
        arrayList.add("Orange"); // Duplicate element, allowed in ArrayList
     System.out.println(arrayList); // Output: [Orange, Grape, Apple, Orange]
    }
}
}
}
}
}
}

