import java.util.*;

public class InventoryTracker {
    public static void main(String[] args) {
        //AC1- List
        // important! List<String> - Interface type
        //ArrayList<String> -class type

        // Both work the same way for basic operations:
        // fruits.add("Apple");
        // fruits.get(0);
        // fruits.size();

        // Difference in practice:
        // List<String> — you can swap implementation anytime
        // List<String> fruits = new ArrayList<>();    using ArrayList now
        // List<String> fruits = new LinkedList<>();   switched! no other code changes needed
        // List<String> fruits = new Vector<>();       switched again! still works

        // ArrayList<String> — LOCKED to ArrayList only
        // ArrayList<String> fruits = new ArrayList<>();   stuck with ArrayList forever
        // ArrayList<String> fruits = new LinkedList<>();   Won't compile
        // ArrayList has two extra methods .ensureCapacity(100)- pre-allocate memory, .trimToSize() - shrink to actual size


        ArrayList<String> itemList = new ArrayList<>();
        itemList.add("Apple");
        itemList.add("Banana");
        itemList.add("Orange");
        itemList.add("Banana");//List save duplicates

        System.out.println("ArrayList<>: ordered, and allows duplicates");
        for (String item : itemList) {
            System.out.println(item);
        }

        //Retrieve
        System.out.println("Retrieve itemList.get(0): " + itemList.get(0));
        System.out.println("Retrieve itemList.get(1): " + itemList.get(1));
        System.out.println("Retrieve itemList.get(2): " + itemList.get(2));
        System.out.println("Retrieve itemList.get(3): " + itemList.get(3));

        //itemList.remove(0) - remove by index
        //itemList.remove("Apple") - remove by value

        System.out.println("Number of elements .size(): " + itemList.size());
        System.out.println("Contains Apple true or false: " + itemList.contains("Apple"));
        System.out.println("Replace element by index .set(0, Grape): " + itemList.set(0, "Grape") );
        System.out.println("Now Grape under 0 index: " + itemList.get(0));

        //itemList.clear() - remove all


        //AC2- Set - allows  unique items only, removes duplicates

        // HashSet - fastest, no order guaranteed
        //LinkedHashSet - maintains insertion order
        //TreeSet - sorted in alphabetical order A->Z or 1->9

        Set<String> itemSet = new HashSet<>(itemList);
        System.out.println("\n Set<>: unique items only");
        for (String item : itemSet) {
            System.out.println(item);
        }

        //itemSet.add("Apple") - ignored duplicate;

        System.out.println("Add duplicate .add(): " + "Grape");
        System.out.println("Grape was not added, ignored. Check println items: ");

        for (String item : itemSet) {
            System.out.println(item);
        }

        System.out.println("Set .size(): " + itemSet.size());


        //Retrieve
        System.out.println("\nRetrieve itemSet.contains() Apple:" + " " + itemSet.contains("Apple"));




        //AC3- Map stores key-value pairs, each key is unique, but values can repeat.
        //usage: fast lookup by key (username-score, product-price)

        // HashSet - fastest, no order guaranteed
        //LinkedHashSet - maintains insertion order
        //TreeSet - sorted in alphabetical order A->Z or 1->9


        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("Apple", 50);
        itemMap.put("Banana", 30);
        itemMap.put("Orange", 20);

        System.out.println("\nMap<String, Integer>: key-value/ item-price");

        //iteration over entries

        for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        //iteration over keys
        for (String key: itemMap.keySet()) {
            System.out.println("Iteration over keys: " + key);
        }

        //iteration over values

        for (int value : itemMap.values()) {
            System.out.println("Iteration over values: " + value);
        }


        //Retrieve
        System.out.println("Retrieve itemMap.get(Apple): " + itemMap.get("Apple"));

        System.out.println("itemMap.containsKey(Apple) true/false: : " + itemMap.containsKey("Apple"));
        System.out.println("itemMap.containsValue(50) true/false: " + itemMap.containsValue(50));

    }

}