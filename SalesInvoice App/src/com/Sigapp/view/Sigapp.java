package com.Sigapp.view;

import com.Sigapp.model.InvoiceHeader;
import com.Sigapp.model.InvoiceLine;
import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;






public class Sigapp extends javax.swing.JFrame   {

    private String br;
    private Object fw;
    private Object lin;
    private String SelectedRow;
    private int invno;

    public Sigapp() {
        initComponents();
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        InvNumlab = new javax.swing.JLabel();
        TotInvlab = new javax.swing.JLabel();
        InvDatetxt = new javax.swing.JTextField();
        CstNametxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvItemTable = new javax.swing.JTable();
        updateInvbtn = new javax.swing.JButton();
        restupdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addInvbtn = new javax.swing.JButton();
        delInvbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InvTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        uploadfile = new javax.swing.JMenuItem();
        savefile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setText("Invoice Number");

        jLabel9.setText("Invoice Date");

        jLabel10.setText("Customer Name");

        jLabel11.setText("Invoice Total");

        CstNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CstNametxtActionPerformed(evt);
            }
        });

        InvItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Mobile", "3200", "1", "3200"},
                {"1", "Cover", "20", "2", "40"},
                {"1", "Headphone", "130", "130", "1"},
                {"2", "Laptop", "4000", "1", "4000"},
                {"2", "Mouse", "35", "1", null}
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
        InvItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvItemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(InvItemTable);

        updateInvbtn.setText("update changes");
        updateInvbtn.setActionCommand("Save Changes");
        updateInvbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateInvbtnMouseClicked(evt);
            }
        });
        updateInvbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInvbtnActionPerformed(evt);
            }
        });

        restupdate.setText("Cancel update");
        restupdate.setActionCommand("Cancel Changes");
        restupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotInvlab, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvNumlab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(updateInvbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restupdate)
                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(InvNumlab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(InvDatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TotInvlab)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateInvbtn)
                    .addComponent(restupdate))
                .addGap(54, 54, 54))
        );

        addInvbtn.setText("Create New Invoice ");
        addInvbtn.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                addInvbtnComponentAdded(evt);
            }
        });
        addInvbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addInvbtnMouseClicked(evt);
            }
        });
        addInvbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInvbtnActionPerformed(evt);
            }
        });

        delInvbtn.setText("Delete Invoice");
        delInvbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delInvbtnMouseClicked(evt);
            }
        });
        delInvbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delInvbtnActionPerformed(evt);
            }
        });

        InvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "22/11/2020", "Ali", "3370"},
                {"2", "13/10/2021", "Saleh", "4035"},
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
        InvTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(InvTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(addInvbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delInvbtn)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addInvbtn)
                    .addComponent(delInvbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        uploadfile.setText("LoadFile");
        uploadfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadfileActionPerformed(evt);
            }
        });
        jMenu1.add(uploadfile);

        savefile.setText("SaveFile");
        savefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefileActionPerformed(evt);
            }
        });
        jMenu1.add(savefile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void uploadfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadfileActionPerformed
   try {
            JFileChooser Chooser = new JFileChooser();
            Chooser.showOpenDialog(null);
            File fts = Chooser.getSelectedFile();
            BufferedReader br = new BufferedReader(new FileReader(fts));
           DefaultTableModel model=new DefaultTableModel();
          
           model.fireTableDataChanged();
            List<String> listOfInvoice = new ArrayList<>();
            String invLine;
//read for each line
                while( (invLine = br.readLine()) != null){
                    listOfInvoice.add(invLine);
                    int recordcount =listOfInvoice.size();
                    int Amountfields = 0;
                    String arryToreturn[][]=new String [recordcount][Amountfields];
                    String[] data;
                    for( int i=0; i< recordcount;i++){
                        data=listOfInvoice.get(i).split("[,\n]");
                        for( int j=0; j<data.length ;j++){
                            arryToreturn[i][j]=data[j];
                            model.addRow(data);
                        }
//                         InvTable.setModel(model); 
                        br.close();
                    }
                    model.addTableModelListener((TableModelListener) InvTable);
                    
                }
            }  catch (FileNotFoundException e1) {
          
                } catch (IOException ex) {}
    }//GEN-LAST:event_uploadfileActionPerformed

   
    private void savefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefileActionPerformed
           DefaultTableModel model = (DefaultTableModel)InvTable.getModel();
            JFileChooser Chooser = new JFileChooser();
            Chooser.showOpenDialog(null);
            File fts = Chooser.getSelectedFile();
           
    try(FileWriter fw = new FileWriter(fts)){  
        for (int i = 0; i < model.getColumnCount(); i++) {
            fw.write(model.getColumnName(i) + ",");
        }

        fw.write("\n");

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                fw.write(model.getValueAt(i, j).toString() + ",");
            }
            fw.write("\n");
        }

        fw.close();
      
    } catch (IOException e) {
    }               
    }//GEN-LAST:event_savefileActionPerformed

    private void CstNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CstNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CstNametxtActionPerformed

    private void updateInvbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInvbtnActionPerformed
       DefaultTableModel model = (DefaultTableModel)InvTable.getModel();
        InvDatetxt.setText(model.getValueAt(InvTable.getSelectedRow(), 1).toString());
        CstNametxt.setText(model.getValueAt(InvTable.getSelectedRow(), 2).toString());
       model.fireTableRowsUpdated(0, 3);
      DefaultTableModel model1 = (DefaultTableModel)InvItemTable.getModel();
        
    }//GEN-LAST:event_updateInvbtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void addInvbtnComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_addInvbtnComponentAdded

    }//GEN-LAST:event_addInvbtnComponentAdded

    private void addInvbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInvbtnMouseClicked
      
     JOptionPane.showMessageDialog(null, "you want to create New invoice");
      DefaultTableModel model = (DefaultTableModel)InvTable.getModel();
        
    //open form for create new invoice 
    AddInvoice addinv =new AddInvoice();
          addinv.setVisible(true);
    
    }//GEN-LAST:event_addInvbtnMouseClicked

    private void addInvbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInvbtnActionPerformed
 
    }//GEN-LAST:event_addInvbtnActionPerformed

    private void delInvbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delInvbtnActionPerformed
   //--delete data row
       try{ 
        JOptionPane.showMessageDialog(null,"You want delete this Invoice");
        int SelectedRow =InvTable.getSelectedRow();
      DefaultTableModel model = (DefaultTableModel)InvTable.getModel();
      
      model.removeRow(SelectedRow);
       } catch (Exception e){
       JOptionPane.showMessageDialog(null, "please select one row");

       } 
    }//GEN-LAST:event_delInvbtnActionPerformed

    private void InvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvTableMouseClicked

        int SelectedRow =InvTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)InvTable.getModel();
        InvNumlab.setText(model.getValueAt(SelectedRow, 0).toString());
        InvDatetxt.setText(model.getValueAt(SelectedRow, 1).toString());
        CstNametxt.setText(model.getValueAt(SelectedRow, 2).toString());
        TotInvlab.setText(model.getValueAt(SelectedRow, 3).toString());
         
        InvoiceHeader invoiceH = new InvoiceHeader();
        InvoiceLine invoiceLn = new InvoiceLine();
        Header invl = invoiceLn.getInv();
         invno = invoiceH.getInvnum();
