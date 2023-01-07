package model;
import view.View;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class FileOperations {
    final private View Fr;
    public FileOperations(View Fr) {
        this.Fr = Fr;
    }

    
   public ArrayList<InvoiceHeader> FRead(){
       

        String ItmPath;
        String HPath;
        File FHeader ;
        File FItm;
        List<String> LinHeader=null;
        List<String> LinItms=null;
        int res;
        ArrayList<InvoiceHeader> ArrayForInvo = new ArrayList<>();

        JOptionPane.showMessageDialog(Fr, "Please insert Headers File then Lines File");

        JFileChooser ChosenF = new JFileChooser();
        do{
            res = ChosenF.showOpenDialog(Fr);
            if (res == JFileChooser.APPROVE_OPTION) {
                FHeader = ChosenF.getSelectedFile();
                if(FHeader.getName().contains(".csv")){
                    HPath=FHeader.getAbsolutePath();
                    break;
                }
                else{
                    System.out.println("Wrong Headers File Format");
                    JOptionPane.showMessageDialog(Fr, "Wrong Headers File Format please insert the correct ChosenF again");
                }
            }
        }while(true);
        do{
            res = ChosenF.showOpenDialog(Fr);

            if (res == JFileChooser.APPROVE_OPTION) {
                FItm = ChosenF.getSelectedFile();
                if(FItm.getName().contains(".csv")){
                    ItmPath= FItm.getAbsolutePath();
                    break;
                }

                else
                {
                    System.out.println("Wrong Items File Format");
                    JOptionPane.showMessageDialog(Fr, "Wrong Items File Format");
                }

            }
        }while(true);

        System.out.println(HPath);
        System.out.println(ItmPath);


        try {
            LinHeader = Files.lines(Paths.get(HPath)).collect(Collectors.toList());
        } catch (IOException Excep) {
            System.out.println("Wrong Headers File Path");
            JOptionPane.showMessageDialog(Fr, "Wrong Headers File Path");
        }


        try {
            LinItms = Files.lines(Paths.get(ItmPath)).collect(Collectors.toList());
        } catch (IOException Excep) {
            System.out.println("Wrong Items File Path");
            JOptionPane.showMessageDialog(Fr, "Wrong Items File Patth");
        }



        if(LinHeader!=null && LinItms !=null){
            for (String LineH : LinHeader) {
                String[] LinArr = LineH.split(",");
                String numToString = LinArr[0];
                String date = LinArr[1];
                String customerName = LinArr[2];
                int No = Integer.parseInt(numToString);
                InvoiceHeader Invo = new InvoiceHeader(No,date,customerName);
                ArrayForInvo.add(Invo);
                Fr.getInvo().add(Invo);

            }
            for (String itmLin : LinItms)
            {
                String[] ItmArr = itmLin.split(",");

                int No = Integer.parseInt(ItmArr[0]);

                String FrName = ItmArr[1];

                double PricePerUnit = Double.parseDouble(ItmArr[2]);
                int NOFUnits = Integer.parseInt(ItmArr[3]);

                InvoiceHeader invo= getInvByNum(No);

                InvoiceLine Itmline = new InvoiceLine(invo,FrName,PricePerUnit,NOFUnits);

                invo.getInvoiceLines().add(Itmline);

            }
        }

        return ArrayForInvo;
    }
    public InvoiceHeader getInvByNum(int num){

        for(InvoiceHeader invo : Fr.getInvo()){

            if(invo.getInvnum()==num){
                return invo;
            }
        }
        return null;

    }
    public void FileSave(ArrayList<InvoiceHeader> invoiceHeaders)
    {
        String itms = "";
        String invos = "";
        File FileLin;
        File FileHedar;
        int res;

        for(InvoiceHeader invoiceHeader : invoiceHeaders){
            String HLines = invoiceHeader.getInvoFTable();

            invos=invos + HLines;

            invos=invos + "\n";

            for(InvoiceLine invoiceLine : invoiceHeader.getInvoiceLines())
            {
                String FItm = invoiceLine.getItmsFTable();
                itms = itms + FItm;
                itms = itms+"\n";
            }
        }

        JOptionPane.showMessageDialog(Fr, "Kindly choose the Headers file then Lines file");
        JFileChooser file = new  JFileChooser();
        do{
            res = file.showSaveDialog(Fr);
            if(res == JFileChooser.APPROVE_OPTION){

                FileHedar = file.getSelectedFile();

                if(FileHedar.getName().contains(".csv")){

                    FileWriter headFileWriter = null;
                    try {
                        headFileWriter = new FileWriter(FileHedar);

                        headFileWriter.write(invos);

                        headFileWriter.flush();

                        break;
                    } catch (IOException Excep)
                    {
                        Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, Excep);

                    }
                    finally
                    {
                        try
                        {
                            headFileWriter.close();
                        }
                        catch (IOException Excep)
                        {
                            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, Excep);
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong Headers File Format");
                    JOptionPane.showMessageDialog(Fr, "Wrong Headers File Format");
                }
            }
        }
        while(true);

        do
        {
            res = file.showSaveDialog(Fr);

            if(res == JFileChooser.APPROVE_OPTION)
            {
                FileLin= file.getSelectedFile();

                if(FileLin.getName().contains(".csv"))
                {
                    FileWriter lineFileWriter = null;
                    try
                    {
                        lineFileWriter = new FileWriter(FileLin);
                        lineFileWriter.write(itms);
                        lineFileWriter.flush();
                        break;
                    }
                    catch (IOException Excep)
                    {
                        Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, Excep);
                    }
                    finally
                    {
                        try
                        {
                            lineFileWriter.close();
                        }
                        catch (IOException ex)
                        {
                            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
            else
            {
                System.out.println("Wrong Lines File Format");

                JOptionPane.showMessageDialog(Fr, "Wrong Lines File Format");
            }
        }
        while(true);
    }
}