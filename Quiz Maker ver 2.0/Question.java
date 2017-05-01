// Question class holds question, its answers and the correct one
// Question has Answers
public class Question {
	private String name;
	private Answer[] answers;
	private String correct;
	
	Question(String name,Answer[] answers,String correct){
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
		return answers[index];
	}
	public void setAnswers(Answer[] answers) {
		this.answers = answers;
	}
	
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	};
	
	
	
	
	

}
