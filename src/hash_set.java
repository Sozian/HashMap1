import java.util.*;
public class hash_set {
    public static void main(String [] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(5);
        System.out.println(set.contains(5));
        System.out.println(set);
        // hash set iteration
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // LinkedhashSet

        LinkedHashSet<String> lhm=new LinkedHashSet<>();
           lhm.add("ddi");
           lhm.add("abhi");
        System.out.println(lhm);

         //TreeSet
         //it willgive sorted array
        TreeSet<String> lhs=new TreeSet<>();
           lhs.add("delhi");
           lhs.add("agra");
        System.out.println(lhs);
    }

    
}
