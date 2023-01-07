package controller;
import model.FileOperations;
import model.InvoiceHeader;
import model.invoicesTableModel;
import model.itemsTableModel;
import model.InvoiceLine;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.event.ListSelectionEvent;

import javax.swing.event.ListSelectionListener;
import view.View;
import view.addInvoDialoge;
import view.editlineDialoge;
public class ControllerInv implements ActionListener , ListSelectionListener
{


    final private View FramApplication;



    private addInvoDialoge DialogeInvo;

    private editlineDialoge DialogeItem;
   

   public ControllerInv(View frame) {
        this.FramApplication = frame;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "Create New Invoice":
                newInv();
                break;
            case "Delete Invoice":
                delInv();
                break;
            case "Save changes":
               EditLine();
                break;
            case "Cancel":
                removeEditLine();
                break;

            case "createNewInvoice":
                InvoiceOk();
                break;

            case "cancelInvoice":
                InvoCancel();
                break;
            case "updateitem":
                LineEditing();
                break;
            case "cancelchanges":
                Linecancel();
                break;
                
                

            case "UpLoad File":

                FramApplication.setInvos(null);
                FileOperations FileOperations = new FileOperations(FramApplication);
                ArrayList<InvoiceHeader> inv= FileOperations.FRead();
                FramApplication.setInvos(inv);
                invoicesTableModel invoiceTable = new invoicesTableModel(inv);
                FramApplication.setHeaderTable(invoiceTable);
                FramApplication.getInvHeaderTab().setModel(invoiceTable);
                FramApplication.getHeaderTab().fireTableDataChanged();

                break;

            case "Save File":
               
                FileOperations FileOperations1 = new FileOperations(FramApplication);
                FileOperations1.FileSave(FramApplication.getInvo());
              

                break;

        }
    }

    private void newInv() {
        DialogeInvo = new addInvoDialoge(FramApplication);

        DialogeInvo.setVisible(true);

    }

    private void delInv() {

        int row = FramApplication.getInvHeaderTab().getSelectedRow();

        if(row!= -1){

            FramApplication.getInvo().remove(row);
            FramApplication.getHeaderTab().fireTableDataChanged();

        }
    }

    private void EditLine() {//update line

        DialogeItem = new editlineDialoge(FramApplication);

        DialogeItem.setVisible(true);

    }

    private void removeEditLine() {

        int SelectedInvo= FramApplication.getInvHeaderTab().getSelectedRow();

        int row = FramApplication.getInvLineTab().getSelectedRow();

        if((SelectedInvo!=-1) && (row!= -1)){

            InvoiceHeader INvo = FramApplication.getInvo().get(SelectedInvo);
            INvo.getInvoiceLines().remove(row);
            FramApplication.getHeaderTab().fireTableDataChanged();
            itemsTableModel line = new itemsTableModel(INvo.getInvoiceLines());
            FramApplication.getInvLineTab().setModel(line);
            line.fireTableDataChanged();
        }
    }

    public void InvoiceOk() {

        String invDate= DialogeInvo.getDateOfInv().getText();
        String Client = DialogeInvo.getNameOfCus().getText();
        int invNum= FramApplication.getTotalInvNo();
        invNum++;
        InvoiceHeader newInvoice = new InvoiceHeader(invNum,invDate,Client);
        FramApplication.getInvo().add(newInvoice);

        FramApplication.getHeaderTab().fireTableDataChanged();
        DialogeInvo.setVisible(false);

        DialogeInvo.dispose();
        DialogeInvo =null;

    }


    private void InvoCancel() {

        DialogeInvo.setVisible(false);

        DialogeInvo.dispose();

        DialogeInvo =null;


    }

    @Override
    public void valueChanged(ListSelectionEvent e)
    {
       //
    }

    private void Linecancel() {

        DialogeItem.setVisible(false);

        DialogeItem.dispose();

        DialogeItem = null;

    }
    private void LineEditing() {
        
        int SelectedInv= FramApplication.getInvHeaderTab().getSelectedRow();
//        int selectedRow= FramApplication.getInvLineTab().getSelectedRow();
        if(SelectedInv!=-1){
            InvoiceHeader invoice = FramApplication.getInvo().get(SelectedInv);
           
            String item= DialogeItem.getNameOfItm().getText();
            String unitPrice = DialogeItem.getPricePerUnit().getText();
            String quantity = DialogeItem.getNOFItm().getText();
            double itemUnitPrice = Double.parseDouble(unitPrice);
            int itemQuantity = Integer.parseInt(quantity);
//            FramApplication.getInvLineTab().setValueAt(invoice, selectedRow, 0);
//            FramApplication.getInvLineTab().setValueAt(item, selectedRow, 1);
//            FramApplication.getInvLineTab().setValueAt(itemUnitPrice, selectedRow, 2);
//             FramApplication.getInvLineTab().setValueAt(itemQuantity, selectedRow, 3);
            InvoiceLine newLine = new InvoiceLine(invoice,item,itemUnitPrice,itemQuantity);
            invoice.getInvoiceLines().add(newLine);
            itemsTableModel line = new itemsTableModel(invoice.getInvoiceLines());
            FramApplication.getHeaderTab().fireTableDataChanged();
            FramApplication.getInvLineTab().setModel(line);
            line.fireTableDataChanged();
        
        }
         
       
     
        
        DialogeItem.setVisible(false);

        DialogeItem.dispose();

        DialogeItem =null;

    }
   

}

