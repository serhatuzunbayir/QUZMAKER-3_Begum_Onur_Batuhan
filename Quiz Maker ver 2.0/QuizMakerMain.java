public class QuizMakerMain {
	// Test class for making operations
	public static void main(String[] args) {
		
		//Creating exam object with the example questions in the example class
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());
		exam1.prepareExam();
		exam1.displayExam();
		exam1.solveExam();
		exam1.gradeExam();
		
	}
	
}


