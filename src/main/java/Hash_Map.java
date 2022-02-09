import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Hash_Map {


    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));

        for(Map.Entry<String, String> i : capitalCities.entrySet()){
            System.out.println(i.getValue());
        }

        System.out.println("~~~~~~~~~~~~~~");
        Iterator<Map.Entry<String, String>> iterator = capitalCities.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry z = iterator.next();
            System.out.println("key" + z.getKey() + "value " + z.getValue());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Map<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "GH");
        hmap.put(3, "IJ");

        for (Map.Entry<Integer, String> i : hmap.entrySet()){
            Integer key = i.getKey();
            String value = i.getValue();
            System.out.println(i.getValue());
        }

        Iterator <Map.Entry<Integer, String>> iterator1 = hmap.entrySet().iterator();
        while(iterator1.hasNext()){
           Map.Entry<Integer, String> result = iterator1.next();
            System.out.println(result.getValue() + "" + result.getKey());
        }

        System.out.println("While Loop:");
        Iterator<Map.Entry<Integer, String>> iterator2 = hmap.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> me2 = iterator2.next();
            System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");

        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 1020);
        map.put(3, 300);
        map.put(1, 100);
        map.put(5, 500);
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }















    }
}
