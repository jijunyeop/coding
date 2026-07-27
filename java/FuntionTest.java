import java.util.Scanner;
public class FuntionTest {
    public static int add(int a,int b){
        int result = a + b;
        return result;
    }
    public  static int sub(int a,int b){
        int result = a - b;
        return result;
    }
    public static int mul(int a,int b){
        int result = a * b;
        return result;  
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int result,a,b;
        System.out.println("a의 값:");
        a = sc.nextInt();
        System.out.println("b의 값:");
        b = sc.nextInt();
        result = add(a,b);
        result = sub(a,b);
        result = mul(a,b);

        System.out.println("더하기 값은" + add(a, b) + "입니다.");
        System.out.println("빼기 값은" + sub(a, b) + "입니다.");
        System.out.println("곱하기 값은:" + mul(a, b) + "입니다.");
    }
}