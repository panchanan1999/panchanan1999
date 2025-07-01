public class array {
    public static void main(String a[])
    {
        int num[][]=new int[4][5];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
            num[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++){
            {
            System.out.print(num[i][j] + " ");
            }

            }
            System.out.println();
    }
        
    }
    
}
