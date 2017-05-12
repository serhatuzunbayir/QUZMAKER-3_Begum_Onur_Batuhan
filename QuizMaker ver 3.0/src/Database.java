import java.util.ArrayList;

public class Database {
	// Just an example questions for creating exam
	static ArrayList<Question> questions = new ArrayList<>();

	// getQuestions() can be reached without creating instance
	public static Question getQuestion(int indexOfQuestion) {

		Answer a0_1 = new Answer("Pounds");
		Answer a0_2 = new Answer("Japanese dollars");
		Answer a0_3 = new Answer("Riki");
		Answer a0_4 = new Answer("Yen");

		Answer a1_1 = new Answer("Emeralds");
		Answer a1_2 = new Answer("Coal");
		Answer a1_3 = new Answer("Crystals");
		Answer a1_4 = new Answer("Mud");

		Answer a2_1 = new Answer("Femur");
		Answer a2_2 = new Answer("Tibia");
		Answer a2_3 = new Answer("Humerus");
		Answer a2_4 = new Answer("Cranium");

		Answer a3_1 = new Answer("Ho2");
		Answer a3_2 = new Answer("HEO2");
		Answer a3_3 = new Answer("H2O");
		Answer a3_4 = new Answer("oH2");

		Answer a4_1 = new Answer("Germany");
		Answer a4_2 = new Answer("Italy");
		Answer a4_3 = new Answer("Egypt");
		Answer a4_4 = new Answer("Greece");

		Answer a5_1 = new Answer("Pinapple");
		Answer a5_2 = new Answer("Plum");
		Answer a5_3 = new Answer("Apple");
		Answer a5_4 = new Answer("Orange");

		Answer a6_1 = new Answer("Cars");
		Answer a6_2 = new Answer("Bikes");
		Answer a6_3 = new Answer("Drinks");
		Answer a6_4 = new Answer("Computers");

		Answer a7_1 = new Answer("Nak Pulau");
		Answer a7_2 = new Answer("Amazon");
		Answer a7_3 = new Answer("Taman Negara");
		Answer a7_4 = new Answer("Kilum-Ijim");

		Answer a8_1 = new Answer("Duplicate");
		Answer a8_2 = new Answer("Dual");
		Answer a8_3 = new Answer("Durable");
		Answer a8_4 = new Answer("Duchy");

		Answer a9_1 = new Answer("Electronic");
		Answer a9_2 = new Answer("Enable");
		Answer a9_3 = new Answer("Executable");
		Answer a9_4 = new Answer("Editable");

		Answer a10_1 = new Answer("Svidrigailov");
		Answer a10_2 = new Answer("Raskolnikov");
		Answer a10_3 = new Answer("Dimitri Prokoviç Razumihin");
		Answer a10_4 = new Answer("Zozimov");

		Answer a11_1 = new Answer("5");
		Answer a11_2 = new Answer("6");
		Answer a11_3 = new Answer("7");
		Answer a11_4 = new Answer("8");

		Answer a12_1 = new Answer("Albert Camus");
		Answer a12_2 = new Answer("J.K. Rowling");
		Answer a12_3 = new Answer("J.R.R. Tolkien");
		Answer a12_4 = new Answer("Milan Kundera");

		Answer a13_1 = new Answer("100");
		Answer a13_2 = new Answer("956");
		Answer a13_3 = new Answer("1024");
		Answer a13_4 = new Answer("1000");

		Answer a14_1 = new Answer("Mitochondria");
		Answer a14_2 = new Answer("Centrosome");
		Answer a14_3 = new Answer("Chloroplasts");
		Answer a14_4 = new Answer("Ribosome");

		Answer a15_1 = new Answer("Manuel");
		Answer a15_2 = new Answer("Automatic");
		Answer a15_3 = new Answer("Tiptronic");
		Answer a15_4 = new Answer("Diesel");

		Answer a16_1 = new Answer("Maximum 5% salt by weight");
		Answer a16_2 = new Answer("Maximum 1% salt by weight");
		Answer a16_3 = new Answer("Maximum 0.01% salt by weight");
		Answer a16_4 = new Answer("Maximum 10% salt by weight");

		Answer a17_1 = new Answer("Inert");
		Answer a17_2 = new Answer("Stationary");
		Answer a17_3 = new Answer("Static");
		Answer a17_4 = new Answer("Ohmage");

		Answer a18_1 = new Answer("Oxygen");
		Answer a18_2 = new Answer("Moisture");
		Answer a18_3 = new Answer("Carbon dioxide");
		Answer a18_4 = new Answer("Heat");

		Answer a19_1 = new Answer("Tungsten");
		Answer a19_2 = new Answer("Iron");
		Answer a19_3 = new Answer("Aluminium");
		Answer a19_4 = new Answer("Titanium");
		
		ArrayList<Answer> answers0=new ArrayList<>();
		answers0.add(a0_1);
		answers0.add(a0_2);
		answers0.add(a0_3);
		answers0.add(a0_4);

		ArrayList<Answer> answers1=new ArrayList<>();
		answers1.add(a1_1);
		answers1.add(a1_2);
		answers1.add(a1_3);
		answers1.add(a1_4);

		ArrayList<Answer> answers2=new ArrayList<>();
		answers2.add(a2_1);
		answers2.add(a2_2);
		answers2.add(a2_3);
		answers2.add(a2_4);

		ArrayList<Answer> answers3=new ArrayList<>();
		answers3.add(a3_1);
		answers3.add(a3_2);
		answers3.add(a3_3);
		answers3.add(a3_4);

		ArrayList<Answer> answers4=new ArrayList<>();
		answers4.add(a4_1);
		answers4.add(a4_2);
		answers4.add(a4_3);
		answers4.add(a4_4);

		ArrayList<Answer> answers5=new ArrayList<>();
		answers5.add(a5_1);
		answers5.add(a5_2);
		answers5.add(a5_3);
		answers5.add(a5_4);

		ArrayList<Answer> answers6=new ArrayList<>();
		answers6.add(a6_1);
		answers6.add(a6_2);
		answers6.add(a6_3);
		answers6.add(a6_4);

		ArrayList<Answer> answers7=new ArrayList<>();
		answers7.add(a7_1);
		answers7.add(a7_2);
		answers7.add(a7_3);
		answers7.add(a7_4);

		ArrayList<Answer> answers8=new ArrayList<>();
		answers8.add(a8_1);
		answers8.add(a8_2);
		answers8.add(a8_3);
		answers8.add(a8_4);

		ArrayList<Answer> answers9=new ArrayList<>();
		answers9.add(a9_1);
		answers9.add(a9_2);
		answers9.add(a9_3);
		answers9.add(a9_4);

		ArrayList<Answer> answers10=new ArrayList<>();
		answers10.add(a10_1);
		answers10.add(a10_2);
		answers10.add(a10_3);
		answers10.add(a10_4);

		ArrayList<Answer> answers11=new ArrayList<>();
		answers11.add(a11_1);
		answers11.add(a11_2);
		answers11.add(a11_3);
		answers11.add(a11_4);

		ArrayList<Answer> answers12=new ArrayList<>();
		answers12.add(a12_1);
		answers12.add(a12_2);
		answers12.add(a12_3);
		answers12.add(a12_4);

		ArrayList<Answer> answers13=new ArrayList<>();
		answers13.add(a13_1);
		answers13.add(a13_2);
		answers13.add(a13_3);
		answers13.add(a13_4);

		ArrayList<Answer> answers14=new ArrayList<>();
		answers14.add(a14_1);
		answers14.add(a14_2);
		answers14.add(a14_3);
		answers14.add(a14_4);

		ArrayList<Answer> answers15=new ArrayList<>();
		answers15.add(a15_1);
		answers15.add(a15_2);
		answers15.add(a15_3);
		answers15.add(a15_4);

		ArrayList<Answer> answers16=new ArrayList<>();
		answers16.add(a16_1);
		answers16.add(a16_2);
		answers16.add(a16_3);
		answers16.add(a16_4);

		ArrayList<Answer> answers17=new ArrayList<>();
		answers17.add(a17_1);
		answers17.add(a17_2);
		answers17.add(a17_3);
		answers17.add(a17_4);

		ArrayList<Answer> answers18=new ArrayList<>();
		answers18.add(a18_1);
		answers18.add(a18_2);
		answers18.add(a18_3);
		answers18.add(a18_4);

		ArrayList<Answer> answers19=new ArrayList<>();
		answers19.add(a19_1);
		answers19.add(a19_2);
		answers19.add(a19_3);
		answers19.add(a19_4);

		Question q0 = new Question("What is the currency of Japan?", answers0, "D");
		Question q1 = new Question("Diamonds are made from highly compressed?", answers1, "B");
		Question q2 = new Question("What is the longest bone in your body?", answers2, "A");
		Question q3 = new Question("What is the atomic sign for water?", answers3, "C");
		Question q4 = new Question("In which counrty is the oldest university in the world situated?", answers4, "C");
		Question q5 = new Question(
				"What falling object is said to have inspired Isaac Newton's theories about gravity?", answers5, "C");
		Question q6 = new Question("What does the Dell company make?", answers6, "D");
		Question q7 = new Question("Where in the world does the largest tropical rainforest grow?", answers7, "B");
		Question q8 = new Question("What does the 'Dura' of Duracell stand for?", answers8, "C");
		Question q9 = new Question("What does the mean of e in 'e-mail?", answers9, "A");
		Question q10 = new Question("What is the main character of 'Crime and Punishment'?", answers10, "B");
		Question q11 = new Question("How many people in a Handball team?", answers11, "C");
		Question q12 = new Question("Who is the writer of 'Harry Potter'?", answers12, "B");
		Question q13 = new Question("One kilowatt how much watt?", answers13, "D");
		Question q14 = new Question("Which is not organelle of plant cell?", answers14, "B");
		Question q15 = new Question("Which is not a transmission system?", answers15, "D");
		Question q16 = new Question("Generally how saline are tears?", answers16, "B");
		Question q17 = new Question("What word means staying in one place and electrical interface?", answers17, "C");
		Question q18 = new Question(
				"Charcoal production requires burning of wood in conditions with substantially reduced what?",
				answers18, "C");
		Question q19 = new Question(
				"Which white metal that burns in air forms more of the earth's crust than carbon, sulphur, copper or lead?",
				answers19, "D");

		questions.add(q0);
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		questions.add(q6);
		questions.add(q7);
		questions.add(q8);
		questions.add(q9);
		questions.add(q10);
		questions.add(q11);
		questions.add(q12);
		questions.add(q13);
		questions.add(q14);
		questions.add(q15);
		questions.add(q16);
		questions.add(q17);
		questions.add(q18);
		questions.add(q19);

		return questions.get(indexOfQuestion);

	}

	public static void viewQuestions() {
		getQuestion(0);
		for (int i = 0; i < 20; i++) {
			System.out.println(i+"   	 " + questions.get(i).getName());
		}
	}
}
