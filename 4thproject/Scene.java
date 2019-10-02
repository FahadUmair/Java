package Lab_4_1;


import Media.*;                  // for Turtle and TurtleDisplayer
import static Media.Turtle.*;    // for Turtle speeds
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  *
  * @version 1.0 (<date>)                                                        */

public class Scene {
  
  Turtle yertle;
  TurtleDisplayer display;
  
  // instance variables
  
  
  /** This constructor ...                                                     */
  
  public Scene ( ) {
    
    yertle= new Turtle(FAST);
    display=new TurtleDisplayer();
    
    display.placeTurtle(yertle);
    
    drawRectangle(60,20);
    yertle.penUp();
    
    yertle.moveTo(80,-50);
    
    drawTriangle(50);

        // statements including call of method
    
  }; // constructor
  
  
  
  /** This method ...                                                          */
  
  private void drawTriangle ( double side ) {
    yertle.penDown();
    
    for(int i=1; i<=3 ; i++){
    
    yertle.forward(side);
    yertle.left(2*PI/3);
    
    
    }
    
  }
  
  private void drawRectangle ( double width, double height ) {
    
    yertle.penDown();
    
    for(int i=1; i<=2; i++){
    
    yertle.forward(width);
    yertle.right(PI/2);
    yertle.forward(height);
    yertle.right(PI/2);
    
    }

  }
  
  
  
  public static void main ( String[] args ) { Scene s = new Scene(); };
  
  
  
}  // Scene
