import java.util.*;
public class bmi
{
public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("BMI Calculator");
        System.out.println("Enter your weight (in kilograms):");
        double wt = sc.nextDouble();
        System.out.println("Enter your height (in cm):");
        double ht = sc.nextDouble();

        double bmi = wt/(ht*ht);

        System.out.println("Your BMI is: " + bmi);

        sc.close();

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal Weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obessed");
        }
    }
}
