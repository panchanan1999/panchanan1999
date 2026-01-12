package StringsDsa;

public class ReverseString {
    public static void main(String[]Args) {
        String str = "hello";
        int length = str.length();
        char[] chArr = str.toCharArray();
        int m = chArr.length;
        for(int i=length-1;i>=0;i--){
            System.out.print(chArr[i]);
        }
        System.out.println(" ");

        //Using charAt(int index) method
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
        //Using Stringbuilder method
        StringBuilder sbbuilder=new StringBuilder(str);
        System.out.println(sbbuilder.reverse());

        //Using StringBuffer Method
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
        // Using two pointer Approach
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            char temp=chArr[start];
            chArr[start]=chArr[end];
            chArr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<chArr.length;i++) {
            System.out.print(chArr[i]);
        }

    }



}
