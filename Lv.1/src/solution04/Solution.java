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
                desktop[i][j] = row[j];
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

    public int[] findMinMax(List<int[]> fileCoordinates) {
        int[] coordinate = fileCoordinates.get(0);
        DragCoordinate drag = new DragCoordinate(coordinate[0], coordinate[0], coordinate[1], coordinate[1]);
        for (int i = 1; i < fileCoordinates.size(); i++) {
            coordinate = fileCoordinates.get(i);
            int left = coordinate[0];
            int right = coordinate[1];
            if (drag.getLeftMin() > left) {
                drag.setLeftMin(left);
            }
            if (drag.getLeftMax() < left) {
                drag.setLeftMax(left);
            }
            if (drag.getRightMin() > right) {
                drag.setRightMin(right);
            }
            if (drag.getRightMax() < right) {
                drag.setRightMax(right);
            }
        }
        return new int[]{drag.getLeftMin(), drag.getRightMin(), drag.getLeftMax() + 1, drag.getRightMax() + 1};
    }
}

class DragCoordinate {

    private int leftMin;
    private int leftMax;
    private int rightMin;
    private int rightMax;

    public DragCoordinate(int leftMin, int leftMax, int rightMin, int rightMax) {
        this.leftMin = leftMin;
        this.leftMax = leftMax;
        this.rightMin = rightMin;
        this.rightMax = rightMax;
    }

    public int getLeftMin() {
        return leftMin;
    }

    public void setLeftMin(int leftMin) {
        this.leftMin = leftMin;
    }

    public int getLeftMax() {
        return leftMax;
    }

    public void setLeftMax(int leftMax) {
        this.leftMax = leftMax;
    }

    public int getRightMin() {
        return rightMin;
    }

    public void setRightMin(int rightMin) {
        this.rightMin = rightMin;
    }

    public int getRightMax() {
        return rightMax;
    }

    public void setRightMax(int rightMax) {
        this.rightMax = rightMax;
    }
}