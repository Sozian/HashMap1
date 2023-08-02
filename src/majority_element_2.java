import java.util.*;
public class majority_element_2 {

    public static int majority(int ele[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        // we store the key value pairs
        int n=ele.length;
        for(int i=0;i<n;i++){
           int num=ele[i]; // arrays are stored in the form of number
            if(map.containsKey(num)){ // if key already exist then we need to add or incrse value by 1
                map.put(num,map.getOrDefault(num,0)+1);
            }
            else{
                map.put(num,1);
            }
            Set<Integer> nums=map.keySet();
            for(Integer key:nums){
                if(map.get(num)>=n/3){
                    System.out.println(nums);
                }
            }

        }
        return -1;
    }
    public static void main(String []args){
        int ele[]={1,2,3,1,2,3,3,3,3,1,1,1};
       // System.out.println(majority(ele));
        HashMap<Integer,Integer> map=new HashMap<>();
        // we store the key value pairs
        int n=ele.length;
        for(int i=0;i<n;i++){
            int num=ele[i]; // arrays are stored in the form of number
            if(map.containsKey(num)){ // if key already exist then we need to add or incrse value by 1
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        Set<Integer> nums=map.keySet();// we are storing num as key value
        ArrayList<Integer> a=new ArrayList<>();
        for(Integer key:nums) { // we are making loop on nums
            if (map.get(key) >= 3) {
                a.add(key);
            }
        }
        System.out.println(a);
        System.out.println(map);
    }
}
