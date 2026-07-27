import java.util.Scanner;
class Calc{
    long num,kor,eng,math,sum,avr;

    public void sum(){
        sum = kor + eng + math;
        System.out.printf("%d",sum);
    }
    public void avr(){
        avr = (double)sum/3.0;
    }
}
public class java_Last_dan_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc calc1 = new Calc();
        int num,kor,eng,math,sum;
        double avr;
        //입력부
        System.out.print("입력화면)\n");
        //System.out 화면에 보여는 역할
        System.out.print("---------------------------------\n");
        System.out.print("번호를 입력하시오 : ");
        num = sc.nextInt();
        System.out.print("국어점수를 입력하시오 : ");
        kor = sc.nextInt();
        System.out.print("영어점수를 입력하시오 : ");
        eng =  sc.nextInt();
        System.out.print("수학점수를 입력하시오 : ");
        math = sc.nextInt();
        System.out.print("---------------------------------\n");
        calc1.kor = kor;
        calc1.eng = eng;
        calc1.math = math;
        calc1.sum();
        calc1.avr();
        System.out.print("출력화면)\n");
        System.out.print("---------------------------------\n");
        System.out.print("번호  국어  영어  수학  총점  평균\n");
        System.out.print("---------------------------------\n");
        System.out.println("%d    %d     %d    %d   %d   %.1f\n",num,kor,eng,math,sum,avr);
        System.out.print("---------------------------------");
    }
}