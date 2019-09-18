package Lab_2_1;


import Media.*;                  // for Turtle and TurtleDisplayer
import static java.lang.Math.*;  // for Math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * 
  * @version 1.0 (<date>)                                                        */

public class Staircase {
  
  
  // instance variables (declaring our variables)
  //type/name
  Turtle yertle;
  TurtleDisplayer display;
  /** This constructor ...                                                     */
  
  public Staircase ( ) {
    //initialize our variables
    yertle = new Turtle();
    display = new TurtleDisplayer();
    display.placeTurtle(yertle);
    //////////////////////////////
    
    
 
      for (int i=1 ; i<=5 ; i++){
      yertle.penDown();
      yertle.forward(10);
      yertle.right(PI/2);
      yertle.forward(10);
      yertle.left(PI/2);
      yertle.penUp();
      // statements
    }
    

    }; // constructor
    
    
    public static void main ( String[] args ) { 
      //calls or runs runs a constructor
      Staircase s = new Staircase(); 
    };
    
    
  } // <className>