//        searchNfile sf=  new searchNfile("InvoiceLine.CSV",invno);
     

    }//GEN-LAST:event_InvTableMouseClicked

    private void restupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restupdateActionPerformed
     if(InvDatetxt.getText().length()<=0||CstNametxt.getText().length()<=0){
     JOptionPane.showMessageDialog(null, "this field is required");
     }
     else{
        JOptionPane.showMessageDialog(null, "confirm if you want cancel update");
     }
   try{   int SelectedR =InvItemTable.getSelectedRow();
    DefaultTableModel model1 = (DefaultTableModel)InvItemTable.getModel();
    JFrame frame =new JFrame("cancel changed");
   
      InvItemTable.removeEditor();
      InvDatetxt.firePropertyChange(br, 1, 0);
//.removeActionListener((ActionListener) updateInvbtn);
      CstNametxt.getInputContext();
     
   }
     catch(  Exception ex){
      JOptionPane.showMessageDialog(null, "you must selected one row");
    }



        
        
    }//GEN-LAST:event_restupdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    

    }//GEN-LAST:event_formWindowOpened

    private void updateInvbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInvbtnMouseClicked
     if(InvDatetxt.getText().length()<=0||CstNametxt.getText().length()<=0){
     JOptionPane.showMessageDialog(null, "this field is required");
     }
   try{   DefaultTableModel model1 = (DefaultTableModel)InvItemTable.getModel();
        int i =InvItemTable.getSelectedRow();
         Editform edt=new Editform();
          edt.setVisible(true);
          model1.fireTableDataChanged();
   }catch(Exception e){
    JOptionPane.showMessageDialog(null, "update success");
   }
    //set data at text field
           
                         

    }//GEN-LAST:event_updateInvbtnMouseClicked

    private void InvItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvItemTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InvItemTableMouseClicked

    private void delInvbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delInvbtnMouseClicked

    }//GEN-LAST:event_delInvbtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sigapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Sigapp().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CstNametxt;
    private javax.swing.JTextField InvDatetxt;
    private javax.swing.JTable InvItemTable;
    private javax.swing.JLabel InvNumlab;
    private transient javax.swing.JTable InvTable;
    private javax.swing.JLabel TotInvlab;
    private javax.swing.JButton addInvbtn;
    private javax.swing.JButton delInvbtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton restupdate;
    private javax.swing.JMenuItem savefile;
    private javax.swing.JButton updateInvbtn;
    private javax.swing.JMenuItem uploadfile;
    // End of variables declaration//GEN-END:variables


}