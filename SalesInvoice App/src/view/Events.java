package view;
import view.View;
import model.InvoiceHeader;
import model.itemsTableModel;
import model.InvoiceLine;


import javax.swing.event.ListSelectionEvent;

import javax.swing.event.ListSelectionListener;

import java.util.ArrayList;

public class Events implements ListSelectionListener
{
    final private View Fr;

    public Events(View Fr) {
        this.Fr = Fr;
    }
 
 

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int IndexInv = Fr.getInvHeaderTab().getSelectedRow();
        if(IndexInv!= -1){

            InvoiceHeader selectedRow = Fr.getInvo().get(IndexInv);
            ArrayList<InvoiceLine> invoiceLines = selectedRow.getInvoiceLines();
            Fr.getIabelCName().setText(selectedRow.getCstname());
            Fr.getIabelInvNumber().setText(""+selectedRow. getInvnum());
            Fr.getIabelInvDate().setText(selectedRow.getInvdate());
            Fr.getIabelTCost().setText(""+selectedRow.getInvTotal());
            itemsTableModel LTH = new itemsTableModel(invoiceLines);
            Fr.getInvLineTab().setModel(LTH);
            LTH.fireTableDataChanged();

        }
    }

}
