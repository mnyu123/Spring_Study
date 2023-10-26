package chapter02;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        // String 타입의 List 준비
        List<String> names = new ArrayList<>();

        // String 타입 데이터 추가
        names.add("홍길동");
        names.add("김선비");
        names.add("YOUNGJAE");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("print 단축키 : sout + 탭키");
    }
}
