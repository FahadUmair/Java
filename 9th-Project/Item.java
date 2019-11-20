package Lab_9_1;

import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions



public class Item{

  private String itemNum;
  private int reorder;
  private int quantity;
  
  public Item(ASCIIDataFile input){
  
  itemNum=input.readString();
  
  if(input.isEOF()==false){
  reorder=input.readInt();
  quantity=input.readInt();
  }
  
  }
  
  public String getItemNum(){
  
  return itemNum;
  }

  public int getReorder(){
  
  return reorder;
  }
  
  public int getQuantity(){
  
  return quantity;
  }
  
  public void sell(int num){
  
    quantity=quantity -num;
  }
  
  public void setReorder(int newReorder){
  
    reorder= newReorder;
  
  }
  
  public boolean shouldReorder(){
  
    if(quantity<=reorder){
    
    return true;
    
    }else{
    
    return false;
    
    }
  
  }
  
  
  public void write(ASCIIOutputFile output){
  
  output.writeString(itemNum);
  output.writeInt(reorder);
  output.writeInt(quantity);
  output.newLine();
  
  }
  
  
}