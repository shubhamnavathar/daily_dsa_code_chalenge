public class Pattern8 {
        public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 1,k=1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++,k++)
            {

                System.out.print(k);             
            }
            System.out.println();
        }
    }
}
