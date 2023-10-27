package solution05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        assertThat(solution.solution(n, m, section)).isEqualTo(result);
    }

    @Test
    void case02() {
        int n = 5;
        int m = 4;
        int[] section = {1, 3};
        int result = 1;

        assertThat(solution.solution(n, m, section)).isEqualTo(result);
    }

    @Test
    void case03() {
        int n = 4;
        int m = 1;
        int[] section = {1, 2, 3, 6};
        int result = 4;

        assertThat(solution.solution(n, m, section)).isEqualTo(result);
    }

    @DisplayName("n 미터의 벽 만들기")
    @Test
    void generateWallTest() {
        int n = 4;
        int[] section = {2, 4};

        HashMap result = new HashMap();
        result.put(1, "O");
        result.put(2, "X");
        result.put(3, "O");
        result.put(4, "X");

        assertThat(solution.generateWall(n, section)).isEqualTo(result);
    }

    @DisplayName("페인트칠 시작점 찾기")
    @Test
    void findStartPointTest() {
        HashMap wall = new HashMap();
        wall.put(1, "O");
        wall.put(2, "X");
        wall.put(3, "X");
        wall.put(4, "O");
        int startPoint = 2;

        assertThat(solution.findStartPoint(wall)).isEqualTo(startPoint);
    }
}