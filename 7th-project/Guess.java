package Lab_7_1;


import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Guess {
    
    
  private ASCIIDisplayer display; // the larger string
  ASCIIPrompter prompt; //teh user input
  
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Guess ( ) {
      
      
      display=new ASCIIDisplayer();
      prompt=new ASCIIPrompter();
      
      display.writeLine("Guessing Game");
      display.writeLine("Guess a number between 1 and 100");
      display.newLine(); //you hitting the enter key in word
      
      prompt.setLabel("Guess");

        // local variables
     
      
      int numGuess=0;
      
      int goal=(int)(100*random())+1;
      
      for(;;){
      
         int userInput=prompt.readInt();//shows the prompter 
        numGuess++;
        
        display.writeInt(userInput);
        
        
        if(userInput==goal){
        //we guessed the number.
          break;
        }
        
        else if(userInput<goal){
        
        display.writeString("Your guess is Lower!");
        display.newLine();
        }
        else{
        
        display.writeString("Your guess is Higher!");
        display.newLine();
        }
      
      }
      
       display.writeString("You guessed in"); // statements
       display.writeInt(numGuess);
       display.writeString("guesses");
         display.newLine();
         display.close();
         
         
    }; // constructor
    
    
    // methods

    
    
    public static void main ( String[] args ) { Guess c = new Guess(); };
    
    
} // <className>
