public class PrintSubArray {
    public static void main(String[] args) {
         int arr[] = {2,4,5,3,6,7,4};
        int curSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++)
        {
            int start = i;

            for(int j =i; j<arr.length; j++)
            {
                int end = j;
                curSum = 0;
                for(int k = start; k<= end ;k++)
                {
                    System.out.print(arr[k]+" ");

                   curSum += arr[k];
                }
                if(max < curSum)
                {
                    max = curSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum of sub array "+ max);
    }
}
