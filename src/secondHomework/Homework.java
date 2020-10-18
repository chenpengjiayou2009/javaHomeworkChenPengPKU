package secondHomework;
import java.lang.Math;
public class Homework {
    public int reverse(int a){
        System.out.println("original num is "+a);
        int res = 0;
        while(a!=0){
            res = res * 10 + a%10;
            a = a/10;
        }
        System.out.println("after reversion number is "+res);
        return res;
    }
    public static void main(String[] args){
        Homework homework = new Homework();
        for(int i=0;i<10;i++){
            homework.reverse((int) (Math.random()*100));
        }
    }
}
