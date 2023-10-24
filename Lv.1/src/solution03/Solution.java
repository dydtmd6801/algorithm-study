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

    public int[] move(String routes, int[] current) {
        String[] route = routes.split(" ");
        if (route[0].equals("E")) {
            current[1] = current[1] + Integer.parseInt(route[1]);
        }
        if (route[0].equals("W")) {
            current[1] = current[1] - Integer.parseInt(route[1]);
        }
        if (route[0].equals("N")) {
            current[0] = current[0] + Integer.parseInt(route[1]);
        }
        if (route[0].equals("S")) {
            current[0] = current[0] - Integer.parseInt(route[1]);
        }
        return current;
    }

}
