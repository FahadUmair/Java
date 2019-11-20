package Lab_9_1;


import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions


/** This class is a program to do a simple inventory control producing a report.
  * 
  * @author David Hughes
  * 
  * @version 1.1 (Nov. 2016)                                                    */

public class Inventory {
    
    
    private ASCIIDataFile    invData;     // data file for inventory info
    private ASCIIOutputFile  newInvData;  // new (updated) inventory file
    private ReportPrinter    report;      // printer for report
    BasicForm                form;
    
    /** The constructor does the day-end inventory control for a small company
      * generating a report.                                                    */
    
    public Inventory ( ) {
        
        
        int     reorder;     // reorder point
        int     oQuant;      // old quantity on hand
        
        int     sold;        // number sold
        int     numReorder;  // number of items requiring reorder
        
        invData = new ASCIIDataFile();
        
        newInvData = new ASCIIOutputFile();
        report = new ReportPrinter();
        form=new BasicForm();
        buildForm();
        setUpReport();
        numReorder = 0;
        
        
        for ( ; ; ) {
        itemNum = new Item(invData);
        if ( invData.isEOF() ) break;
            
        fillForm(anitem);
          
            form.accept(); //awits for user to press OK button
            
            sold=form.readInt("sold");
            oQuant=anItem.getQuantity;
            anItem.sell(sold);
            if ( anItem.shouldReorder() ) {
                writeDetail(anItem,oQuant,sold);
                numReorder = numReorder + 1;
            };
            anItem.write(newInvData);
        };
        writeSummary(numReorder);
        invData.close();
        newInvData.close();
        
        report.close();
        form.close();
        
    };  // constructor
    
    
    
    
    
    /** This method sets up the report, adding all fields.                      */
    
    private void setUpReport ( ) {
        
        report.setTitle("National Widgets","Inventory Control");
        report.addField("itemNum","Item #",6);
        report.addField("reorder","Reorder Pt",10);
        report.addField("oQuant","Old",8);
        report.addField("sold","Sold",8);
        report.addField("nQuant","New",8);
        
    };  // setUpReport
    
    
    /** This method generates a report detail line.
      * 
      * @param  itemNum   item number
      * @param  reorder   reorder point
      * @param  oQuant    old quantity
      * @param  sold      items sold
      * @param  nQuant    new quantity                                          */
    
    private void writeDetail ( Item anItem, int oQuant, int sold) {
        
        report.writeString("itemNum",anItem.getItemNum());
        report.writeInt("reorder",anItem.getreorder());
        report.writeInt("oQuant",oQuant);
        report.writeInt("sold",sold);
        report.writeInt("nQuant",anItem.getQuantity);
        
    };  // writeDetail
    
    
    /** This method generates the report summary.
      * 
      * @param  numReorder number of items requiring reorder                     */
    
    private void writeSummary ( int numReorder ) {
        
        report.writeLine("# Items to Reorder: "+numReorder);
        
    };  // writeSummary
    
    
    /** This method writes a record to the new inventory file.
      * 
      * @param  itemNum  item number
      * @param  reorder  reorder point
      * @param  quant    quantity                                                */
    
    private void writeInvData ( String itemNum, int reorder, int quant ) {
        
        newInvData.writeString(itemNum);
        newInvData.writeInt(reorder);
        newInvData.writeInt(quant);
        newInvData.newLine();
        
    };  // writeInvData
    
    private void buildForm(){
    form.setTitle("Inventory");
    form.addTextField("itemNum","Item #",10,10,10);
    form.setEditable("itemNum",false);//setEditable("varName",Boolean)
    form.addTextField("reorder","Reorder Point",5,10,40);
    form.setEditable("reorder",false);
    form.addTextField("quantity","Quantity on Hand",5,10,70);
    form.setEditable("quantity",false);
    form.addTextField("sold","Number Sold",5,10,100);
    form.setEditable("sold",true);// its okay even if we don't specify this line, because naturally everything is editable
    
    }
    
    private void fillForm(Item anItem){
    
//    form.clearAll();
//    form.writeString("itemNum",itemNum);
//    form.writeInt("reorder",reorder);
//    form.writeInt("quantity",quantity);
    
      form.writeString("itemNum",anItem.getItemNum());
        form.writeInt("reorder",anItem.getreorder());
        form.writeInt("quant",anItem.getQuantity());
        form.writeInt("sold");
       
      
      
    }
    
    
    public static void main ( String[] args ) { Inventory i = new Inventory(); };
    
    
}  // Inventory