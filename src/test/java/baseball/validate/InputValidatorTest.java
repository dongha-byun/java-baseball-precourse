package baseball.validate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void 입력_길이_예외_체크(){
        String input = "12453";

        assertThatIllegalArgumentException().isThrownBy(
                () -> InputValidator.validateInputLength(input)
        ).withMessage("자릿수 입력이 옳바르지 않습니다. 게임을 종료합니다.");
    }

    @Test
    void 입력_문자_예외_체크(){
        String input = "동하12";

        assertThatIllegalArgumentException().isThrownBy(
                () -> InputValidator.validateInputNumber(input)
        ).withMessage("숫자 외 입력이 확인되었습니다. 게임을 종료합니다.");
    }
}