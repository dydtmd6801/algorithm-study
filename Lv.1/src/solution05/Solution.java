package solution05;

import java.util.HashMap;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        return answer;
    }

    public HashMap generateWall(int n, int[] section) {
        HashMap wall = new HashMap();
        int unpainted = 0;
        for (int i = 1; i <= n; i++) {
            if (section[unpainted] == i) {
                wall.put(i, "X");
                unpainted++;
                continue;
            }
            wall.put(i, "O");
        }
        return wall;
    }
}