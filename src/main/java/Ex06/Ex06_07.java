package Ex06;

public class Ex06_07 {
// 에러가 나는게 맞는 코드
    public static void main(String[] args) {

//      대입을 해줘야 메모리 ( RAM )에 올라가지 않기 때문에 아래에서 오류가 남
        int hap;
        int i;

        for ( i = 1; i <= 10; i++ ) {
//          여기서 메모리에 올라가지 않은애를 불러오라고 하니까 에러가 남
            hap = hap + i;
        }

        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
