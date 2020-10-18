package firstHomework;

import java.util.*;
public class multiplyDigits {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000 ");
        int num = input.nextInt();
        if (num<0||num>1000){
            throw new Exception("the range should between 0 and 1000");
        }
        int remainder, res = 1, x=num;
        while(num!=0){
            remainder = num % 10;
            res *= remainder;
            num = num / 10;
        }
        System.out.println("the multiplication of all digits in " + x + " is " + res);
    }
}
