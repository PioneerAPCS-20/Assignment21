
public class ForLoops 
{
    public static void main(String[] args)
    {
        System.out.println(pow(2, 10));
    }

    public static int pow(int a, int b)
    {
        int prod = 1;

        for(int i = 0; i < b; i++)
        {
            prod *= a;
        }

        return prod;
    }
}
