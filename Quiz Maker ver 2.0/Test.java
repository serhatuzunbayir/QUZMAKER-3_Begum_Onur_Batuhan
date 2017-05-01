import static org.junit.Assert.*;

public class Test {

	
	@org.junit.Test
	public void test1_get_answer() {
		Answer answer = new Answer();
		answer.setAnswer("A");
		assertTrue(answer.getAnswer()=="A");
	}

	@org.junit.Test
	public void test2_get_name() {
		Exam exam = new Exam();
		exam.setName("Begum");
		assertTrue(exam.getName()==("Begum"));
	}
	
	@org.junit.Test
	public void test3_get_ID() {
		Exam exam = new Exam();
		exam.setID(318);
		assertTrue(exam.getID()==(318));
	}
	
	@org.junit.Test
	public void test4_get_paper() {
		Exam exam = new Exam();
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());
		
		exam.setPaper(exam1.getPaper());
		assertTrue(exam1.getPaper()==exam.getPaper());
	}
	
	@org.junit.Test
	public void test5_get_Questions() {
		Exam exam = new Exam();
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());
		
		exam.setQuestions(exam1.getQuestions());
		assertTrue(exam1.getQuestions()==exam.getQuestions());
	}
	
	@org.junit.Test
	public void test6_get_QuestionOrder() {
		Exam exam = new Exam();
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());
		
		exam.setQuestionOrder(exam1.getQuestionOrder());
		assertTrue(exam1.getQuestionOrder()==exam.getQuestionOrder());
	}
	
	@org.junit.Test
	public void test7_get_myAnswers() {
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());
		String[] Answers=new String[5];
		
		Answers[0]="A";
		Answers[1]="B";
		Answers[2]="C";
		Answers[3]="D";
		Answers[4]="E";
		
		exam1.setMyAnswers(Answers);
		assertTrue(exam1.getMyAnswers()==Answers);
	}
	
	@org.junit.Test
	public void test8_solve_exam() {
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());
		exam1.prepareExam();
		exam1.solveExam();
	}
	
	@org.junit.Test
	public void test9_prepare_exam() {
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());	
		exam1.prepareExam();
	}
	
	@org.junit.Test
	public void test10_display_exam() {
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());
		exam1.prepareExam();
		exam1.displayExam();
	}
	
	@org.junit.Test
	public void test11_grade_exam() {
		Exam exam1=new Exam(1,"Batuhan",Example.getQuestions());
		exam1.prepareExam();
		exam1.solveExam();
		exam1.gradeExam();
	}
	
	@org.junit.Test
	public void test12_get_correct() {
		Question question = new Question();
		question.setCorrect("C");
		assertTrue(question.getCorrect()=="C");
	}
	
	@org.junit.Test
	public void test13_get_questionName() {
		Question question = new Question();
		question.setName("Question");
		assertTrue(question.getName()==("Question"));
	}
	
	@org.junit.Test
	public void test14_get_Answers() {
		Question question = new Question();
		Answer[] answers=new Answer[4];
		
		answers[0]=new Answer("Adana");
		
		question.setAnswers(answers);
		assertTrue(question.getAnswers(0)==answers[0]);
	}
	
	@org.junit.Test
	public void test15_answer_constructor(){
		Answer a=new Answer("Bolu");
		assertTrue(a.getAnswer()=="Bolu");
	}
	
	@org.junit.Test
	public void test16_question_constructor(){
		Answer[] ans=new Answer[4];
		Question q=new Question("which one is above?",ans,"A");
		assertTrue(q.getName()=="which one is above?");
	}
	
	@org.junit.Test
	public void test17_exam_constructor(){
		Question[] q=new Question[5];
		Exam e=new Exam(318,"Onur",q);
		assertTrue(e.getID()==318);
	}
	
	@org.junit.Test
	public void test18_answer_default_constructor(){
		Answer a=new Answer();
		assertTrue(a.getAnswer()=="no answer");
	}
	
	@org.junit.Test
	public void test19_question_default_constructor(){
		Question q=new Question();
		assertTrue(q.getName()=="no question");
	}
	
	@org.junit.Test
	public void test20_exam_default_constructor(){
		Exam e=new Exam();
		assertTrue(e.getName()=="no name");
	}

}
