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

public class SceneThree {
  
  Turtle yertle;
  TurtleDisplayer display;
  
  // instance variables
  
  
  /** This constructor ...                                                     */
  
  public SceneThree ( ) {
    
    yertle= new Turtle(FAST);
    display=new TurtleDisplayer();
    
    display.placeTurtle(yertle);
    
    yertle.setPenColor(green);
    yertle.moveTo(-70,0);
    drawRectangle(100,80);
    
    
    yertle.moveTo(-80,0);
    drawTriangle(120);
    
    yertle.setPenColor(red);
    
    
    yertle.moveTo(64,-64);
    drawRectangle(20,16);
    
    
    
    yertle.moveTo(62,-64);
    drawTriangle(24);
    
    

        // statements including call of method
    
  }; // constructor
  
  
  
  /** This method ...                                                          */
  
  private void drawTriangle ( double side ) {
    yertle.penDown();
    
    for(int i=1; i<=3 ; i++){
    
    yertle.forward(side);
    yertle.left(2*PI/3);
    
    
    }
    yertle.penUp();
  }
  
  private void drawRectangle ( double width, double height ) {
    
    yertle.penDown();
    
    for(int i=1; i<=2; i++){
    
    yertle.forward(width);
    yertle.right(PI/2);
    yertle.forward(height);
    yertle.right(PI/2);
    
    }
    yertle.penUp();
  }
  
  
  
  public static void main ( String[] args ) { SceneThree s = new SceneThree(); };
  
  
  
}  // Scene
