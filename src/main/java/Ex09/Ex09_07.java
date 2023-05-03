package Ex09;

public class Ex09_07 {

    public static void main(String[] args) {

        String str = "    한글    ABCD    efgh    ";
        String result = ""; // 결과를 저장할 문자열 변수

        // 문자열의 문자 개수만큼 반복한다.
        for (int i = 0; i < str.length(); i++) {
            // charAt(위치)는 해당 위치의 문자를 추출한다.
            // 이 문자가 공백이 아니면 8행에서 result에 덧붙인다.
            if (str.charAt(i) != ' ')
                result += str.substring(i, i + 1);
        }

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("공백제거 ==> [" + result + "]");
    }
}
