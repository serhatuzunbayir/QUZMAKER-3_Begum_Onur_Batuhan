import java.util.Random;
import java.util.Scanner;
// Necessary class for creating quiz maker
// Exam has questions
public class Exam {
	private int ID;
	private String name;
	private Question[] questions;
	private Question[] myPaper;
	private String[] myAnswers;  
	private int[] questionOrder;

	Exam(){
		ID=0;
		name="no name";
	}
	Exam(int ID,String name,Question[] questions){
		this.ID=ID;
		this.name=name;
		this.questions=questions;
		questionOrder=new int[5];
		myPaper=new Question[5];
		myAnswers=new String[5];
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
	public Question[] getQuestions() {
		return questions;
	}
	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}
	public Question[] getPaper(){
		return myPaper;
	}
	public void setPaper(Question[] q){
		myPaper=q;
	}
	public int[] getQuestionOrder() {
		return questionOrder;
	}
	public void setQuestionOrder(int[] questionOrder) {
		this.questionOrder = questionOrder;
	}
	public String[] getMyAnswers() {
		return myAnswers;
	}
	public void setMyAnswers(String[] myAnswers) {
		this.myAnswers = myAnswers;
	}
	
	// prepareExam method sets myPaper with the questions
	public void prepareExam(){
		
		questionOrder[0]=9;
		questionOrder[1]=9;
		questionOrder[2]=9;
		questionOrder[3]=9;
		questionOrder[4]=9;
		
		// Shuffle the questions for each of every exam paper
		Random rand = new Random();
		int i=0;
		while(i<5){
			int n=rand.nextInt(5) + 0;
			if(n!=questionOrder[0] && n!=questionOrder[1] && n!=questionOrder[2] && n!=questionOrder[3] && n!=questionOrder[4]){
				questionOrder[i]=n;
				myPaper[i]=questions[n];
				i++;
			}		
		}		
	}
	
	// It displays the paper
	public void displayExam(){
		for(int k=0;k<5;k++){
			System.out.println("-------------------------------------------------------------------------");
			System.out.print((k+1)+") ");
			System.out.println(myPaper[k].getName());
			System.out.println("-------------------------------------------------------------------------");
			for(int i=0;i<4;i++){
				char alpha[] = "ABCD".toCharArray();
				System.out.print(alpha[i]+") ");
				System.out.println(myPaper[k].getAnswers(i).getAnswer());
			}
		}
		
	}
	
	// Grade the paper and print out the result
	public void gradeExam(){
		double total=0;
		for(int k=0;k<5;k++){
			System.out.println("--------------------------");
			if(myAnswers[k].equals(questions[questionOrder[k]].getCorrect())){
				System.out.println("Q"+(k+1)+". CORRECT +20");
				total+=20;
			}
			else{
				System.out.println("Q"+(k+1)+". FALSE -2.5");
				total-=2.5;
			}
		}
		
		if(total<0)
			total=0;
		
		System.out.println("__________________________");
		System.out.println(getName()+",your grade is: "+total);
		
		
	}
	
	// Users can solve their paper with this method
	public void solveExam(){
		Scanner input=new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("START TO SOLVE YOUR PAPER:");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+". question: ");
			String answer=input.next();
			myAnswers[i]=answer;
		}
		input.close();
		System.out.println("EXAM IS OVER !");
	}
	
	

	
}
