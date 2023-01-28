import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> correctAnswerLevel1 = new HashMap<>();
        ArrayList<String> level1UserAnswers = new ArrayList<>();
        ArrayList<String> level2UserAnswers = new ArrayList<>();
        ArrayList<String> level3UserAnswers = new ArrayList<>();

        Integer counterCorrectAttemp = 0;
        Integer currentLevelScore = 0;
        Integer globalScore = 0;

//        set correct answers level 1
        correctAnswerLevel1.put("tie", 40);
        correctAnswerLevel1.put("die", 40);
        correctAnswerLevel1.put("dude", 10);

        String isUserWantToRetry = "Y";

        while (isUserWantToRetry.equals("Y")) {
            globalScore = 0;
            boolean isLevel1Pass = false;
            boolean isLevel2Pass = false;

            //level 1
            // currentLevelScore > 70 = exit ke level selanjutnya
            // counterAttemp == 10 = exit program
            level1UserAnswers.clear();
            counterCorrectAttemp = 0;
            for (int i = 0; i < 3; i++) {
                // user dimintain inputan
                Scanner input = new Scanner(System.in);
                String inputanUser = input.nextLine().toLowerCase(Locale.ROOT);

                // validasi apakah jawaban user >=3 && <=6
                if (validateLengthAnswers(inputanUser)) {
                    // validasi apakah jawaban user ada di jawaban yang benar & belum pernah di input sebelumnya
                    if (correctAnswerLevel1.get(inputanUser) != null && !level1UserAnswers.contains(inputanUser)) {
                        level1UserAnswers.add(inputanUser);
                        currentLevelScore += correctAnswerLevel1.get(inputanUser);
                        globalScore += correctAnswerLevel1.get(inputanUser);
                        System.out.println(correctAnswerLevel1.get(inputanUser));

                        counterCorrectAttemp++;
                    } else {
                        if (!level1UserAnswers.contains(inputanUser)) {
                            level1UserAnswers.add(inputanUser);
                        }
                    }
                } else {
                    level1UserAnswers.add(inputanUser);
                }
            }

            // print semua score
            System.out.print("Level 1 berhasil =>" + level1UserAnswers);

            // bisa ke level selanjutnya atau engga

            if (currentLevelScore <= 70) {
                System.out.print("Anda ingin mengulang [y/t] ");
                Scanner wantToRetryScanner = new Scanner(System.in);
                isUserWantToRetry = wantToRetryScanner.nextLine().toUpperCase(Locale.ROOT);
            } else {
                if (currentLevelScore >= 70) {
                    isLevel1Pass = true;
                }
            }


            // validasi level 2
            if (isLevel1Pass) {
                currentLevelScore = 0;
                level2UserAnswers.clear();
                counterCorrectAttemp = 0;

                System.out.print("Eksekusi Level 2 =>");
                //for nya disini

                if (currentLevelScore >= 70) {
                    //print hasilnya disini
                    // kasih tau counterCorrectAttemp dan currentLevelScore
                    isLevel2Pass = true;
                } else {
                    System.out.print("Anda ingin mengulang [y/t] ");
                    Scanner wantToRetryScanner = new Scanner(System.in);
                    isUserWantToRetry = wantToRetryScanner.nextLine().toUpperCase(Locale.ROOT);
                }
            }


            // validasi level 3
            if (isLevel2Pass) {
                currentLevelScore = 0;
                level3UserAnswers.clear();
                counterCorrectAttemp = 0;

                System.out.print("Eksekusi Level 3 =>");
                //for nya disini

                if (currentLevelScore <= 70) {
                    System.out.print("Anda ingin mengulang [y/t] ");
                    Scanner wantToRetryScanner = new Scanner(System.in);
                    isUserWantToRetry = wantToRetryScanner.nextLine().toUpperCase(Locale.ROOT);
                } else {
                    // print semua hasil dari level 1 - 3
                    // print globalScore

                    return;
                }
            }
        }
    }

    static boolean validateLengthAnswers(String keyword) {
        return keyword.length() >= 3 && keyword.length() <= 26;
    }
}