package baseball.validate;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 숫자 게임 내 숫자 관련 유효성은 해당 객체를 통해 검사한다.
public abstract class NumberValidator {

    // 숫자 중복 체크
    public static void validateUnique(List<Integer> list){
        final List<Integer> sorted = list;
        Set<Integer> set = new HashSet<>(sorted);

        if(set.size() != sorted.size()){
            throw new IllegalArgumentException("같은 값이 2번 이상 검출되어 게임을 종료합니다.");
        }
    }
}
