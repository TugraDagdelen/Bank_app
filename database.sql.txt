CREATE TABLE `accounts` (
  `account_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `account_number` varchar(45) DEFAULT NULL,
  `balance` decimal(15,0) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`account_id`),
  KEY `customer_id_idx` (`account_number`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `branches` (
  `branch_id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `address` tinytext,
  PRIMARY KEY (`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `cards` (
  `card_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `card_number` varchar(45) DEFAULT NULL,
  `expiration_date` date DEFAULT NULL,
  `cvv` varchar(45) DEFAULT NULL,
  `limit` decimal(15,0) DEFAULT NULL,
  `debt` double DEFAULT NULL,
  `monthly_dept` double DEFAULT NULL,
  `remaining_months` int DEFAULT NULL,
  PRIMARY KEY (`card_id`,`customer_id`),
  KEY `customer_ref_idx` (`card_number`),
  KEY `customer_ref` (`customer_id`),
  CONSTRAINT `customer_ref` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `customer` (
  `customer_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `surname` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` longtext,
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `customercol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `investment` (
  `ins_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int DEFAULT NULL,
  `quantity` double DEFAULT NULL,
  `inv_name` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`ins_id`),
  KEY `inv_ref_idx` (`inv_name`),
  KEY `inv_ref` (`customer_id`),
  CONSTRAINT `inv_ref` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `loans` (
  `loan_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `loan_type` varchar(45) DEFAULT NULL,
  `main_amount` decimal(15,0) DEFAULT NULL,
  `interest_rate` decimal(5,0) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `remaining_amount` decimal(15,0) DEFAULT NULL,
  `remaining_months` int DEFAULT NULL,
  PRIMARY KEY (`loan_id`),
  KEY `customer_ref_idx` (`loan_type`),
  KEY `customer_refer` (`customer_id`),
  CONSTRAINT `customer_refer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
CREATE TABLE `login_logs` (
  `log_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `login_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `status` varchar(45) DEFAULT NULL,
  `password` int DEFAULT NULL,
  `nick_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`log_id`,`customer_id`),
  KEY `log_ref` (`customer_id`),
  CONSTRAINT `log_ref` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE `rate` (
  `rate_id` int NOT NULL AUTO_INCREMENT,
  `loan_type` varchar(45) DEFAULT NULL,
  `rate` double DEFAULT NULL,
  PRIMARY KEY (`rate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



