import java.util.*;
public class freq_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the array element");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k=max_freq(a);
        System.out.println("max freq"+k);
    }

    public static int max_freq(int a[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);
        int max=0;
        int k=0;
       /* for(int i=0;i<map.size();i++){

            if(map.get(a[i])>max){
                max=map.get(a[i]);

            }
        }*/
        int max1=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

            for(int i=0;i<map.size();i++){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    max1=entry.getKey();
                }
            }
        }
        return max1;
    }
}

