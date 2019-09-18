package Lab_2_1;


import Media.*;                  // for Turtle and TurtleDisplayer
import static java.lang.Math.*;  // for Math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * 
  * @version 1.0 (<date>)                                                        */

public class Starburst {
    
    
    // instance variables (declaring our variables)
    //type/name
    Turtle yertle;
    TurtleDisplayer display;
    /** This constructor ...                                                     */
    
    public Starburst ( ) {
        //initialize our variables
      yertle = new Turtle();
      display = new TurtleDisplayer();
      display.placeTurtle(yertle);
      //////////////////////////////



      
      for (int i=1 ; i<=10 ; i++){
      yertle.setPenColor(red);
      yertle.forward(60);
      yertle.penDown();
      yertle.forward(30);
      yertle.penUp();
      yertle.moveTo(0,0);
      yertle.right(PI/5);
      }
    }; // constructor
    
    
    public static void main ( String[] args ) { 
    //calls or runs runs a constructor
      Starburst s = new Starburst(); 
    };
    
    
} // <className>
