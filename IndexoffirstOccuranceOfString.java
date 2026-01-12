package StringsDsa;

public class IndexoffirstOccuranceOfString {
    public static int firstoccurance(String haystack,String needle){
        int m=haystack.length();
        int n=needle.length();
        for(int i=0;i<m-n+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+n).equals(needle))
                {
                    return 1;
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        String haystack="abcbutabc";
        String needle="abc";
        System.out.println(firstoccurance(haystack,needle));

    }
}
