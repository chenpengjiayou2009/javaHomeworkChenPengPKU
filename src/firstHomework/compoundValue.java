package firstHomework;

import java.util.*;
public class compoundValue {
    private static HashMap<Integer,String> m = new HashMap<>(){{
        put(1,"first month");
        put(2,"second month");
        put(3,"third month");
        put(4,"fourth month");
        put(5,"fifth month");
        put(6,"sixth month");
    }};
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount ");
        double money = input.nextDouble();
        double pre = 0;
        double annualRate = 0.0375/12;
        for (int i = 0;i < 6;i++){
            money = (100+pre)*(1+annualRate);
            pre = money;
            System.out.println("After the " + m.get(i+1) + " , the value is " + money);
        }
    }
}
