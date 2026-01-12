package StringsDsa;

import java.util.HashMap;

public class Deleteduplicatecharacters {
    public static void duplicatedelete(String s){
        String p=s.trim();
        char[]charArray=p.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<charArray.length;i++){
            if(!map.containsKey(charArray[i])){
                map.put(charArray[i],1);
            }
            else{
                map.put(charArray[i],map.get(charArray[i])+1);
            }
        }

    }
    public static void main(String[]args)
    {
        String str="Panchanan";

    }
}
