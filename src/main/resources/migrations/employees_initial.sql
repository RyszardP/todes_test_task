CREATE TABLE employees (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(60) NULL,
  surname VARCHAR(60) NULL,
  patronic VARCHAR(60) NULL,
  birthday TIMESTAMP(6) NULL,
  sex VARCHAR(6) NULL,
  telephone VARCHAR(15) NULL,
  git_url VARCHAR(100) NULL,
  contacts VARCHAR(100) NULL,
  PRIMARY KEY (id)
);


  CREATE TABLE technology (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(60) NULL,
  PRIMARY KEY (id)
);


CREATE TABLE employee_technology(
employee_id INT NOT NULL,
technology_id INT NOT NULL,
PRIMARY KEY (employee_id, technology_id),
FOREIGN KEY (employee_id) REFERENCES employees(id),
FOREIGN KEY (technology_id) REFERENCES technology(id)
);

