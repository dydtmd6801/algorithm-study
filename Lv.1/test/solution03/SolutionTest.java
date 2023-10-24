package solution03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}