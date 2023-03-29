import java.util.Scanner;

public class D {
// 아침 시간 퀴즈
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b;
        a = s.nextInt();
//        b = s.nextInt();

//        아래의 첫 if문의 예제에서 첫 if문에서 연산자가 3개 들어가는데 최소공배수인 a % 6 ==0으로 하면 연산자 하나로 처리할 수 있음.
        if ( a % 2 ==0 && a % 3 == 0) {
            System.out.printf("2와 배수와 3의 배수를 모두 충족합니다. \n");
        } else if ( a % 3 == 0 ) {
            System.out.printf("3의 배수입니다. \n");
        } else if ( a % 2 ==0 ) {
            System.out.printf("2의 배수입니다. \n");
        } else {
            System.out.printf("끝");
        }
    }
}
