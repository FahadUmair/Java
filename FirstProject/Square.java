
import Media.*;
import static java.lang.Math.*;
import static java.awt.Color.*;



public class Square{
  
  private TurtleDisplayer display;
  private Turtle yertle;
  
  public Square(){
    
    System.out.println("Hello");
    System.out.println("My name is Fahad");
    display = new TurtleDisplayer();
    yertle = new Turtle();
    display.placeTurtle(yertle);
    yertle.penDown();
    yertle.forward(40);
    yertle.right(PI/2);
    yertle.forward(40);
    yertle.right(PI/2);
    yertle.forward(40);
    yertle.right(PI/2);
    yertle.forward(40);
    yertle.right(PI/2);
    yertle.penUp();
    display.close();
    
  }
  
  //This will run as soon as the run button is pressed.
  //This is called the main method. 
  
  public static void main(String[]args){
    
//Execute Square()
    Square s=new Square();
    
  }
  
}