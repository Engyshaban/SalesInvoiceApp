package view;
import view.View;
import java.awt.*;
import javax.swing.JDialog;

import javax.swing.JLabel;

import javax.swing.JButton;

import javax.swing.JTextField;

public class addInvoDialoge extends JDialog
{
    private JTextField cstNametxt;
    private JLabel CstName;

    private JTextField InvDate;
    private JLabel DateLb;

    private JButton BtCancel;
    private JButton submit;

    public addInvoDialoge(View frame) {

        CstName = new JLabel("Customer Name:");
        cstNametxt = new JTextField(20);
        DateLb = new JLabel("Date (dd/mm/yyyy)");
        InvDate = new JTextField(10);

       this.setSize(600, 100);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new FlowLayout());

        submit = new JButton("OK");
        BtCancel = new JButton("Cancel");
        submit.setActionCommand("createNewInvoice");
        BtCancel.setActionCommand("cancelInvoice");

        submit.addActionListener(frame.getCtrl());
        BtCancel.addActionListener(frame.getCtrl());

       

        add(CstName);
        add(cstNametxt);
        add(DateLb);
        add(InvDate);
        add(submit);
        add(BtCancel);


        pack();


    }

    public JTextField getNameOfCus()
    {
        return cstNametxt;
    }

    public JTextField getDateOfInv()
    {
        return InvDate;
    }

}
