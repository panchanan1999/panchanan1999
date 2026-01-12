package StringsDsa;

import java.util.Scanner;

public class Palindromeornot {
    public static boolean isPalindrome2pointer(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
           left++;
            right--;
        }
        return true;

    }
    public static boolean ispalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        return str.equals(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        if(ispalindrome(str))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
        if(isPalindrome2pointer(str))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }


    }
}
