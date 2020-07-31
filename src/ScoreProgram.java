/*
 * Calculate sum, average, min, and max from an array of scores, and aggregate letter grades
 * Written by Joshua Revels
 */

import javax.swing.JOptionPane;

public class ScoreProgram {

    //declare letter grade variables
    public static int gradeA = 0;
    public static int gradeB = 0;
    public static int gradeC = 0;
    public static int gradeD = 0;
    public static int gradeF = 0;

    public static void main(String[] args) {
        // define array, sum, largest, and smallest variables
        String response = JOptionPane.showInputDialog(null, "Number of Scores:");
        int number = Integer.parseInt(response);
        int scores[] = new int[number];
        //for loop to get the scores from the user and save them into the scores array
        for (int a = 0; a < number; a++) {
            response = JOptionPane.showInputDialog(null, "Enter score" + (a + 1));
            scores[a] = Integer.parseInt(response);
        }
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        //for loop to find sum, largest and smallest
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            if (scores[i] > largest) {
                largest = scores[i];
            }
            if (scores[i] < smallest) {
                smallest = scores[i];
            }
        }
        //run procedural determineGrade method
        determineGrade(scores);
        //output
        JOptionPane.showMessageDialog(null, "The sum is " + sum
                + "\nThe average is " + sum / scores.length
                + "\nThe largest score is " + largest
                + "\nThe smallest score is " + smallest
                + "\nThe number of students with scores of 90-100 (A) is "
                + gradeA
                + "\nThe number of students with scores of 80-89 (B) is "
                + gradeB
                + "\nThe number of students with scores of 79-70 (C) is "
                + gradeC
                + "\nThe number of students with scores of 69-60 (D) is "
                + gradeD
                + "\nThe number of students with scores below 60 (F) is "
                + gradeF);
    }

    public static void determineGrade(int[] scores) {
        //declare variables
        int x, y;
        //conditional statement to calculate letter grade
        for (x = 0; x < scores.length; x++) {
            y = scores[x];
            if (y <= 100 && y >= 90) {
                gradeA++;
            } else if (y <= 89 && y >= 80) {
                gradeB++;
            } else if (y <= 79 && y >= 70) {
                gradeC++;
            } else if (y <= 69 && y >= 60) {
                gradeD++;
            } else if (y <= 59) {
                gradeF++;
            }

        }
    }
}