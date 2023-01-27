import java.util.Scanner;

public class Calculating {
    public static double bmiCalculator(int weight, int height){
        double weightValue = weight;
        double heightValue = (double)height/100;

        double bmiResult = (double) Math.round(weightValue / Math.pow(heightValue,2)*100)/100;

        return  bmiResult;
    }

    public static String comment(double bmi){
        if(bmi < 18.5){
             return "You're underweight!";
        }
        else if(bmi >= 18.5 && bmi <= 24.99){
            return "Your weight is normal!";
        }
        else{
            return "You're overweight!";
        }
    }
}

