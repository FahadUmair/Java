package Lab_8_1;


import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions


/** This class is a program to do a simple inventory control producing a report.
  * 
  * @author David Hughes
  * 
  * @version 1.0 (Nov. 2013)                                                    */

public class Inventory {
  
  
  private ASCIIDataFile    invData;     // data file for inventory info
  private ASCIIPrompter prompter;       // new update inventory fiile
  private ASCIIOutputFile updatedFile;  // printer for report
  private ReportPrinter    report;      // printer for report
  
  
  /** The constructor does the day-end inventory control for a small company
    * generating a report.                                                    */
  
  public Inventory ( ) {
    
    String  itemNum;     // item number
    int     reorder=0;     // reorder point
    int     oQuant=0; //current quantity on hand
    int nQuant=0;// quantity on hand
    int sold=0; // number sold
    int     numReorder;  // number of items requiring reorder
    
    invData = new ASCIIDataFile();
    prompter= new ASCIIPrompter();
    updatedFile=new ASCIIOutputFile();
    report = new ReportPrinter();
//    set up ypur report
//    start reading from file. Hint use for(;;){...}
//    read itemNum
//    read reorder
//    read oQuant
//    set the label of promt to itemNum
//    find the sold value
//    #call writeDetal(itemNum,reorder,oQuant,sold nQuant);
//    #ONLY if you need to write to pdf
//    for all items, update their values by calling
//    updateFileInfo(itemNum, reorder, nQuant);
//    after looping through everything
//    write the summary
//    close the report, file and updatedFile
    setUpReport();
    numReorder = 0;
    for ( ; ; ) {
      itemNum = invData.readString();
      if ( invData.isEOF() ) break;
      reorder = invData.readInt();
      oQuant = invData.readInt();
      prompter.setLabel(itemNum);
      sold=prompter.readInt();
      nQuant=oQuant - sold;
      if ( nQuant <= reorder ) {
        writeDetail(itemNum,reorder,oQuant,sold,nQuant);
        numReorder = numReorder + 1;
      };
      updateFileInfo(itemNum,reorder,nQuant);
    };
    writeSummary(numReorder);
    invData.close();
    report.close();
    
  };  // constructor
  
  
  /** This method sets up the report, adding all fields.                      */
  
  private void setUpReport ( ) {
    
    report.setTitle("National Widgets","Inventory Control");
    report.addField("itemNum","Item #",10);//left most column
    report.addField("reorder","Reorder Pt",10);
    report.addField("oQuant","Old",10);
    report.addField("sold","Sold",10);
    report.addField("nQuant","New",10);//right most column
  };  // setUpReport
  
  
  /** This method generates a report detail line.
    * 
    * @param  itemNum  item number
    * @param  reorder  reorder point
    * @param  quant    quantity                                               */
  
  private void writeDetail ( String itemNum, int reorder, int oQuant,int sold, int nQuant ) {
    
    report.writeString("itemNum",itemNum);
    report.writeInt("reorder",reorder);
    report.writeInt("oQuant",oQuant);
    report.writeInt("sold",sold);
    report.writeInt("nQuant",nQuant);
    
  };  // writeDetail
 
  
  
  /** This method generates the report summary.
    * 
    * @param  numReorder number of items requiring reorder                     */
  
  private void writeSummary ( int numReorder ) {
    
    report.writeLine("# Items to Reorder: "+numReorder);
    
  };  // writeSummary
  
   private void updateFileInfo (String itemNum, int reorder,int quant){
  updatedFile.writeString(itemNum);
  updatedFile.writeInt(reorder);
  updatedFile.writeInt(quant);
  updatedFile.newLine();
  };
  
  
  public static void main ( String[] args ) { Inventory i = new Inventory(); };
  
  
}  // Inventory