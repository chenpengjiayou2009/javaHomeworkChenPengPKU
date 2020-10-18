package firstHomework;

import java.util.*;
public class numberOfYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of minutes ");
        int minutes = input.nextInt();
        int hours = minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        days = days % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years " + days + " days ");
    }
}
