public class Even {
    public static boolean isEven(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        boolean res = isEven(12);

        if(res == true)
        {
            System.out.println("Even no");
        }
        else
        {
            System.out.println("Odd no");
        }

    }
}
