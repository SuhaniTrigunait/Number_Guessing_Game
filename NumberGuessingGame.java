import java.util.*;

public class NumberGuessingGame{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int n=rand.nextInt(100)+1;
        int g=0;
        int a=0;

        System.out.println("Welcome to the number guessig game!!");
        System.out.println("Enter a number from 1 to 100 and guess what's the number!!");
        System.out.println("Try to guess the right number in least no. of attemps!!");

        while(g!=n)
        {
            System.out.println("Enter your guess : ");
            g=sc.nextInt();
            if (g < 1 || g > 100) {
                System.out.println("Invalid input! Enter a number between 1 and 100.");
                continue;   
            }
            a++;

            if(g>n)
            {
                System.out.println("Too high...try again!");
            }
            else if(g<n)
            {
                System.out.println("Too low...try again!");
            }
            else{
                System.out.println("Correct guess...Congratulations!!");
                System.out.println("You uessed it in "+a+" attempts");
                break;
            }
        }
        sc.close();
    }
}