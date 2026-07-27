import java.util.Scanner;
class Tmo1{
    final int Max = 10;
    int[] num = new int[Max];
    int[] kor = new int[Max];
    int[] eng = new int[Max];
    int[] math = new int[Max];
    int[] sum = new int[Max];
    double[] avr = new double[Max];
    int[] rank = new int[Max];
    String[] name = new String[Max];
    public boolean data1(Scanner sc,int count){
        System.out.println("-------------------------------------");
        System.out.print("검색하려는 이름 입력하세오 : ");
        String searchName = sc.next();
        for(int i=0;i<count;i++){
            rank[i]=1;
            for(int e=0;e<count;e++){
                if(avr[i]<avr[e]){
                    rank[i]+=1;
                }
            }
            if(searchName.equals(name[i])){
                sum[i]=kor[i]+eng[i]+math[i];
                avr[i]=sum[i]/3.0;
                System.out.println("--------------------------------------------------------");
                System.out.println("번호  이름  국어  영어  수학  총점   평균   등수");
                System.out.println("--------------------------------------------------------");
                System.out.printf("%d     %s   %d     %d    %d   %d   %.2f    %d\n",num[i],name[i],kor[i],eng[i],math[i],sum[i],avr[i],rank[i]);
                System.out.println("--------------------------------------------------------");
                return true;
            }
        }
        System.out.println("입력하신 이름은 없는 값입니다.");
        return false;
    }
}
class Tmo2 extends Tmo1{
    String dfname;    
    double tmp;
    int tmp2;
    String tmp3;
    int count = 0;
    public Tmo2(String dfname,int dftscore){
        for(int i=0;i<Max;i++){
            name[i] = dfname;
            kor[i] = dftscore;
            eng[i] = dftscore;
            math[i] = dftscore;
            num[i] = i+1;
        }
    }
    public Tmo2 (String dftname){
        for(int i=0;i<Max;i++){
            name[i] = "홍길동";
            kor[i] = 30;
            eng[i] = 30;
            math[i] = 30;
            num[i] = i+1;
        }
    }
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
            System.out.println("기본값으로 이름" + " " + name[count] + " " +"각 점수는 30점으로 기록했습니다.");
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
    public void data5(Scanner sc){
        line(50);
        System.out.print("이름 입력하시오 : ");
        String searchName = sc.next();
        line(50);
        for(int i=0;i<count;i++){
            if(searchName.equals(name[i])){
                /* 
                System.out.println("번호 : " + num[i]);
                System.out.println("이름 : " + name[i]);
                System.out.println("국어 : " + kor[i]);
                System.out.println("영어 : " + eng[i]);
                System.out.println("수학 : " + math[i]);
                */
                System.out.print("번호(수정불가) :" + " " + num[i] + "\n");

                System.out.print("이름(수정불가) :" + " " + name[i] + "\n");
            
                System.out.print("국어" + "(" + ("현재"+ kor[i]+"점") +")" +"수정점수 : ");
                kor[i] = sc.nextInt();

                System.out.print("영어" + ("현재" + eng[i]+"점") + "수정점수 : ");
                eng[i] = sc.nextInt();

                System.out.print("수학" + "(" + ("현재" + math[i]+"점") +")"+ "수정점수 : ");
                math[i] = sc.nextInt();

                sum();
                avr();
                rank();
                line(50);
                System.out.println("수정후 점수");
                line(50);
                System.out.println("번호  이름  국어  영어  수학  총점   평균   등수");
                line(50);
                System.out.printf("%d     %s   %d     %d    %d   %d   %.2f    %d\n",num[i],name[i],kor[i],eng[i],math[i],sum[i],avr[i],rank[i]);
                line(50);
                return;
            }
        }
        System.out.println("입력하신 이름은 없습니다.");
    }
    public void data6(){
        System.out.print("이름 입력하시오 : ");
    }
}
public class java_last_dan_17{   
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        Tmo2 tmo2 = new Tmo2("홍길동");
        System.out.print("입력화면)\n");
        while(true) {
            tmo2.line();
            System.out.println("<<원하시는 번호를 선택하세요>>");
            tmo2.line();
            System.out.println("1.학생정보입력");
            System.out.println("2.학생정보출력");
            System.out.println("3.학생정보검색");
            System.out.println("4.학생정보수정");
            System.out.println("5.학생정보삭제");
            System.out.println("6.종료");
            System.out.print("선택번호 : ");
            int num = sc.nextInt();
        switch (num) {
            case 1:
                tmo2.data3(sc);
                break;
            case 2:
                tmo2.data4();
                break;
            case 3:
                tmo2.data1(sc,tmo2.count);
                break;
            case 4:
                tmo2.data5(sc);
                break;
            case 5:
                tmo2.data6();
                break;
            default:
                sc.close();
                System.exit(0);
            }
        }
    }
}