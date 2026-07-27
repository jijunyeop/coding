import java.util.Scanner;
class Calc{
    //Calc를 호출하는 ex_1이 같은 패키지에 안에 있기 때문에 접근이 가능하여 public를 안써도 됨
    //average는 객체를 만들어서 호출하고 있기 때문에 static가 필요없다
     double average(int g,int e,int m){
        //함수는 클래스 밖에서도 독릭적인 존재 
        //여기서에 int는
        //Calc안에 있는 average 메소드를 사용하기 위해 ex_1 클래스 접근을 허용하게 해주는 역할
        double avg;
        avg=(double)(g+e+m)/3; 
        //평균값을 임시로 저장하기 위해 avg라는 변수를 만듬
        return avg; 
        // 메소드 밖으로 나가서 평균값을 돌려줌
    }
}
public class ex_1 {
    public static void main(String[] args){
        int g;
        int e;
        int m;
        double ave;
        Calc calc1=new Calc();
        //new는 힙 메모리에 객체를 생성하고 그주소를 반환하는 연산자
        //new는 Calc 객체를 생성한다
        //static과 new는 모두 메모리에 데이터를 생성한다
        //하지만 static는 하나를 공유하기 위해 생성 new는 객체를 생성하기 위해 사용
        //stati은 클래스 로딩 시 메모리에 생성되는 멤버이고,new는 객체를 생성하기 위해 사용하는 연사자
        //class는 메모리에 틀만 있기 때문에 new라는 실제 객체를 만들어야 동작하기 때문이다
        //Calc은 위에 있는 Calc 클래스 있는 데이터 기능 덩어리(객체)를 가져오기 위해 사용하기 위한 역할
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 :");
        g = sc.nextInt();
        System.out.print("영어 :");
        e = sc.nextInt();
        System.out.print("수학 :");
        m = sc.nextInt();

        ave = calc1.average(g,e,m);
        
        System.out.println("---------------------------");
        System.out.println("국어    영어    수학    평균");
        System.out.println("---------------------------"); 
        System.out.println(g+" "+e+" "+m+" "+ave);
    }
}