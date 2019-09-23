package Lab_2_1;


import Media.*;                  // for Turtle and TurtleDisplayer
import static java.lang.Math.*;  // for Math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * Fahad
  * 
  * @version 1.0 (<date>)                                                        */

public class fancyDiamond {
    
    
    // instance variables (declaring our variables)
    //type/name
    Turtle yertle;
    TurtleDisplayer display;
    /** This constructor ...                                                     */
    
    public fancyDiamond ( ) {
        //initialize our variables
      yertle = new Turtle();
      display = new TurtleDisplayer();
      display.placeTurtle(yertle);
      //////////////////////////////



      
      for (int i=1 ;i<=4 ; i++){
      
      for (int j=1 ; j<=5 ; j++){
        yertle.penDown();
        yertle.forward(10);
        yertle.right(PI/2);
        yertle.forward(10);
        yertle.left(PI/2);
        yertle.penUp();
        // statements
      }
      yertle.right(PI/2);
      }
      
       for (int i=1 ; i<=4 ; i++) {
       yertle.moveTo(0,-50);
       yertle.forward(50);
       yertle.penDown();
       yertle.forward(10);
       yertle.penUp();
       yertle.right(PI/2);
       }
      
    }; // constructor
    
    
    public static void main ( String[] args ) { 
    //calls or runs runs a constructor
      fancyDiamond s = new fancyDiamond(); 
    };
    
    
} // <className>
