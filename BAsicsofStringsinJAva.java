package StringsDsa;

public class BAsicsofStringsinJAva {
    public static void main(String[]args)
    {
        String str=new String("Panchanan");
        System.out.println("the length of the string is: "+str.length());
        System.out.println("the string is: "+str.charAt(3));
        System.out.println("the string after concatination: "+str.concat(" Mandal"));
        String s2=new String ("Panchanan Mandal");
        if(str.equals(s2))
        {
            System.out.println("the same string is both equal");
        }
        else {
            System.out.println("the same string is not equal");
        }

    }

}
