package baseball;

import baseball.domain.Computer;
import baseball.domain.Player;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        String numberStr = Console.readLine();

        Player player = new Player(numberStr);
        Computer computer = new Computer();
    }
}
