public class ArrayDublicateNo {


    public static boolean dubNoArray(int num[])
    {

        for(int i = 0; i<num.length; i++)
        {
            for(int j = i+1; j<num.length; j++)
            {
                if(num[i] == num[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};

        System.out.println(dubNoArray(nums));
    }
}
