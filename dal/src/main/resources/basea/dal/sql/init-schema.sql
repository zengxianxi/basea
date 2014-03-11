# 组织表
CREATE TABLE `security_organization` (
  `org_id`      VARCHAR(25) NOT NULL,
  `password`    VARCHAR(50) NOT NULL,
  `description` VARCHAR(255) DEFAULT NULL,
  `parent_id`   VARCHAR(25) DEFAULT NULL,
  PRIMARY KEY (`org_id`),
  KEY `parent_id` (`parent_id`),
  CONSTRAINT `fk_organization_parent` FOREIGN KEY (`parent_id`) REFERENCES `security_organization` (`org_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

