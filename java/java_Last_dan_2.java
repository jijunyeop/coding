import java.util.Scanner;
public class java_Last_dan_2{
    static int sumfution(int kor,int eng,int math){
        int sum; 
        sum = kor+eng+math;
        return sum;
    }
    public static double avrfution(int sum){
        //메소드를 객체에 넣지 않고 클래스 로딩 시 현재 메소드가 메모리에 올라간다
        //그래서 main과 함께 사용한다
        //객체 없이 main도 static임으로 같이 올라가서 바로 쓸수 있게 하는 역할
        double avr;
        avr = (double)sum/3.0;
        return avr;
    }
        //public 모든 접근 허용 해주는 역할
        //public 다른 클래스에서 어디서든 접근 가능하게 해주는 역할
        //하지만 private는 해당 본인 클래스 안에서만 접근 가능
        //private는 데이터를 보호하려고 하기 때문에 외부에서의 접근 못하게 한다
        //public을 지우면 int 메소드 등에 접근 제한이 걸린다
        //public는 외부 접근 제한이 없기 때문에 avr은 다른 클래스를 사용할수 있기때문에
        //public을 사용하는것이 좋다
        //private는 내부 접근만 허용해주므로 sum같은 내부 계산용 메소드에는
        //private를 사용하는것이 좋다
        //int는 정수를 저장하거나 반환한기 위한 자료형 타입
        //static는 클래스에 있는 메소드나 변수를 객체 없이 사용하게 해주는 역할
        //객체란 클래스에 있는 메소드나 변수의 데이터 덩어리를 말한다
        //static는 클래스 로딩할 때 메모리에 먼저 올라가서 바로 사용 가능
        //static는 객체를 만들지 않고도 호출할 수 있게 하려고 사용
        //main은 실생 시점에서 객체가 존재하지 않는다
        //main은 객체 생성 없이 실행해야 하기 때문에 Static가 필요하다
        //class 변수난 메소드를 관리하는 설계도같은 역할이다
    public static void main(String[] args) {
        //static은 클래스 로딩 시 메모리에 먼저 올라가는 멤버
        //main 내부에서는 필요한 객체를 new로 heap에 생성
        //main은 객체 생성 없이 실행해야 하기 때문에 Static가 필요하다
        //main은 static이어야하는 이유는 main이 실행하는 순간 객체가 없기 때문이다
        Scanner sc = new Scanner(System.in);
        //new는 힙 메모리에 객체를 생성하고 그주소를 반환하는 연산자
        //new를 사용하여 Scanner 객체를 생성한다
        //class는 메모리에 틀만 있기 때문에 new라는 실제 객체를 만들어야 동작하기 때문이다
        //System.in 키보드로 입력 받기 위한 입력 통로 역할
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
        sum = sumfution(kor,eng,math);
        avr = avrfution(sum);
        //출력부
        System.out.print("출력화면)\n");
        System.out.print("---------------------------------\n");
        System.out.print("번호  국어  영어  수학  총점  평균\n");
        System.out.print("---------------------------------\n");
        System.out.printf("%d    %d     %d    %d   %d   %.1f\n",num,kor,eng,math,sum,avr);
        System.out.print("---------------------------------");
    }
}