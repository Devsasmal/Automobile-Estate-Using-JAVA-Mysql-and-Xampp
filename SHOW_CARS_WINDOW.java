/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile_estate;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEV SASMAL
 */
public class SHOW_CARS_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form SHOW_CARS_WINDOW
     */
    public SHOW_CARS_WINDOW() {
        initComponents();
        
        fillJtablesCars();
        
        //change the jtable row height
        jTable1.setRowHeight(40);
        //change the jtable selection background
        jTable1.setSelectionBackground(new Color(27,120,77));
        //change the Id column width
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        
    }
    
    //create a function to populate the cars 
        public void fillJtablesCars()
    {
        C_CARS cars = new C_CARS();
        ArrayList<C_CARS> carsList= cars.carsList();
            
        //the jtable columns
        String[] colNames = {"id","car_model","car_make","ownerid","price","address","seats","air_bags","engine","doors","fuel_capa","fuel_type","parking_sensors","antilock","roof","age","camera","voice","antitheft","fingerprint","maps","speed_sensors","crash_sensors"};
        
        //the jtable row
        //ownerslist.size()= the size of the arraylist
        //6 = the number of columns        
        Object[][] rows = new Object[carsList.size()][23];
        
        //add data form the list to the rows 
        for(int i =0; i<carsList.size();i++)
        {
            rows[i][0] = carsList.get(i).getIds();
            rows[i][1] = carsList.get(i).getCar_Model();
            rows[i][2] = carsList.get(i).getCar_Make();
            rows[i][3] = carsList.get(i).getOwnerId();
            rows[i][4] = carsList.get(i).getPrice();
            rows[i][5] = carsList.get(i).getAddress();
            rows[i][6] = carsList.get(i).getSeats();
            rows[i][7] = carsList.get(i).getAir_bags();
            rows[i][8] = carsList.get(i).getEngine();
            rows[i][9] = carsList.get(i).getDoors();
            rows[i][10] = carsList.get(i).getFuel_capa();
            rows[i][11] = carsList.get(i).getFuel_type();
            if(carsList.get(i).isParking_sensors()) rows[i][12] = "YES";
            else{rows[i][12] = "NO";}
            if(carsList.get(i).isAntilock()) rows[i][13] = "YES";
            else{rows[i][13] = "NO";}
            if(carsList.get(i).isRoof())  rows[i][14] = "YES";
            else{rows[i][14] = "NO";}
            rows[i][15] = carsList.get(i).getAge();
            if(carsList.get(i).isCamera()) rows[i][16] = "YES";
            else{rows[i][16] = "NO";}
            if(carsList.get(i).isVoice()) rows[i][17] = "YES";
            else{rows[i][17] = "NO";}
            if(carsList.get(i).isAntitheft()) rows[i][18] = "YES";
            else{rows[i][18] = "NO";}
            if(carsList.get(i).isFingerprint()) rows[i][19] = "YES";
            else{rows[i][19] = "NO";}
            if(carsList.get(i).isMaps()) rows[i][20] = "YES";
            else{rows[i][20] = "NO";}
            if(carsList.get(i).isSpeed_sensors()) rows[i][21] = "YES";
            else{rows[i][21] = "NO";}
            if(carsList.get(i).isCrash_sensors()) rows[i][22] = "YES";
            else{rows[i][22] = "NO";}
            
        }
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SHOW_CARS_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SHOW_CARS_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SHOW_CARS_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SHOW_CARS_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SHOW_CARS_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
