import java.util.*;
class Sz_trial {
    /******************************************************************************

     Online Java Compiler.
     Code, Compile, Run and Debug java program online.
     Write your code in this editor and press "Run" button to execute it.

     *******************************************************************************/

        public static void main(String[] args) {
            System.out.println("Hello World");
            String str[]={"adi","abhi","dev"};
            noOfPairs(str);
        }
        public static void noOfPairs(String box[]){
            // Code Here.
            int count=0;
            String str[]=new String[3];
            for(int i=0;i<str.length-1;i++){
                for(int j=i+1;j<str.length;j++){
                    str[i]=box[i]+box[j];
                    HashMap<Character,Character> map=new HashMap<>();

                    //for (int k = 0; k < str.length; k++) {
                    //char num = str[k];
                /* if (map.containsKey(num))
                   {
                    map.put(num, map.get(num) + 1);
                   }
                   else {
                   map.put(num, 1);
                   }
                   System.out.println(map);
        }
        */
                    System.out.println(str[i]);
                    get(str);

                }

            }



        }
        public static void get(String[] str){
            String str1="";
            for(int i=0;i<str.length;i++){
                str1=str1+str[i];
            }
            int n=str1.length();

            for(int i=0;i<n;i++){
                System.out.println(str1.charAt(i));
            }
        }
    }



