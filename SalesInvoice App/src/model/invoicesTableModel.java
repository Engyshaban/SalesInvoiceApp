
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class invoicesTableModel extends AbstractTableModel {
    
   
    private ArrayList<InvoiceHeader> invs;

    public invoicesTableModel(ArrayList<InvoiceHeader> invs)
    {
        this.invs = invs;
    }

    @Override
    public int getRowCount()
    {
        return invs.size();
    }

    

    @Override
    public Object getValueAt(int indexRow, int indexCol) {

        InvoiceHeader invoice = invs.get(indexRow);
        switch(indexCol){
            case 0:
                return invoice.getInvnum();

            case 1:
                return invoice.getInvdate();

            case 2:
                return invoice.getCstname();

            case 3:
                return invoice.getInvTotal();

        }

        return null;
    }
 @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
    }
    
    @Override
   public String getColumnName(int columnIndex){
      switch (columnIndex) {
          case 0 :
              return "No.";
          case 1 :
              return "Date";
          case 2 :
              return "Customer";
          case 3 :
              return "Total";
          default:
              return "";
      }
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
}

