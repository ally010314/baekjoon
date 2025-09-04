import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class N25206 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        }

        List<Float> hours = new ArrayList<>();
        List<Float> scores = new ArrayList<>();

        for (String str : lines) {
            String[] strings = str.split(" ");

            if (strings.length >= 3) {
                hours.add(Float.parseFloat(strings[1]));

                float scorePoint = 0.0F;

                switch (strings[2]) {
                    case "A+":
                        scorePoint = 4.5F;
                        break;
                    case "A0":
                        scorePoint = 4.0F;
                        break;
                    case "B+":
                        scorePoint = 3.5F;
                        break;
                    case "B0":
                        scorePoint = 3.0F;
                        break;
                    case "C+":
                        scorePoint = 2.5F;
                        break;
                    case "C0":
                        scorePoint = 2.0F;
                        break;
                    case "D+":
                        scorePoint = 1.5F;
                        break;
                    case "D0":
                        scorePoint = 1.0F;
                        break;
                    case "F":
                        scorePoint = 0.0F;
                        break;
                    default:
                        hours.remove(hours.size() - 1);
                        break;
                }

                if (!strings[2].equals("P")) {
                    scores.add(scorePoint);
                }
            }
        }

        Float averageScore;
        Float totalHours = 0F;
        Float totalScores = 0F;

        for (int i = 0; i < hours.size(); i++) {

            totalHours += hours.get(i);
            totalScores += scores.get(i) * hours.get(i);
        }

        averageScore = totalScores / totalHours;

        System.out.println(averageScore);
    }


}
