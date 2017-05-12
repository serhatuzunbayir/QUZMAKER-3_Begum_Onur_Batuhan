import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
	static int id = 0;
	String user = "admin";
	Scanner input = new Scanner(System.in);

	public void displayMenu() {
		System.out.println("QUIZ MAKER ver 3.0_______________");
		System.out.println("Enter your username");
		System.out.println(">> ");

		user = input.nextLine();
	
		int choice;
		do {
			
			System.out.println("-------- WELCOME ! -------- ");
			System.out.println(" (1)	Start Random Quiz");
			System.out.println(" (2)	Prepare Exam");
			System.out.println(" (3)	View Results");

			System.out.println("\n (0)	Exit		");
			System.out.println(">> ");
			
			
			choice= input.nextInt();
			
			
			switch (choice) {
			case 1:
				startRandomQuiz();
				break;
			case 2:
				prepareExam();
				break;
			case 3:
				viewResults();
				break;
			case 0:
				System.out.println("Thanks for using it !");
				System.out.println("QUIZ MAKER ver 3.0");
				break;
			}
			
		choice=0;

		} while (choice != 0);

	}

	public void startRandomQuiz() {
		Random randomNumber = new Random();
		Exam exam1 = new Exam(id + 1, user);
		for (int i = 0; i < 5; i++) {
			int rn = 0 + randomNumber.nextInt(19);
			exam1.setQuestion(Database.getQuestion(rn));
		}
		exam1.prepareExam(5);
		exam1.displayExam(5);
		exam1.solveExam(5);
		exam1.gradeExam(5);
	}

	public void prepareExam() {
		int numberOfQuestions;

		System.out.println("Please specify --->");
		System.out.println("Number of questions:  ");
		numberOfQuestions = input.nextInt();
		ArrayList<Integer> wantedQuestions = new ArrayList<>();

		System.out.println(" QCODE  QUESTIONS");
		Database.viewQuestions();
		System.out.println("Enter the QCODEs for the wanted questions --->");
		for (int i = 0; i < numberOfQuestions; i++) {
			System.out.println((i + 1) + "-> ");
			wantedQuestions.add(input.nextInt());
		}

		Exam exam2 = new Exam(id + 1, user);
		for (int i = 0; i < numberOfQuestions; i++) {
			exam2.setQuestion(Database.getQuestion(wantedQuestions.get(i)));
		}
		exam2.prepareExam(numberOfQuestions);
		exam2.displayExam(numberOfQuestions);
		exam2.solveExam(numberOfQuestions);
		exam2.gradeExam(numberOfQuestions);
	}

	public void viewResults() {
		System.out.println("Exam ID   Name       Grade");
		for (int i = 0; i < Exam.grades.size(); i++) {
			System.out.println(id+ "     " +user+ "       " + Exam.grades.get(i));
		}
	}

}
