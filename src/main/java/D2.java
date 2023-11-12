public class D2 {

    public static void main(String[] args) {

        int i, k;

        // i를 단으로 두고 k를 올라가는 값으로 설정. 한 후 k가 9가 될때까지 k를 증감연산자로 1씩 증가시켜서 9단까지 출력되게함
        for (i = 2, k = 1; k < 10; k++) {
            System.out.printf(" %d x %d = %d \n", i, k, i * k);

            // 이제 k가 9단까지 끝을내고 내려와서 if문을 거쳤을때 9와 같다면 단 숫자인 i를 1증가 시키고 k를초기화 시켜준 후 큰 for문을 다시 실행하게됨
        if (k == 9) {
            i++;
            k = 0;
            // 단이 9단까지 이니까 i가 10하고 같아지면 break를 걸어줘서 for문이 멈추게함.
        }
        if (i == 10)
            break;
        }


        // 마지막에 줄을 바꿔준후 구구단이 끝났다는걸 알려줌
        System.out.println("");
        System.out.printf("구구단 끝");

    }
}
