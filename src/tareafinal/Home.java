/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafinal;

import MSQL.Controlador;

/**
 *
 * @author Kisuke Urahara
 */
public class Home extends javax.swing.JFrame {
         
    
    
       
    
    public Home() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtEma = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnMCerrar = new javax.swing.JMenuItem();
        btnMSalir = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/view_search_find_9565.png"))); // NOI18N
        btnListar.setText("Ver Lista");
        btnListar.setMaximumSize(new java.awt.Dimension(121, 41));
        btnListar.setMinimumSize(new java.awt.Dimension(121, 41));
        btnListar.setPreferredSize(new java.awt.Dimension(121, 41));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 130, 50));

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 135, 50));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/27-Edit_Text_256x256_35395.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(121, 41));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 135, 50));

        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setText("Telefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        txtNom.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 195, 29));

        txtEma.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtEma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 195, 29));

        txtTel.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 195, 29));

        txtApe.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 195, 29));

        jLabel6.setText("ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 195, 29));

        btnActualizar.setBackground(new java.awt.Color(204, 255, 204));
        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnActualizar.setText("ok");
        btnActualizar.setPreferredSize(new java.awt.Dimension(121, 41));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 135, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escudo2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 340, 290));

        escritorio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 290));
        jPanel1.getAccessibleContext().setAccessibleName("menu de usuarios");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombres", "Apellidos", "Telefono", "Email"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        escritorio.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 580, -1));

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jMenu1.setText("Menu");

        jMenu5.setText("Sesion");

        jMenuItem1.setText("Regresar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        btnMCerrar.setText("Cerrar sesion");
        btnMCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCerrarActionPerformed(evt);
            }
        });
        jMenu5.add(btnMCerrar);

        btnMSalir.setText("Salir");
        btnMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSalirActionPerformed(evt);
            }
        });
        jMenu5.add(btnMSalir);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnMSalirActionPerformed

    private void btnMCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCerrarActionPerformed
        FrmLogin ventana = new FrmLogin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMCerrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                SubMenu v = new SubMenu();
                v.setVisible(true); 
                this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        Home v = new Home();
        Controlador c = new Controlador(v);
        v.setVisible(true); 
        v.setLocationRelativeTo(v);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnListar;
    private javax.swing.JMenuItem btnMCerrar;
    private javax.swing.JMenuItem btnMSalir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    public javax.swing.JTable tablaUsuarios;
    public javax.swing.JTextField txtApe;
    public javax.swing.JTextField txtEma;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNom;
    public javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
