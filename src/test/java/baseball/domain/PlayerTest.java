package baseball.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class PlayerTest {

    @Test
    void 객체생성_테스트(){
        String numbers = "123";
        Player player = new Player(numbers);

        assertThat(player).isNotNull();
        assertThat(player.getNumbers()).isNotNull();
    }

    @Test
    void 사용자_입력숫자_생성(){
        String numbers = "425";
        Player player = new Player(numbers);

        assertThat(player.getNumbers().size()).isEqualTo(3);
        assertThat(player.getNumbers()).contains(4,2,5);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234", "우테캠", "12동", "변99"})
    void 입력_오류_테스트(String input){

        assertThatIllegalArgumentException().isThrownBy(
                () -> new Player(input)
        );
    }

}