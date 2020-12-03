import java.util.Scanner;

/**
 * Write a description of class BabylSqrt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabylSqrt
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to take the square root: ");
        double num = in.nextDouble();
        double ans = sqrt(num);
        System.out.println("The square root of " + num + " is " + ans);
    }
    
    public static double sqrt(double n)
    {
        double lastGuess = 1;
        double nextGuess = 0;
        double diff = 1;
        
        while(diff > 0.0001)
        {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            diff = Math.abs(nextGuess - lastGuess);
            lastGuess = nextGuess;
        }
        
        return nextGuess;
    }
}

