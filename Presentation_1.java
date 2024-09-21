import java.util.Scanner;

public class Presentation_1 {
   public static void main(String args[]) {
   
      //Initializing input
      Scanner input = new Scanner(System.in);
   
      //Declaring and intializing variables
      char letterGrade;
      double totalCredits = 0, totalPoints = 0, classCredit = 0, qualityPoints = 0, collegeGPA = 0;
      boolean programStatus= true;
      
      //Welcomes user to program
      System.out.println("Welcome to Scholarly Stats! \n follow the instructions to get your college gpa.");
      
      //Program while loop based on user condition
      while(programStatus) {
      
         //Getting user grade per class
         System.out.println("Enter a class grade: \n A \n B \n C \n D \n F \n E = Exit");
         letterGrade = input.next().charAt(0);
         
         //Condition check, just in case user wants to exit program         
         if(letterGrade == 'E' || letterGrade == 'e') {
            programStatus = false;
         
         //Error checking to see if user entered anything besides options given
         //Will exit program if condition is not met
         } else if (letterGrade != 'A' && letterGrade != 'a' &&
                    letterGrade != 'B' && letterGrade != 'b' &&
                    letterGrade != 'C' && letterGrade != 'c' &&
                    letterGrade != 'D' && letterGrade != 'd' &&
                    letterGrade != 'F' && letterGrade != 'f') {
                     
                     System.out.println("Error: Incorrect value entered...");
                     System.out.println("Program will now exit!");
                     programStatus = false;
         } else {
            
            //Getting user units per class              
            System.out.println("Now enter the amount of units for that class");
            
            //Condition statement checks if input has a double
            if(input.hasNextDouble()) {
               classCredit = input.nextDouble();
               totalCredits += classCredit;
            } else {
            //Error checking condition statement
            //Will exit program if condition is not met
               System.out.println("Error: Incorrect value entered please only include numbers");
               System.out.println("Program will now exit!");
               programStatus = false;
            }
            
            //Takes the condition and does calculation based on user input and case   
            switch(letterGrade) {
               case 'A':
               case 'a':
                  qualityPoints = classCredit * 4;
                  totalPoints += qualityPoints;
                  break;
               case 'B':
               case 'b':
                  qualityPoints = classCredit * 3;
                  totalPoints += qualityPoints;
                  break;
               case 'C':
               case 'c':
                  qualityPoints = classCredit * 2;
                  totalPoints += qualityPoints;
                  break;
               case 'D':
               case 'd':
                  qualityPoints = classCredit * 1;
                  totalPoints += qualityPoints;
                  break;
               case 'F':
               case 'f':
                  qualityPoints = classCredit * 0;
                  totalPoints += qualityPoints;
                  break;
               }
               
         }
      }
      
      //Error checking that the user entered credits
      //If condition not met will prompt goodbye message
      if (totalCredits > 0) {
         collegeGPA = totalPoints / totalCredits;
         System.out.println("Your College GPA is: " + collegeGPA);
      } else {
         System.out.println("Thank you for using Scholarly Stats!");
      }
   } 
}