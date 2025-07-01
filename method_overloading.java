class calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
      public int add(int n3,int n4,int n5){
        return n3+n4+n5;
    }
}
public class method_overloading {
    public static void main (String args[]){
        calculator calc=new calculator();
        int p=calc.add(3,4);
        int q=calc.add(4,5,6);
        System.out.println(p);
        System.out.println(q);
    }
}
