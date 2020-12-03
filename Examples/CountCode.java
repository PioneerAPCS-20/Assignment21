
import java.util.Scanner;

public class CountCode
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        int count = countCode(str);
        System.out.println(count + " ocurrence(s).");
    }

    public static int countCode(String str)
    {
        int from = 0;
        int i = str.indexOf("co", from);
        int count = 0;

        while(i != -1)
        {
            if(i + 3 < str.length() && str.substring(i + 3, i + 4).equals("e"))
            {
            count++;
            }
    
            from = i + 1;
            
            i = str.indexOf("co", from);
        }

        return count;
    }
}


