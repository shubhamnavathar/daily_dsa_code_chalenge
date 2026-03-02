public class Sort {

    
    public static void selectionSort(int arr[])
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            int min = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[min] < arr[j])
                {
                    min = j;
                }
                
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]  = temp;
        }

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void insertionSort(int arr[])
    {
         for(int i = 1; i<arr.length; i++)
         {
            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            arr[prev +1] = curr;
         }
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void countingSort(int arr[])
    {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest+1];
        for(int i =0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }


        int j = 0;

        for(int i = 0; i<count.length; i++)
        {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
        public static void main(String[] args) {
        int arr[] = {5,5,4,1,3,3,2};


        countingSort(arr);

        for(int i : arr)
        {
            System.out.print(i+" ");
        }

    }

}
