import java.util.*;
public class Assig_que_2_two_sum {
    public static int[] hashing(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;

        // this part is for filling of the index element
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            else{
                map.put(num,1);
            }
        }

        //now we need to search for the element
       for(int i=0;i<n;i++){
          int  num=arr[i];
          // now we will calcute the remaining number
           int rem=target-num;
           if(map.containsKey(rem)){
              int index=map.get(rem);
              return new int[]{i,index};
           }
       }
       return new int []{0,-1};
    }
    public static void main(String [] args){
        int arr[]={1,3,2,5,1};
        int target=5;

        System.out.println(hashing(arr,8));
    }
}
