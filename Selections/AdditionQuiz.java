package Selections;

import java.util.Scanner;

public class AdditionQuiz
{
    public static void main(String[] args)
    {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7% 10);

        System.out.println("What is the addition of two numbers " + number1 + " " +
                number2);

        Scanner input = new Scanner(System.in);

        int result = input.nextInt();

        int output = number1 + number2;

        if(result == output)
        {
            System.out.println("true");
        }
        else if (result != output)
            {
                System.out.println("false");
            }
        else
        {
            System.out.println("Enter the number");
        }

    }
}
