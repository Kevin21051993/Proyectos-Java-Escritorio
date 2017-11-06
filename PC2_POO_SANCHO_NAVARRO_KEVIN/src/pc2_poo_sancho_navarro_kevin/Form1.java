package pc2_poo_sancho_navarro_kevin;
import java.util.*;         //Libreria necesaria para utilizar ArrayList
import javax.swing.JOptionPane;
public class Form1 extends javax.swing.JFrame {
//variable de tipo general
    List<Empleado> lis = new ArrayList();
    public Form1() {
        initComponents();
        txtHrMes.setEnabled(false);
        txtAnExp.setEnabled(false);
        txtDiasLab.setEnabled(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHrMes = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAnExp = new javax.swing.JTextField();
        txtDiasLab = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtres = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btgraba = new javax.swing.JButton();
        btOrdPag = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        btOrdNom = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        cbsexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE DEL EMPLEADO");

        jLabel2.setText("TIPO");

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Programador", "Analista" }));
        cbtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbtipoItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROGRAMADOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel3.setText("HORAS TRABAJADAS AL MES");

        txtHrMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHrMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(txtHrMes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHrMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANALISTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 0, 204))); // NOI18N

        jLabel5.setText("ANOS DE EXPERIENCIA");

        jLabel6.setText("N° DIAS LABORADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAnExp)
                    .addComponent(txtDiasLab, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAnExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiasLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        txtres.setColumns(20);
        txtres.setRows(5);
        jScrollPane1.setViewportView(txtres);

        btgraba.setText("Grabar Empleado");
        btgraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgrabaActionPerformed(evt);
            }
        });

        btOrdPag.setText("OrdenarPorPago");
        btOrdPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdPagActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        btgroup.add(rb1);
        rb1.setText("Todos");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        btgroup.add(rb2);
        rb2.setText("Programadores");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        btgroup.add(rb3);
        rb3.setText("Analistas");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb1)
                .addGap(18, 18, 18)
                .addComponent(rb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(rb3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3))
                .addContainerGap())
        );

        btOrdNom.setText("OrdenarPorNombre");
        btOrdNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdNomActionPerformed(evt);
            }
        });

        jLabel9.setText("EDAD");

        jLabel10.setText("SEXO");

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Masculino", "Femenino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btgraba)
                                    .addGap(32, 32, 32)
                                    .addComponent(btOrdNom)
                                    .addGap(18, 18, 18)
                                    .addComponent(btOrdPag))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel2))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel7)
                            .addGap(182, 182, 182)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btgraba)
                    .addComponent(btOrdPag)
                    .addComponent(btOrdNom))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("PROGRAMADOR");
        jPanel2.getAccessibleContext().setAccessibleName("ANALISTA");
        jPanel3.getAccessibleContext().setAccessibleName("LISTAR");

        pack();
    }// </editor-fold>//GEN-END:initComponents
//---------------------------------------------------------------------------------------------------------------
  //Estos son los procedimientos que se utilizan para listar(imprimir con filtro) al darle click a las opciones(radiobuttons)
  void todos(){
      txtres.setText("Lista de todos los Empleados\n");
      for(Empleado x:lis){
          txtres.append(x.Print());
          txtres.append("\n===========\n");
      }
  }  
  void LisProg(){
      txtres.setText("Lista de Programadores\n");
      for(Empleado x:lis){
          if(x instanceof Programador){
          txtres.append(x.Print());
          txtres.append("\n===========\n");
          }
      }
  } 
  void LisAnal(){
      txtres.setText("Lista de Analistas\n");
      for(Empleado x:lis){
          if(x instanceof Analista){
          txtres.append(x.Print());
          txtres.append("\n===========\n");
          }
      }
  }
