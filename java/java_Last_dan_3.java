import java.util.Scanner;
public class java_Last_dan_3{
    static int sumfution(int kor,int eng,int math){
        int sum; 
        sum = kor+eng+math;
        return sum;
    }
    public static double avrfution(int sum){
        double avr;
        avr = (double)sum/3.0;
        return avr;
    }    
        public static void main(String[] args) {
        //배열 생성
        int[] num = new int[3];
        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] math = new int[3];
        int[] sum = new int [3];
        double[] avr = new double [3];
        Scanner sc = new Scanner(System.in);

        //입력부
        System.out.print("입력화면)\n");
        System.out.print(   "---------------------------------\n");
        for(int i=0;i<3;i++){
            num[i]=i+1;            
            System.out.println((i+1)+"번 국어점수를 입력하시오 :");
            kor[i] = sc.nextInt();
            System.out.println((i+1)+"번 영어점수를 입력하시오 :");
            eng[i] =  sc.nextInt();
            System.out.println((i+1)+"번 수학점수를 입력하시오 :");
            math[i] = sc.nextInt();
            sum[i] = (kor[i]+eng[i]+math[i]);
            avr[i] = (double)(kor[i]+eng[i]+math[i])/3;
        }
        System.out.print("---------------------------------\n");
        //입력 계산부  
        /*
        result=sum(kor,eng,math);
        result=avr(math,kor,eng)/3;
        */

         //출력부
        System.out.print("출력화면)\n");
        System.out.print("---------------------------------\n");
        System.out.println("번호  국어  영어  수학  총점  평균\n");
        System.out.print("---------------------------------\n");
        for(int i=0;i<3;i++){
            System.out.printf("%d    %d     %d    %d   %d   %.2f\n",num[i],kor[i],eng[i],math[i],sum[i],avr[i]);
        }
        System.out.print("---------------------------------");
        }
    }