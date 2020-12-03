
public class ForLoops 
{
    public static void main(String[] args)
    {
        String dna = "TAGCCAGAACCGTTTCTCTGA";
        int c = 0;
        for(int i = 0; i < dna.length(); i++)
        {
            if(dna.substring(i, i+1).equals("G") || dna.substring(i, i+1).equals("C"))
            {
                c++;
            }
        }
        double perc = 100.0 * c / dna.length();
        System.out.println(perc);
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
