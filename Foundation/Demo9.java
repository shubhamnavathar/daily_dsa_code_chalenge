public record Demo9() {
    public static void main(String args[])
    {
        int i = 0;
        int n = 10;
        int sum = 0;
        while(i <= n)
        {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    
}
