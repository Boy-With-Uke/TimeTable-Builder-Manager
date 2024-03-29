/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.Conn;

import app.Connector;
import app.WindowMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author boywithuke
 */
public class Window_Connexion extends javax.swing.JFrame {

    /**
     * Creates new form Window_Connexion1
     */
    public Window_Connexion() {
        initComponents();
        setResizable(false);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        Textmdp = new javax.swing.JPasswordField();
        Connexion_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(19, 21, 25));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(154, 154, 154));
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(154, 154, 154));
        jLabel3.setText("Password:");

        TextId.setBackground(new java.awt.Color(51, 57, 67));
        TextId.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        TextId.setForeground(new java.awt.Color(154, 154, 154));

        Textmdp.setBackground(new java.awt.Color(51, 57, 67));
        Textmdp.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        Textmdp.setForeground(new java.awt.Color(154, 154, 154));
        Textmdp.setPreferredSize(new java.awt.Dimension(23, 27));

        Connexion_Button.setBackground(new java.awt.Color(51, 57, 67));
        Connexion_Button.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        Connexion_Button.setForeground(new java.awt.Color(154, 154, 154));
        Connexion_Button.setText("Connexion");
        Connexion_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Connexion_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Renitah", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(154, 154, 154));
        jLabel1.setText("Login in");

        Back_Button.setBackground(new java.awt.Color(51, 57, 67));
        Back_Button.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        Back_Button.setForeground(new java.awt.Color(154, 154, 154));
        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Textmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(Connexion_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Textmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Connexion_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Connexion_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Connexion_ButtonActionPerformed
        String username = TextId.getText().trim();
        String mdp = Textmdp.getText().trim();
        System.out.println(username+ " "+ mdp);
        try {
            Connection connection = Connector.getConnection();

            Connect(connection, username, mdp);
            
            Connector.closeConnection(connection);
            WindowMain main = new WindowMain();
            main.setVisible(true);
            this.dispose();

        } catch (SQLException e) {
            // En cas d'erreur de base de données, affichez un message d'erreur
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des classes : " + e.getMessage());
        }


    
        
    }//GEN-LAST:event_Connexion_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        WindowChoice ch = new WindowChoice();
        ch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Window_Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window_Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window_Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window_Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window_Connexion().setVisible(true);
            }
        });
    }
    public void Connect(Connection connection, String username, String mdp) {
        String querry = "SELECT * FROM user WHERE username = ? AND password = ?";

        try (
             PreparedStatement statement = connection.prepareStatement(querry)) {

            statement.setString(1, username);
            statement.setString(2, mdp);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // L'utilisateur existe, vous pouvez ouvrir la nouvelle fenêtre ici
                    // Exemple : new FenetrePrincipale().setVisible(true);
                } else {
                    // L'utilisateur n'existe pas, affichez un message d'erreur
                    System.out.println("Nom d'utilisateur ou mot de passe incorrect.");
                }
            }

        } catch (SQLException e) {
            // En cas d'erreur SQL, affichez un message d'erreur
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Connexion_Button;
    private javax.swing.JTextField TextId;
    private javax.swing.JPasswordField Textmdp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
