/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author boywithuke
 */
public class methode {
     public void deleteMatiere(Connection connection, String nomClasse) throws SQLException {
        // Utilisez une requête SQL pour supprimer la classe
        String query = "DELETE FROM matieres WHERE nom_matiere = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nomClasse);
            statement.executeUpdate();
        }
    }
}
