package app.Timetable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Validator {

    public static boolean isValid(Connection connection, int startHour, int endHour, String salle, String classe, String day) {
        try {

// Vérifier si la classe est déjà occupée à la même heure le même jour
            if (isClassOccupied(connection, startHour, endHour, classe, day)) {
                JOptionPane.showMessageDialog(null, "La classe est déjà occupée à cette heure le même jour.");
                return false;
            }

            // Vérifier si la salle est déjà occupée à la même heure le même jour
            if (isSalleOccupied(connection, startHour, endHour, salle, day)) {
                JOptionPane.showMessageDialog(null, "La salle est déjà occupée à cette heure le même jour.");
                return false;
            }

            // Récupérer l'effectif de la classe
            int effectifClasse = getEffectifClasse(connection, classe);

            // Récupérer l'effectif de la salle
            int effectifSalle = getEffectifSalle(connection, salle);

            // Vérifier si l'effectif de la salle est suffisant
            if (effectifSalle < effectifClasse) {
                JOptionPane.showMessageDialog(null, "L'effectif de la salle est insuffisant pour accueillir la classe.");
                return false;
            }

            // Si toutes les conditions sont satisfaites, la validation est réussie
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur SQL : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private static boolean isSalleOccupied(Connection connection, int startHour, int endHour, String salle, String day) throws SQLException {
        String query = "SELECT * FROM plage_horraire WHERE salle_associee = ? AND date = ? AND ((debut >= ? AND debut < ?) OR (fin > ? AND fin <= ?))";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, salle);
            statement.setString(2, day);
            statement.setInt(3, startHour);
            statement.setInt(4, endHour);
            statement.setInt(5, startHour);
            statement.setInt(6, endHour);

            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next(); // true si la salle est déjà occupée à cette heure le même jour
            }
        }
    }

    private static int getEffectifClasse(Connection connection, String classe) throws SQLException {
        String query = "SELECT effectif_classe FROM classe WHERE nom_classe = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, classe);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("effectif_classe");
                } else {
                    throw new SQLException("Classe non trouvée : " + classe);
                }
            }
        }
    }

    private static int getEffectifSalle(Connection connection, String salle) throws SQLException {
        String query = "SELECT effectif_salle FROM salle WHERE nom_salle = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, salle);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("effectif_salle");
                } else {
                    throw new SQLException("Salle non trouvée : " + salle);
                }
            }
        }
    }

    private static boolean isClassOccupied(Connection connection, int startHour, int endHour, String classe, String day) throws SQLException {
        String query = "SELECT * FROM plage_horraire WHERE classe_associee = ? AND date = ? AND ((debut >= ? AND debut < ?) OR (fin > ? AND fin <= ?))";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, classe);
            statement.setString(2, day);
            statement.setInt(3, startHour);
            statement.setInt(4, endHour);
            statement.setInt(5, startHour);
            statement.setInt(6, endHour);

            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next(); // true si la classe est déjà occupée à cette heure le même jour
            }
        }
    }
    public static boolean PlageExists(Connection connection, int startHour, int endHour, String classe, String day) throws SQLException {
        
        // Utilisez une requête SQL pour vérifier l'existence de la classe
        String query = "SELECT COUNT(*) FROM plage_horraire WHERE date = ? AND classe_associee = ? AND debut = ? AND fin = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, day);
            statement.setString(2, classe);
            statement.setInt(3, startHour);
            statement.setInt(4, endHour);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            return count > 0;
        }
    }
}
