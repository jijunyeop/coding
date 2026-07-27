import java.util.Scanner;
class Two{
    int[] num = new int[3];
    int[] kor = new int[3];
    int[] eng = new int[3];
    int[] math = new int[3];
    int[] sum = new int[3];
    double[] avr = new double[3];
    int[] rank = new int[3];
    public void sum(){
        for(int i=0;i<3;i++){
            sum[i]=kor[i]+eng[i]+math[i];
        }
    }
    public void avr(){
        for(int i=0;i<3;i++){
            avr[i]=sum[i]/3.00;
        }
    }
    public void rank(){
        for(int i=0;i<3;i++){
            rank[i]=1;
            for(int e=0;e<3;e++){
                if(avr[i]<avr[e]){
                    rank[i]+=1;
                }
            }
        }
    }
    public void line(){
        System.out.println("----------------------------------------------");
    }
    public void line(int value){
        for(int i=0;i<=value;i++){
            System.out.printf("-");
        }
        System.out.printf("");
    }
}
public class java2_last_dan_9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Two two2 = new Two();
        System.out.print("입력화면)\n");
        two2.line();
        for(int i=0;i<3;i++){
            two2.num[i] = i+1;
            System.out.print((i+1)+"번 국어점수를 입력하시오 : ");
            two2.kor[i] = sc.nextInt();
            System.out.print((i+1)+"번 영어점수를 입력하시오 : ");
            two2.eng[i] =  sc.nextInt();
            System.out.print((i+1)+"번 수학점수를 입력하시오 : ");
            two2.math[i] = sc.nextInt();
        }
        two2.line();
        two2.sum();
        two2.avr();
        two2.rank();
        System.out.print("출력화면)\n");
        two2.line(50);
        System.out.print("번호  국어  영어  수학  총점  평균    등수\n");
        two2.line(50);
        for(int i=0;i<3;i++){
            System.out.printf("%d     %d     %d    %d   %d   %.2f      %d\n",two2.num[i],two2.kor[i],two2.eng[i],two2.math[i],two2.sum[i],two2.avr[i],two2.rank[i]);
        }
        two2.line(50);
    }
}