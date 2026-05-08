import java.util.Scanner;

// practice if else statement
// take some subject's marks from candidate and verify whether he is pass or
// fail and show his final percentage based on some of total marks he acquire in all subjects

// Input all subject marks.

// Check if any single subject mark is below the passing limit.

// If yes: Display "Fail."

// If no: Calculate the percentage using the formula above and display it.

public class ControlFlowIfElse {
    public static void main(String args[]) {
        int minPassingMarkInSubject = 35; // marks should be above 35
        int totalSubjects = 6;
        int maxPossibleMarks = totalSubjects * 100;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in Marathi");
        int marksInMarathi = sc.nextInt();

        System.out.println("Enter marks in English");
        int marksInEnglish = sc.nextInt();

        System.out.println("Enter marks in Biology");
        int marksInBiology = sc.nextInt();

        System.out.println("Enter marks in Chemistry");
        int marksInChemistry = sc.nextInt();

        System.out.println("Enter marks in Physics");
        int marksInPhysics = sc.nextInt();

        System.out.println("Enter marks in Maths");
        int marksInMaths = sc.nextInt();

        if (marksInMarathi < minPassingMarkInSubject || marksInEnglish < minPassingMarkInSubject
                || marksInBiology < minPassingMarkInSubject ||
                marksInChemistry < minPassingMarkInSubject || marksInPhysics < minPassingMarkInSubject
                || marksInMaths < minPassingMarkInSubject) {
            System.out.println("\nStatus: Fail");
            System.out.println("Reason: You scored below " + minPassingMarkInSubject + " in one or more subjects.");
            System.out.println("Try again next year!");
        } else {
            // 2. Calculation logic (only if passed all subjects)
            int totalObtained = marksInMarathi + marksInEnglish + marksInBiology + marksInChemistry + marksInPhysics
                    + marksInMaths;

            // We use 600.0f (float) to prevent integer division error
            float percentage = (totalObtained / (float) maxPossibleMarks) * 100;

            System.out.println("\n--- Result ---");
            System.out.println("Total Marks Obtained: " + totalObtained + " / " + maxPossibleMarks);
            System.out.printf("Final Percentage: %.2f%%\n", percentage);
            System.out.println("Congratulations! You have passed the examination.");
        }

        sc.close();
    }

}

// corrections by gemini
// import java.util.Scanner;

// public class ControlFlowIfElse {
// public static void main(String args[]) {
// // Constants for passing logic
// int minPassingMarkInSubject = 35;
// int totalSubjects = 6;
// int maxPossibleMarks = totalSubjects * 100; // 600 total

// Scanner sc = new Scanner(System.in);

// // Input subject marks
// System.out.println("Enter marks in Marathi:");
// int marathi = sc.nextInt();

// System.out.println("Enter marks in English:");
// int english = sc.nextInt();

// System.out.println("Enter marks in Biology:");
// int biology = sc.nextInt();

// System.out.println("Enter marks in Chemistry:");
// int chemistry = sc.nextInt();

// System.out.println("Enter marks in Physics:");
// int physics = sc.nextInt();

// System.out.println("Enter marks in Maths:");
// int maths = sc.nextInt();

// // 1. Logic to check if failed in any single subject
// if (marathi < minPassingMarkInSubject || english < minPassingMarkInSubject ||
// biology < minPassingMarkInSubject || chemistry < minPassingMarkInSubject ||
// physics < minPassingMarkInSubject || maths < minPassingMarkInSubject) {

// System.out.println("\nStatus: Fail 😢");
// System.out.println("Reason: You scored below " + minPassingMarkInSubject + "
// in one or more subjects.");
// System.out.println("Try again next year!");

// } else {
// // 2. Calculation logic (only if passed all subjects)
// int totalObtained = marathi + english + biology + chemistry + physics +
// maths;

// // We use 600.0f (float) to prevent integer division error
// float percentage = (totalObtained / (float) maxPossibleMarks) * 100;

// System.out.println("\n--- Result ---");
// System.out.println("Total Marks Obtained: " + totalObtained + " / " +
// maxPossibleMarks);
// System.out.printf("Final Percentage: %.2f%%\n", percentage);
// System.out.println("Congratulations! You have passed the examination.");
// }

// sc.close();
// }
// }