import java.util.Scanner;
class Tmo{
    final int Max = 3;
    int[] num = new int[Max];
    int[] kor = new int[Max];
    int[] eng = new int[Max];
    int[] math = new int[Max];
    int[] sum = new int[Max];
    double[] avr = new double[Max];
    int[] rank = new int[Max];
    String[] name = new String[Max];
    String dfname;    
    double tmp;
    int tmp2;
    String tmp3;
    int count = 0; 
    public void sum(){
        for(int i=0;i<count;i++){
            sum[i]=kor[i]+eng[i]+math[i];
        }
    }
    public void avr(){
        for(int i=0;i<count;i++){
            avr[i]=sum[i]/3.00;
        }
    }
    public void rank(){
        for(int i=0;i<count;i++){
            rank[i]=1;
            for(int e=0;e<count;e++){
                if(avr[i]<avr[e]){
                    rank[i]+=1;
                }
            }
        }
    }
    public void array(){
        for(int i=0;i<count;i++){
            for(int j=i;j<count;j++){
                if(num[i]<num[j]){
                    tmp2=num[j];
                    num[j]=num[i];
                    num[i]=tmp2;

                    tmp3=name[j];
                    name[j]=name[i];
                    name[i]=tmp3;

                    tmp2=kor[j];
                    kor[j]=kor[i];
                    kor[i]=tmp2;

                    tmp2=eng[j];
                    eng[j]=eng[i];
                    eng[i]=tmp2;

                    tmp2=math[j];
                    math[j]=math[i];
                    math[i]=tmp2;

                    tmp2=sum[j];
                    sum[j]=sum[i];
                    sum[i]=tmp2;

                    tmp=avr[j];
                    avr[j]=avr[i];
                    avr[i]=tmp;

                    tmp2=rank[j];
                    rank[j]=rank[i];
                    rank[i]=tmp2;
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
        System.out.printf("\n");
    }   

    public Tmo (String dftname){
        for(int i=0;i<Max;i++){
            name[i] = "홍길동";
            kor[i] = 30;
            eng[i] = 30;
            math[i] = 30;
            num[i] = i+1;
        }
    }
    public void data3(final Scanner sc){
        if(count >= Max){
            System.out.println((Max)+"명을 모두 입력했습니다.더 이상 입력할 수 없습니다.");
            return;
        }
        line();
        System.out.print((count+1)+"번 이름 입력하시오 : ");
        dfname = sc.next();

        if(dfname.equals("0")){
            count++; 
            System.out.println("기본값으로 이름 홍길동 각 점수는 30점으로 기록했습니다.");
            return;
            
        }else{
            name[count] = dfname;
        }

        System.out.print((count+1)+"번 국어점수를 입력하시오 : ");
        kor[count] = sc.nextInt();

        System.out.print((count+1)+"번 영어점수를 입력하시오 : ");
        eng[count] = sc.nextInt();

        System.out.print((count+1)+"번 수학점수를 입력하시오 : ");
        math[count] = sc.nextInt();

        num[count] = count+1;
        count++;
        line();
    }

    public void data4(){
        line();
        sum();
        avr();
        rank();
        array();
        System.out.print("출력화면)\n");
        line(50);
        System.out.print("번호  이름  국어  영어  수학  총점  평균    등수\n");
        line(50);
        for(int i=0;i<count;i++){
            System.out.printf("%d     %s   %d     %d    %d   %d   %.2f    %d\n",num[i],name[i],kor[i],eng[i],math[i],sum[i],avr[i],rank[i]);
        }
        line(50);
    }
}
public class java_last_dan_14{   
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        Tmo tmo2 = new Tmo("홍길동");
        System.out.print("입력화면)\n");
        while(true) {
            tmo2.line();
            System.out.println("<<원하시는 번호를 선택하세요>>");
            tmo2.line();
            System.out.println("1.학생정보입력");
            System.out.println("2.학생정보출력");
            System.out.println("3.종료");
            System.out.print("선택번호 : ");
            int num = sc.nextInt();
        switch (num) {
            case 1:
                tmo2.data3(sc);
                break;
            case 2:
                tmo2.data4();
                break;       
            default:
                sc.close();
                System.exit(0);
            }
        }
    }
}