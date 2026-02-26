import java.util.*;
public class BinCoeff {
    public static int coeff(int n)
    {
        int f = 1;

        for(int i = 1; i<=n; i++)
        {
            f*=i;
        }
        System.out.println(f);
        return f;
        
    }

    public static int bionomialCoeff(int p, int q)
    {
        int fact_p = coeff(p);
        int fact_q = coeff(q);

        int fact_pmq = coeff(p-q);

        int res = fact_p / (fact_q * fact_pmq);

        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = 5;
        int b = 2;
        System.out.println(bionomialCoeff(a,b));
        sc.close();
        
    }
}
