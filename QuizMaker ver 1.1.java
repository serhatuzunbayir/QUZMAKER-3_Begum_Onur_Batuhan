import java.util.Random;
import java.util.Scanner;
public class QuizMaker {

	public static void main(String[] args) {
		
		String[] Solutions=new String[5];
		Solutions[0]="A";
		Solutions[1]="D";
		Solutions[2]="D";
		Solutions[3]="A";
		Solutions[4]="B";
		
		String[][] myPaper=new String[5][6];
		String[] myAnswers=new String[5];
		
		myPaper=prepareExam();
		displayExam(myPaper);
		
		myAnswers=solveExam();
		gradeExam(myAnswers,myPaper,Solutions);
		
	}
	
	public static String[] solveExam(){
		String[] arr=new String[5];
		Scanner a=new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("START TO SOLVE YOUR PAPER:");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+". question: ");
			String answer=a.next();
			arr[i]=answer;
		}
		a.close();
		System.out.println("EXAM IS OVER !");
		return arr;
	}
	
	public static void gradeExam(String myAnswers[],String exam[][],String solutions[]){
		double total=0;
		for(int k=0;k<5;k++){
			int a=Integer.parseInt(exam[k][5]);
			System.out.println("--------------------------");
			char myAns = myAnswers[k].charAt(0);
			char sol = solutions[a].charAt(0);
			if(myAns==sol){
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
	
	public static String[][] prepareExam(){
		
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
		
		String[][] myExam=new String[5][6];
		myExam[0][5]="11";
		myExam[1][5]="9";
		myExam[2][5]="9";
		myExam[3][5]="9";
		myExam[4][5]="9";
		
		
		Random rand = new Random();
		int i=0;
		while(i<5){
			int n=rand.nextInt(5) + 0;
			if(n!=Integer.parseInt(myExam[0][5]) && n!=Integer.parseInt(myExam[1][5]) && n!=Integer.parseInt(myExam[2][5]) && n!=Integer.parseInt(myExam[3][5]) && n!=Integer.parseInt(myExam[4][5])){
				myExam[i][5]=Integer.toString(n);
				myExam[i][0]=QUESTIONS[n][0];
				i++;
			}
				
		}
		
		int[] Acheck=new int[4];
		int j=1;
		for(i=0;i<5;i++){
			
			Acheck[0]=11;
			Acheck[1]=11;
			Acheck[2]=11;
			Acheck[3]=11;
			while(j<5){
				int n=rand.nextInt(4) + 1;
				if(n!=Acheck[0] && n!=Acheck[1] && n!=Acheck[2] && n!=Acheck[3]){
					Acheck[j-1]=n;
					myExam[i][j]=QUESTIONS[0][n];
					j++;
				}
				
			}
			j=1;
		}
		
		return myExam;
	}

	public static void displayExam(String myPaper[][]){
		for(int k=0;k<5;k++){
			System.out.println("--------------------------");
			System.out.print((k+1)+") ");
			System.out.println(myPaper[k][0]);
			System.out.println("--------------------------");
			for(int i=1;i<5;i++){
				System.out.println(myPaper[k][i]);
			}
		}
		
	}
}


