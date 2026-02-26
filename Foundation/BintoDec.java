public class BintoDec
{
    public static void Demo(int Bin)
    {
        int pow = 0;
        int dec = 0;
        while(Bin > 0)
        {
            int LD = Bin % 10;
            dec = dec +(LD * (int)Math.pow(2,pow));
            Bin /= 10;
            pow++;

        }

        System.out.println(dec);
    } 
        public static void decBin(int dec)
    {
        int pow = 0;
        int bin = 0;

        while(dec > 0)
        {
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            dec = dec/2;
            
           
        }
        System.out.print(bin);
    }
    public static void main(String args[])
    {
       Demo(101);
       decBin(5);
    }
}