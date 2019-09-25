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

public class Polyspiral {
  
  
  // instance variables
  
  Turtle yertle;
  TurtleDisplayer display;
  
  /** This constructor ...                                                     */
  
  public Polyspiral ( ) {
    
    // statements including call of method
    
    yertle= new Turtle();
    display= new TurtleDisplayer();
    
    display.placeTurtle(yertle);
    yertle.penDown();
    
    
    drawPolyspiral();
    
    
    
    
  }; // constructor
  
  /** This method ...                                                          */
  
  private void drawPolyspiral ( ) {
    
    // local variables
    int length=2;
    
    for (int i=1 ; i<=30 ; i++){
    yertle.forward(length);
    yertle.right(PI/6);
    length=length +2;
    };
    
    
  }; 
  
  
  
  public static void main ( String[] args ) { 
    
    Polyspiral s = new Polyspiral(); 
    
  };
  
  
  
}  // Polyspiral
