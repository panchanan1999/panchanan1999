package StringsDsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicatecharacterscount {
    public static String removeDuplicates(String str){
        Map<Character,Boolean> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char c:str.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,true);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void duplicatecharacterscount(String str){
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char c:str.toCharArray()){
            if(!Character.isWhitespace(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }

        }
        System.out.println(map);

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        duplicatecharacterscount(str);
        System.out.println(removeDuplicates(str));
    }
}
