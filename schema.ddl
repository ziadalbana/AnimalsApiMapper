CREATE TABLE `animals` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `taxonomy_Id` int unsigned DEFAULT NULL,
  `locations` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `characteristics_Id` int unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `characteristics_Id` (`characteristics_Id`),
  KEY `taxonomy_Id` (`taxonomy_Id`),
  CONSTRAINT `animals_ibfk_1` FOREIGN KEY (`characteristics_Id`) REFERENCES `characteristics` (`id`),
  CONSTRAINT `animals_ibfk_2` FOREIGN KEY (`taxonomy_Id`) REFERENCES `taxonomy` (`id`)
)

-- taskdb.`characteristics` definition

CREATE TABLE `characteristics` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `prey` varchar(250) DEFAULT NULL,
  `name_of_young` varchar(250) DEFAULT NULL,
  `group_behavior` varchar(250) DEFAULT NULL,
  `estimated_population_size` varchar(250) DEFAULT NULL,
  `biggest_threat` varchar(250) DEFAULT NULL,
  `most_distinctive_feature` varchar(250) DEFAULT NULL,
  `gestation_period` varchar(250) DEFAULT NULL,
  `habitat` varchar(250) DEFAULT NULL,
  `diet` varchar(250) DEFAULT NULL,
  `average_litter_size` varchar(250) DEFAULT NULL,
  `lifestyle` varchar(250) DEFAULT NULL,
  `common_name` varchar(250) DEFAULT NULL,
  `number_of_species` varchar(250) DEFAULT NULL,
  `location` varchar(250) DEFAULT NULL,
  `slogan` varchar(250) DEFAULT NULL,
  `group_name` varchar(250) DEFAULT NULL,
  `color` varchar(250) DEFAULT NULL,
  `skin_type` varchar(250) DEFAULT NULL,
  `top_speed` varchar(250) DEFAULT NULL,
  `lifespan` varchar(250) DEFAULT NULL,
  `weight` varchar(250) DEFAULT NULL,
  `height` varchar(250) DEFAULT NULL,
  `age_of_sexual_maturity` varchar(250) DEFAULT NULL,
  `age_of_weaning` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

-- taskdb.taxonomy definition

CREATE TABLE `taxonomy` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `kingdom` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `phylum` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `class` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `order_num` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `family` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `genus` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `scientific_name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) 