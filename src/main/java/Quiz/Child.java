package Quiz;

/* 상속된 부모클래스의 기능 ( 함수 ) 를 오버라이딩 하고 싶다면 Alt + Insert 를 누르고 Override Methods 기능을 사용하면 됨 */
public class Child extends Cal {

    @Override
    public int sum(int a, int b) {
        return a * b;
    }
}
