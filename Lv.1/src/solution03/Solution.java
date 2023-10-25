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
        int positionX = current[0];
        int positionY = current[1];
        String direction = route[0];
        int distance = Integer.parseInt(route[1]);
        switch (direction) {
            case "E":
                positionY += distance;
                break;
            case "W":
                positionY -= distance;
                break;
            case "N":
                positionX -= distance;
                break;
            case "S":
                positionX += distance;
                break;
            default:
                break;
        }
        current[0] = positionX;
        current[1] = positionY;
        return current;
    }

    public boolean isMove(String[][] park, String routes, int[] current) {
        String[] route = routes.split(" ");
        String direction = route[0];
        int distance = Integer.parseInt(route[1]);
        int parkWidth = park[0].length;
        int parkHeight = park.length;
        int positionX = current[0];
        int positionY = current[1];
        switch (direction) {
            case "E":
                if (positionX + distance > parkWidth) {
                    return false;
                }
                for (int i = positionX; i <= positionX + distance; i++) {
                    if (park[positionX][i].equals("X")) {
                        return false;
                    }
                }
                break;
            case "W":
                if (positionX - distance < 0) {
                    return false;
                }
                for (int i = positionX; i >= 0; i--) {
                    if (park[positionX][i].equals("X")) {
                        return false;
                    }
                }
                break;
            case "N":
                if (positionY - distance < 0) {
                    return false;
                }
                for (int i = positionY; i >= 0; i--) {
                    if (park[i][positionY].equals("X")) {
                        return false;
                    }
                }
                break;
            case "S":
                if (positionY + distance < parkHeight) {
                    return false;
                }
                for (int i = positionY; i <= positionY + distance; i++) {
                    if (park[i][positionY].equals("X")) {
                        return false;
                    }
                }
                break;
            default:
                return false;
        }
        return true;
    }

    public int[] currentLocation(String[][] park) {
        int[] current = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if (park[i][j].equals("S")) {
                    current[0] = i;
                    current[1] = j;
                }
            }
        }
        return current;
    }

}