//-----------------------------------------------------------------------------------------------------------------
    private void btgrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgrabaActionPerformed
     if(cbtipo.getSelectedIndex()==1)
         datProg();
     else
         datAnal(); 
     
     //Limpiamos
        txtnom.setText("");           txtedad.setText("");
        cbsexo.setSelectedItem(0);    cbtipo.setSelectedItem(0);
        txtHrMes.setText("");         txtAnExp.setText("");  
        txtDiasLab.setText("");       btgroup.clearSelection();
        txtres.setText("");
     //Bloqueamos
        txtHrMes.setEnabled(false);
        txtAnExp.setEnabled(false);
        txtDiasLab.setEnabled(false);
     JOptionPane.showMessageDialog(null,"grabacion ok");
     
    }//GEN-LAST:event_btgrabaActionPerformed
    void datAnal(){
        String nom = txtnom.getText();
        int edadd = Integer.parseInt(txtedad.getText());
        int sexoo=0;
        if(cbsexo.getSelectedIndex()==1)
            sexoo= 1;
        if(cbsexo.getSelectedIndex()==2)
            sexoo= 2;
        int anoss = Integer.parseInt(txtAnExp.getText());
        int diass = Integer.parseInt(txtDiasLab.getText());
        Analista est = new Analista(anoss,diass,nom,edadd,sexoo);
        lis.add(est);
    }
    void datProg(){
            String nom = txtnom.getText();
            int edadd = Integer.parseInt(txtedad.getText());
            int sexoo=0;
            if(cbsexo.getSelectedIndex()==1)
                sexoo= 1;
            if(cbsexo.getSelectedIndex()==2)
                sexoo= 2; 
            double hr = Double.parseDouble(txtHrMes.getText());
            Programador cont = new Programador(hr,nom,edadd,sexoo);
            lis.add(cont);
    }
    private void cbtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbtipoItemStateChanged
        //Aquí el profe programó un "evento" de tipo "Item" para manejar 
        //la habilitacion y deshabilitacion de controles(campos,combos,etc)
        //clickeado un determinado item del combobox
        
        //habilitar y deshabilitar controles
        if(cbtipo.getSelectedIndex()==0)
        {
            txtHrMes.setEnabled(false);
            txtAnExp.setEnabled(false);
            txtDiasLab.setEnabled(false);
        }
        if(cbtipo.getSelectedIndex()==1)
        {
            txtHrMes.setEnabled(true);
            txtAnExp.setEnabled(false);
            txtDiasLab.setEnabled(false);
        }
        if(cbtipo.getSelectedIndex()==2)
        {
            txtHrMes.setEnabled(false);
            txtAnExp.setEnabled(true);
            txtDiasLab.setEnabled(true);
        }
    }//GEN-LAST:event_cbtipoItemStateChanged

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
       todos();
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
       LisProg();
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
       LisAnal();
    }//GEN-LAST:event_rb3ActionPerformed

    private void txtHrMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHrMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHrMesActionPerformed

    private void btOrdPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdPagActionPerformed
        //Ordena por pagos
        class ordena2 implements Comparator{     
            public int compare(Object o1, Object o2){
                Empleado e1= (Empleado)o1;                                      
                Empleado e2= (Empleado)o2;      
                return (int)(e1.PagoTotal()-(e2.PagoTotal()));     
            }                                                      
        }
        Collections.sort(lis, new ordena2());
    }//GEN-LAST:event_btOrdPagActionPerformed

    private void btOrdNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdNomActionPerformed
        //Ordena por nombres
        class ordena1 implements Comparator{     
            public int compare(Object o1, Object o2){     
                Empleado e1= (Empleado)o1;                                   
                Empleado e2= (Empleado)o2;      
                return e1.getNombre().compareTo(e2.getNombre());   
            }     
        }  
        Collections.sort(lis, new ordena1());  
    }//GEN-LAST:event_btOrdNomActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOrdNom;
    private javax.swing.JButton btOrdPag;
    private javax.swing.JButton btgraba;
    private javax.swing.ButtonGroup btgroup;
    private javax.swing.JComboBox<String> cbsexo;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextField txtAnExp;
    private javax.swing.JTextField txtDiasLab;
    private javax.swing.JTextField txtHrMes;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextArea txtres;
    // End of variables declaration//GEN-END:variables
}
