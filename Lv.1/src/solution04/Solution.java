package solution04;

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
}