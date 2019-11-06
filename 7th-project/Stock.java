package Lab_7_1;


import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Stock {
    
    
  ASCIIDataFile file;
  ReportPrinter report;
  
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Stock ( ) {
      
      file= new ASCIIDataFile();
      report=new ReportPrinter();
         
      
      String itemNum;
      int reorder=0;//reorder point
      int quantity=0;//quantity
      int numReorder=0;//number of items requiring reorder
      
      
      setUpReport();
      for(;;){
      
      itemNum = file.readString();      
      if(file.isEOF()){//checks if we reached end of file
        break;
      }
      
      reorder=file.readInt();
      quantity=file.readInt();
      if(quantity<=reorder){
      //put item in pdf
      writeDetail(itemNum, reorder, quantity);
      numReorder++;
      
      }
      
      }
      writeSummary(numReorder);
      file.close();
      report.close();
      
    }; // constructor
    
    private void setUpReport(){
    
    
      report.setTitle("National Widgets","Inventory Control");
    
      //("variablename","title of column", width)
      
      report.addField("ItemNum","Item #", 10);//left col
    report.addField("reorder","Reorder Pt", 10);//middle col
    report.addField("quantity","Quantity", 10);//right col
      
      
    }
    
    private void writeDetail(String itemNum,int reorder, int quantity){
    
    report.writeSting("itemNum",itemNum);
    report.writeInt("reorder",reorder);
    report.writeInt("quantity",quantity);
    
    }
    
    
    private void writeSummary(int numReorder){
    
      report.writeLine("# Items to Reorder: "+ numReorder);
    
    }
    // methods

    
    
    public static void main ( String[] args ) { Stock c = new Stock(); };
    
    
} // <className>
