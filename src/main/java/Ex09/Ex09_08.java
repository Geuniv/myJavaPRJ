package Ex09;

public class Ex09_08 {

    public static void main(String[] args) {

        // 문자열 변수 2개를 초기화한다.
        String str1 = "Java Programming";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");

        System.out.println(str1.compareTo(str2)); // 두 문자열을 비교한다.
        System.out.println(str1.contains("Java")); // "Java" 글자가 포함되었는지 확인한다.
    }
}
