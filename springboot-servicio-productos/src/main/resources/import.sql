INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic', 800, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony', 700, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Apple', 1000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Notebook', 1000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Hewlett Packard', 500, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Bianchi', 600, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Nike', 100, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Adidas', 200, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Reebok', 300, NOW());

INSERT INTO usuarios (username, password, name, last_name, email, create_at) VALUES ('gustavoG', '123456G', 'Gustavo', 'Huayta', 'gus@gmail.com', NOW() );
INSERT INTO usuarios (username, password, name, last_name, email, create_at) VALUES ('eduardo123', '123456E', 'Eduardo', 'Vicente', 'evi@gmail.com', NOW() );

INSERT INTO categoria (id_categoria, nombre) VALUES (1, 'Desayunos');
INSERT INTO categoria (id_categoria, nombre) VALUES (2, 'Ensaladas');
INSERT INTO categoria (id_categoria, nombre) VALUES (3, 'Postres');

INSERT INTO producto (id_producto, nombre, descripcion, precio, id_categoria, estado) VALUES (1, 'Banana Pancake', 'Banana Pancake',  19.49, 1, 1));
INSERT INTO producto (id_producto, nombre, descripcion, precio, id_categoria, estado) VALUES (2, 'Raisins Croissant', 'Raisins Croissant',  11.99, 1, 1));
INSERT INTO producto (id_producto, nombre, descripcion, precio, id_categoria, estado) VALUES (3, 'Greek Salad', 'Greek Salad',  11.99,2, 1));

