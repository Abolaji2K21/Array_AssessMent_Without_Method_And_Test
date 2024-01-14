import java.util.Scanner;
import java.util.Arrays;

public class StudentScores{

	private static int numOfStudent;
	private static int numOfSubject;
	private static double total;
	private static double average;
	private static int easiestSubject;
	private static int hardestSubject;
	private static int passes;
	private static int failures;
	private static double classTotalScore;
	private static double bestGraduatingScore;
	private static int bestGraduatingStudentIndex;
 	private static int worstGraduatingStudentIndex;
	private static int overallHighestStudentIndex;
	private static int overallHighestSubjectIndex;
	private static int overallLowestStudentIndex;
	private static int overallLowestSubjectIndex;

	private static double[][] studentScores;
	private static Scanner input = new Scanner(System.in);


			public static void main(String args[]){
		System.out.println(" How Many Student Do You Have?" );
		numOfStudent = input.nextInt();	
	 	System.out.println();
		
		System.out.println(" How Many Subject Do They Offer?" );
		numOfSubject = input.nextInt();	
	 	System.out.println();

		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
		System.out.println("Saved Successfully" );
	 	System.out.println();
		
		studentScores(input);
		getFirstDisplay();
		getSecondDisplay();
		getThirdDisplay();

			}
	private static void studentScores(Scanner input){
	studentScores = new double [numOfStudent][numOfSubject];

		for(int count = 0; count < numOfStudent; count++){
		System.out.println("Entering Scores for Student" + (count + 1) + ":");

		       for(int counter = 0; counter < numOfSubject; counter ++){
				while(true){		
		System.out.println("Enter Scores for Subject" + (counter + 1) + ":");
                    studentScores[count][counter] = input.nextDouble();
     if (studentScores[count][counter] >= 0 && studentScores[count][counter] <= 100) {
		    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
		    System.out.println("Saved Successfully" );
	 	    System.out.println();
	break;

					} else {
	System.out.println("Enter A Valid Ranging From 0 - 100");
	 	    System.out.println();
					}


				}
			}
		}

	}


private static double calculateTotal(double[] scores) {
    double total = 0;
    for (double score : scores) {
        total += score;
    }
    return total;
}


private static void getFirstDisplay() {
    System.out.println("==============================================================");
    System.out.printf("%-10s", "STUDENT");

    for (int vertical = 0; vertical < numOfSubject; vertical++) {
        System.out.printf("%-10s", "SUB" + (vertical + 1));
    }
    System.out.printf("%-10s%-10s%-10s", "TOT", "AVE", "POS");

    System.out.println();
    System.out.println("==============================================================");

    int[] positions = new int[numOfStudent];

    for (int index = 0; index < numOfStudent; index++) {
        int currentStudentPosition = 1;

        for (int position = 0; position < numOfStudent; position++) {
            double totalScorePosition = calculateTotal(studentScores[position]);
            double totalScoreIndex = calculateTotal(studentScores[index]);

            if (totalScorePosition > totalScoreIndex) {
                currentStudentPosition++;
            }
        }

        positions[index] = currentStudentPosition;

        System.out.printf("%-10s", "Student" + (index + 1));

        total = 0;
        for (int vertical = 0; vertical < numOfSubject; vertical++) {
            System.out.printf("%-10.1f", studentScores[index][vertical]);
            total += studentScores[index][vertical];
        }

        average = total / numOfSubject;

        System.out.printf("%-10.1f%-10.1f%-10d", total, average, positions[index]);
        System.out.println();
    }

    System.out.println("==============================================================");
}

	
private static void getSecondDisplay() {
    System.out.println("SUBJECT SUMMARY");
        System.out.println();

    for (int subjectIndex = 0; subjectIndex < numOfSubject; subjectIndex++) {
        System.out.printf("%-10s", "Subject" + (subjectIndex + 1));
        System.out.println();

        double maxScore = studentScores[0][subjectIndex];
        double minScore = studentScores[0][subjectIndex];
        double totalScore = 0;

        int highestScorerIndex = 0;
        int lowestScorerIndex = 0; 

        passes = 0;
        failures = 0;

        for (int studentIndex = 0; studentIndex < numOfStudent; studentIndex++) {
            double currentScore = studentScores[studentIndex][subjectIndex];

            if (currentScore > maxScore) {
                maxScore = currentScore;
                highestScorerIndex = studentIndex;
            }

            if (currentScore < minScore) {
                minScore = currentScore;
                lowestScorerIndex = studentIndex;
            }

            totalScore += currentScore;

            if (currentScore >= 50) {
                passes = passes + 1;
            } else {
                failures = failures + 1;
            }
        }

        double averageScore = totalScore / numOfStudent;

        System.out.println("Highest Scoring Student Is: Student " + (highestScorerIndex + 1) + " scoring " + maxScore);
        System.out.println();
        System.out.println("Lowest Scoring Student Is: Student " + (lowestScorerIndex + 1) + " scoring " + minScore);
        System.out.println();
        System.out.println("Total Score is : " + totalScore);
        System.out.println();
        System.out.println("Average Score is : " + averageScore);
        System.out.println();
        System.out.println("Number Of Passes : " + passes);
        System.out.println();
        System.out.println("Number Of Fails : " + failures);
        System.out.println();
        System.out.println();
    }
}

