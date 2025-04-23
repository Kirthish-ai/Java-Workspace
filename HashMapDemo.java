import java.util.*;

class HashMapDemo 
{
    public static void main(String args[]) 
    {
        // Create a hash map
        HashMap<String, Double> m = new HashMap<>();

        // Put elements to the map
        m.put("John Doe", 3434.34);
        m.put("Tom Smith", 123.22);
        m.put("Jane Baker", 1378.00);
        m.put("Todd Hall", 99.22);
        m.put("Ralph Smith", -19.08);

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = m.entrySet();

        // Display the set
        for (Map.Entry<String, Double> me : set) 
        {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        // Deposit 1000 into John Doe's account
        double balance = m.get("John Doe");
        m.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + m.get("John Doe"));
    }
}