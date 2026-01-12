package StringsDsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequescies_Of_Characters_In_a_String {
    public static void main(String []args){
        String s="HelLo World";
        charactercount(s);
        usingHashMap(s);

    }
    public static void usingHashMap(String s){
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        char strArray[]=s.toCharArray();
        for(char c:strArray){
            if(!String.valueOf(c).isBlank()){
                if(charMap.containsKey(c)){
                    charMap.put(c,charMap.get(c)+1);
                }
                else {
                    charMap.put(c,1);
                }
            }
        }
        System.out.print(charMap);
    }
    public static void charactercount(String s){
        int[]arr=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x =(int)ch;
            arr[x]++;
        }
        for(int i=0;i<256;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print((char)i+(" : ")+arr[i]+"   ");
            }

        }
    }
}
