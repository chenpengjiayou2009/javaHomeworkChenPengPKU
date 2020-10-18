package firstHomework;

import java.util.*;
public class computingBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds ");
        double pounds = input.nextDouble();
        double kilograms = 0.45359273 * pounds;
        System.out.println("Enter height in inches ");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;
        double BMI = kilograms / Math.pow(meters,2);
        System.out.println(String.format("BMI is %.4f",BMI));
    }
}
