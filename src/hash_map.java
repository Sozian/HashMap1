import java.util.HashMap;
import java.util.*;

public class hash_map {
    public static void main(String [] args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("india",10);
        hm.put("china",20);
        hm.put("nepal",5);
        System.out.println(hm.get("china"));
        System.out.println(hm);

        int a=hm.get("india");
        System.out.println(a);
        System.out.println(hm.containsKey("Indoneasia")); // it will return false
        System.out.println(hm.containsKey("india"));// it will return true as key does not exists
        hm.remove("china");
        //hm.clear(); // to clear our data
        System.out.println(hm.size());


        // iteration over the loop

        Set<String> keys=hm.keySet();
        System.out.println(keys);
        //  we are using for each loop here
        for(String k: keys){
            System.out.println("key = "+k+ " ,value = "+hm.get(k));
        }
    }
}
