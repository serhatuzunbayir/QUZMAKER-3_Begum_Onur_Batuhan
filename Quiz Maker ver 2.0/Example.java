
public class Example {
	// Just an example questions for creating exam
	
	// getQuestions() can be reached without creating instance
	public static Question[] getQuestions(){

		Answer a0_1=new Answer("Pounds");
		Answer a0_2=new Answer("Japanese dollars");
		Answer a0_3=new Answer("Riki");
		Answer a0_4=new Answer("Yen");
		
		Answer a1_1=new Answer("Emeralds");
		Answer a1_2=new Answer("Coal");
		Answer a1_3=new Answer("Crystals");
		Answer a1_4=new Answer("Mud");
		
		Answer a2_1=new Answer("Femur");
		Answer a2_2=new Answer("Tibia");
		Answer a2_3=new Answer("Humerus");
		Answer a2_4=new Answer("Cranium");
		
		Answer a3_1=new Answer("Ho2");
		Answer a3_2=new Answer("HEO2");
		Answer a3_3=new Answer("H2O");
		Answer a3_4=new Answer("oH2");
		
		Answer a4_1=new Answer("Germany");
		Answer a4_2=new Answer("Italy");
		Answer a4_3=new Answer("Egypt");
		Answer a4_4=new Answer("Greece");
		
		Answer[] answers0=new Answer[4];
		answers0[0]=a0_1;
		answers0[1]=a0_2;
		answers0[2]=a0_3;
		answers0[3]=a0_4;
		
		Answer[] answers1=new Answer[4];
		answers1[0]=a1_1;
		answers1[1]=a1_2;
		answers1[2]=a1_3;
		answers1[3]=a1_4;
		
		Answer[] answers2=new Answer[4];
		answers2[0]=a2_1;
		answers2[1]=a2_2;
		answers2[2]=a2_3;
		answers2[3]=a2_4;
		
		Answer[] answers3=new Answer[4];
		answers3[0]=a3_1;
		answers3[1]=a3_2;
		answers3[2]=a3_3;
		answers3[3]=a3_4;
		
		Answer[] answers4=new Answer[4];
		answers4[0]=a4_1;
		answers4[1]=a4_2;
		answers4[2]=a4_3;
		answers4[3]=a4_4;
		
		Question q0=new Question("What is the currency of Japan?",answers0,"D");
		Question q1=new Question("Diamonds are made from highly compressed?",answers1,"B");
		Question q2=new Question("What is the longest bone in your body?",answers2,"A");
		Question q3=new Question("What is the atomic sign for water?",answers3,"C");
		Question q4=new Question("In which counrty is the oldest university in the world situated?",answers4,"C");
		Question[] questions=new Question[5];
		questions[0]=q0;
		questions[1]=q1;
		questions[2]=q2;
		questions[3]=q3;
		questions[4]=q4;
		
		return questions;
	}
}
