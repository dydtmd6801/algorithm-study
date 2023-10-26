package solution04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setSolution() {
        solution = new Solution();
    }

    @Test
    void case01() {
        String[] wallpaper = {".#...", "..#..", "...#."};
        int[] result = {0, 1, 3, 4};

        assertThat(solution.solution(wallpaper)).isEqualTo(result);
    }

    @Test
    void case02() {
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        int[] result = {1, 3, 5, 8};

        assertThat(solution.solution(wallpaper)).isEqualTo(result);
    }

    @Test
    void case03() {
        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        int[] result = {0, 0, 7, 9};

        assertThat(solution.solution(wallpaper)).isEqualTo(result);
    }

    @Test
    void case04() {
        String[] wallpaper = {"..", "#."};
        int[] result = {1, 0, 2, 1};

        assertThat(solution.solution(wallpaper)).isEqualTo(result);
    }

    @DisplayName("바탕화면 정보의 문자열로 2차원 배열 만들기")
    @Test
    void generateDesktopTest() {
        String[] wallpaper = {"..", "#."};
        String[][] desktop = {{".","."},{".","#"}};

        assertThat(solution.generateDesktop(wallpaper)).isEqualTo(desktop);
    }

    @DisplayName("파일이 있는 좌표 찾아내기")
    @Test
    void findFileCoordinate() {
        String[][] desktop = {{".", "#", ".", ".", "."}, {".", ".", "#", ".", "."}, {".", ".", ".", "#", "."}};

        assertThat(solution.findFile(desktop)).contains(new int[]{0, 1}, new int[]{1, 2}, new int[]{2, 3});
    }
}