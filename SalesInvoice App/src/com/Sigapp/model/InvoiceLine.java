
package com.Sigapp.model;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;


public class InvoiceLine {
     Header inv;
     String ite_name;
     int ite_count;
     double ite_price;
    double totalprice;
    
    
    
    

    public InvoiceLine(Header inv, String ite_name, int ite_count, double ite_price) {
        this.inv = inv;
        this.ite_name = ite_name;
        this.ite_count = ite_count;
        this.ite_price = ite_price;
    }

    public InvoiceLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "inv=" + inv + ", ite_name=" + ite_name + ", ite_count=" + ite_count + ", ite_price=" + ite_price + '}';
    }
   
    public Header getInv() {
        return inv;
    }

    public void setInv(Header inv) {
        this.inv = inv;
    }

    public String getIte_name() {
        return ite_name;
    }

    public void setIte_name(String ite_name) {
        this.ite_name = ite_name;
    }

    public int getIte_count() {
        return ite_count;
    }

    public void setIte_count(int ite_count) {
        this.ite_count = ite_count;
    }

    public double getIte_price() {
        return ite_price;
    }
    
    public void setIte_price(double ite_price) {
        this.ite_price = ite_price;
       
    }
    
    public double gettotalprice() {   // calculate invoice for each item
        return ite_price*ite_count ;
    }
    
    public static void main(String[] args){
//      String  s1= new Object listOfInvoice(filepath1);
//       String s2=new Object listOfInvoice(filepath2);
//   
//           if (s1.compareTo(s2) > 0){
//
//        System.out.println(String toString().compareToIgnoreCase( Object listOfInvoice));
//           }
//        
//        
 }

    public void setInv(int numinv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
