create table cliente (
	idcliente int primary key auto_increment,
	nombre varchar(100),
	telefono varchar(15),
	direccion varchar(200),
	email varchar(100)
);

create table mascota (
	idmascota int primary key auto_increment,
	nombre varchar(100),
	especie varchar(50),
	raza varchar(50),
	idcliente int,
	foreign key (idcliente) references cliente(idcliente)
);

create table veterinario (
	idveterinario int primary key auto_increment,
	nombre varchar(100),
	especialidad varchar(100),
	telefono varchar(15),
	email varchar(100)
);

create table cita (
	idcita int primary key auto_increment,
	idmascota int,
	idveterinario int,
	fecha date,
	motivo varchar(200),
	foreign key (idmascota) references mascota(idmascota),
	foreign key (idveterinario) references veterinario(idveterinario)
);

create table tratamiento (
	idtratamiento int primary key auto_increment,
	idcita int,
	descripcion varchar(200),
	costo decimal(10, 2),
	fecha date,
	foreign key (idcita) references cita(idcita)
);

insert into cliente (nombre, telefono, direccion, email) values
('Juan Pérez', '987654321', 'Calle Falsa 123', 'juan.perez@email.com'),
('María Gómez', '123456789', 'Av. Siempre Viva 456', 'maria.gomez@email.com'),
('Luis Martínez', '234567890', 'Calle 10', 'luis.martinez@email.com'),
('Ana Torres', '345678901', 'Calle 20', 'ana.torres@email.com'),
('Pedro Sánchez', '456789012', 'Calle 30', 'pedro.sanchez@email.com'),
('Laura Fernández', '567890123', 'Calle 40', 'laura.fernandez@email.com'),
('Jorge Ruiz', '678901234', 'Calle 50', 'jorge.ruiz@email.com'),
('Lucía López', '789012345', 'Calle 60', 'lucia.lopez@email.com');

insert into mascota (nombre, especie, raza, idcliente) values
('Rex', 'Perro', 'Labrador', 1),
('Luna', 'Gato', 'Siamés', 1),
('Bobby', 'Perro', 'Poodle', 2),
('Nina', 'Gato', 'Persa', 2),
('Rocky', 'Perro', 'Bulldog', 3),
('Bella', 'Perro', 'Golden Retriever', 4),
('Simba', 'Gato', 'Bengalí', 5),
('Mia', 'Perro', 'Beagle', 6);

insert into veterinario (nombre, especialidad, telefono, email) values
('Dr. López', 'Cirugía', '123456789', 'dr.lopez@veterinaria.com'),
('Dra. Pérez', 'Medicina General', '987654321', 'dra.perez@veterinaria.com'),
('Dr. Gómez', 'Dermatología', '234567890', 'dr.gomez@veterinaria.com'),
('Dra. Torres', 'Odontología', '345678901', 'dra.torres@veterinaria.com'),
('Dr. Martínez', 'Cardiología', '456789012', 'dr.martinez@veterinaria.com'),
('Dra. Sánchez', 'Nutrición', '567890123', 'dra.sanchez@veterinaria.com'),
('Dr. Ruiz', 'Endocrinología', '678901234', 'dr.ruiz@veterinaria.com'),
('Dra. Fernández', 'Oncología', '789012345', 'dra.fernandez@veterinaria.com');

insert into cita (idmascota, idveterinario, fecha, motivo) values
(1, 1, '2024-01-15', 'Chequeo general'),
(2, 1, '2024-01-16', 'Vacunación'),
(3, 2, '2024-01-17', 'Consulta dermatológica'),
(4, 3, '2024-01-18', 'Revisión dental'),
(5, 4, '2024-01-19', 'Chequeo general'),
(6, 5, '2024-01-20', 'Consulta nutricional'),
(7, 6, '2024-01-21', 'Chequeo general'),
(8, 7, '2024-01-22', 'Control de peso');

insert into tratamiento (idcita, descripcion, costo, fecha) values
(1, 'Vacuna antirrábica', 30.00, '2024-01-15'),
(2, 'Vacuna polivalente', 25.00, '2024-01-16'),
(3, 'Tratamiento para dermatitis', 50.00, '2024-01-17'),
(4, 'Limpieza dental', 70.00, '2024-01-18'),
(5, 'Control de parásitos', 40.00, '2024-01-19'),
(6, 'Asesoría nutricional', 20.00, '2024-01-20'),
(7, 'Vacuna antirrábica', 30.00, '2024-01-21'),
(8, 'Control de peso', 15.00, '2024-01-22');
