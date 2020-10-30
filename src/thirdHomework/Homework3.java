package thirdHomework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

public class Homework3{
    public void SetDate(){
        Date date = new Date();
        int time = 10000;
        int i = 0;
        while(i<7){  // 总共循环了8次，分别是10000, 100000, 1000000, 10000000 ....
            date.setTime(time);
            System.out.println(date.toString());
            time = time * 10;
            i += 1;
        }
    }
    public void testAccount(){
        Accout accout = new Accout(1122,20000);
        accout.setAnnualInterestRate(4.5);
        accout.withDraw(2500);
        accout.deposit(3000);
        System.out.println("now the balance is " + accout.getBalance());
        System.out.println("now the monthly interest rate is " + accout.getMonthlyInterestRate());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 设置格式
        ft.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));   // 设置时区
        System.out.println("the createdDate is " + ft.format(accout.getDateCreated()));
    }
    // 冒泡排序
    public static void sort(ArrayList<Number> list){
        int length = list.size();
        for(int i = 0;i<length-1;i++){
            for(int j = i;j<length;j++){
                Number numberI = list.get(i);
                Number numberJ = list.get(j);
                if(numberI.doubleValue()>numberJ.doubleValue()){
                    list.set(i,numberJ);
                    list.set(j,numberI);
                }
            }
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        //   1. testSetdate
        Homework3 h3 = new Homework3();
        h3.SetDate();

        // 2. testAccout
        h3.testAccount();

        // 3. testsortArray
        int[] l = new int[]{1,2,3};
        ArrayList<Number> list = new ArrayList<>();
        for(int i:l){
            list.add(i);
        }
        Homework3.sort(list);
        for(Number i:list){
            System.out.println(i);
        }    // 打印排序之后的结果

        // 4.testcoloneCourse
        Course course = new Course("Java");
        course.addStudent("Eric");
        course.addStudent("Simon");
        Course newCourse = course.clone();

        for(String s:newCourse.getStudents()){
            if(s!=null){System.out.println(s);}
        } // 打印克隆之后的课程清单

    }

}