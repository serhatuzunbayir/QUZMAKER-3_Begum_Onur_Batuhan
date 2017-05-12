import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Necessary class for creating quiz maker
// Exam has questions
public class Exam {
	private int ID;
	private String name;
	private ArrayList<Question> questions = new ArrayList<>();
	private ArrayList<Question> myPaper = new ArrayList<>();
	private ArrayList<String> myAnswers= new ArrayList<>();
	private ArrayList<Integer> questionOrder= new ArrayList<>();
	public static ArrayList<Double> grades= new ArrayList<>();

	Exam() {
		ID = 0;
		name = "no name";
	}

	Exam(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Question getQuestion(int index) {
		return questions.get(index);
	}

	public void setQuestion(Question question) {
		questions.add(question);
	}

	public ArrayList<Question> getPaper() {
		return myPaper;
	}

	public void setPaper(ArrayList<Question> q) {
		for (int i = 0; i < q.size(); i++)
			myPaper.add(q.get(i));
	}

	public ArrayList<Integer> getQuestionOrder() {
		return questionOrder;
	}

	public void setQuestionOrder(ArrayList<Integer> questionOrder) {
		this.questionOrder = questionOrder;
	}
	

	public ArrayList<String> getMyAnswers() {
		return myAnswers;
	}

	public void setMyAnswers(ArrayList<String> myAnswers) {
		this.myAnswers = myAnswers;
	}

	// prepareExam method sets myPaper with the questions
	public void prepareExam(int numberOfquestions) {
		
		for (int i = 0; i < numberOfquestions; i++) {
			questionOrder.add(0);
		}


		// Shuffle the questions for each of every exam paper
		Random rand = new Random();
		int i = 0;
		while (i < numberOfquestions) {
			int n = rand.nextInt(numberOfquestions) + 0;
			for (i = 0; i < numberOfquestions; i++) {
				if (n != questionOrder.get(i)) {
					questionOrder.add(n);
					myPaper.add(questions.get(i));
				}
			}
		}
	}

	// It displays the paper
	public void displayExam(int numberOfquestions) {
		for (int k = 0; k < numberOfquestions; k++) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.print((k + 1) + ") ");
			System.out.println(myPaper.get(k).getName());
			System.out.println("-------------------------------------------------------------------------");
			for (int i = 0; i < 4; i++) {
				char alpha[] = "ABCD".toCharArray();
				System.out.print(alpha[i] + ") ");
				System.out.println(myPaper.get(k).getAnswers(i).getAnswer());
			}
		}
	}

	// Grade the paper and print out the result
	public void gradeExam(int numberOfquestions) {
		double total = 0;
		double correct = 100 / numberOfquestions;
		for (int k = 0; k < numberOfquestions; k++) {
			System.out.println("--------------------------");
			if (myAnswers.get(k).equals(questions.get(questionOrder.get(k)).getCorrect())) {
				System.out.println("Q" + (k + 1) + ". CORRECT +" + correct);
				total += correct;
			} else {
				System.out.println("Q" + (k + 1) + ". FALSE -0-");
			}
		}

		if (total < 0)
			total = 0;

		System.out.println("__________________________");
		System.out.println(getName() + ",your grade is: " + total);
		grades.add(total);
	}

	// Users can solve their paper with this method
	public void solveExam(int numberOfquestions) {
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("START TO SOLVE YOUR PAPER:");
		for (int i = 0; i < numberOfquestions; i++) {
			System.out.println((i + 1) + ". question: ");
			String answer = input.next();
			myAnswers.add(answer);
		}
		input.close();
		System.out.println("EXAM IS OVER !");
	}

}
