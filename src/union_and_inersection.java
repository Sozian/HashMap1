import java.util.HashSet;
// this code for inersection
public class union_and_inersection {
    public static void main(String [] args){
        int arr1[]={1,3,4,5,6};
        int arr2[]={1,3};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length-1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<=arr2.length-1;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
}
