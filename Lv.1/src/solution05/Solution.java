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

    public int findStartPoint(HashMap wall) {
        for (int i = 1; i <= wall.size(); i++) {
            if(wall.get(i).equals("X")) {
                return i;
            }
        }
        return 0;
    }

    public boolean checkOverTheWall(int wallLength, int paintLength, int startPoint) {
        if (startPoint + paintLength < wallLength) {
            return true;
        }
        return false;
    }

    public HashMap paint(HashMap wall, int brushLength, int startPoint) {
        for (int i = startPoint; i <= brushLength; i++) {
            wall.put(i, "O");
        }
        return wall;
    }
}