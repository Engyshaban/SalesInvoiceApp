package view;
import view.View;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class editlineDialoge extends JDialog
{
    private JTextField itemName;
    private JTextField itmcount;
    private JTextField itemprice;
    private JLabel itemNameLb;
    private JLabel priceitemLbl;
    private JLabel NumItm;
    private JButton BtnCancel;
    private JButton OKBtn;

    public editlineDialoge(View frame) {

        itemNameLb = new JLabel("Item Name:");
        itemName = new JTextField(30);
        priceitemLbl = new JLabel("Item Price:");
        itemprice = new JTextField(30);
        NumItm = new JLabel("Count:");
        itmcount = new JTextField(30);
        OKBtn = new JButton("OK");
         OKBtn.addActionListener(frame.getCtrl());
        OKBtn.setActionCommand("updateitem");
        getContentPane().setBackground(Color.white);
        BtnCancel = new JButton("Cancel");
        BtnCancel.addActionListener(frame.getCtrl());
        BtnCancel.setActionCommand("cancelchanges");
        getContentPane().setBackground(Color.white);
        setLayout(new GridLayout(4, 4));
        add(itemNameLb);
        add(itemName);
        add(priceitemLbl);
        add(itemprice);
        add(NumItm);
        add(itmcount);
        add(OKBtn);
        add(BtnCancel);

        pack();
    }

    public JTextField getNameOfItm()
    {
        return itemName;
    }

    public JTextField getPricePerUnit() {
        return itemprice;
    }

    public JTextField getNOFItm() {
        return itmcount;
    }
}
