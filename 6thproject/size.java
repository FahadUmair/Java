package Lab_6_1;


import Media.*;                  // for Picture and PictureDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class size {
  
  PictureDisplayer display;
  
  // instance variables
  
  
  /** This constructor ...                                                     */
  
  public size ( ) {
    
    Picture pic;
    
    display=new PictureDisplayer();
    pic=new Picture();
    
    
    display.placePicture(pic);
    
//      display.waitForUser();
    
    pic=crop(pic, 275,275,100,100);
PictureDisplayer display2;
display2=new PictureDisplayer(pic);
display.close();
display2.close();

pic.save();

// local variables

// statements including call to method

}; // constructor
    
   
    private Picture crop(Picture aPic, int x, int y, int width, int height){
      
      Picture result;
      result= new Picture(width,height);
      //keep in mind thst picture is zero based meaning that top left is (0,0) and bottom right (99,99)
      
      for(int r=y; r<y+ height; r++){//rows
      
        for(int c=x; c<x+width; c++){//columns
        
        //get the color of our current pixel:
          
          Color pixelColor= aPic.getPixel(c,r).getColor();
          // set the color that we just obtained into the result picture.
        
        result.getPixel(c-x,r-y).setColor(pixelColor);
          
          
        }
      
      }
          
          return result;
          
          };
    
    
    
    // methods

    
    
    public static void main ( String[] args ) { size s = new size(); };
    
    
    } // <className>
