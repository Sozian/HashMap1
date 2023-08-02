import java.util.LinkedHashMap;
import java.util.TreeMap;

public class linked_hash_map {
    public static void main(String [] args){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",20);
        lhm.put("pak",30);
        lhm.get("India");
        System.out.println(lhm);
        TreeMap<Integer,Integer> tree=new TreeMap<>();
        tree.put(1,1);
        tree.put(3,2);
        tree.put(2,1);
        System.out.println(tree);
    }
}
