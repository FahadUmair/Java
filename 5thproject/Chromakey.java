package Lab_5_1;


import Media.*;                  // for Picture and PictureDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Chromakey {
    
    
    // instance variables
    PictureDisplayer display;
    
    
    /** This constructor ...                                                     */
    
    public Chromakey ( ) {

      Picture background;
      Picture foreground;
        // local variables
      
      display= new PictureDisplayer();
      
      background=new Picture(640,480);
      display.placePicture(background);
      display.waitForUser();
      
      
      foreground=new Picture(640,480);
      display.placePicture(foreground);
      display.waitForUser();
      
      fillIn(foreground,background);
      
      display.close();
      
      foreground.save();//saves the output
      background.save();//saves the output
        // statements including call to method
        
    }; // constructor
    
    private void fillIn(Picture foreground, Picture background){
    
    Pixel fPixel;  //current pixel for the foreground
    Pixel bPixel; // current pixel for the background
    
    
    while(foreground.hasNext()){
    
    fPixel= foreground.next();
    bPixel= background.next();
    
    if(fPixel.getDistance(GREEN)< 195){
    
    Color c= bPixel.getColor();//get the colour of the current pixel of the background
    fPixel.setColor(c);// set the colour of the background in the foreground image
    
    }
    
    
    
    }
    

    
    }
    // methods

    
   
    
    
    
    public static void main ( String[] args ) { Chromakey s = new Chromakey(); };
    
    
} // <className>
