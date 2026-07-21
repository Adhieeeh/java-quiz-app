import java.util.*;
class main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        String[] questions = {
            "1. What is the default value of an int variable in Java?",
            "2. Which keyword is used to define a constant in Java?",
            "3. Which operator is used for modulus (remainder) in Java?"
        };

        String[][] options = {
            {"A) 1", "B) 0", "C) null", "D) -1"},
            {"A) static", "B) const", "C) final", "D) abstract"},
            {"A) /", "B) %", "C) #", "D) *"}
        };

        char[] answers = {'B', 'C', 'B'}; 

        int score = 0;
        int totalQuestions = questions.length;

        System.out.println("=== Welcome to the Java Basics Quiz ===");
        System.out.println("Answer by entering A, B, C, or D.\n");

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println("   " + option);
            }

            System.out.print("Your answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

           
            if (userAnswer == answers[i]) {
                System.out.println(" Correct!\n");
                score++; 
            } else {
                System.out.println(" Wrong! Correct answer was: " + answers[i] + "\n");
            }
        }

       
        double percentage = ((double) score / totalQuestions) * 100;

        System.out.println("=== Quiz Results ===");
        System.out.println("Your Score: " + score + "/" + totalQuestions);
        System.out.printf("Percentage: %.1f%%\n", percentage);

    
        if (percentage >= 70.0) {
            System.out.println(" Great job! You passed the quiz.");
        } else {
            System.out.println(" Keep practicing and try again!");
        }

        sc.close();
    }
}