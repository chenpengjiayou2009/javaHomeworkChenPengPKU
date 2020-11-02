package secondHomework;

import java.util.Scanner;

public class Homework {
    public static int reverse(int a){
        System.out.println("original num is "+a);
        int res = 0;
        while(a!=0){
            res = res * 10 + a%10;
            a = a/10;
        }
        System.out.println("after reversion number is "+res);
        return res;
    }
    public static void printMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((int)(2*Math.random())+" ");
            }
        System.out.println();
        }
    }
    public static void countDigits(){
        int[] res = new int[10];
        for(int i =0;i<100;i++){
            int num = (int) (10*Math.random());
            res[num] += 1;
        }
        for (int i=0;i<10;i++){
            System.out.println("count of "+ i + "is "+res[i]);
        }
    }
    public static int indexOfSmallestElement(double[] array){
        double min = Double.MAX_VALUE;
        int res = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                res = i;
                min = array[i];
            }
        }
        return res;
    }
    public static double sumMajorDiagonal(double[][] m){
        double s = 0;
        int nRows = m.length;
        int nLines = m[0].length;
        for(int i=0;i<nRows;i++){
            for(int j=0;j<nLines;j++){
                if(j==i){
                    s+=m[i][j];
                    break;
                }
            }
        }
        return s;
    }
    public static void main(String[] args){
        // test reverseInteger
        System.out.println("1.reverseInteger");
        for(int i=0;i<10;i++){
            reverse((int) (Math.random()*100));
        }
        // test printMatrx
        System.out.println("\n2.printMatrix");
        for(int i=0;i<10;i++){
            System.out.println("matrix of "+i+"is ");
            printMatrix(i);
        }
        // test countDigits
        System.out.println("\n3.test CountDigits");
        countDigits();

        // test indexOfSmallestElement
        System.out.println("\n4.indexOfSmallestElement");
        System.out.println("input an double array of length 10");
        Scanner input1 = new Scanner(System.in);
        double[] array = new double[10];
        for(int i =0;i<10;i++){
            array[i] = input1.nextDouble();
        }
        System.out.println("smallest index is " + indexOfSmallestElement(array));


        // test sumMajorDiagonal
        System.out.println("\n5.sumMajorDiagonal");
        System.out.println("input matrix shape");
        Scanner input2 = new Scanner(System.in);
        int n = input2.nextInt();
        double[][] m = new double[n][n];
        for(int i=0;i<n;i++){
            System.out.println("input "+(i+1)+" row");
            for(int j=0;j<n;j++){
                m[i][j] = input2.nextDouble();
            }
        }
        System.out.println("sum of diagonal is "+sumMajorDiagonal(m));


    }
}

