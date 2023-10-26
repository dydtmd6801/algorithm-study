package solution04;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        return answer;
    }

    public String[][] generateDesktop(String[] wallpaper) {
        String[][] desktop = new String[wallpaper.length][wallpaper[0].length()];
        for (int i = 0; i < wallpaper.length; i++) {
            String[] row = wallpaper[i].split("");
            for (int j = 0; j < wallpaper[i].length(); j++) {
                desktop[i][j] = row[i];
            }
        }
        return desktop;
    }

    public List<int[]> findFile(String[][] desktop) {
        List<int[]> fileCoordinates = new ArrayList<>();
        for (int i = 0; i < desktop.length; i++) {
            for (int j = 0; j < desktop[i].length; j++) {
                if (desktop[i][j].equals("#")) {
                    int[] fileCoordinate = {i, j};
                    fileCoordinates.add(fileCoordinate);
                }
            }
        }
        return fileCoordinates;
    }

}