	private static void getThirdDisplay(){
	
	easiestSubject = 0;
	hardestSubject = 0;
	overallHighestStudentIndex = 0;
	overallHighestSubjectIndex = 0;
	overallLowestStudentIndex = 0;
	overallLowestSubjectIndex = 0;
	bestGraduatingStudentIndex = 0;
 	worstGraduatingStudentIndex = 0;
	classTotalScore = 0;
	bestGraduatingScore = 0;
	
	
	double easiestSubjectAve = studentScores[0][0];
	double hardestSubjectAve = studentScores[0][0];
    	double overallHighestScore = studentScores[0][0];
    	double overallLowestScore = studentScores[0][0];
    	double worstGraduatingScore = studentScores[0][0];

	for (int checkSubject = 0; checkSubject < numOfSubject; checkSubject++) {
        double subjectTotalScore = 0;
        int passes = 0;
        int failures = 0;

        for (int checkStudent = 0; checkStudent < numOfStudent; checkStudent++) {
            double currentScore = studentScores[checkStudent][checkSubject];

            if (checkStudent == 0) {
                easiestSubjectAve = currentScore;
                hardestSubjectAve = currentScore;
            } else {
                easiestSubjectAve = Math.min(easiestSubjectAve, currentScore);
                hardestSubjectAve = Math.max(hardestSubjectAve, currentScore);
            }

            if (currentScore > overallHighestScore) {
                overallHighestScore = currentScore;
                overallHighestStudentIndex = checkStudent;
                overallHighestSubjectIndex = checkSubject;
            }

            if (currentScore < overallLowestScore) {
                overallLowestScore = currentScore;
                overallLowestStudentIndex = checkStudent;
                overallLowestSubjectIndex = checkSubject;
            }

            subjectTotalScore += currentScore;

            if (currentScore >= 50) {
                passes++;
            } else {
                failures++;
            }
        }

        classTotalScore += subjectTotalScore;

        if (subjectTotalScore > bestGraduatingScore) {
            bestGraduatingScore = subjectTotalScore;
            bestGraduatingStudentIndex = checkSubject;
        } else if (subjectTotalScore < worstGraduatingScore) {
            worstGraduatingScore = subjectTotalScore;
            worstGraduatingStudentIndex = checkSubject;
        }

        if (easiestSubjectAve < easiestSubjectAve) {
            easiestSubjectAve = easiestSubjectAve;
            easiestSubject = checkSubject;
        }

        if (hardestSubjectAve > hardestSubjectAve) {
            hardestSubjectAve = hardestSubjectAve;
            hardestSubject = checkSubject;
        }

      
    }

    double classAverageScore = classTotalScore / numOfStudent;

    System.out.println();
    System.out.println("===========================================");
    System.out.println("The hardest subject is Subject " + (hardestSubject + 1) + " with " + failures + " failures" );
    System.out.println("The easiest subject is Subject " + (easiestSubject + 1) + " with " + passes + " passes" );
    System.out.println("The overall Highest score is scored by Student " + (overallHighestStudentIndex + 1) + " in subject " + (overallHighestSubjectIndex + 1) + " scoring " + overallHighestScore);
    System.out.println("The overall Lowest score is scored by Student " + (overallLowestStudentIndex + 1) + " in subject " + (overallLowestSubjectIndex + 1) + " scoring " + overallLowestScore);
    System.out.println();


    System.out.println("===========================================");
    System.out.println("CLASS SUMMARY");
    System.out.println("===========================================");
    System.out.println();


    System.out.println("===========================================");
    System.out.println("Best Graduating Student is: Student " + (bestGraduatingStudentIndex + 1) + " scoring " + bestGraduatingScore);
    System.out.println("===========================================");
    System.out.println();


    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    System.out.println("Worst Graduating Student is: Student " + (worstGraduatingStudentIndex + 1) + " scoring " + worstGraduatingScore);
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    System.out.println();


    System.out.println("===========================================");
    System.out.println();
    System.out.println("Class total score is: " + classTotalScore);
    System.out.printf("Class Average score is:%.2f", classAverageScore);
    System.out.println();
    System.out.println("===========================================");
	}
}


