import java.util.*;




class Demo6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400  == 0))
        {
            System.out.println("This is a leap year");
        }
        else
        {
            System.out.println("This is a not leap year");
        }
        sc.close();
    }
}