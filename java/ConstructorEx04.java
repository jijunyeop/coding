class CalculatorEx {
    int a;
    int b;

    public CalculatorEx() {
        a = 10;
        b = 20;
    }
    public CalculatorEx(int num1, int num2) {
        a = num1;
        b = num2;
    }
    public void sum() {
        System.out.println("합계 : " +(a + b));
    }
}
public class ConstructorEx04 {
    public static void main(String[] args) {
        CalculatorEx cc = new CalculatorEx();
        cc.sum();
        CalculatorEx cc2 = new CalculatorEx(0, 10);
        cc2.sum();
    }
}