/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sigapp.view;

import com.Sigapp.model.InvoiceHeader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class AddInvoice extends javax.swing.JFrame {
    

   private Object model;
    private Object InvTable;
    private Object total;
    private String filepath1;
    private String filepath2;
    private int filepath;
    private Object pw;
   
     
    
    public AddInvoice() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        InvNum = new javax.swing.JTextField();
        Invcount = new javax.swing.JTextField();
        InvItem = new javax.swing.JTextField();
        InvCst = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        InvDate = new javax.swing.JTextField();
        InvItemPrice = new javax.swing.JTextField();
        saveInvtof = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create New Invoice");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setText("Invoice Number");

        jLabel9.setText("Invoice Date");

        jLabel10.setText("Customer Name");

        InvNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvNumActionPerformed(evt);
            }
        });

        jLabel11.setText("Item Name");

        jLabel12.setText(" Item Price");

        jLabel13.setText("Item Count");

        InvDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvDateActionPerformed(evt);
            }
        });

        saveInvtof.setText("OK");
        saveInvtof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveInvtofMouseClicked(evt);
            }
        });
        saveInvtof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInvtofActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(InvItemPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(InvItem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvCst, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Invcount)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(saveInvtof, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(InvNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(InvDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvCst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(InvItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(InvItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Invcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(saveInvtof)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(saveInvtof);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InvDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvDateActionPerformed


    private void saveInvtofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInvtofActionPerformed
         DefaultTableModel model=new DefaultTableModel();
           InvTable.setModel(model);
      
           InvoiceHeader invoiceH=new InvoiceHeader();
            int invnum =Integer.parseInt(InvNum.getText());
            SimpleDateFormat df= new SimpleDateFormat("dd/mm/yyyy");
            Date invdate =Date.valueOf(df.format((InvDate.getText())));
            String cstname =InvCst.getText(); 
            String ite_name=InvItem.getText();
            double  ite_price=Double.parseDouble(InvItemPrice.getText());
            int ite_count =Integer.parseInt(Invcount.getText());
            invoiceH.setInvnum(invnum);
            invoiceH.setCstname(cstname);
            invoiceH.setInvdate(invdate);
        ArrayList<InvoiceHeader.Item> items;
            invoiceH.setItems(items);
            invoiceH.getTotal();
             model.setValueAt(InvDate, ERROR, invnum);
             model.fireTableDataChanged();

            
          saveRecorder adinv =new saveRecorder();
          saveRecorder(invnum,invdate,cstname);        
        model.addRow(new Object[] { invnum,invdate,cstname, ite_count*ite_price });

            
                        switch(filepath){ 
                        case( filepath1):
                           pw.println( invnum + ", " +  invdate + " ," + cstname);
                           break;
                       
                        case(filepath2):
                            pw.println( invnum + ", " +  ite_name + " ," + ite_price+","+ ite_count);
                            break;}
    }//GEN-LAST:event_saveInvtofActionPerformed

    private void InvNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvNumActionPerformed

    private void saveInvtofMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveInvtofMouseClicked


  this.dispose();
  
      if(InvNum.getText().equals("")||InvCst.getText().equals("")||InvItem.getText().equals( "")||InvDate.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter all data!");
           


            } else{
//               String data[] = {InvNum.getText()||InvCst.getText()||InvItem.getText()||InvDate.getText()};
//               DefaultTableModel InvoiceHeader = (DefaultTableModel)InvTable.getModel();
//               InvoiceHeader.addRow((Vector) data);
               
               JOptionPane.showMessageDialog(this, "Add data successfully!");
//          InvoiceHeader data0 = new InvoiceHeader();
              
        }
    
  
        
    }//GEN-LAST:event_saveInvtofMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField InvCst;
    public javax.swing.JTextField InvDate;
    public javax.swing.JTextField InvItem;
    public javax.swing.JTextField InvItemPrice;
    public javax.swing.JTextField InvNum;
    public javax.swing.JTextField Invcount;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton saveInvtof;
    // End of variables declaration//GEN-END:variables

    private void saveRecorder(int invnum, Date invdate, String cstname) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class saveRecorder {

        public saveRecorder() {
        }
    }

    private static class getTotal {

        public getTotal() {
        }
    }
}