import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String isUserWantToRetry = "Y";
        Integer globalSumScore = 0;
        while (isUserWantToRetry.equals("Y")) {
            globalSumScore = 0;
            // Level 1
            WordMatcher firstLevel = new WordMatcher();
            firstLevel.setCorrectAnswer(getFirstLevelCorrectAnswers());
            System.out.print("Level 1\n");
            System.out.print("d     e       t       t       l       i\n");
            firstLevel.operateLevel();
            if (firstLevel.isThisLevelPass()) {
                globalSumScore += firstLevel.getCurrentLevelScore();
                System.out.printf("You had answered 10 times with %d right answers\n\n", firstLevel.getCounterCorrectAttemp());
            } else {
                System.out.print("You Lose!! Try Again..\n");
                System.out.print("Do you want to retry [y/t] ");
                Scanner wantToRetryScanner = new Scanner(System.in);
                isUserWantToRetry = wantToRetryScanner.nextLine().toUpperCase(Locale.ROOT);
            }

            // Level 2
            WordMatcher secondLevel = new WordMatcher();
            if (firstLevel.isThisLevelPass()) {
                secondLevel.setCorrectAnswer(getSecondLevelCorrectAnswers());
                System.out.print("Level 2\n");
                System.out.print("d     e       t       t       l       i\n");
                secondLevel.operateLevel();
                System.out.printf("You had answered 10 times with %d right answers\n\n", secondLevel.getCounterCorrectAttemp());
            }
            if (isUserWantToRetry.equals("Y") && firstLevel.isThisLevelPass() && !secondLevel.isThisLevelPass()) {
                System.out.print("You Lose!! Try Again..\n");
                System.out.print("Do you want to retry [y/t] ");
                Scanner wantToRetryScanner = new Scanner(System.in);
                isUserWantToRetry = wantToRetryScanner.nextLine().toUpperCase(Locale.ROOT);
            }


            //Level 3, idem
            WordMatcher thirdLevel = new WordMatcher();
            if (secondLevel.isThisLevelPass()) {
                globalSumScore += secondLevel.getCurrentLevelScore();
                thirdLevel.setCorrectAnswer(getThirdLevelCorrectAnswers());
                System.out.print("Level 3\n");
                System.out.print("d     e       t       t       l       i\n");
                thirdLevel.operateLevel();
                System.out.printf("You had answered 10 times with %d right answers\n\n", thirdLevel.getCounterCorrectAttemp());
            }
            if (!isUserWantToRetry.equals("Y") && firstLevel.isThisLevelPass() && secondLevel.isThisLevelPass() && !thirdLevel.isThisLevelPass()) {
                System.out.print("You Lose!! Try Again..\n");
                System.out.print("Do you want to retry [y/t] ");
                Scanner wantToRetryScanner = new Scanner(System.in);
                isUserWantToRetry = wantToRetryScanner.nextLine().toUpperCase(Locale.ROOT);
            }

            if (thirdLevel.isThisLevelPass()) {
                globalSumScore += thirdLevel.getCurrentLevelScore();
                System.out.print("Overall score : %d\n" + globalSumScore);
                System.out.print("You WIN!!");

                // set exit program
                isUserWantToRetry = "N";
            }
        }
    }

    private static HashMap<String, Integer> getFirstLevelCorrectAnswers() {
        HashMap<String, Integer> listCorrectAnswers = new HashMap<>();
        listCorrectAnswers.put("die", 10);
        listCorrectAnswers.put("led", 10);
        listCorrectAnswers.put("lei", 10);
        listCorrectAnswers.put("let", 10);
        listCorrectAnswers.put("lid", 10);
        listCorrectAnswers.put("lit", 10);
        listCorrectAnswers.put("tie", 10);
        listCorrectAnswers.put("deli", 10);
        listCorrectAnswers.put("diet", 10);
        listCorrectAnswers.put("edit", 10);
        listCorrectAnswers.put("idle", 10);
        listCorrectAnswers.put("lied", 10);
        listCorrectAnswers.put("tide", 10);
        listCorrectAnswers.put("tied", 10);
        listCorrectAnswers.put("tile", 10);
        listCorrectAnswers.put("tilt", 10);
        listCorrectAnswers.put("tilde", 10);
        listCorrectAnswers.put("tiled", 10);
        listCorrectAnswers.put("title", 10);
        listCorrectAnswers.put("tilted", 10);
        listCorrectAnswers.put("titled", 10);

        return listCorrectAnswers;
    }

    private static HashMap<String, Integer> getSecondLevelCorrectAnswers() {
        HashMap<String, Integer> listCorrectAnswers = new HashMap<>();
        listCorrectAnswers.put("die", 10);
        listCorrectAnswers.put("led", 10);
        listCorrectAnswers.put("lei", 10);
        listCorrectAnswers.put("let", 10);
        listCorrectAnswers.put("lid", 10);
        listCorrectAnswers.put("lit", 10);
        listCorrectAnswers.put("tie", 10);
        listCorrectAnswers.put("deli", 10);
        listCorrectAnswers.put("diet", 10);
        listCorrectAnswers.put("edit", 10);
        listCorrectAnswers.put("idle", 10);
        listCorrectAnswers.put("lied", 10);
        listCorrectAnswers.put("tide", 10);
        listCorrectAnswers.put("tied", 10);
        listCorrectAnswers.put("tile", 10);
        listCorrectAnswers.put("tilt", 10);
        listCorrectAnswers.put("tilde", 10);
        listCorrectAnswers.put("tiled", 10);
        listCorrectAnswers.put("title", 10);
        listCorrectAnswers.put("tilted", 10);
        listCorrectAnswers.put("titled", 10);

        return listCorrectAnswers;
    }

    private static HashMap<String, Integer> getThirdLevelCorrectAnswers() {
        HashMap<String, Integer> listCorrectAnswers = new HashMap<>();
        listCorrectAnswers.put("die", 10);
        listCorrectAnswers.put("led", 10);
        listCorrectAnswers.put("lei", 10);
        listCorrectAnswers.put("let", 10);
        listCorrectAnswers.put("lid", 10);
        listCorrectAnswers.put("lit", 10);
        listCorrectAnswers.put("tie", 10);
        listCorrectAnswers.put("deli", 10);
        listCorrectAnswers.put("diet", 10);
        listCorrectAnswers.put("edit", 10);
        listCorrectAnswers.put("idle", 10);
        listCorrectAnswers.put("lied", 10);
        listCorrectAnswers.put("tide", 10);
        listCorrectAnswers.put("tied", 10);
        listCorrectAnswers.put("tile", 10);
        listCorrectAnswers.put("tilt", 10);
        listCorrectAnswers.put("tilde", 10);
        listCorrectAnswers.put("tiled", 10);
        listCorrectAnswers.put("title", 10);
        listCorrectAnswers.put("tilted", 10);
        listCorrectAnswers.put("titled", 10);

        return listCorrectAnswers;
    }
}