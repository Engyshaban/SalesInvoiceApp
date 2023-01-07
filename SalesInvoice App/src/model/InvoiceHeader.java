package model;



import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    int invnum;
    String invdate;
    String cstname ;
    double total;
    ArrayList<InvoiceLine> InvoiceLines;
   
    public InvoiceHeader(int invnum, String invdate, String cstname) {
        this.invnum = invnum;
        this.invdate = invdate;
        this.cstname = cstname;
       
    }

    public InvoiceHeader() {
       
    }
    public int getInvnum() {
        return invnum;
    }

    public void setInvnum(int invnum) {
        this.invnum = invnum;
    }

    public String getInvdate() {
        return invdate;
    }

    public void setInvdate(String invdate) {
        this.invdate = invdate;
    }

    public String getCstname() {
        return cstname;
    }

    public void setCstname(String cstname) {
        this.cstname = cstname;
    }

    public double getInvTotal(){
        double t=0.0;
        for(InvoiceLine InvoiceLine : getInvoiceLines()){

            t= t + InvoiceLine.getTLine();

        }

        return t;
    }

        
 public ArrayList<InvoiceLine> getInvoiceLines()
    {
        if(InvoiceLines ==null){

            InvoiceLines =new ArrayList();
        }

        return InvoiceLines;
    }

public void setItems(ArrayList<InvoiceLine> InvoiceLines) {
        this.InvoiceLines = InvoiceLines;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "invnum=" + invnum + ", invdate=" + invdate + ", cstname=" + cstname + ", InvoiceLines=" + InvoiceLines + '}';
   
 }
      public double getTotal()
    {
        double t=0.0;
        for(InvoiceLine invoiceLine : getInvoiceLines()){

            t= t+ invoiceLine.getTotal();
        }

        return t;
    }

    public String getInvoFTable()
    {
        return invnum + "," + invdate + "," + cstname;
    }

}
    
        
         
