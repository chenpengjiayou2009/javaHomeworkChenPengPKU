package thirdHomework;

import java.util.Date;
class Accout {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    Accout(){
        this.dateCreated = new Date(); // 默认开户日期为创建实例的日期
    }
    Accout(int id,double balance){
        this.dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate / 100;
    }
    public double getAnnualInterestRate(double annualInterestRate){
        return this.annualInterestRate;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        double monthlyInterestRate = getMonthlyInterestRate();
        return this.balance * monthlyInterestRate;
    }
    public double withDraw(double value){
        if(value>this.balance){   // 余额不足则返回0并提示
            System.out.println("balance is less than withdraw");
            return 0;
        }
        else{
            System.out.println("withdraw " + value);
            this.balance -= value;
            System.out.println("after withdraw the balance is " + this.balance);
            return value;
        }
    }
    public double deposit(double value){
        this.balance += value;
        System.out.println("put" + value + "in the account");
        System.out.println(" now the balance is " + this.balance);
        return this.balance;
    }

}
