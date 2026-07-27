import java.util.Scanner;
class MyMath2{
    long a,b,result1,result2,result3,result4;

    public void add(){
        result1 = a+b;
    }
    public void minus(){
        result2 = a-b;
    }
    public void multi(){
        result3 = a*b;
    }
    public void divide(){
        result4 = a/b;
    }
}
public class MyMathTest2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        MyMath2 my = new MyMath2();
        System.out.println("a 값:");
        my.a = sc.nextLong();

        System.out.println("b 값:");
        my.b = sc.nextLong();
        
        my.add();
        my.minus();
        my.multi();
        my.divide();

        System.out.println("add:" +my.result1);
        System.out.println("minus:" + my.result2);
        System.out.println("multi" + my.result3);
        System.out.println("divide:" + my.result4);
    }
}