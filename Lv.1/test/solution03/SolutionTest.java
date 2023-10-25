package solution03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setSolution() {
        this.solution = new Solution();
    }

    @Test
    void case01() {
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        int[] result = {2, 1};

        assertThat(solution.solution(park, routes)).isEqualTo(result);
    }

    @Test
    void case02() {
        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        int[] result = {0, 1};

        assertThat(solution.solution(park, routes)).isEqualTo(result);
    }

    @Test
    void case03() {
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};
        int[] result = {0, 0};

        assertThat(solution.solution(park, routes)).isEqualTo(result);
    }

    @DisplayName("공원 만들기 테스트")
    @Test
    void generateParkTest() {
        String[] park = {"SOO", "OOO", "OOO"};
        String[][] newPark = {{"S", "O", "O"}, {"O", "O", "O"}, {"O", "O", "O"}};

        assertThat(solution.generatePark(park)).isEqualTo(newPark);
    }

    @DisplayName("로봇 강아지 이동 테스트")
    @ParameterizedTest
    @MethodSource("moveInfo")
    void moveTest(String routes, int[] current, int[] result) {
        assertThat(solution.move(routes, current)).isEqualTo(result);
    }

    private static Stream<Arguments> moveInfo() {
        return Stream.of(
                Arguments.of("E 2", new int[]{0, 0}, new int[]{0, 2}),
                Arguments.of("W 1", new int[]{1, 3}, new int[]{1, 2}),
                Arguments.of("N 3", new int[]{3, 2}, new int[]{0, 2}),
                Arguments.of("S 2", new int[]{1, 2}, new int[]{3, 2})
        );
    }

    @DisplayName("이동 정보에 맞춰 이동 가능 여부 테스트")
    @ParameterizedTest
    @MethodSource("isMoveInfo")
    void isMoveTest(String[][] park, String route, int[] current, boolean result) {
        assertThat(solution.isMove(park, route, current)).isEqualTo(result);
    }

    private static Stream<Arguments> isMoveInfo() {
        return Stream.of(
                Arguments.of(new String[][]{{"S", "O", "O"}, {"X", "O", "O"}, {"O", "O", "O"}}, "S 2", new int[]{0, 0}, false),
                Arguments.of(new String[][]{{"S", "O", "O"}, {"O", "O", "O"}, {"O", "O", "O"}}, "E 2", new int[]{0, 0}, true),
                Arguments.of(new String[][]{{"S", "O", "O"}, {"O", "O", "O"}, {"O", "O", "O"}}, "W 2", new int[]{0, 0}, false)
        );
    }

}