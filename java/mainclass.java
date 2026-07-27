import java.util.Scanner;
class Cal1 {
    int val1;
    int val2;
    int sel;

    public void sum(){
        System.out.println("연산결과 : " + (val1) + "+" + (val2) + "=" + (val1 + val2));
    }
    public void subt(){
        System.out.println("연산결과 : " + (val1) + "-" + (val2) + "=" + (val1 - val2));
    }
    public void mult(){
        System.out.println("연산결과 : " + (val1) + "*" + (val2) + "=" + (val1 * val2));
    }
}
class Cal2 extends Cal1 {
    public void div(){
        if(val2 == 0){
            System.out.println("0으로 나눌 수 없습니다.");
        }else{
            System.out.println("연산결과 : " + (val1) + "/" + (val2) + "=" + (val1 / val2));
        }
    }
    public void input1(Scanner sc){
        System.out.print("연산선택 1.덧셈, 2.뺄셈, 3.곱셈, 4.나눗셈, (0,종료) : ");
        sel = sc.nextInt();
        if (sel == 0)
            return;
            System.out.print("값1 입력 : ");
            val1 = sc.nextInt();
            System.out.print("값2 입력 : ");
            val2 = sc.nextInt();
    }
    public void output1(){
        switch (sel) {
            case 1:sum();
                break;
            case 2: subt();
                break;
            case 3: mult();
                break;
            case 4: div();
                break;
        }
    }
}
public class mainclass {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        Cal2 calculator = new Cal2();
        System.out.println("계산기시작");
        while (true) {
            calculator.input1(sc);
            if (calculator.sel == 0) {
                System.out.println("계산기 종료~^^");
                sc.close();
                System.exit(0);
            }
            calculator.output1();
        }
    }
}   