package Selections;

import java.util.Scanner;

public class ComputeTax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or " +
                 "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");


        double status = input.nextDouble();
        double income = input.nextDouble();

        double tax = 0;

        if(status == 0 )
        {
            if(income <= 8350)
            {
                tax = income * 0.10;
            }
            else if(income <= 33950)
            {
                tax = income * 0.15;
            }
        }



    }
}
