package Selections;

import java.util.Scanner;

public class SubtractionQuiz
{



        public static void main(String[] args)
        {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if(number1 < number2)
            {
                int temp = number2;
                number1 = temp;
            }

            System.out.println("What is the subtraction of two numbers " + number1 + " - " +
                    number2);

            Scanner input = new Scanner(System.in);

            int result = input.nextInt();

            int output = number1 - number2;

            if(result == output)
            {
                System.out.println("you are correct");
            }
            else if (result != output)
            {
                System.out.println("your answer is wrong");
            }
            else
            {
                System.out.println("Enter the number");
            }

        }


}
