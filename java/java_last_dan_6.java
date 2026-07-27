import java.util.Scanner;   
class Calc{ 

    int[] sumfution(int kor[],int eng[],int math[]){
        int[] sum = new int[3];
        for(int i=0;i<3;i++){
            sum[i]=(kor[i]+eng[i]+math[i])+10;
        }
        return sum;
    }
    double[] avrfution(int sum[]){
        double[] avr = new double[3];
        for(int i=0;i<3;i++){
            avr[i]=(double)(sum[i])/3.0+10;
        }
        return avr;
    }
}
public class java_last_dan_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calc calc1  = new Calc();
        double[] avr = new double[3];
        int[] sum = new int[3];
        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] math = new int[3];
        int[] num = new int[3];
        System.out.println("입력화면)");
        System.out.println("----------------------------------------------");
        for(int i=0;i<3;i++){
            num[i] = i+1;
            System.out.println((i+1)+"번 국어점수를 입력하시오 :");
            kor[i] = sc.nextInt();
            System.out.println((i+1)+"번 영어점수를 입력하시오 :");
            eng[i] = sc.nextInt();
            System.out.println((i+1)+"번 수학점수를 입력하시오 :");
            math[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------------");
        sum = calc1.sumfution(kor,eng,math);
        avr = calc1.avrfution(sum);
        System.out.println("출력화면)");
        System.out.println("----------------------------------------------");
        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("----------------------------------------------");
        for(int i=0;i<3;i++){
            System.out.printf("  %d      %d      %d      %d     %d    %.2f\n",num[i],kor[i],eng[i],math[i],sum[i],avr[i]);
        }
        System.out.println("----------------------------------------------");
    }
}