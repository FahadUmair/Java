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

public class SceneFour {
  
  Turtle yertle;
  TurtleDisplayer display;
  
  // instance variables
  
  
  /** This constructor ...                                                     */
  
  public SceneFour ( ) {
    
    yertle= new Turtle(FAST);
    display=new TurtleDisplayer();
    
    display.placeTurtle(yertle);
    
    yertle.setPenColor(green);
    yertle.moveTo(-70,0);
    drawHouse(1);
    
    yertle.setPenColor(red);
    yertle.moveTo(64,-64);
    drawHouse(0.2);
    
  
    drawFireworks ( 2);
    
    
    // statements including call of method
    
  }; // constructor
  
  private void drawHouse (double scale) {
  yertle.penDown();
  drawRectangle(100*scale,80*scale); 
  yertle.penUp();
  yertle.left(PI);
  yertle.forward(10*scale);
  yertle.right(PI);
  yertle.penDown();
  drawTriangle(120*scale);
 
  }
  
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
  
  private void drawFireworks (int fireworks ) {
    
    
    double  x;  // x-coordinate for position
    double  y;  // y-coordinate for position
    int  c;  // the color for the starburst
    
    for ( int i=1 ; i<=fireworks ; i++ ) {
      x = (int)(301*random())-150;
      y = (int)(301*random())-150;
      c = (int)(16777216*random());
      yertle.setPenColor(new Color(c));
      yertle.moveTo(x,y);
      drawStarburst(30);
    };
    
  };  // drawFireworks
  
  
  /** This method draws a starburst.                                           */
  
  private void drawStarburst (double radius) {
    
    for ( int i=1 ; i<=10 ; i++ ) {
      yertle.forward(2*radius/3);
      yertle.penDown();
      yertle.forward(radius/3);
      yertle.penUp();
      yertle.backward(radius);
      yertle.right(PI/5);
    };
    
  };  // drawStarburst
  
  public static void main ( String[] args ) { SceneFour s = new SceneFour(); };
  
  
  
}  // Scene
