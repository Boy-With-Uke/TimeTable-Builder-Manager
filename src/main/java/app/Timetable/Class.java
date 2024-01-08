/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.Timetable;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author boywithuke
 */
public class Class {

    private String matiere;
    private String prof;
    private String salle;
    private String duree;
    private JPanel panel;
    private JLabel label;

    public Class(String matiere, String prof, String salle, String duree) {
        this.matiere = matiere;
        this.prof = prof;
        this.salle = salle;
        this.duree = duree;
        initComponents();
    }

    private void initComponents() {
        panel = new JPanel();

        // Utilisez le format HTML pour inclure des retours à la ligne
        String labelText = "<html>" + matiere + "<br>" + prof + "<br>" + salle + "<br>" + duree + "</html>";

        label = new JLabel(labelText);
        label.setFont(new java.awt.Font("Dialog", 0, 18));
        label.setForeground(new java.awt.Color(154, 154, 154));

        // Définir le fond du panel comme transparent
        panel.setOpaque(false);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(label);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getLabel() {
        return label;
    }
    public String getDuree() {
        return this.duree;
    }

}
