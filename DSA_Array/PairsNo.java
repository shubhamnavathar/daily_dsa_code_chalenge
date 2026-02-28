public class PairsNo {
        public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};


        for(int i = 0; i< numbers.length; i++)
        {
            int num = numbers[i];
            for(int j = i+1; j< numbers.length; j++)
            {
                System.out.print("("+ num +","+ numbers[j]+")");
            }
            System.out.println();
        }
        }
}