import java.util.Scanner;
class Calc{
    int sumfution(int kor,int eng,int math){
        int sum; 
        sum = kor+eng+math;
        return sum;
    }
    double avrfution(int sum){
        System.out.print("%d", sum);
        double avr;
        System.out.print("%f", avr);
        avr = (double)sum/3.0;
        System.put.print("%f", avr);
        return avr;
    }
}
public class java_Last_dan_5{
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
        //입력 계산부
        sum = calc1.sumfution(kor,eng,math);
        avr = calc1.avrfution(sum);
        //출력부
        System.out.print("출력화면)\n");
        System.out.print("---------------------------------\n");
        System.out.print("번호  국어  영어  수학  총점  평균\n");
        System.out.print("---------------------------------\n");
        System.out.printf("%d    %d     %d    %d   %d   %.1f\n",num,kor,eng,math,sum,avr);
        System.out.print("---------------------------------");
    }
}