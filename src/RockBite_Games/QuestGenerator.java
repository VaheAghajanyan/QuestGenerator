package RockBite_Games;

import java.util.List;

public class QuestGenerator {
    public static String generateQuests(int N) {
        StringBuilder firstPart = new StringBuilder(N / 2);
        StringBuilder secondPart = new StringBuilder(N - (N / 2));
        List<Integer> segments = determineSegments(N);
        int midPoint = N / 2;
        int countOfB = 0;
        int countOfS = 0;
        int index = 0;
        int endIndex = 0;

        for (int i = 0; i < segments.size(); i++) {
            endIndex = midPoint / (segments.size() - i);
            while (percentageOfB(countOfB, endIndex) < segments.get(i)) {
                firstPart.append("b");
                countOfB++;
                index++;
            }
            while (index < endIndex) {
                firstPart.append("s");
                index++;
            }
        }

        index = 0;
        for (int i = 0; i < segments.size(); i++) {
            endIndex = (N - midPoint) / (segments.size() - i);
            while (percentageOfS(countOfS, endIndex) < segments.get(i)) {
                secondPart.append("s");
                countOfS++;
                index++;
            }

            while (index < endIndex) {
                secondPart.append("b");
                index++;
            }
        }

        return firstPart.append(secondPart.reverse()).toString();
    }

    private static List<Integer> determineSegments(int N) {
        if (N < 12) {
            return List.of(60);
        } else if (N < 50){
            return List.of(60, 40);
        } else if (N < 100){
            return List.of(60, 40, 30);
        } else if (N < 500) {
            return List.of(70, 50, 30, 20);
        } else if (N < 2000){
            return List.of(75, 55, 35, 25, 15);
        } else {
            return List.of(85, 75, 55, 45, 35, 25);
        }
    }

    private static double percentageOfB(int countOfB, int length) {
        return ((double) countOfB / length) * 100;
    }

    private static double percentageOfS(int countOfC, int length) {
        return ((double) countOfC / length) * 100;
    }
}