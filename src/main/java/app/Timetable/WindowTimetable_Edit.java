/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.Timetable;

import app.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author boywithuke
 */
public class WindowTimetable_Edit extends javax.swing.JFrame {

    /**
     * Creates new form WindowTimetable_Add
     */
    private Window_Main windowMainInstance;
    private String classe;

    public WindowTimetable_Edit(String classe, Window_Main windowMainInstance) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        fillDaysComboBox();
        fillStartComboBox();
        fillEndComboBox();
        fillSubjectComboBox();
        fillRoomComboBox();
        
        NewfillDaysComboBox();
        NewfillStartComboBox();
        NewfillEndComboBox();
        NewfillSubjectComboBox();
        NewfillRoomComboBox();
        
        this.classe = classe;
        this.windowMainInstance = windowMainInstance;
        System.out.println(this.classe);

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
        jLabel4 = new javax.swing.JLabel();
        DayCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        StartCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        EndCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        SubjectCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        RoomCombo = new javax.swing.JComboBox<>();
        ButtonValidate = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        NewDayCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        NewStartCombo = new javax.swing.JComboBox<>();
        NewEndCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NewSubjectCombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        NewRoomCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 21, 25));

        jLabel1.setFont(new java.awt.Font("Renitah", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(154, 154, 154));
        jLabel1.setText("Update a new Class");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(154, 154, 154));
        jLabel4.setText("Day:");

        DayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(154, 154, 154));
        jLabel5.setText("Start:");

        StartCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 0}));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(154, 154, 154));
        jLabel6.setText("End");

        EndCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 0 }));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(154, 154, 154));
        jLabel7.setText("Subject:");

        SubjectCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(154, 154, 154));
        jLabel8.setText("Room");

        RoomCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonValidate.setBackground(new java.awt.Color(51, 57, 67));
        ButtonValidate.setFont(new java.awt.Font("Noto Sans", 2, 17)); // NOI18N
        ButtonValidate.setForeground(new java.awt.Color(154, 154, 154));
        ButtonValidate.setText("Validate");
        ButtonValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonValidateActionPerformed(evt);
            }
        });

        CloseButton.setBackground(new java.awt.Color(51, 57, 67));
        CloseButton.setFont(new java.awt.Font("Noto Sans", 2, 17)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(154, 154, 154));
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(154, 154, 154));
        jLabel9.setText("Day:");

        NewDayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(154, 154, 154));
        jLabel10.setText("Start:");

        NewStartCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 0}));

        NewEndCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 0 }));

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(154, 154, 154));
        jLabel11.setText("End");

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(154, 154, 154));
        jLabel12.setText("Subject:");

        NewSubjectCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(154, 154, 154));
        jLabel13.setText("Room");

        NewRoomCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(StartCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(EndCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RoomCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(106, 106, 106)))
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewDayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(NewStartCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(72, 72, 72)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewEndCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel11)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SubjectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NewSubjectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewRoomCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel13)))))
                .addGap(176, 176, 176))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(ButtonValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StartCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EndCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubjectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoomCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewDayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(NewEndCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(NewSubjectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(NewRoomCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(NewStartCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonValidateActionPerformed

        String subject = SubjectCombo.getSelectedItem().toString();
        String room = RoomCombo.getSelectedItem().toString();
        String day = DayCombo.getSelectedItem().toString();
        String start_string = StartCombo.getSelectedItem().toString();
        String end_string = EndCombo.getSelectedItem().toString();
        Integer start = Integer.parseInt(start_string);
        Integer end = Integer.parseInt(end_string);

        String Newsubject = NewSubjectCombo.getSelectedItem().toString();
        String Newroom = NewRoomCombo.getSelectedItem().toString();
        String Newday = NewDayCombo.getSelectedItem().toString();
        String Newstart_string = NewStartCombo.getSelectedItem().toString();
        String Newend_string = NewEndCombo.getSelectedItem().toString();
        Integer Newstart = Integer.parseInt(Newstart_string);
        Integer Newend = Integer.parseInt(Newend_string);

        try {

            Connection connection = Connector.getConnection();
            Boolean Exist = Validator.PlageExists(connection, start, end, this.classe, day);
            Boolean Valid = Validator.isValid(connection, Newstart, Newend, Newroom, this.classe, Newday);

            String teacher = getTeacher(connection, subject);
            System.out.println(Valid);
            if (Exist && Valid) {
                String Newprof = getTeacher(connection, Newsubject);
                Update(connection,Newstart,Newend,Newprof,Newroom,this.classe, Newsubject, Newday, start, end,room, this.classe,teacher, subject,day);                
                javax.swing.JOptionPane.showMessageDialog(this, "Le Plage a été modifiée avec succès.");

                // Fermez la connexion à la base de données
                Connector.closeConnection(connection);
            } else {
                // Si la classe existe déjà, affichez une boîte de dialogue d'erreur
                javax.swing.JOptionPane.showMessageDialog(this, "Erreur de validation");
            }

        } catch (SQLException e) {
            // En cas d'erreur de base de données, affichez un message d'erreur
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des classes : " + e.getMessage());
        }


    }//GEN-LAST:event_ButtonValidateActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        SwingUtilities.updateComponentTreeUI(windowMainInstance);
        windowMainInstance.invalidate();
        windowMainInstance.validate();
        windowMainInstance.repaint();
        windowMainInstance.refreshWindow();
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WindowTimetable_Edit.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowTimetable_Edit.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowTimetable_Edit.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowTimetable_Edit.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    private void fillDaysComboBox() {
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        // Ajoutez les classes à la JComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(days.toArray(new String[0]));
        DayCombo.setModel(model);

    }

    private void fillStartComboBox() {
        List<Integer> start = new ArrayList<>();
        start.add(7);
        start.add(8);
        start.add(9);
        start.add(10);
        start.add(13);
        start.add(14);
        start.add(15);
        // Ajoutez les classes à la JComboBox
        DefaultComboBoxModel<Integer> model = new DefaultComboBoxModel<>(start.toArray(new Integer[0]));
        StartCombo.setModel(model);

    }

    private void fillEndComboBox() {
        List<Integer> start = new ArrayList<>();
        start.add(8);
        start.add(9);
        start.add(10);
        start.add(11);
        start.add(12);
        start.add(14);
        start.add(15);
        start.add(16);
        start.add(17);
        // Ajoutez les classes à la JComboBox
        DefaultComboBoxModel<Integer> model = new DefaultComboBoxModel<>(start.toArray(new Integer[0]));
        EndCombo.setModel(model);

    }

    private void fillSubjectComboBox() {
        try {
            // Obtenez une connexion à la base de données
            Connection connection = Connector.getConnection();

            // Récupérez les données de la base de données (noms des classes)
            List<String> matieres = getMatiereFromDatabase(connection);

            // Ajoutez les classes à la JComboBox
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(matieres.toArray(new String[0]));
            SubjectCombo.setModel(model);

            // Fermez la connexion à la base de données
            Connector.closeConnection(connection);
        } catch (SQLException e) {
            // En cas d'erreur de base de données, affichez un message d'erreur
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des classes : " + e.getMessage());
        }
    }

    private List<String> getMatiereFromDatabase(Connection connection) throws SQLException {
        List<String> matieres = new ArrayList<>();
        String query = "SELECT nom_matiere FROM matieres";
        try (PreparedStatement statement = connection.prepareStatement(query); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String matiere = resultSet.getString("nom_matiere");
                matieres.add(matiere);
            }
        }
        return matieres;
    }

    private void fillRoomComboBox() {
        try {
            // Obtenez une connexion à la base de données
            Connection connection = Connector.getConnection();

            // Récupérez les données de la base de données (noms des classes)
            List<String> rooms = getRoomFromDatabase(connection);

            // Ajoutez les classes à la JComboBox
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(rooms.toArray(new String[0]));
            NewRoomCombo.setModel(model);

            // Fermez la connexion à la base de données
            Connector.closeConnection(connection);
        } catch (SQLException e) {
            // En cas d'erreur de base de données, affichez un message d'erreur
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des salles : " + e.getMessage());
        }
    }

    private List<String> getRoomFromDatabase(Connection connection) throws SQLException {
        List<String> matieres = new ArrayList<>();
        String query = "SELECT nom_salle FROM salle";
        try (PreparedStatement statement = connection.prepareStatement(query); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String matiere = resultSet.getString("nom_salle");
                matieres.add(matiere);
            }
        }
        return matieres;
    }
    
    
    
    
    
    private void NewfillRoomComboBox() {
        try {
            // Obtenez une connexion à la base de données
            Connection connection = Connector.getConnection();

            // Récupérez les données de la base de données (noms des classes)
            List<String> rooms = getRoomFromDatabase(connection);

            // Ajoutez les classes à la JComboBox
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(rooms.toArray(new String[0]));
            RoomCombo.setModel(model);

            // Fermez la connexion à la base de données
            Connector.closeConnection(connection);
        } catch (SQLException e) {
            // En cas d'erreur de base de données, affichez un message d'erreur
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des salles : " + e.getMessage());
        }
    }
    
    private void NewfillDaysComboBox() {
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        // Ajoutez les classes à la JComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(days.toArray(new String[0]));
        NewDayCombo.setModel(model);

    }

    private void NewfillStartComboBox() {
        List<Integer> start = new ArrayList<>();
        start.add(7);
        start.add(8);
        start.add(9);
        start.add(10);
        start.add(13);
        start.add(14);
        start.add(15);
        // Ajoutez les classes à la JComboBox
        DefaultComboBoxModel<Integer> model = new DefaultComboBoxModel<>(start.toArray(new Integer[0]));
        NewStartCombo.setModel(model);

    }

    private void NewfillEndComboBox() {
        List<Integer> start = new ArrayList<>();
        start.add(8);
        start.add(9);
        start.add(10);
        start.add(11);
        start.add(12);
        start.add(14);
        start.add(15);
        start.add(16);
        start.add(17);
        // Ajoutez les classes à la JComboBox
        DefaultComboBoxModel<Integer> model = new DefaultComboBoxModel<>(start.toArray(new Integer[0]));
        NewEndCombo.setModel(model);

    }

    private void NewfillSubjectComboBox() {
        try {
            // Obtenez une connexion à la base de données
            Connection connection = Connector.getConnection();

            // Récupérez les données de la base de données (noms des classes)
            List<String> matieres = getMatiereFromDatabase(connection);

            // Ajoutez les classes à la JComboBox
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(matieres.toArray(new String[0]));
            NewSubjectCombo.setModel(model);

            // Fermez la connexion à la base de données
            Connector.closeConnection(connection);
        } catch (SQLException e) {
            // En cas d'erreur de base de données, affichez un message d'erreur
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des classes : " + e.getMessage());
        }
    }
    
    
    

    private void Update(Connection connection, int newStart, int newEnd, String newProf, String newSalle, String newClass, String newMatiere, String newDay, int startHour, int endHour, String salle, String classe, String prof, String matiere, String day) throws SQLException {
        String query = "UPDATE plage_horraire SET date = ?, debut = ?, fin = ?, classe_associee = ?, matiere_associee = ?, salle_associee = ?, prof_associee = ? WHERE date = ? AND debut = ? AND fin = ? AND classe_associee = ? AND matiere_associee = ? AND salle_associee = ? AND prof_associee = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, newDay);
            statement.setInt(2, newStart);
            statement.setInt(3, newEnd);
            statement.setString(4, newClass);
            statement.setString(5, newMatiere);
            statement.setString(6, newSalle);
            statement.setString(7, newProf);
            // Ajoutez les paramètres pour la clause WHERE
            statement.setString(8, day);
            statement.setInt(9, startHour);
            statement.setInt(10, endHour);
            statement.setString(11, classe);
            statement.setString(12, matiere);
            statement.setString(13, salle);
            statement.setString(14, prof);

            statement.executeUpdate();
            System.out.println("Requête SQL : " + statement.toString());
        }
    }

    private String getTeacher(Connection connection, String matiere) throws SQLException {
        String query = "SELECT enseignant_matiere FROM matieres WHERE nom_matiere = ?";
        String result = null;

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, matiere);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    result = resultSet.getString("enseignant_matiere");
                }
            }
        }

        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonValidate;
    private javax.swing.JButton CloseButton;
    private javax.swing.JComboBox<String> DayCombo;
    private javax.swing.JComboBox<Integer> EndCombo;
    private javax.swing.JComboBox<String> NewDayCombo;
    private javax.swing.JComboBox<Integer> NewEndCombo;
    private javax.swing.JComboBox<String> NewRoomCombo;
    private javax.swing.JComboBox<Integer> NewStartCombo;
    private javax.swing.JComboBox<String> NewSubjectCombo;
    private javax.swing.JComboBox<String> RoomCombo;
    private javax.swing.JComboBox<Integer> StartCombo;
    private javax.swing.JComboBox<String> SubjectCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
