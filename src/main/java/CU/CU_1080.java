package CU;

import java.util.Scanner;

public class CU_1080 {

    // 1080 - 언제까지 더해야할까
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = 1;

        while (true) {
            if (n * (n+1) >= 2* num) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
