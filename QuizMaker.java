import java.util.Random;
import java.util.Scanner;
public class QuizMaker {

	public static void main(String[] args) {
		
		String[][] QUESTIONS=new String[5][5];
		QUESTIONS[0][0]="Question 1";
		QUESTIONS[1][0]="Question 2"; 
		QUESTIONS[2][0]="Question 3"; 
		QUESTIONS[3][0]="Question 4"; 
		QUESTIONS[4][0]="Question 5"; 
		
		QUESTIONS[0][1]="A";
		QUESTIONS[0][2]="B";
		QUESTIONS[0][3]="C";
		QUESTIONS[0][4]="D";
		
		String[] ANSWERS=new String[5];
		ANSWERS[0]="A";
		ANSWERS[1]="D";
		ANSWERS[2]="D";
		ANSWERS[3]="A";
		ANSWERS[4]="B";
		
		
		int[] Qcheck=new int[5];
		Qcheck[0]=11;
		Qcheck[1]=11;
		Qcheck[2]=11;
		Qcheck[3]=11;
		Qcheck[4]=11;
		
		int[] Acheck=new int[4];
		Acheck[0]=11;
		Acheck[1]=11;
		Acheck[2]=11;
		Acheck[3]=11;
		
		String[][] q=new String[5][5];
		Random rand = new Random();
		int i=0;
		while(i<5){
			int n=rand.nextInt(5) + 0;
			if(n!=Qcheck[0] && n!=Qcheck[1] && n!=Qcheck[2] && n!=Qcheck[3] && n!=Qcheck[4]){
				Qcheck[i]=n;
				q[i][0]=QUESTIONS[n][0];
				i++;
			}
				
		}
		
		
		int j=1;
		for(i=0;i<5;i++){
			while(j<5){
				int n=rand.nextInt(4) + 1;
				if(n!=Acheck[0] && n!=Acheck[1] && n!=Acheck[2] && n!=Acheck[3]){
					Acheck[j-1]=n;
					q[i][j]=QUESTIONS[0][n];
					j++;
				}
				
			}
			Acheck[0]=11;
			Acheck[1]=11;
			Acheck[2]=11;
			Acheck[3]=11;
			j=1;
		}
		
		
		for(int k=0;k<5;k++){
			System.out.println("--------------------------");
			System.out.println(q[k][0]);
			System.out.println("--------------------------");
			for(i=1;i<5;i++){
				System.out.println(q[k][i]);
			}
			
			
		}
		
		String[] myAnswers=new String[5];
		myAnswers=solve();
		grade(myAnswers,ANSWERS,Qcheck);
		
	}
	
	public static String[] solve(){
		String[] arr=new String[5];
		Scanner a=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println((i+1)+". question: ");
			String answer=a.next();
			arr[i]=answer;
		}
		a.close();
		System.out.println("EXAM IS OVER !");
		return arr;
	}
	
	public static void grade(String arr[],String ans[],int exam[]){
		double total=0;
		for(int k=0;k<5;k++){
			int a=exam[k];
			System.out.println("--------------------------");
			char c = arr[k].charAt(0);
			char d = ans[a].charAt(0);
			if(c==d){
				System.out.println("Q"+(k+1)+". CORRECT +20");
				total+=20;
			}
			else{
				System.out.println("Q"+(k+1)+". FALSE -5");
				total-=5;
			}
		}
		System.out.println("____________________");
		System.out.println("Your grade: "+total);
	}

}
