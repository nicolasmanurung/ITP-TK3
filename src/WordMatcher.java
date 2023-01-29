import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class WordMatcher {
    private HashMap<String, Integer> correctAnswerLevel = new HashMap<>();
    private ArrayList<String> userAnswers = new ArrayList<>();
    private String tempUserAnswers = "";

    private Integer currentLevelScore = 0;

    private Integer counterCorrectAttemp = 0;

    public void setCorrectAnswer(HashMap<String, Integer> correctAnswer) {
        this.correctAnswerLevel = correctAnswer;
    }

    private boolean validateLengthAnswers(String keyword) {
        return keyword.length() >= 3 && keyword.length() <= 26;
    }

    public Integer getCurrentLevelScore() {
        return this.currentLevelScore;
    }

    public Integer getCounterCorrectAttemp() {
        return this.counterCorrectAttemp;
    }

    public boolean isThisLevelPass() {
        return currentLevelScore >= 70;
    }

    public void operateLevel() {
        for (int i = 1; i <= 10; i++) {
            // user dimintain inputan
            System.out.print(String.format("%d> Your Answer : ", i));

            Scanner input = new Scanner(System.in);
            String inputanUser = input.nextLine().toLowerCase(Locale.ROOT);

            // validasi apakah jawaban user >=3 && <=6
            if (validateLengthAnswers(inputanUser)) {
                // validasi apakah jawaban user ada di jawaban yang benar & belum pernah di input sebelumnya
                if (correctAnswerLevel.get(inputanUser) != null && !userAnswers.contains(inputanUser)) {
                    userAnswers.add(inputanUser);
                    currentLevelScore += correctAnswerLevel.get(inputanUser);
                    counterCorrectAttemp++;

                    System.out.println("#Right. Score :" + currentLevelScore);
                } else {
                    if (!userAnswers.contains(inputanUser)) {
                        userAnswers.add(inputanUser);
                    } else {
                        System.out.println("You had already type this word before..");
                    }
                }
            } else {
                userAnswers.add(inputanUser);
            }
        }
    }


}
