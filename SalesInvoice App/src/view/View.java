package view;

import model.InvoiceHeader;
import controller.ControllerInv;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.FileOperations;
import model.InvoiceLine;
import model.invoicesTableModel;
import model.itemsTableModel;


public class View extends JFrame   {

    public View() { 
        initComponents();
        
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NewInvButton = new javax.swing.JButton();
        NewInvButton.addActionListener(ctrl);
        DeleteInvoiceButton = new javax.swing.JButton();
        DeleteInvoiceButton.addActionListener(ctrl);
        SPJ1 = new javax.swing.JScrollPane();
        InvHeaderTab = new javax.swing.JTable();
        InvHeaderTab.getSelectionModel().addListSelectionListener(ActionTab);
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        IabelInvNumber = new javax.swing.JLabel();
        IabelTCost = new javax.swing.JLabel();
        IabelInvDate = new javax.swing.JTextField();
        IabelCName = new javax.swing.JTextField();
        SPJ2 = new javax.swing.JScrollPane();
        InvLineTab = new javax.swing.JTable();
        savechangesBtn = new javax.swing.JButton();
        savechangesBtn.addActionListener(ctrl);
        removechangesBtn = new javax.swing.JButton();
        removechangesBtn.addActionListener(ctrl);
        menuBar = new javax.swing.JMenuBar();
        BarMenu = new javax.swing.JMenu();
        MenuItemLoad = new javax.swing.JMenuItem();
        MenuItemLoad.addActionListener(ctrl);
        MenuItemSave = new javax.swing.JMenuItem();
        MenuItemSave.addActionListener(ctrl);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NewInvButton.setText("Create New Invoice ");
        NewInvButton.setActionCommand("Create New Invoice");
        NewInvButton.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                NewInvButtonComponentAdded(evt);
            }
        });
        NewInvButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewInvButtonMouseClicked(evt);
            }
        });
        NewInvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewInvButtonActionPerformed(evt);
            }
        });

        DeleteInvoiceButton.setText("Delete Invoice");
        DeleteInvoiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteInvoiceButtonMouseClicked(evt);
            }
        });
        DeleteInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceButtonActionPerformed(evt);
            }
        });

        InvHeaderTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InvHeaderTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvHeaderTabMouseClicked(evt);
            }
        });
        SPJ1.setViewportView(InvHeaderTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(NewInvButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteInvoiceButton)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(SPJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(SPJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewInvButton)
                    .addComponent(DeleteInvoiceButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Invoice Number");

        jLabel9.setText("Invoice Date");

        jLabel10.setText("Customer Name");

        jLabel11.setText("Invoice Total");

        IabelCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IabelCNameActionPerformed(evt);
            }
        });

        InvLineTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InvLineTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvLineTabMouseClicked(evt);
            }
        });
        SPJ2.setViewportView(InvLineTab);

        savechangesBtn.setText("Save changes");
        savechangesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savechangesBtnMouseClicked(evt);
            }
        });
        savechangesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savechangesBtnActionPerformed(evt);
            }
        });

        removechangesBtn.setText("Cancel ");
        removechangesBtn.setActionCommand("Cancel");
        removechangesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removechangesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(SPJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IabelCName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IabelInvDate, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IabelInvNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IabelTCost, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(savechangesBtn)
                .addGap(92, 92, 92)
                .addComponent(removechangesBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IabelInvNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(IabelInvDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(IabelCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IabelTCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(SPJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savechangesBtn)
                    .addComponent(removechangesBtn))
                .addGap(54, 54, 54))
        );

        BarMenu.setText("File");

        MenuItemLoad.setText("UpLoad File");
        MenuItemLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLoadActionPerformed(evt);
            }
        });
        BarMenu.add(MenuItemLoad);

        MenuItemSave.setText("Save File");
        MenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSaveActionPerformed(evt);
            }
        });
        BarMenu.add(MenuItemSave);

        menuBar.add(BarMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLoadActionPerformed

    }//GEN-LAST:event_MenuItemLoadActionPerformed

    private void MenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveActionPerformed
      

