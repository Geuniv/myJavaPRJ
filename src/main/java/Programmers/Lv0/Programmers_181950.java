package Programmers.Lv0;

import java.util.Scanner;

public class Programmers_181950 {

    // 코딩 기초 트레이닝 - 문자열 반복해서 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for ( int i = 0; i < n; i++ ) {
            System.out.print(str);
        }
    }
}
