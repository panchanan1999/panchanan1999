public class typecasting {
    public static void main(String args[])
    {
        // Implicit Type Casting
        int a=10;
        double b= a;
        System.out.println(b);
        // Explicit Type Casting
        double c=122290.90;
        int d=(int)c;
        System.out.println(d);
        //Arithmatic casting
        int e=7;
        int f=2;
        double g=(double)e/f;
        System.out.println(g);
        // Byte Overflow on Casting --Cast an integer value greater than 127 to a byte and print the result.
        int h=128;
        byte i=(byte)h;
        System.out.println(i);
        //Character to ASCII
        char x='j';
        int y=(int)x;
        System.out.println(y);
    }
}
