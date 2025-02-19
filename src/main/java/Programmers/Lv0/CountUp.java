package Programmers.Lv0;

public class CountUp {

    public int[] solution(int start_num, int end_num) {
        // int[] answer = {};

        // 문제 설명
        // 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

        // 입출력 예 #1
        // 3부터 10까지의 숫자들을 담은 리스트 [3, 4, 5, 6, 7, 8, 9, 10]를 return합니다.

        int num = end_num - start_num + 1;
        int[] answer = new int[num];

        // ㅇㅖ제가 숫자를 받는게 아니기 때문에 스캐너는 사용 불가능 한걸로 보임
//         Scanner sc = new Scanner(System.in);
//         len = sc.nextInt();
//
//         int[] answer = new int[len];

        for ( int i = 0; i < answer.length; i++ ) {
            answer[i] += start_num;
            start_num++;
        }

        return answer;
    }

}
