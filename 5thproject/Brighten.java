package Lab_5_1;


import Media.*;                  // for Picture and PictureDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Brighten {
    
    
    // instance variables
    PictureDisplayer display;
    
    /** This constructor ...                                                     */
    
    public Brighten ( ) {

      Picture pic;
        // local variables
      
      display= new PictureDisplayer();
      pic=new Picture();
      display.placePicture(pic);
      display.waitForUser();
      makeBrighten(pic,2);
      display.close();
      pic.save();//saves the output
        // statements including call to method
        
    }; // constructor
    
    private void makeBrighten(Picture newPic, double amount){
    
    Pixel p;  //current pixel
    
    int r;  // red values of the current pixel
    
    int g;  // green values of the current pixel
    
    int b;  //the blue value of the current pixel
    
    while(newPic.hasNext()){
    
      //make p store the current pixel
      
      p=newPic.next();
        
      r=clip((int)(p.getRed()*amount));
      g=clip((int)(p.getGreen()*amount));
      b=clip((int)(p.getBlue()*amount));
      
      p.setRed(r);
      p.setGreen(g);
      p.setBlue(b);
     
      // we now set our new colours
      
    };
    
    }
    // methods

    
    private int clip (int val){
    
      if(val>255){
      
        val=255;
      
      }
      return val;
    
    };
    
    
    
    public static void main ( String[] args ) { Brighten s = new Brighten(); };
    
    
} // <className>
