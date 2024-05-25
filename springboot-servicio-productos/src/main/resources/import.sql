INSERT INTO usuarios (username, password, name, last_name, email, create_at) VALUES ('gustavoG', '123456G', 'Gustavo', 'Huayta', 'gus@gmail.com', NOW() );
INSERT INTO usuarios (username, password, name, last_name, email, create_at) VALUES ('eduardo123', '123456E', 'Eduardo', 'Vicente', 'evi@gmail.com', NOW() );

INSERT INTO categoria (id_categoria, nombre) VALUES (1, 'Desayunos');
INSERT INTO categoria (id_categoria, nombre) VALUES (2, 'Ensaladas');
INSERT INTO categoria (id_categoria, nombre) VALUES (3, 'Postres');

INSERT INTO producto (id_producto, nombre, descripcion, precio, id_categoria, estado) VALUES (1, 'Banana Pancake', 'Banana Pancake', 19.49, 1, 1);
INSERT INTO producto (id_producto, nombre, descripcion, precio, id_categoria, estado) VALUES (2, 'Raisins Croissant', 'Raisins Croissant',  11.99, 1, 1);
INSERT INTO producto (id_producto, nombre, descripcion, precio, id_categoria, estado) VALUES (3, 'Greek Salad', 'Greek Salad', 11.99, 2, 1);

