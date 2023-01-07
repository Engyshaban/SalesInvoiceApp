
package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Date;
import javax.swing.JOptionPane;

public class controllerfile {

   String filepath;
    String editTerm;
    String invnum;
    String ite_name;
    String ite_price;
    String ite_count;
    int Amountfields;
        
     public static void filepath() {
//             File filepath1 =new File("InvoiceHeader.CSV");
//             File filepath2 =new File("InvoiceLine.CSV");
//             File filepath3 =new File("tmp.txt");
        }
        
    public static void removeRecordCSV(String filepath,String removeTerm) throws IOException{
                                String tempfile = "temp.txt";
                                File oldfile = new File(filepath);
                                File newfile = new File(tempfile);

            String invnum=""; String invdate="";  String cstname=""; 
      try { 
           FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw); 
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc =new Scanner(new File(filepath));
           sc.useDelimiter("[,\n]");
                              while(sc.hasNext()){
                                 invnum=sc.next();
                                 invdate=sc.next();
                                 cstname=sc.next();
                                
                                 if(!invnum.equals(removeTerm)){
                                 pw.println(invnum+","+invdate+","+cstname);
                                 }
                               }       
                    sc.close();
                    pw.flush();
                    pw.close();
                              oldfile.delete();
                              File dump =new File(filepath);
                              newfile.renameTo(dump);
        }
          catch(Exception e)  {
        JOptionPane.showMessageDialog(null, "Error");}
     }
          
    public static void editRecord(String filepath, String editTerm, String ninvnum , String nite_name,String nite_price,String nite_count){
            String tempfile = "temp.txt";
            File oldfile = new File(filepath);
            File newfile = new File(tempfile); 
            String invnum =""; String ite_name=""; String ite_price="";String ite_count="";  
            try { 
            FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw); 
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc =new Scanner(new File(filepath));
            sc.useDelimiter("[,\n]");
                  while(sc.hasNext()){
                    invnum  =sc.next();
                     ite_name =sc.next();
                      ite_price=sc.next();
                      ite_count=sc.next();
                    if(invnum.equals(editTerm))// make sure i edit in the right record 
                    {
                    pw.println(ninvnum+" ,"+nite_name+" ,"+ nite_price +", "+ nite_count);}
                    else{
                     pw.println(invnum+" ,"+ite_name+" ,"+ite_price+", "+ ite_count) ;
                       } 
                  } 
                    sc.close();    
                         pw.flush();
                         pw.close();
                         oldfile.delete();
                         File dump =new File(filepath);
                          newfile.renameTo(dump);
           } catch(Exception e){ }                                       
    
    }
   
  
    public static void saveRecorder(int invnum, Date invdate, String cstname,String filepath){
        
        try{
            FileWriter fw= new FileWriter(filepath,true);
           BufferedWriter bw = new BufferedWriter(fw); 
           PrintWriter pw=new PrintWriter(bw);
           pw.println( invnum+","+ invdate+","+  cstname);
           pw.flush();
            pw.close();
            JOptionPane.showMessageDialog(null, "record saved");
        }catch(Exception E){
        JOptionPane.showMessageDialog(null, "record Not saved");
        }
  }
      
    
     public static void searchNfile(String filepath,String searchTerm){
        
          boolean found=false;
          String invnum =""; String ite_name=""; String ite_price="";String ite_count="";  
          
         try{
           Scanner  sc=new Scanner (new File(filepath));
             sc.useDelimiter("[,\n]");
             while(sc.hasNext()&&!found){
                    invnum  =sc.next();
                    ite_name =sc.next();
                    ite_price=sc.next();
                    ite_count=sc.next();
                if(invnum.equals(searchTerm) )
                   {
                    found=true;
                    }
               }  
                    if(found=true){ 
                        JOptionPane.showMessageDialog(null,"invnum:"+ invnum+" ite_name:" +ite_name+ "ite_price:"+  ite_price+"ite_count:"+ite_count);
                        }
                        else{
                
                 JOptionPane.showMessageDialog(null,"no recorded found");
                
                             }
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Error");
                 }
         }
    
}