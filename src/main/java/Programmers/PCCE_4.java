package Programmers;

import java.util.Scanner;

public class PCCE_4 {

    // [PCCE ㄱㅣ출문제] 4번 - 병과분류
    // 빈칸 채우기
    // 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다. 빈칸을 제외한 기본 코드는 수정할 수 없습니다. 빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        String code = sc.next(); // 사용자 입력을 문자열로 받음

        // 입력된 문자열의 마지막 4글자를 추출
        // substring(start, end) 메서드를 사용하여 마지막 4글자를 가져옴
        String lastFourWords = code.substring(code.length() - 4, code.length());

        // 조건문을 사용하여 마지막 4글자에 따라 병과를 분류
        if (lastFourWords.equals("_eye")) {
            System.out.println("Ophthalmologyc"); // 안과 (Ophthalmologyc)
        }
        else if (lastFourWords.equals("head")) {
            System.out.println("Neurosurgery"); // 신경외과 (Neurosurgery)
        }
        else if (lastFourWords.equals("infl")) {
            System.out.println("Orthopedics"); // 정형외과 (Orthopedics)
        }
        else if (lastFourWords.equals("skin")) {
            System.out.println("Dermatology"); // 피부과 (Dermatology)
        }
        else {
            System.out.println("direct recommendation"); // 위 조건에 해당하지 않는 경우
        }

        sc.close(); // Scanner 객체를 닫아 자원 누수를 방지
    }
}
