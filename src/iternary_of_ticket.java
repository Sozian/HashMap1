import java.util.*;
public class iternary_of_ticket {
    public static String get_start(HashMap<String,String> map1){
        HashMap<String,String> reverse_set=new HashMap<>();
        for(String keys:map1.keySet()){
            reverse_set.put(map1.get(keys),keys);
        }
        System.out.println(reverse_set);
        for(String keys:map1.keySet()){
            if(!reverse_set.containsKey(keys)){ // !reverse_set.containsKey(keys) if this return false then we need
                                               // to return keyas here reverse_set does not contain key mumbai
                return keys;
            }

        }

        return "abc";
    }
    public static void main(String [] args){
        HashMap<String,String> map1=new HashMap<>();
        map1.put("chennai","banglore");
        map1.put("mumbai","Delhi");
        map1.put("goa","chennai");
        map1.put("Delhi","Goa");
        System.out.println( get_start(map1));
    }
}
