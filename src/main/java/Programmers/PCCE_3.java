package Programmers;

import java.util.Scanner;

public class PCCE_3 {

    // [PCCE ㄱㅣ출문제] 3번 - 수 나누기
    // 디버깅 문제
    // 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다. 1줄만 수정하여 버그를 고치세요. 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.

    // 원본 코드
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < 1; i++) {
            // 예시 : 4859
            answer += number % 100; // 59
            number /= 100; // 48
        }

        System.out.println(answer);
    }*/

    // 정답 풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        int number = sc.nextInt(); // 입력값을 정수로 받음
        int answer = 0; // 최종 합을 저장할 변수

        // 입력된 숫자를 2자리씩 잘라서 더하는 반복문
        // 입출력 예시 : 입력 = 4859, 출력 = 107 / 입력 = 29, 출력 = 29
        while (number > 0) {
            answer += number % 100; // 현재 숫자의 마지막 두 자리 추출하여 더함 ( 나머지연산으로 28.59 가 나오고 그 후 나머지만을 가져오므로 59 저장 )
            number /= 100; // 이미 더한 두 자리 제거 (100으로 나누어 자릿수를 줄임)
        }

        System.out.println(answer); // 최종 합 출력
    }
}
