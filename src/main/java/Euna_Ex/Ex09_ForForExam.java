package Euna_Ex;

import java.util.Scanner;

public class Ex09_ForForExam {

    // 미션 1)
    // 단 기존의 for문 이외에 새로운 for문을 추가하지 마시오.

    //미션2)
    // 단: 8
    // 범위(1,3,5,7,9):3
    // <결과>
    // 7단	8단	9단
    // 7x1	8x1	9x1
    // 7x9	8x9	9x9
    // -----------------
    // 단: 8
    // 범위(1,3,5,7,9):5
    // <결과>
    // 6단  7단	8단	9단  10단
    // -----------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.printf("단을 입력해주세요 : ");
            int dan = Integer.parseInt(sc.nextLine());

            System.out.printf("범위(1, 3, 5, 7, 9) : ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println("올바른 값을 입력하세요.");
            } else {

                for (int i = 0; i <= 9; i++) {
                    for (int j = dan - (n / 2); j <= dan + (n / 2); j++) {
                        if (i == 0) {
                            System.out.print(j + "단\t\t");
                        } else {
                            System.out.print(j + "x" + i + "=" + (j * i) + "\t");
                        }
                    }
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            System.out.println("숫자만 입력해");
            e.printStackTrace();
        }
    }
}
