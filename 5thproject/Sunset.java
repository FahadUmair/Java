package Lab_5_1;


import Media.*;                  // for Picture and PictureDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Sunset {
    
    
    // instance variables
    PictureDisplayer display;
    
    /** This constructor ...                                                     */
    
    public Sunset ( ) {

      Picture pic;
        // local variables
      
      display= new PictureDisplayer();
      pic=new Picture();
      display.placePicture(pic);
      display.waitForUser();
      makeSunset(pic);
      display.close();
      pic.save();//saves the output
        // statements including call to method
        
    }; // constructor
    
    private void makeSunset(Picture newPic){
    
    Pixel p;  //current pixel
    
    int g;  // green values of the current pixel
    
    int b;  //the blue value of the current pixel
    
    while(newPic.hasNext()){
    
      //make p store the current pixel
      
      p=newPic.next();
        
      g=(int)(p.getGreen()*0.7);//our new green colour

      p.setGreen(g);
      
      b=(int)(p.getBlue()*0.7);
      
      p.setBlue(b);
    }
    
    }
    // methods

    
    
    public static void main ( String[] args ) { Sunset s = new Sunset(); };
    
    
} // <className>
