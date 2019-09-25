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

public class Fireworks {
  
  
  // instance variables
  
  Turtle yertle;
  TurtleDisplayer display;
  
  /** This constructor ...                                                     */
  
  public Fireworks ( ) {
    
    // statements including call of method
    
    yertle= new Turtle(FAST);
    display= new TurtleDisplayer();
    
    display.placeTurtle(yertle); 
    
    drawFireworks();  
    
    
    
  }; // constructor
  
  /** This method ...                                                          */
  
  private void drawFireworks ( ) {
    
    yertle.penUp();
    int x=0;
    int y=0;
    int c=0;
    
    
    for(int i=1; i<=5; i++){
      
      x=(int)(301*random())-150;
      y=(int)(301*random())-150;
      c=(int)(16777216*random()+0);
      
      yertle.moveTo(x,y);
      drawStartburst();
      yertle.setPenColor(new Color (c));
      
    }
    
  }
  
  private void drawStartburst(){
    
    for(int i=1; i<=10 ; i++){
      yertle.forward(10);
      yertle.penDown();
      yertle.forward(20);
      yertle.penUp();
      yertle.backward(30);      // back to center
      yertle.right(PI/5);
    };
    
    
    
  }; 
  
  
  
  public static void main ( String[] args ) { 
    
    Fireworks s = new Fireworks(); 
    
  };
  
  
  
}  // Polyspiral
