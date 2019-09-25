package Lab_3_1;


import Media.*;                  // for Turtle and TurtleDisplayer
import java.awt.*;               // for Color objects, constructor and methods
import static Media.Turtle.*;    // for Turtle speeds
import static java.lang.Math.*;  // for Math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author Fahad
  *
  * @version 1.0 (<date>)                                                        */

public class Walk {
  
  
  // instance variables
  
  Turtle yertle;
  TurtleDisplayer display;
  
  /** This constructor ...                                                     */
  
  public Walk ( ) {
    
    // statements including call of method
    
    yertle= new Turtle();
    display= new TurtleDisplayer();
    
    display.placeTurtle(yertle);
    yertle.penDown();
    
    
    drawWalk();
    
    
    
    
  }; // constructor
  
  /** This method ...                                                          */
  
  private void drawWalk ( ) {
    
    // local variables
    
    
    for(int i=1; i<=20; i++){
     
      int x=(int)(301*random())-150;
    int y=(int)(301*random())-150;
      
      yertle.moveTo(x,y);
      
      
    }
  }; 
  
  
  
  public static void main ( String[] args ) { 
    
    Walk s = new Walk(); 
    
  };
  
  
  
}  // Polyspiral
