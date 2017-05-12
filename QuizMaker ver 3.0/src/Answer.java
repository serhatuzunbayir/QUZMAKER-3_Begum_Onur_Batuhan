// Answer class keeps the string answer only
public class Answer {
	private String answer;
	
	Answer(){
		answer="no answer";
	}
	Answer(String answer){
		this.answer=answer;
	}

	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}	
}
