package Programmers;

public class PCCE_5 {

    // [PCCE ㄱㅣ출문제] 5번 - 심폐소생술
    // 빈칸 채우기
    // 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다. 빈칸을 제외한 기본 코드는 수정할 수 없습니다. 빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.

    class Solution {
        public int[] solution(String[] cpr) {
            int[] answer = {0, 0, 0, 0, 0}; // 정답 배열, 각 동작의 순서를 저장
            String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"}; // 올바른 CPR 순서

            // cpr 배열을 순회하면서 각 동작의 원래 순서를 찾기
            for (int i = 0; i < cpr.length; i++) { // cpr 배열의 모든 요소에 대해 반복
                for (int j = 0; j < basic_order.length; j++) { // 올바른 순서와 비교
                    if (cpr[i].equals(basic_order[j])) { // 현재 요소가 올바른 순서의 요소와 같다면
                        answer[i] = j + 1; // 기본 순서는 0부터 시작하므로 1을 더해 정답 배열에 저장
                        break; // 찾았으면 더 이상 비교할 필요 없으므로 루프 종료
                    }
                }
            }
            return answer; // 최종 순서가 담긴 배열 반환
        }
    }
}
