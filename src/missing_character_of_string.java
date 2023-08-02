import java.util.*;
public class missing_character_of_string {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String line="testsample";
        getMaxOccuringChar(line);
    }
    public static void getMaxOccuringChar(String line)
    {
        sortString(line);
        TreeMap<Character,Integer> map=new TreeMap<>();
        int n=line.length();
        for(int i=0;i<n;i++){
            if(map.containsKey(line.charAt(i))){
                map.put(line.charAt(i),map.get(line.charAt(i))+1);
            }else{
                map.put(line.charAt(i),1);
            }
        }
        char st='a';
        System.out.println(map);
        int max=0;

        for(int i=0;i<n;i++){
            if(map.get(line.charAt(i))==max && st<line.charAt(i)){
                continue;
            }
            else if(map.get(line.charAt(i))>max){
                max=map.get(line.charAt(i));
                System.out.println(max);
                st=line.charAt(i);
                System.out.println(st);
            }
            else if(map.get(line.charAt(i))==max && st>line.charAt(i)){
                st=line.charAt(i);
            }
        }
        System.out.println(st);

    }
    static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
}
