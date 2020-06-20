package Selections;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {


        System.out.println("Enter weight in pounds");

        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double WeightKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        double BMI = WeightKilograms / (heightInMeters * heightInMeters);


        if (BMI < 18.5)
        {
            System.out.println("BMI is " + BMI +  " Underweight");

        }
        else if(BMI >= 18.5 && BMI < 25.0)
        {
            System.out.println("BMI is " + BMI +" Normal");
        }
        else if(BMI >= 25.0 && BMI < 30.0)
        {
            System.out.println("BMI is " + BMI +" Overweight");
        }
        else if(BMI >= 30.0)
        {
            System.out.println("BMI is " + BMI +" Obese");
        }

    }
}