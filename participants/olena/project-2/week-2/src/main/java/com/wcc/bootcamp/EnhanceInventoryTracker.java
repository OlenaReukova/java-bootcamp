import java.util.*;

public class EnhanceInventoryTracker {
    // this task requires both Set and Map, but in general we could use only Map key-value;

    public static void main(String[] args) {
//hashSet does not have indexes, not available get(i), so we can use only for-each loop

        Set<String> itemNames = new HashSet<>();
        Map<String, Integer> itemQuantity= new HashMap<>();

        itemNames.add("Apple");
        itemQuantity.put("Apple", 50);

        itemNames.add("Peach");
        itemQuantity.put("Peach", 80);

        itemNames.add("Orange");
        itemQuantity.put("Orange", 30);

        System.out.println("\nBEFORE CHANGES, Initial data\n");

        //convert itemNames HashSet into ArrayList to implement standard for loop
        ArrayList<String> nameList = new ArrayList<>(itemNames);
        for(int i = 0; i<nameList.size(); i ++) {
            String name = nameList.get(i);
            Integer quantity = itemQuantity.get(name);
            System.out.println("Name/Quantity: " + name + "/" + quantity);
        }

        // for loop-each for Set
        for(String name : itemNames) {
            System.out.println(name);
        }


        System.out.println("\nfor-each loop for Map through the keys:");
        for (String name : itemQuantity.keySet()) {
            System.out.println(name);
        }


        System.out.println("\nfor-each loop for Map through the values:");
        for(Integer quantity : itemQuantity.values()) {
            System.out.println(quantity);
        }
            //Loop through the key-values
            System.out.println("\nName and Quantity\n");
            for(Map.Entry<String, Integer> entry : itemQuantity.entrySet()) {
                System.out.println("Name/Quantity: " + entry.getKey() + "/" + entry.getValue() );

        }


        //Update quantity
        itemQuantity.put("Apple", 150);

        //Remove product from Set
        itemNames.remove("Peach");
        //or remove from Map
        itemQuantity.remove("Peach");


        System.out.println("\nAFTER CHANGES\n");
        //for-each loop after changes
        for (Map.Entry<String, Integer> entry : itemQuantity.entrySet()) {
            System.out.println("Name/Quantity:  " + entry.getKey() + "/" + entry.getValue());
        }



    }

}