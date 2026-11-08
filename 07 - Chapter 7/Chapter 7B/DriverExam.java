public class DriverExam {
    private final char[] correctAnswers = {
        'B', 'D', 'A', 'A', 'C',
        'A', 'B', 'A', 'C', 'D',
        'B', 'C', 'D', 'A', 'D',
        'C', 'C', 'B', 'D', 'A'
    };

    private char[] studentAnswers;

    public DriverExam(char[] studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public boolean passed() {
        return totalCorrect() >= 15;
    }

    public int totalCorrect() {
        int correct = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] == correctAnswers[i]) {
                correct++;
            }
        }
        return correct;
    }

    public int totalIncorrect() {
        return correctAnswers.length - totalCorrect();
    }

    public int[] questionsMissed() {
        int[] temp = new int[correctAnswers.length];
        int missedCount = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] != correctAnswers[i]) {
                temp[missedCount++] = i + 1;
            }
        }

        int[] missed = new int[missedCount];
        System.arraycopy(temp, 0, missed, 0, missedCount);
        return missed;
    }
}
