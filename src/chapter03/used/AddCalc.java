package chapter03.used;

/*
* Calculator 인터페이스를 구현한 클래스
* 여기는 덧셈처리만
*/
public class AddCalc implements Calculator {
    @Override
    public Integer calc(Integer x, Integer y) {
        return x + y;
    }
}
