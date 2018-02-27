
import java.awt.List;
import java.sql.*;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umit Kilic
 */
public class Mainclass extends javax.swing.JFrame {

    Connection c=null;
    ConnecttoDB connecttodb=new ConnecttoDB();
    Statement st=null;
    private final DefaultTableModel tableModel = new DefaultTableModel();
    int selectedid=0;
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    /**
     * Creates new form Mainclass
     */
    public Mainclass() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        connectbutton = new javax.swing.JButton();
        statuslabel = new javax.swing.JLabel();
        closebutton = new javax.swing.JButton();
        getall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        namelist = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        nametable = new javax.swing.JTable();
        getalltotablebutton = new javax.swing.JButton();
        name_tf = new javax.swing.JTextField();
        age_tf = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        connectbutton.setText("Connect");
        connectbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectbuttonMouseClicked(evt);
            }
        });

        statuslabel.setText("Disconnected!");

        closebutton.setText("Close");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });

        getall.setText("Get All to Jlist");
        getall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getallMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(namelist);

        nametable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        nametable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nametableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(nametable);

        getalltotablebutton.setText("Get All to Table");
        getalltotablebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getalltotablebuttonMouseClicked(evt);
            }
        });

        savebutton.setText("Save");
        savebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebuttonMouseClicked(evt);
            }
        });

        updatebutton.setText("Update");
        updatebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        updatebutton.setFocusPainted(false);
        updatebutton.setFocusable(false);
        updatebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebuttonMouseClicked(evt);
            }
        });

        deletebutton.setText("Delete");
        deletebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(statuslabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getall)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(connectbutton)
                                .addGap(18, 18, 18)
                                .addComponent(closebutton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(age_tf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name_tf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(getalltotablebutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(savebutton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updatebutton)
                        .addGap(18, 18, 18)
                        .addComponent(deletebutton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectbutton)
                    .addComponent(closebutton))
                .addGap(18, 18, 18)
                .addComponent(statuslabel)
                .addGap(28, 28, 28)
                .addComponent(getall)
                .addGap(54, 54, 54)
                .addComponent(getalltotablebutton)
                .addGap(77, 77, 77)
                .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(age_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(savebutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebutton)
                    .addComponent(deletebutton))
                .addGap(219, 219, 219))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectbuttonMouseClicked
        // TODO add your handling code here:
        
        c=connecttodb.connectdb();
        statuslabelchange(c);
    }//GEN-LAST:event_connectbuttonMouseClicked

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        // TODO add your handling code here:
        c=connecttodb.disconnectdb(c);
        statuslabelchange(c);
        System.out.println(c);
    }//GEN-LAST:event_closebuttonActionPerformed

    private void getallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getallMouseClicked
        // TODO add your handling code here:
        DefaultListModel dlm=new DefaultListModel();
        
        try {
            st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from bilgiler");
            
            while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("ID");
         int age = rs.getInt("age");
         String name = rs.getString("name");
         dlm.addElement(name);

      }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        namelist.setModel(dlm);
    }//GEN-LAST:event_getallMouseClicked

    private void getalltotablebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getalltotablebuttonMouseClicked
        // TODO add your handling code here:
        getalltotable();
    }//GEN-LAST:event_getalltotablebuttonMouseClicked

    private void savebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebuttonMouseClicked
        // TODO add your handling code here:
        String name;
        int age;
        
        name=name_tf.getText();
        age=Integer.parseInt(age_tf.getText());
        try {
            st=c.createStatement();
            
            String query="insert into bilgiler (name,age) values (?, ?)";
            PreparedStatement preparedStmt = c.prepareStatement(query);
            preparedStmt.setString (1, name);
            preparedStmt.setInt (2, age);
            

            // execute the preparedstatement
            preparedStmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        getalltotable();
        name_tf.setText("");
        age_tf.setText("");
    }//GEN-LAST:event_savebuttonMouseClicked

    private void nametableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nametableMouseClicked
        // TODO add your handling code here:
        
        selectedid=Integer.parseInt(data.get(nametable.getSelectedRow()).get(0).toString());
        System.out.println(selectedid);
    }//GEN-LAST:event_nametableMouseClicked

    private void updatebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebuttonMouseClicked
        // TODO add your handling code here:
        if(selectedid!=0){
            UpdateScreen upd=new UpdateScreen(c,selectedid);
            upd.setVisible(true);
        }
        
        
        System.out.println("update");
    }//GEN-LAST:event_updatebuttonMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        System.out.println("dele");
       
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        System.out.println("no");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        System.out.println("gaineeed");
        if(c!=null){
            getalltotable();
        }
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseClicked
        // TODO add your handling code here:
        
        if(c!=null && selectedid!=0){
            try {
                System.out.println("burada!");
                st=c.createStatement();
                String query="DELETE FROM bilgiler WHERE ID="+selectedid;
                
                int res=JOptionPane.showConfirmDialog(this, "Are you sure?", "Delete", JOptionPane.OK_CANCEL_OPTION);
                if(res==JOptionPane.OK_OPTION)
                    st.executeUpdate(query);
                else if (res==JOptionPane.CANCEL_OPTION)
                    System.out.println("cancel");
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
                
        
        
    }//GEN-LAST:event_deletebuttonMouseClicked

    public void statuslabelchange(Connection c){
        if(c!=null)
            statuslabel.setText("Connected!");
        else
            statuslabel.setText("Disconnected!");
    }
    
    public void getalltotable(){
        try {
            st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from bilgiler");
            ResultSetMetaData rsmd=rs.getMetaData();
            
         
         // Names of columns
                Vector<String> columnNames = new Vector<String>();
            int columnCount = rsmd.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(rsmd.getColumnName(i));
            }

            // Data of the table
            //Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            data.removeAllElements();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int i = 1; i <= columnCount; i++) {
                    vector.add(rs.getObject(i));
                }
                data.add(vector);
            }

            tableModel.setDataVector(data, columnNames);
            nametable.removeAll();
            nametable.setModel(tableModel);
      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(Mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainclass().setVisible(true);
            }
        });
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_tf;
    private javax.swing.JButton closebutton;
    private javax.swing.JButton connectbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton getall;
    private javax.swing.JButton getalltotablebutton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name_tf;
    private javax.swing.JList<String> namelist;
    private javax.swing.JTable nametable;
    private javax.swing.JButton savebutton;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
