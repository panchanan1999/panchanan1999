class method{
    public void musicplay(){
        System.out.println("Music playing...");

    }
    public String getmeapen(int cost)
    {
        if(cost>=10)
        {
            return "Pen";
        }
        return "nothing";
    }
}
public class methods {
    public static void main(String[] args) {
        
        method m=new method();
        String result=m.getmeapen(2);
        System.out.println(result);
        m.musicplay();
    }
    
}
