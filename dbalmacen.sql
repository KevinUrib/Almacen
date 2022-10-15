Create database almacen;
USE almacen;

create table usuarios(
idUser int not null primary key auto_increment,
username varchar(30) not null,
contra varchar(300) not null,
nivel varchar(30)
);

SELECT * FROM usuarios;

create table departamentos(
id_depto int not null primary key auto_increment,
nombreDepto varchar(30) not null,
cantEmpleados int not null
);

SELECT * FROM departamentos;

create table empleados(
idEmp  int not null primary key auto_increment,
nombres varchar(60) not null,
apellidos varchar(60) not null,
dui varchar(10) not null,
salario double not null,
idDepto int not null,
constraint pk_departamento foreign key(idDepto) references departamentos(id_depto)
on update cascade on delete cascade
);

-- INSERT PARA USUARIOS
INSERT INTO almacen.usuarios (username,contra,nivel) VALUES ('Administrator','password1*','Administrador'),
									('Empleador','password2*','Usuario'),
                                    ('Cliente','password3*','Cliente');
                                    
-- INSERT PARA DEPARTAMENTOS
INSERT INTO departamentos(nombreDepto,cantEmpleados)  VALUES('TECNOLOGIA',25),
															('FINANZAS',30),
															('RECURSOS HUMANOS',20);