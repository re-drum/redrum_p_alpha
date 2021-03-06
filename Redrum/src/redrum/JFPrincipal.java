package redrum;

import dao.DataSource;
import dao.daoUsers;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuarios;


/**
 *
 * @author Aluno TDS
 */
public class JFPrincipal extends javax.swing.JFrame {

    static String emailRedefinir;
    
    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
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
        jTFEoT = new javax.swing.JTextField();
        jPasswordF = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jLEsqueceu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CriarJanelaLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Redrum", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(158, 0, 0))); // NOI18N

        jTFEoT.setForeground(new java.awt.Color(153, 153, 153));
        jTFEoT.setText("E-mail");
        jTFEoT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFEoTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFEoTFocusLost(evt);
            }
        });
        jTFEoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEoTActionPerformed(evt);
            }
        });

        jPasswordF.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordF.setText("jPasswordField1");
        jPasswordF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFFocusLost(evt);
            }
        });
        jPasswordF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFActionPerformed(evt);
            }
        });
        jPasswordF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFKeyTyped(evt);
            }
        });

        jBEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBEntrar.setForeground(new java.awt.Color(158, 0, 0));
        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jLEsqueceu.setForeground(new java.awt.Color(158, 0, 0));
        jLEsqueceu.setText("Esqueceu a senha?");
        jLEsqueceu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEsqueceuMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CriarJanelaLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CriarJanelaLogin.setForeground(new java.awt.Color(158, 0, 0));
        CriarJanelaLogin.setText("Criar nova conta");
        CriarJanelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarJanelaLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(CriarJanelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(CriarJanelaLogin)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEoT)
                    .addComponent(jBEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordF)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLEsqueceu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTFEoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLEsqueceu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void finalize() throws Throwable {
        
    }
    
    private void jTFEoTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFEoTFocusGained
        // TODO add your handling code here:
        if(jTFEoT.getText().equals("E-mail"))
        {
            jTFEoT.setText("");
            jTFEoT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTFEoTFocusGained

    private void jTFEoTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFEoTFocusLost
        // TODO add your handling code here:

        if(jTFEoT.getText().equals(""))
        {
            jTFEoT.setText("E-mail");
            jTFEoT.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_jTFEoTFocusLost

    private void jPasswordFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFFocusGained
        // TODO add your handling code here:
        if(jPasswordF.getText().equals("jPasswordField1"))
        {
            jPasswordF.setText("");
            jPasswordF.setForeground(new Color(0,0,0));
        }

    }//GEN-LAST:event_jPasswordFFocusGained

    private void jPasswordFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFFocusLost
        // TODO add your handling code here:

        if(jPasswordF.getText().equals(""))
        {
            jPasswordF.setText("jPasswordField1");
            jPasswordF.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_jPasswordFFocusLost

    private void jPasswordFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFActionPerformed
         jBEntrarActionPerformed(evt);// TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFActionPerformed

    private void jPasswordFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFKeyPressed
   
    }//GEN-LAST:event_jPasswordFKeyPressed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed

        int flag = 0;

        // cria um datasource para conex??o com o banco
        DataSource dataSource = new DataSource();

        // instancia um objeto
        daoUsers user = new daoUsers(dataSource);
        
        String pw = new String(jPasswordF.getPassword());

        // cria um arraylist para jogar os dados recuperados dentro
        ArrayList<Usuarios> emails = user.validaUser(jTFEoT.getText());
       

        // verifica se a lista retornou vazia
        if(emails != null){

            // coloca as informa????es da lista na ??rea de texto
            for(Usuarios u : emails){

                if ((u.getEmail().equals(jTFEoT.getText())) && (u.getSenha().equals(pw))){
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    this.setVisible(false);
                    flag = 1;
                }
                
                System.out.printf("%s - %s\n",u.getEmail(),u.getSenha());
          
            }
        }
            
        if (flag==0) {
           System.out.printf("\n%d", flag);
           jTFEoT.setText("");
           jPasswordF.setText("");
           JOptionPane.showMessageDialog(null, "Usu??rio ou senha incorreto. Tente novamente!");
        }
        user = null;
        // fecha DataSource
        dataSource.closeDataSource();
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jLEsqueceuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEsqueceuMouseClicked
        // TODO add your handling code here:
        new JFEsqueci().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLEsqueceuMouseClicked

    private void CriarJanelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarJanelaLoginActionPerformed
        // TODO add your handling code here:
        new JFCadastro().setVisible(true);
        this.setVisible(false);
        // DataSource dataSource = new DataSource();
        // dataSource.closeDataSource();
        // JOptionPane.showMessageDialog(null,"Desconectado com sucesso!");

    }//GEN-LAST:event_CriarJanelaLoginActionPerformed

    private void jTFEoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEoTActionPerformed
        jBEntrarActionPerformed(evt);
 
// TODO add your handling code here:
    }//GEN-LAST:event_jTFEoTActionPerformed

    private void jPasswordFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFKeyTyped
   
    }//GEN-LAST:event_jPasswordFKeyTyped

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CriarJanelaLogin;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLEsqueceu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordF;
    private javax.swing.JTextField jTFEoT;
    // End of variables declaration//GEN-END:variables
}
