import java.util.HashMap;

public class valid_anagram {
    public static boolean isvalid_anagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        // we are traversing around the String s and storing the value into hash map by traversing one by one
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // now we need to traverse along the String t so that if its character matches with char of map then delete it

        for(int i=0;i<s.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){ // we are checking the particular character at that index in string t exist in the hash
                                   // map or set or not
                                   // if it  matches then
                if(map.get(ch)==1){ // if their is one character that exists in hash map
                    map.remove(ch);  // we will completely remove that hash set
                }
                else{
                    map.put(ch,map.get(ch)-1); // if more than two element are present then we need to reducing its freq
                                               // by one and again need to put into map
                }
            }
            else{ // if that character does not exists
                return false; //then we will directly return zero
            }

        }
        return map.isEmpty();// if it will map is empty it will return true else it will return false
    }
    public static void main(String [] args){
        String s="diaa"; // both string should be of equal lengths
        String t="idaa";
        System.out.println(isvalid_anagram(s,t));
    }
}
