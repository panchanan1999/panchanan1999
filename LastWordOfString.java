package StringsDsa;

public class LastWordOfString {
    static int lengthoflastwordofstring(String s){
        String p=s.trim();
        int count=0;
        for(int i=p.length()-1;i>=0;i--){
            if(p.charAt(i)!=' ')
            {
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="    Hello   World   ";
        System.out.println(lengthoflastwordofstring(s));
    }
}
