package solution05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setSolution() {
        solution = new Solution();
    }

    @Test
    void case01() {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        int result = 2;

        assertThat(solution.solution(n,m,section)).isEqualTo(result);
    }

    @Test
    void case02() {
        int n = 5;
        int m = 4;
        int[] section = {1, 3};
        int result = 1;

        assertThat(solution.solution(n,m,section)).isEqualTo(result);
    }

    @Test
    void case03() {
        int n = 4;
        int m = 1;
        int[] section = {1, 2, 3, 6};
        int result = 4;

        assertThat(solution.solution(n,m,section)).isEqualTo(result);
    }
}