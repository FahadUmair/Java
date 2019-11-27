package Lab_10_1;


import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class MakeInvFile {
    
    private ASCIIDataFile     invData;//reading from txt file
    private BinaryOutputFile  newInvData;//writes to .bin file
    ASCIIDisplayer            display;
    
// instance variables
    
    
    /** This constructor ...                                                     */
    
    public MakeInvFile ( ) {

      Item anItem;
      
      int numItem; //number of items in the file
            
      invData= new ASCIIDataFile();
      newInvData=new BinaryOutputFile();
      display=new ASCIIDisplayer();
      
      numItem=0;  
      
      for(;;){
      anItem=new Item(invData);
      if(invData.isEOF())break;
      
      numItem++; //numItem +=1; // add 1 to original value of numItem
      
      newInvData.writeObject(anItem);
      }
      
      display.writeString("Number of records created: ");
      display.writeInt(numItem);
      
      
      invData.close();
      newInvData.close();
      display.close();
      
        // statements
        
    }; // constructor
    
    
    // methods

    
    // For main classes only:
    public static void main ( String[] args ) { MakeInvFile c = new MakeInvFile(); };
    
    
} // <className>
