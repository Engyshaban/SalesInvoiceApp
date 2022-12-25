package com.Sigapp.model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    int invnum;
     Date invdate;
    String cstname ;
    double total;
    ArrayList<Item> items;
    Object InvItemTable;
    Object InvTable;
    public static void main(String[] args) throws IOException {
       
    }
    public InvoiceHeader(int invnum, Date invdate, String cstname, double total) {
        this.invnum = invnum;
        this.invdate = invdate;
        this.cstname = cstname;
        this.total = total;
    }

    public InvoiceHeader() {
       
    }
    public int getInvnum() {
        return invnum;
    }

    public void setInvnum(int invnum) {
        this.invnum = invnum;
    }

    public Date getInvdate() {
        return invdate;
    }

    public void setInvdate(Date invdate) {
        this.invdate = invdate;
    }

    public String getCstname() {
        return cstname;
    }

    public void setCstname(String cstname) {
        this.cstname = cstname;
    }

    public double getTotal() {
        double Total=0.0;    //get row count here //convert it to string and display in jtable
        for (int i=0;i<InvTable.getRowCount();i++)
        { int ite_count=Integer.parseInt((String)InvTable.getValueAT(i,3)));
          totalprice+= new gettotalprice();
        }
        Total.setText(String.valueof(totalprice));
        return Total++;
        }

        
public ArrayList<Item> getItems(ArrayList Items) {
       ArrayList Item;
         (Item = null)
        Items =new ArrayList(); 
        return items;
}

public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "invnum=" + invnum + ", invdate=" + invdate + ", cstname=" + cstname + ", total=" + total + ", items=" + items + '}';
    }
    
    
    
    

    private static class Item {

        Object listOfInvoice;

        }

    private static class gettotalprice {

        public gettotalprice() {
            
        }
    }
    
    
 }
    
        
         
