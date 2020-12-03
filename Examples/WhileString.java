
import java.util.Scanner;

public class WhileString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine().toLowerCase();
        System.out.print("Enter a string: ");
        String find = in.nextLine().toLowerCase();
        int count = countStrs(str, find);
        System.out.println(count + " ocurrence(s) of " + find + ".");
    }

    public static int countStrs(String str, String find)
    {
        int from = 0;
        int i = str.indexOf(find, from);
        int count = 0;

        while(i != -1)
        {
            from = i + 1;
            count++;
            i = str.toLowerCase().indexOf(find, from);
        }

        return count;
    } 
}


