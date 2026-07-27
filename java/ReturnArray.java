import java.util.Scanner;

public class ReturnArray {

    static int[] makeArray(int[] kor, int[] eng){
        int[] sum = new int[3];
        for(int i = 0; i < 3; i++){
            sum[i] = (kor[i] + eng[i]) + 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] sum = new int[3];

        // 입력
        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + "번째 국어점수 입력:");
            kor[i] = sc.nextInt();
            System.out.println((i+1) + "번째 영어점수 입력:");
            eng[i] = sc.nextInt();
        }
        sum = makeArray(kor, eng);
        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + "번째 값: " + sum[i]);
        }
    }
}