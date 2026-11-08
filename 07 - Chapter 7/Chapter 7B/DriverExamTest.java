//Victoria Buckner
//CS 314 01
//Chapter 7B
//This program will ask the user to input the answers to the
//drivers test then it will display the number of answers
//correct and incorrect, the grade percentage, if they passed
//or failed, and which questions they missed. 

import java.util.Scanner;

public class DriverExamTest {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        char[] answers = new char[20];

        System.out.println("Enter the student's answers (A, B, C, or D): ");

        for (int i = 0; i < answers.length; i++){
            System.out.print("Question " + (i + 1) + ": ");
            String input = keyboard.nextLine().trim().toUpperCase();

            if (input.length() > 0)
            { answers[i] = input.charAt(0); }
            else
            { answers[i] = ' '; }
        }

        DriverExam exam = new DriverExam(answers);

        int correct = exam.totalCorrect();
        int incorrect = exam.totalIncorrect();
        double percentage = correct * 100.00 / 20;
        boolean passed = exam.passed();
        int[] missed = exam.questionsMissed();

        System.out.println("Exam Results: ");
        System.out.println("Correct Answers: " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.printf("Percentage: %.2f%%\n", + percentage);
        if (passed)
        { System.out.println("Result: Passed"); }
        else
        { System.out.println("Result: Failed"); }
        
        if (missed.length > 0){
            System.out.print("Questions Missed: ");
            for (int i = 0; i < missed.length; i++){
                System.out.print(missed[i]);
                if (i != missed.length - 1)
                { System.out.print(", "); }
            }
            System.out.println();
        }
    }
}

