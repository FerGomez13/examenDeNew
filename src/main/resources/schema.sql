DROP TABLE IF EXISTS TBL_ANIMALES;

CREATE TABLE TBL_ANIMALES(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
raza VARCHAR (100)NOT NULL,
color VARCHAR(100)NOT NULL,
pelaje VARCHAR(100)NOT NULL,
fecha_nacimiento VARCHAR(100) NOT NULL,
vacunas VARCHAR(100) NOT NULL,
adopcion VARCHAR(50) NOT NULL,
nombre_adopcion VARCHAR(250) NOT NULL,
tipo VARCHAR(100) NOT NULL);
