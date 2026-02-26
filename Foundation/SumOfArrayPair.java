public class SumOfArrayPair {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        for(int i = 1; i<=arr.length; i++)
        {
            int first = arr[i];
            for(int j = i+1; j<arr.length; j++)
            {
                int second = arr[j];

                System.out.println("Sum of pair in Array : "+ (first+second));
            }
        }
    }
}
