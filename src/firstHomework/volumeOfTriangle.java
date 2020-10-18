package firstHomework;

import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class volumeOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the Equilateral triangle, separated by pressing Enter ");
        double length = input.nextInt();
        double height = input.nextInt();
        double area = Math.sqrt(3) * Math.pow(length,2) / 4;
        BigDecimal areaRes = new BigDecimal(area).setScale(2,RoundingMode.DOWN);
        double volume = area * height;
        BigDecimal volumeRes = new BigDecimal(volume).setScale(2,RoundingMode.DOWN);
        System.out.println(String.format("area is %.2f",areaRes.doubleValue()));
        System.out.println(String.format("volume is %.2f",volumeRes.doubleValue()));
    }
}
