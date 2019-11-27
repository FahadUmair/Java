package Lab_10_1;


import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class ListInvFile {
    
    
   private BinaryDataFile invData;//reads from .bin file
   private ASCIIDisplayer display;//outputs what we read from the . bin file on screen
   
    
    /** This constructor ...                                                     */
    
    public ListInvFile ( ) {

      Item anItem;
      
      int  numItem;
      
      invData=new BinaryDataFile();
      display=new ASCIIDisplayer();
      
      numItem=0;
      
      for(;;){
      
      anItem=(Item)invData.readObject();
        
      if(invData.isEOF()){break;};
      
      numItem++;
      writeDetail(anItem);
        
      }
      
  
      
      
      display.newLine();
      display.writeString("The num");
      display.writeInt(numItem);
      
      
      invData.close();
      display.close();
      
        // local variables
        
        // statements
        
    }; // constructor
    
        private void writeDetail(Item anItem){
      
      display.writeString(anItem.getItemNum());
      display.writeInt(anItem.getReorder());
      display.writeInt(anItem.getQuant());
      display.newLine();}
      
    // methods

    
    // For main classes only:
    public static void main ( String[] args ) { ListInvFile c = new ListInvFile(); };
    
    
} // <className>
