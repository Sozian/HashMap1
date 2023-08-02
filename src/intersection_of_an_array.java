import java.util.*;
public class intersection_of_an_array {

    public static void main(String [] args){
        int arr1[]={1,3,4,5,6};
        int arr2[]={1,3};
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length-1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<=arr2.length-1;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]); // we need to remove the array element so that it cant be counted again agan
            }
        }
        System.out.println("interesection"+count);
        System.out.println("element which are not the part of the subset"+set);
    }
}
