package model;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
public class itemsTableModel extends AbstractTableModel
{
 
    
    private ArrayList<InvoiceLine> InvoiceLineitem;

    public itemsTableModel(ArrayList<InvoiceLine> InvoiceLineitem)
    {
        this.InvoiceLineitem = InvoiceLineitem;
    }

    @Override
    public int getRowCount()
    {
        return InvoiceLineitem.size();
    }

    @Override
    public int getColumnCount()
    {
        return 5;
    }

    @Override
    public Object getValueAt(int indexR, int indexCol) {

        InvoiceLine invoiceLine = InvoiceLineitem.get(indexR);
        switch(indexCol){
            case 0:
                return invoiceLine.getInv().getInvnum();

            case 1:
                return invoiceLine.getItemName();

            case 2:
                return invoiceLine.getItemPrice();

            case 3:
                return invoiceLine.getCount();

            case 4:
                return invoiceLine.getTLine();

        }

        return null;

    }

    @Override
    public String getColumnName(int columnIndex)
    {
         switch (columnIndex) {
          case 0 :
              return "No.";
          case 1 :
              return "Item Name";
          case 2 :
              return "Item Price";
          case 3 :
              return  "Count";
          case 4 :
              return  "Item Total";
          default:
              return "";
      }
    }
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
    }

  
}
