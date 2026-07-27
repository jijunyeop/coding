package exam;

import java.util.Scanner;

class Calc{
    public double average(int g,int e,int m){
        double avg;
        avg= (double)(g+e+m)/3;
        return avg;
    }
}
public class ex_3{
    public static void main(String[]args){
        int g;
        int e;
        int m;
        double ave;
        Clac calc1=new Clac();

        Scanner sc = Scanner(System.in);
        System.out.print("국어 :");
        g=sc.nextInt();
        System.out.print("영어 :");
        e=sc.nextInt();
        System.out.print("수학 :");
        m=sc.nextInt();

        ave=clac1.average(g,e,m);
    }
}