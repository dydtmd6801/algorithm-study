package solution03;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        return answer;
    }

    public String[][] generatePark(String[] park) {
        String[][] newPark = new String[park[0].length()][park.length];
        for (int i = 0; i < park.length; i++) {
            String[] obstacle = park[i].split("");
            for (int j = 0; j < obstacle.length; j++) {
                newPark[i][j] = obstacle[j];
            }
        }
        return newPark;
    }

}
