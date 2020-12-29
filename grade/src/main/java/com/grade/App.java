package com.grade;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static char letterGrade(int score) {
        char grade;
        if (score < 0 || score > 100)
            grade = 'X';
        else if (score >= 90 && score <= 100)
            grade = 'A';
        else if (score >= 80 && score < 90)
            grade = 'B';
        else if (score >= 70 && score < 80)
            grade = 'C';
        else if (score >= 60 && score < 70)
            grade = 'D';
        else
            grade = 'F';
        return grade;
    }
}
