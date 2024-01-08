/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.Room;

import app.Class.*;
import app.Subject.*;
import app.*;
import java.sql.*;

public class WindowRoom_UpdateDel extends javax.swing.JFrame {

    /**
     * Creates new form ClasseAddDelWindow
     */
    public WindowRoom_UpdateDel() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        ButtonUpdate = new javax.swing.JButton();
        ButtonDel = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        NewName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NewSize = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        upBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 21, 25));

        jLabel1.setFont(new java.awt.Font("Renitah", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(154, 154, 154));
        jLabel1.setText("Update or Delete Room");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(154, 154, 154));
        jLabel2.setText("Room Name:");

        TextName.setBackground(new java.awt.Color(51, 57, 67));
        TextName.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        TextName.setForeground(new java.awt.Color(154, 154, 154));
        TextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNameActionPerformed(evt);
            }
        });

        ButtonUpdate.setBackground(new java.awt.Color(51, 57, 67));
        ButtonUpdate.setFont(new java.awt.Font("Noto Sans", 2, 15)); // NOI18N
        ButtonUpdate.setForeground(new java.awt.Color(154, 154, 154));
        ButtonUpdate.setText("Update");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });

        ButtonDel.setBackground(new java.awt.Color(51, 57, 67));
        ButtonDel.setFont(new java.awt.Font("Noto Sans", 2, 15)); // NOI18N
        ButtonDel.setForeground(new java.awt.Color(154, 154, 154));
        ButtonDel.setText("Delete");
        ButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDelActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(51, 57, 67));
        Back.setFont(new java.awt.Font("Noto Sans", 2, 15)); // NOI18N
        Back.setForeground(new java.awt.Color(154, 154, 154));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        NewName.setBackground(new java.awt.Color(51, 57, 67));
        NewName.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        NewName.setForeground(new java.awt.Color(154, 154, 154));
        NewName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(154, 154, 154));
        jLabel3.setText("New Room Name:");

        NewSize.setBackground(new java.awt.Color(51, 57, 67));
        NewSize.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        NewSize.setForeground(new java.awt.Color(154, 154, 154));
        NewSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSizeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(154, 154, 154));
        jLabel4.setText("New Room Size:");

        upBox.setForeground(new java.awt.Color(154, 154, 154));
        upBox.setText("Update the Room Size");
        upBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(NewName, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(NewSize, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(279, 279, 279))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(419, 419, 419))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(upBox, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(NewSize, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(NewName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(upBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNameActionPerformed

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
        String nom_class = TextName.getText().trim();
        Integer eff_class = isNewSizeEmpty();

        String newName = NewName.getText().trim();
        boolean UpdateSize = isUpdateSize();

        // Vérifiez si le champ de texte n'est pas vide
        if (!nom_class.isEmpty() && !newName.isEmpty()) {
            try {
                // Obtenez une connexion à la base de données
                Connection connection = Connector.getConnection();
                if (ClassExists(connection, nom_class)) {

                    // Mise à jour de la matière
                    upClasse(connection, nom_class, newName, eff_class, UpdateSize);

                    // Affichez une boîte de dialogue de succès
                    javax.swing.JOptionPane.showMessageDialog(this, "La Classe '" + nom_class + "' a été mis à jour avec succès.");

                    // Fermez la connexion à la base de données
                    Connector.closeConnection(connection);

                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Erreur : La Classe '" + nom_class + "' n'existe pas.");

                }

            } catch (SQLException e) {
                // En cas d'erreur de base de données, affichez un message d'erreur
                javax.swing.JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour de la Classe : " + e.getMessage());
            }
        } else {
            // Si le champ de texte est vide, affichez un message d'erreur
            javax.swing.JOptionPane.showMessageDialog(this, "Veuillez entrer le nom de la Matiere.");
        }
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void ButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDelActionPerformed
        String nomMatiere = TextName.getText().trim();

        // Vérifiez si le champ de texte n'est pas vide
        if (!nomMatiere.isEmpty()) {
            try {
                // Obtenez une connexion à la base de données
                Connection connection = Connector.getConnection();

                // Vérifiez si la classe existe
                if (ClassExists(connection, nomMatiere)) {
                    // Si la classe existe, supprimez-la de la base de données
                    deleteMatiere(connection, nomMatiere);

                    // Affichez une boîte de dialogue de succès
                    javax.swing.JOptionPane.showMessageDialog(this, "La Matiere '" + nomMatiere + "' a été supprimée avec succès.");

                    // Fermez la connexion à la base de données
                    Connector.closeConnection(connection);
                } else {
                    // Si la classe n'existe pas, affichez une boîte de dialogue d'erreur
                    javax.swing.JOptionPane.showMessageDialog(this, "Erreur : La Matiere '" + nomMatiere + "' n'existe pas.");
                }
            } catch (SQLException e) {
                // En cas d'erreur de base de données, affichez un message d'erreur
                javax.swing.JOptionPane.showMessageDialog(this, "Erreur lors de la suppression de la Matiere : " + e.getMessage());
            }
        } else {
            // Si le champ de texte est vide, affichez un message d'erreur
            javax.swing.JOptionPane.showMessageDialog(this, "Veuillez entrer le nom de la Matiere à supprimer.");
        }
    }//GEN-LAST:event_ButtonDelActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        WindowRoom_Choice ch = new WindowRoom_Choice();
        ch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void NewNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewNameActionPerformed

    private void NewSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewSizeActionPerformed

    private void upBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upBoxActionPerformed

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
            java.util.logging.Logger.getLogger(WindowRoom_UpdateDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowRoom_UpdateDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowRoom_UpdateDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowRoom_UpdateDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowRoom_UpdateDel().setVisible(true);
            }
        });
    }

    private boolean ClassExists(Connection connection, String nomClasse) throws SQLException {
        // Utilisez une requête SQL pour vérifier l'existence de la classe
        String query = "SELECT COUNT(*) FROM salle WHERE nom_salle = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nomClasse);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            return count > 0;
        }
    }
    // Méthode pour ajouter une nouvelle classe à la base de données

    public void deleteMatiere(Connection connection, String nomClasse) throws SQLException {
        // Utilisez une requête SQL pour supprimer la classe
        String query = "DELETE FROM salle WHERE nom_salle = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nomClasse);
            statement.executeUpdate();
        }
    }

    private boolean isUpdateSize() {
        return upBox.isSelected();
    }

    private Integer isNewSizeEmpty() {

        String eff_class_string = NewSize.getText();
        Integer eff_class;
        if (!eff_class_string.isEmpty()) {
            eff_class = Integer.parseInt(eff_class_string);
        } else {
            eff_class = 50;
        }
        return eff_class;
    }

    private void upClasse(Connection connection, String nomClasse, String newName, Integer newsize, boolean isUpdateClasse) throws SQLException {
        // Utilisez une requête SQL pour mettre à jour la matière
        String query;
        if (isUpdateClasse) {
            query = "UPDATE salle SET nom_salle = ?, effectif_salle = ? WHERE nom_salle = ?";
        } else {
            query = "UPDATE salle SET nom_salle = ? WHERE nom_salle = ?";
        }

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, newName);

            if (isUpdateClasse) {
                statement.setInt(2, newsize);
                statement.setString(3, nomClasse);
            } else {
                statement.setString(2, nomClasse);
            }

            statement.executeUpdate();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton ButtonDel;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JTextField NewName;
    private javax.swing.JTextField NewSize;
    private javax.swing.JTextField TextName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox upBox;
    // End of variables declaration//GEN-END:variables
}
