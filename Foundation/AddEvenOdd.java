public class AddEvenOdd {

    public static void main(String args[])
    {
        int n = 26574883;
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i<n; i++)
        {
            int lastDigit = n%10;
            if(lastDigit % 2 ==0)
            {
                evenSum += lastDigit;
            }
            else
            {
                oddSum += lastDigit;
            }
            n = n/10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
    
}
