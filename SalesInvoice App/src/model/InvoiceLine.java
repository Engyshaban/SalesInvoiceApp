
package model;


public class InvoiceLine {

	private String itemName;
	private double itemPrice;
	private int count;
        private InvoiceHeader inv;

    public InvoiceLine( InvoiceHeader invoiceHeader ,  String itemName, double itemPrice, int count) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public InvoiceHeader getInv() {
        return inv;
    }
     public void setInv(InvoiceHeader inv) {
        this.inv = inv;
          }
    
	 public double getTLine() {
        return itemPrice * count;
    }
         
	public String getItemName() {
		return itemName;
	}

       
        
        
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", count=" + count + '}';
    }
    
    
    public double getTotal()
    {
        return itemPrice * count;
    }
    
    
	 public String getItmsFTable(){
         
         return inv.getInvnum() + "," + itemName + "," + itemPrice + "," +count;
         }

    
                 
   
}

























































































