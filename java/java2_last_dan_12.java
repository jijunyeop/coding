import java.util.Scanner;
import linpirntpack.linprint;
import defalut.calculator;
public class java2_last_dan_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator ct = new calculator();
        linprint lp = new linprint();
        System.out.print("입력화면)\n");
        lp.line();
        for(int i=0;i<3;i++){
            ct.num[i] = i+1;
            System.out.print((i+1)+"번 이름 입력하시오 : ");
            ct.name[i] = sc.next();
            System.out.print((i+1)+"번 국어점수를 입력하시오 : ");
            ct.kor[i] = sc.nextInt();
            System.out.print((i+1)+"번 영어점수를 입력하시오 : ");
            ct.eng[i] =  sc.nextInt();
            System.out.print((i+1)+"번 수학점수를 입력하시오 : ");
            ct.math[i] = sc.nextInt();
        }
        lp.line();
        ct.sum();
        ct.avr();
        ct.rank();
        ct.array();
        System.out.print("출력화면)\n");
        lp.line(50);
        System.out.print("번호  이름  국어  영어  수학  총점  평균    등수\n");
        lp.line(50);
        for(int i=0;i<3;i++){
            System.out.printf("%d     %s   %d     %d    %d   %d   %.2f    %d\n",ct.num[i],ct.name[i],ct.kor[i],ct.eng[i],ct.math[i],ct.sum[i],ct.avr[i],ct.rank[i]);
        }
        lp.line(50);
    }
}