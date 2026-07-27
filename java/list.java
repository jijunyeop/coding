import java.util.Scanner;
    class one1 {
    final int MAX = 3;

    int[] num = new int[MAX];
    String[] name = new String[MAX];
    int[] score = new int[MAX];
    int count = 0;

    public void data1(final Scanner sc) {
        if (count >= MAX) {
            System.out.println("3명을 모두 입력했습니다.");
            return;
        }

        System.out.print((count + 1) + "번 번호 입력 : ");
        num[count] = sc.nextInt();

        System.out.print((count + 1) + "번 좋아하는 과일 입력 : ");
        name[count] = sc.next();

        System.out.print((count + 1) + "번 과일 점수 입력 : ");
        score[count] = sc.nextInt();
        count++;

        System.out.println("입력 완료! (현재 " + count + "명 입력됨)");
    }

    public void data2() {
        if (count == 0) {
        System.out.println("입력된 데이터가 없습니다.");
        return;
    }

    System.out.print("번호      과일         점수\n");
    for(int i=0; i<count; i++) {
        System.out.printf("%d           %s          %d\n",num[i], name[i], score[i]);
        }
    }
}
public class list{
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        final one1 one2 = new one1();

        while(true) {
            System.out.println("<<원하시는 번호를 선택하세요>>");
            System.out.println("1.입력: ");
            System.out.println("2.출력: ");
            System.out.println("3.종료: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    one2.data1(sc);
                    break;
                case 2:
                    one2.data2();
                    break;
                default:
                    System.out.print("종료합니다.");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}