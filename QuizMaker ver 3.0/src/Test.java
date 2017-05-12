import static org.junit.Assert.*;

import java.util.ArrayList;

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
		Exam exam1=new Exam(1,"Batuhan");
		
		exam.setPaper(exam1.getPaper());
		assertTrue(exam1.getPaper()==exam.getPaper());
	}
	
	@org.junit.Test
	public void test5_get_Questions() {
		Exam exam = new Exam();
		Exam exam1=new Exam(1,"Batuhan");
		
		exam.setQuestion(exam1.getQuestion(1));
		assertTrue(exam1.getQuestion(1)==exam.getQuestion(1));
	}
	
	@org.junit.Test
	public void test6_get_QuestionOrder() {
		Exam exam = new Exam();
		Exam exam1=new Exam(1,"Batuhan");
		
		exam.setQuestionOrder(exam1.getQuestionOrder());
		assertTrue(exam1.getQuestionOrder()==exam.getQuestionOrder());
	}
	
	@org.junit.Test
	public void test7_get_myAnswers() {
		Exam exam1=new Exam(1,"Batuhan");
		ArrayList<String> Answers=new ArrayList<>();
		
		Answers.add("A");
		Answers.add("B");
		Answers.add("C");
		Answers.add("D");
		Answers.add("E");
		
		exam1.setMyAnswers(Answers);
		assertTrue(exam1.getMyAnswers()==Answers);
	}
	
	@org.junit.Test
	public void test8_solve_exam() {
		Exam exam1=new Exam(1,"Batuhan");
		exam1.prepareExam(2);
		exam1.solveExam(2);
	}
	
	@org.junit.Test
	public void test9_prepare_exam() {
		Exam exam1=new Exam(1,"Batuhan");	
		exam1.prepareExam(2);
	}
	
	@org.junit.Test
	public void test10_display_exam() {
		Exam exam1=new Exam(1,"Batuhan");
		exam1.prepareExam(2);
		exam1.displayExam(2);
	}
	
	@org.junit.Test
	public void test11_grade_exam() {
		Exam exam1=new Exam(1,"Batuhan");
		exam1.prepareExam(2);
		exam1.solveExam(2);
		exam1.gradeExam(2);
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
		ArrayList<Answer> answers=new ArrayList<>();
		
		answers.add(new Answer("Adana"));
		
		question.setAnswers(answers);
		assertTrue(question.getAnswers(0)==answers.get(0));
	}
	
	@org.junit.Test
	public void test15_answer_constructor(){
		Answer a=new Answer("Bolu");
		assertTrue(a.getAnswer()=="Bolu");
	}
	
	@org.junit.Test
	public void test16_question_constructor(){
		ArrayList<Answer> ans=new ArrayList<>();
		Question q=new Question("which one is above?",ans,"A");
		assertTrue(q.getName()=="which one is above?");
	}
	
	@org.junit.Test
	public void test17_exam_constructor(){
		Exam e=new Exam(318,"Onur");
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
