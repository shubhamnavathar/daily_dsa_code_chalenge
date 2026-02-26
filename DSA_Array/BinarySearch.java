public class BinarySearch {
    public static int  binSearh(int arr[], int find)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <=end)
        {
            int mid = (start + end) /2;

            if(arr[mid] == find)
            {
                return mid;
            }
            if(arr[mid] < find)
            {
                start = mid +1;
            }
            else
            {
                end = mid -1;
            }
            
        }
        return -1;
    }

        public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,12,23,34,54};
        int key = 12;

        System.out.println("Index of key is " + binSearh(arr, key));
    }
    
}
