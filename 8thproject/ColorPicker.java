package Lab_8_1;

import BasicIO.*;
import Media.*;                  // for Picture and PictureDisplayer
import java.awt.*;               // for Color class


/** This class is a program to show color represented by RGB value.
  * 
  * @author  D. Hughes
  * 
  * @version  1.0 (June 2013)
  * 
  * new concepts: Picture constructor, function method                           */

public class ColorPicker {
  
  
  BasicForm form;
  private PictureDisplayer  display;  // display for picture
  
  
  /** The constructor creates and displays the color swatch.                   */
  
  public ColorPicker ( ) {
    
    Picture        pic=new Picture(1,1);     // picture to be displayed
    int button=0;// which button has been pressed
    int r=0;//red channel
    int g=0;
    int b=0;
    Color c;//creating a new color based on rgb values read
                       //0   ,  1   , 2
    form=new BasicForm("View","Save","Quit");
    buildform();
    
    for(;;){
      
      button=form.accept(); // read which button has been clicked
      
      if (button ==2){//Quit
        
        break;
        
      }
      
      if (button ==1){//Save
        pic.save();
        
      }
      
      if (button ==0){//View
        
        
        r=form.readInt("r");
        g=form.readInt("g");
        b=form.readInt("b");
        
        
        c=new Color(r,g,b);
        
        pic=makeSwatch(200,200,c);
        form.placePicture("pic",pic);
        
        
      }
      
    }
    
    
    
  };  // constructor
  
  
  public void buildform(){
  
  form.setTitle("Color Picker");
  //addCanvas("varName", "Canvas Title", width,height, x,y)
  form.addCanvas("pic","Color",200,200,25,10);
  //addTextField("varName", "Text Field Title", width, x,y)
  form.addTextField("r","Red",3,10,240);
  form.addTextField("g","Green",3,90,240);
  form.addTextField("b","Blue",3,170,240);
  
  }
  
  private Picture makeSwatch ( int width, int height, Color aColor ) {
    
    Picture  result;  // picture for swatch
    Pixel    p;       // a pixel of the picture
    
    result = new Picture(width,height);
    while ( result.hasNext() ) {
      p = result.next();
      p.setColor(aColor);
    };
    return result;
    
  };  // makeSwatch
  
  
  public static void main ( String[] args )
  { ColorPicker c = new ColorPicker(); } ;
  
}  // ColorPicker