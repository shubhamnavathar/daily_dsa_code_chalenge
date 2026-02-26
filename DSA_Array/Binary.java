public class Binary {

    public static int getBinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key) {
                return mid;
            }

            if(numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;  // ✅ VERY IMPORTANT
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,5,6,12,23,34,54};
        int key = 12;

        System.out.println("Index of key is " + getBinarySearch(numbers, key));
    }
}