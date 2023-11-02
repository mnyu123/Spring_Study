package chapter03.used;

// 의존성 있는 프로그램을 구성하기 위해 인터페이스 생성
/*
 * 계산 처리 인터페이스
 */
public interface Calculator {
    /**
     * 계산 처리를 함
     * @param x
     * @param y
     * @return Integer
     */
    Integer calc(Integer x , Integer y);
}