//           DefaultTableModel model = (DefaultTableModel)InvHeaderTab.getModel();
//            JFileChooser Chooser = new JFileChooser();
//            Chooser.showOpenDialog(null);
//            File fts = Chooser.getSelectedFile();
//           
//    try(FileWriter fw = new FileWriter(fts)){  
//        for (int i = 0; i < model.getColumnCount(); i++) {
//            fw.write(model.getColumnName(i) + ",");
//        }
//
//        fw.write("\n");
//
//        for (int i = 0; i < model.getRowCount(); i++) {
//            for (int j = 0; j < model.getColumnCount(); j++) {
//                fw.write(model.getValueAt(i, j).toString() + ",");
//            }
//            fw.write("\n");
//        }
//
//        fw.close();
//      
//    } catch (IOException e) {
//    }               
    }//GEN-LAST:event_MenuItemSaveActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void NewInvButtonComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_NewInvButtonComponentAdded

    }//GEN-LAST:event_NewInvButtonComponentAdded

    private void NewInvButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewInvButtonMouseClicked
   
    
    }//GEN-LAST:event_NewInvButtonMouseClicked

    private void NewInvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewInvButtonActionPerformed
      
    }//GEN-LAST:event_NewInvButtonActionPerformed

    private void DeleteInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceButtonActionPerformed
  
    }//GEN-LAST:event_DeleteInvoiceButtonActionPerformed

    private void InvHeaderTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvHeaderTabMouseClicked
 
    }//GEN-LAST:event_InvHeaderTabMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    

    }//GEN-LAST:event_formWindowOpened

    private void DeleteInvoiceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteInvoiceButtonMouseClicked

    }//GEN-LAST:event_DeleteInvoiceButtonMouseClicked

    private void removechangesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removechangesBtnActionPerformed
     

    }//GEN-LAST:event_removechangesBtnActionPerformed

    private void savechangesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savechangesBtnActionPerformed
        

    }//GEN-LAST:event_savechangesBtnActionPerformed

    private void savechangesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savechangesBtnMouseClicked

    }//GEN-LAST:event_savechangesBtnMouseClicked

    private void InvLineTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvLineTabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InvLineTabMouseClicked

    private void IabelCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IabelCNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IabelCNameActionPerformed

   
     public void runUI() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels ()) {
                if ("Nimbus".equals ( info.getName () )) {
                    javax.swing.UIManager.setLookAndFeel ( info.getClassName () );
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException excep) {
            java.util.logging.Logger.getLogger ( View.class.getName () ).log ( java.util.logging.Level.SEVERE, null, excep );
        }
    
        
            java.awt.EventQueue.invokeLater (new Runnable() {
            @Override
            public void run() {
                View Fr = new View ();
                
                Fr.setVisible(true);
                FileOperations FileOperations1 = new FileOperations ( Fr );
                ArrayList<InvoiceHeader> inv = FileOperations1.FRead ();
                Fr.setInvos ( inv );
                invoicesTableModel invTable = new invoicesTableModel ( inv );
                Fr.setHeaderTable ( invTable );
                Fr.getInvHeaderTab ().setModel ( invTable );
                Fr.getHeaderTab ().fireTableDataChanged ();
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BarMenu;
    private javax.swing.JButton DeleteInvoiceButton;
    private javax.swing.JTextField IabelCName;
    private javax.swing.JTextField IabelInvDate;
    private javax.swing.JLabel IabelInvNumber;
    private javax.swing.JLabel IabelTCost;
    private transient javax.swing.JTable InvHeaderTab;
    private javax.swing.JTable InvLineTab;
    private javax.swing.JMenuItem MenuItemLoad;
    private javax.swing.JMenuItem MenuItemSave;
    private javax.swing.JButton NewInvButton;
    private javax.swing.JScrollPane SPJ1;
    private javax.swing.JScrollPane SPJ2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton removechangesBtn;
    private javax.swing.JButton savechangesBtn;
    // End of variables declaration//GEN-END:variables

    private final  ControllerInv  ctrl = new ControllerInv(this);
    private final Events ActionTab = new Events(this);


    private ArrayList<InvoiceHeader> invos;



    public JTextField getIabelInvDate()
    {
        return IabelInvDate;
    }


    public ControllerInv getCtrl()
    {
        return ctrl;
    }


    public void setIabelInvDate(JTextField iabelInvDate)
    {
        this.IabelInvDate = iabelInvDate;
    }


    public JLabel getIabelInvNumber()
    {
        return IabelInvNumber;
    }

    private invoicesTableModel headerTable;

    public invoicesTableModel getHeaderTab()
    {
        return headerTable;
    }
    public void setHeaderTable(invoicesTableModel headerTable)
    {
        this.headerTable = headerTable;
    }
    public ArrayList<InvoiceHeader> getInvo()
    {

        if(invos ==null){
            invos = new ArrayList<>();
        }
        return invos;
    }

    public void setInvos(ArrayList<InvoiceHeader> invos)
    {
        this.invos = invos;
    }

    public JTextField getIabelCName()
    {
        return IabelCName;
    }

    public JLabel getIabelTCost()
    {
        return IabelTCost;
    }

    public JTable getInvHeaderTab()
    {
        return InvHeaderTab;
    }

    public JTable getInvLineTab()
    {
        return InvLineTab;
    }


    public int getTotalInvNo(){

        int No=0;
        for(InvoiceHeader invo: invos){
            if(invo.getInvnum()>No){
                No= invo.getInvnum();
            }
        }

        return No;
    }

    
	
}