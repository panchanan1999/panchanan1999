package StringsDsa;

public class countofcharactersinastring {
    public static int lengthoflastwordofstring(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="Panchanan Mandal is ";
        System.out.println(lengthoflastwordofstring(s));
    }
}

