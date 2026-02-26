import java.util.Scanner;

public class Palimdrom {
    public static boolean isPalimdrom(int num)
    {
        int temp = num;
        int sum = 0;

        while(temp > 0)
        {
            int ld = temp % 10;
            sum = sum * 10 + ld;
            temp = temp/10;

        }

        if(num == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean res = isPalimdrom(n);

        System.out.println(res);
        sc.close();
    }
}
