-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : mar. 09 jan. 2024 à 19:50
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `edt`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE `classe` (
  `id_classe` int(11) NOT NULL,
  `nom_classe` varchar(255) NOT NULL,
  `effectif_classe` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`id_classe`, `nom_classe`, `effectif_classe`) VALUES
(1, 'M2', 100),
(3, 'L1', 154),
(4, 'L2', 50),
(5, 'L3', 50),
(6, 'M1', 50),
(7, 'essaie', 50),
(8, 'hakai', 55);

-- --------------------------------------------------------

--
-- Structure de la table `matieres`
--

CREATE TABLE `matieres` (
  `id_matiere` int(11) NOT NULL,
  `nom_matiere` varchar(255) NOT NULL,
  `enseignant_matiere` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `matieres`
--

INSERT INTO `matieres` (`id_matiere`, `nom_matiere`, `enseignant_matiere`) VALUES
(1, 'Exorcism', 'Satoru Gojo'),
(2, 'Swordsmanship', 'Roronoa Zoro'),
(3, 'Helmsman', 'Jimbe'),
(5, 'History', 'Nico Nico Robin'),
(6, 'Eating Challenge', 'Luffy'),
(8, 'Lying', 'Eric Cartman');

-- --------------------------------------------------------

--
-- Structure de la table `plage_horraire`
--

CREATE TABLE `plage_horraire` (
  `id_plage` int(11) NOT NULL,
  `date` varchar(255) NOT NULL,
  `debut` int(255) NOT NULL,
  `fin` int(255) NOT NULL,
  `classe_associee` varchar(255) DEFAULT NULL,
  `prof_associee` varchar(255) DEFAULT NULL,
  `matiere_associee` varchar(255) NOT NULL,
  `salle_associee` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `plage_horraire`
--

INSERT INTO `plage_horraire` (`id_plage`, `date`, `debut`, `fin`, `classe_associee`, `prof_associee`, `matiere_associee`, `salle_associee`) VALUES
(1, 'Monday', 10, 12, 'L3', 'Satoru Gojo', 'Meat Eating', 'B200'),
(3, 'Monday', 8, 10, 'L3', 'Satoru Gojo', 'Meat Eating', 'B200'),
(5, 'Monday', 13, 17, 'essaie', 'Satoru Gojo', 'Meat Eating', 'B200'),
(7, 'Wednesday', 7, 11, 'essaie', 'Luffy', 'Eating Challenge', 'A103'),
(8, 'Monday', 7, 8, 'essaie', 'Luffy', 'Eating Challenge', 'A103'),
(9, 'Tuesday', 13, 15, 'essaie', 'Luffy', 'Eating Challenge', 'A103'),
(10, 'Wednesday', 13, 17, 'essaie', 'Luffy', 'Eating Challenge', 'A103'),
(11, 'Thursday', 7, 12, 'essaie', 'Satoru Gojo', 'Exorcism', 'A105'),
(12, 'Thursday', 13, 15, 'essaie', 'Luffy', 'Eating Challenge', 'A103'),
(14, 'Wednesday', 10, 12, 'L3', 'Jimbe', 'Helmsman', 'A105'),
(15, 'Monday', 9, 8, 'hakai', 'Luffy', 'Eating Challenge', 'A103'),
(16, 'Tuesday', 7, 12, 'hakai', 'Eric Cartman', 'Lying', 'A104'),
(17, 'Thursday', 9, 12, 'L3', 'Nico Nico Robin', 'History', 'A104'),
(18, 'Friday', 7, 8, 'essaie', 'Luffy', 'Eating Challenge', 'A103'),
(19, 'Tuesday', 7, 10, 'essaie', 'Jimbe', 'Helmsman', 'A103');

-- --------------------------------------------------------

--
-- Structure de la table `prof`
--

CREATE TABLE `prof` (
  `id_prof` int(11) NOT NULL,
  `nom_prof` varchar(255) NOT NULL,
  `matiere_prof` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `prof`
--

INSERT INTO `prof` (`id_prof`, `nom_prof`, `matiere_prof`) VALUES
(2, 'Suguru', 'Exorcism'),
(6, 'Nico Nico Robin', 'History'),
(8, 'Luffy', 'Eating Challenge'),
(9, 'Eric Cartman', 'Lying');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE `salle` (
  `id_salle` int(11) NOT NULL,
  `nom_salle` varchar(25) NOT NULL,
  `assignation` int(11) DEFAULT NULL,
  `allocation` varchar(255) DEFAULT NULL,
  `effectif_salle` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`id_salle`, `nom_salle`, `assignation`, `allocation`, `effectif_salle`) VALUES
(2, 'A103', NULL, NULL, 60),
(3, 'A104', NULL, NULL, 60),
(4, 'A105', NULL, NULL, 60),
(5, 'B200', NULL, NULL, 10),
(6, 'Shin', NULL, NULL, 42),
(7, 'Fasana', NULL, NULL, 10);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
(1, 'Satoru', 'bankai'),
(2, 'Luffy', 'meat');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`id_classe`),
  ADD UNIQUE KEY `nom_classe` (`nom_classe`);

--
-- Index pour la table `matieres`
--
ALTER TABLE `matieres`
  ADD PRIMARY KEY (`id_matiere`),
  ADD UNIQUE KEY `nom_matiere` (`nom_matiere`);

--
-- Index pour la table `plage_horraire`
--
ALTER TABLE `plage_horraire`
  ADD PRIMARY KEY (`id_plage`);

--
-- Index pour la table `prof`
--
ALTER TABLE `prof`
  ADD PRIMARY KEY (`id_prof`),
  ADD KEY `matiere_prof` (`matiere_prof`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`id_salle`),
  ADD UNIQUE KEY `numero_salle` (`nom_salle`),
  ADD UNIQUE KEY `allocation` (`allocation`),
  ADD KEY `assignation` (`assignation`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `classe`
--
ALTER TABLE `classe`
  MODIFY `id_classe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT pour la table `matieres`
--
ALTER TABLE `matieres`
  MODIFY `id_matiere` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `plage_horraire`
--
ALTER TABLE `plage_horraire`
  MODIFY `id_plage` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT pour la table `prof`
--
ALTER TABLE `prof`
  MODIFY `id_prof` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT pour la table `salle`
--
ALTER TABLE `salle`
  MODIFY `id_salle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `prof`
--
ALTER TABLE `prof`
  ADD CONSTRAINT `prof_ibfk_1` FOREIGN KEY (`matiere_prof`) REFERENCES `matieres` (`nom_matiere`);

--
-- Contraintes pour la table `salle`
--
ALTER TABLE `salle`
  ADD CONSTRAINT `salle_ibfk_1` FOREIGN KEY (`assignation`) REFERENCES `classe` (`id_classe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
