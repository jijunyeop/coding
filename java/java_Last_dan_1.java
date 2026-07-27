
import java.util.Scanner;
public class java_Last_dan_1{
    public static void main(String[] args) {
        int number,language,english,math,sum;
        double avr;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력부\n");
        System.out.print("입력화면)\n");
        System.out.print("---------------------------------\n");
        System.out.print("번호를 입력하시오 : ");
        number = sc.nextInt();
        System.out.print("국어점수를 입력하시오 : ");
        language = sc.nextInt();
        System.out.print("영어점수를 입력하시오 : ");
        english =  sc.nextInt();
        System.out.print("수학점수를 입력하시오 : ");
        math = sc.nextInt();
        System.out.print("---------------------------------\n");
        System.out.print("입력 계산부\n");
        sum = math+language+english;
        avr = (double)(math+language+english)/3;
        System.out.print("출력부\n");
        System.out.print("출력화면)\n");
        System.out.print("---------------------------------\n");
        System.out.print("번호  국어  영어  수학  총점  평균\n");
        System.out.print("---------------------------------\n");
        System.out.printf("%d    %d     %d    %d   %d   %.1f\n",number,language,english,math,sum,avr);
        System.out.print("---------------------------------");
    }
}