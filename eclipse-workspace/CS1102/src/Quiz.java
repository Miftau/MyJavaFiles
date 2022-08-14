

public class Quiz {
	

	public static void main(String[] args) {
		 
		Question question = new MultipleChoiceQuestion("Where is the capital state of United States",
		"Los Angelis",
		 "Texas",
		 "San Francisco",
		"Washington DC",
	     "Morocco\n", "D");
		
		Question question1 = new MultipleChoiceQuestion("A person who treats a patient is known as",
				"Farmer",
		 "Doctor",
		 "Driver",
		"Mechanic",
	     "treater", "B");
		
		Question question2 = new MultipleChoiceQuestion("Which one is odd?",
				"Bluetooth",
		 "Wi-Fi",
		 "Earpiece",
		"Speaker",
	     "Spanner", "E");
		
		Question question3 = new MultipleChoiceQuestion("Where can we find diamond?",
		 "In the air ",
		 "In the swimming pool",
		 "Outside the backyard",
		"Deep down the ground",
	     "Anywhere", "D");
		
		Question question4 = new MultipleChoiceQuestion("The head of a family is?",
		 "Uncle",
		 "Aunty",
		 "Father",
		"Sister",
	     "Brother", "C");
		
		
		Question question5 = new TrueFalseQuestion("Programming languages are examples of formal language?", "TRUE");
		Question question6 = new TrueFalseQuestion("Class is the same as object?", "FALSE");
		Question question7 = new TrueFalseQuestion("We can instantiate an object from abstract class?", "FALSE");
		Question question8 = new TrueFalseQuestion("All classes in java must be a subclass of another class?", "TRUE"); 
		Question question9 = new TrueFalseQuestion("Type coercion exists in Java?", "FALSE");
		
		question.check();
		question1.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		question6.check();
		question7.check();
		question8.check(); 
		question9.check();
		
		Question.showResult();
	
	}			
}


