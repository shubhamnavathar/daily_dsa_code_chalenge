import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System .out.print("Enter the Pen price: ");
        float a = sc.nextFloat();
        System .out.print("Enter the pencil price: ");
        float b = sc.nextFloat();
        System .out.print("Enter the rubber price: ");
        float c = sc.nextFloat();

        float res = a+b+c;
        float gst = (float) (res * 0.18);
        float sum = res + gst;
        System.out.println(sum);
        sc.close();
    }
}
