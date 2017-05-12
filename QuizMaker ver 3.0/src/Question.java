import java.util.ArrayList;

// Question class holds question, its answers and the correct one
// Question has Answers
public class Question {
	private String name;
	private ArrayList<Answer> answers= new ArrayList<>();
	private String correct;
	
	Question(String name,ArrayList<Answer> answers,String correct){
		this.name=name;
		this.answers=answers;
		this.correct=correct;
	}

	Question(){
		name="no question";
		correct="X";
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Answer getAnswers(int index) {
		return answers.get(index);
	}
	public void setAnswers(ArrayList<Answer> answers) {
		this.answers = answers;
	}
	
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	};
	
	
	
	
	

}
