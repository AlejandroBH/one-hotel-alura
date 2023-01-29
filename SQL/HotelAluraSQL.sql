CREATE DATABASE hotelalura;

USE hotelalura;

CREATE TABLE reservas(
	id INT NOT NULL AUTO_INCREMENT,
	fecha_entrada DATE NULL,
	fecha_salida DATE NULL,
	valor VARCHAR(45) NULL,
	forma_pago VARCHAR(45) NULL,
	PRIMARY KEY(id)
)Engine=InnoDB;

CREATE TABLE huespedes(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(45) NULL,
	apellido VARCHAR(45) NULL,
	fecha_nacimiento DATE NULL,
	nacionalidad VARCHAR(45) NULL,
	telefono INT,
	id_reserva INT NOT NULL,
	PRIMARY KEY(id)
)Engine=InnoDB;