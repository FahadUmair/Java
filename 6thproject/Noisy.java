package Lab_6_1;


import Media.*;                  // for Picture and PictureDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Noisy {
  
  SoundPlayer player;
  // instance variables
  
  
  /** This constructor ...                                                     */
  
  public Noisy ( ) {
    
   Sound input;
   player= new SoundPlayer();
   input=new Sound();
   
   player.placeSound(input);
   player.waitForUser();
   
   makeNoisy(input,1000);
   player.close();
   input.save();

// local variables

// statements including call to method

}; // constructor
    
   
  
  private void makeNoisy ( Sound aSound, int nAmp ){
  
  Sample s;  //the current sample of sound passed
  int amp; // amplitude of the current sample
  
  int newAmp; //new amplitude of the current sample
  
  while(aSound.hasNext()){
  
    s= aSound.next(); //gotten the next sample
    
    amp= s.getAmp(); //the aplitude of current sample
    
    newAmp= (int)((2*nAmp+1)*random())-nAmp;
    
    s.setAmp(newAmp);
    
    
    
  }
  
  }
    
    
    // methods

    
    
    public static void main ( String[] args ) { Noisy s = new Noisy(); };
    
    
    } // <className>
