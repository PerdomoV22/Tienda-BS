insert into ciudad values (63000,"Armenia");
insert into ciudad values (66000,"Pereira");
insert into ciudad values (170001,"Manizales");
insert into ciudad values (680001,"Bucaramanga");
insert into ciudad values (76000,"Cali");
insert into ciudad values (050001,"Medellin");
insert into ciudad values (080001,"Barranquilla");
insert into ciudad values (130001,"Cartagena");
insert into ciudad values (730001,"Ibague");
insert into ciudad values (110110,"Bogota");

insert into administrador values (1005095839,"diego@email.com","Entre lomas Torre 20 Apt 401",1,"Diego Cortes","159753d","3128848672");
insert into administrador values (1005604213,"juan22@email.com","Parque uribe Cra 5 No 23",1,"Juan Perdomo","perdomov22","3157418901");
insert into administrador values (1098721903,"laura@email.com","Villa Claudia Mz g No 8",1,"Laura Montoya","lau19mo","3226356707");
insert into administrador values (1003208047,"sebastian@email.com","Naranjos Cra 15 No 44",0,"Sebastian Lopez","37egdet","3157223390");
insert into administrador values (9728822,"carlos@email.com","Av norte Cra 2 No 7",0,"Carlos Cortes","1927467","3147234682");
insert into administrador values (41965280,"leidy@email.com","San simon Cra 35 No 31",1,"Leidy Perez","2202706jdl","3197392938");
insert into administrador values (1092882935,"santiago@email.com","El jardin Cra 17 No 60",0,"Santiago Hernandez","yebex34yc","3117286999");
insert into administrador values (1007892437,"daniel@email.com","Conjunto residencial los yarumos torre 4 Apt 106",1,"Daniel Cartagena","jxdnwei","3132715261");
insert into administrador values (1077346717,"andres@email.com","El poblado Cra 11 No 10",0,"Andres Mosquera","ahwsg66","3117261507");
insert into administrador values (1067892437,"pablo@email.com","Conjunto residencial  torre verde torre 15 Apt 306",1,"Pablo Torres","26svst6","3105292791");

insert into cliente values (42645092,"sandra@email.com","Bocagrande Cra 16 No 13",1,"Sandra Diaz","cnw87","3143803356");
insert into cliente values (447632251,"miguel@email.com","La pavona Mz 10 No 6",1,"Miguel Contreras","hcewui","3107238728");
insert into cliente values (9734108,"laura@email.com","Las americas Cra 4 No 12",0,"Laura Hurtado","nxswu81","3177010020");
insert into cliente values (1009938213,"morant@email.com","las Ceibas Mz 30 No 56",1,"Javier Morant","znue150","3166667287");
insert into cliente values (58398347,"luis@email.com","Granada Cra 24 a 51-13",0,"Luis Hidalgo","nsdih","3143538290");
insert into cliente values (1109467871,"cristian@email.com","Las americas AV bolivar Cra 33 No 70",1,"Cristian Prada","undeu7","3237451273");
insert into cliente values (6329019,"manuel@email.com","Laureles Mz 7 No 9",0,"Manuel Arias","mca1307","3143803356");
insert into cliente values (24789118,"george@email.com","Santa cruz Mz 12 No 2",1,"George Gallo","asjfu1975","3215345152");
insert into cliente values (73940237,"claudia@email.com","Aranjuez Cra 22 No 36",1,"Claudia Trujillo","127dhgd","3006362562");
insert into cliente values (127365947,"hugo@email.com","Molinos Cra 50 No 83",0,"Hugo Vargas","7egdb","3163765454");

insert into cupon values (001,"Cupon de descuento por registro","Descuento que se aplica a la persona que se registra en la pagina","2022/11/24",20000);
insert into cupon values (002,"Cupon de descuento por primera compra","Descuento que se aplica a la persona que realiza su primera compra","2022/12/12",0.10);
insert into cupon values (003,"Cupon de descuento por compras mayores","Descuento que se aplica por compra de productos mayores a 100 mil pesos","2022/12/29",30000);
insert into cupon values (004,"Cupon de regalo ","Cupon que se obtiene por fidelidad del cliente","2023/01/07",70000);
insert into cupon values (005,"Cupon por envio gratis","Cupon que se aplica para realizar envios gratis a cualquier parte del pais","2022/11/24",50000);
insert into cupon values (006,"Cupon por productos de lanzamiento","Cupon de descuento que aplica para productos referenciados","2023/02/15",0.15);
insert into cupon values (007,"Cupon festividades","Cupon de descuento que se aplica a productos referenciados en festividades","2022/12/31",.20);

insert into categoria values (01,"Categoria en la que se encuentran productos para ninos","Nino");
insert into categoria values (02,"Categoria en la que se encuentran productos para ninas","Nina");
insert into categoria values (03,"Categoria en la que se encuentran productos para  hombres","Hombre");
insert into categoria values (04,"Categoria en la que se encuentran productos para Mujeres","Mujer");
insert into categoria values (05,"Categoria en la que se encuentran productos para bebes","Bebe");
insert into categoria values (06,"Categoria en la que se encuentran productos faciales,faciales,corporales y maquillaje","Beauty");

insert into cliente_cupones values (127365947,001);
insert into cliente_cupones values (24789118,001);
insert into cliente_cupones values (6329019,001);
insert into cliente_cupones values (42645092,006);
insert into cliente_cupones values (447632251,003);
insert into cliente_cupones values (127365947,005);
insert into cliente_cupones values (1009938213,002);
insert into cliente_cupones values (1109467871,007);
insert into cliente_cupones values (6329019,004);
insert into cliente_cupones values (24789118,002);

insert into categoria_clientes values (04,9734108);
insert into categoria_clientes values (02,42645092);
insert into categoria_clientes values (02,58398347);
insert into categoria_clientes values (04,73940237);
insert into categoria_clientes values (03,1109467871);
insert into categoria_clientes values (01,1009938213);
insert into categoria_clientes values (05,1109467871);
insert into categoria_clientes values (02,127365947);
insert into categoria_clientes values (01,24789118);
insert into categoria_clientes values (06,9734108);

insert into tienda values (1,"Av Norte Cra 13 No 15","tenis","7359217",1005095839,63000);
insert into tienda values (2,"Centro comercial arboleda local 22","tenis","7459922",1005604213,66000);
insert into tienda values (3,"Unicentro Cra 20 No 06","tenis","7351256",1098721903,170001);
insert into tienda values (4,"Cra 03 No 17-29","tenis","7447247",1003208047,680001);
insert into tienda values (5,"Cra 19 No 5-56","tenis","7451307",9728822,76000);
insert into tienda values (6,"Centro comercial victoria local 14","tenis","7362121",41965280,050001);
insert into tienda values (7,"Av Sur Cra 48 No 65","tenis","7379038",1092882935,080001);
insert into tienda values (8,"Centro comercial plaza bocagrande Cra 1 No 12","tenis","7446205",1007892437,130001);
insert into tienda values (9,"Centro comercial la estacion Cl 60 No 12-224","tenis","7383729",1077346717,730001);
insert into tienda values (10,"Centro comercial la colina Cra 58d No 146146-51","tenis","7474771",1067892437,110110);

insert into producto values (0001,"Rojo","Camiseta para hombre ","url foto","tenis","Camiseta Hombre",80000,"L",03,001,1);
insert into producto values (0002,"Gris","Camiseta para niño ","url foto","tenis","Camiseta Niño",55000,"S",01,null,2);
insert into producto values (0003,"Azul","Pantalon para mujer ","url foto","tenis","Pantalon Mujer",130000,"M",04,null,3);
insert into producto values (0004,"Verde","Camisa para niño ","url foto","tenis","Camisa Niño",45000,"S",01,002,4);
insert into producto values (0005,"Amarillo","Tonico para la piel","url foto","Eleven","Tonico facial",60000,"Producto sin talla",06,007,5);
insert into producto values (0006,"Blanco","Overol para bebe ","url foto","tenis","Overol Bebe",100000,"XS",05,null,6);
insert into producto values (0007,"Negro","Camiseta para hombre ","url foto","tenis","Camiseta Hombre",90000,"XL",03,005,7);
insert into producto values (0008,"Morado","Vestido para mujer ","url foto","tenis","Vestido Mujer",150000,"L",04,003,8);
insert into producto values (0009,"Rosado","Pantalon para niña","url foto","tenis","Pantalon Niña",75000,"S",02,null,9);
insert into producto values (0010,"Salmon","Falda para niña ","url foto","tenis","Falda Niña",50000,"S",02,002,10);

insert into pqrs values (00001,"Mal entrega de producto","Se hace el reclamo debido a la mala entrega del producto",42645092);
insert into pqrs values (00002,"Excelente producto","El producto es de muy buena calidad",447632251);
insert into pqrs values (00003,"Demora en entrega","Demora en el proceso de entrega excede los dias habiles",9734108);
insert into pqrs values (00004,"Producto defectuoso","Reclamo por la mala calidad del producto",1009938213);
insert into pqrs values (00005,"No acepta medio de pago","Queja por no aceptar medio de pago",58398347);
insert into pqrs values (00006,"Peticion de catalogo","Peticion donde exige el catalogo de los productos",1109467871);
insert into pqrs values (00007,"Mala atencion","Queja por mal asesoramiento por parte de los empleados",6329019);
insert into pqrs values (00008,"Satisfaccion por eficacia","Satisfaccion por la eficiencia de la aplicacion",24789118);
insert into pqrs values (00009,"Lentitud en el proceso de compra","Queja por lentitud a la hora de comprar productos",73940237);
insert into pqrs values (00010,"Excelente variedad","Felicitacion por la variedad de productos ofrecidos a un buen precio",127365947);

insert into factura values (000001,"Factura por compra de un jean para hombre y una camisa para hombre");
insert into factura values (000002,"Factura por compra de un overol para bebe");
insert into factura values (000003,"Factura por compra de una falda y calcetines para niña");
insert into factura values (000004,"Factura por compra de un vestido de mujer, zapatos camisa para hombre y un tonico facila");
insert into factura values (000005,"Factura por compra de un bolso");
insert into factura values (000006,"Factura por compra de tres jeans dos camisetas y un reloj");
insert into factura values (000007,"Factura por compra de un babero, tres chupos e interiores de mujer");
insert into factura values (000008,"Factura por compra de tres maletas, dos calcetines y un gorro");
insert into factura values (000009,"Factura por compra de legis y top para ejercicio");
insert into factura values (000010,"Factura por compra de cuatro pares de tenis");

insert into entrega values (0000001,8,"Bocagrande Cra 16 No 13",0,"2022/11/31T10:45",65000);
insert into entrega values (0000002,8,"La pavona Mz 10 No 6",1,"2022/01/21T7:11",55000);
insert into entrega values (0000003,8,"Las americas Cra 4 No 12",1,"2023/04/28T1:22",155000);
insert into entrega values (0000004,8,"las Ceibas Mz 30 No 56",0,"2022/12/31T3:33",25000);
insert into entrega values (0000005,8,"Granada Cra 24 a 51-13",0,"2023/07/11T10:50",38000);
insert into entrega values (0000006,8,"Las americas AV bolivar Cra 33 No 70",1,"2022/10/15T12:40",80000);
insert into entrega values (0000007,8,"Laureles Mz 7 No 9",1,"2023/07/03T3:45",59000);
insert into entrega values (0000008,8,"Santa cruz Mz 12 No 2",1,"2022/07/13T9:45",355000);
insert into entrega values (0000009,8,"Aranjuez Cra 22 No 36",0,"2023/12/27T7:45",128000);
insert into entrega values (0000010,8,"Molinos Cra 50 No 83",1,"2023/06/20T5:45",100000);

insert into compra values (100,"2022/11/21T5:45","Daviplta",200000,42645092,0000001,000001);
insert into compra values (101,"2022/01/11T7:13","Bancolombia",250000,447632251,0000002,000002);
insert into compra values (102,"2023/04/15T8:07","Nequi",300000,9734108,0000003,000003);
insert into compra values (103,"2022/12/02T9:17","Movil",400000,1009938213,0000004,000004);
insert into compra values (104,"2023/06/30T12:47","PSE",120000,58398347,0000005,000005);
insert into compra values (105,"2022/10/07T11:13","PSE",80000,1109467871,0000006,000006);
insert into compra values (106,"2023/06/21T8:56","Daviplta",500000,6329019,0000007,000007);
insert into compra values (107,"2022/06/27T1:22","Nequi",380000,24789118,0000008,000008);
insert into compra values (108,"2023/12/15T5:30","Bancolombia",202000,73940237,0000009,000009);
insert into compra values (109,"2023/06/03T10:20","Daviplta",960000,127365947,0000010,000010);

insert into compra_productos values (100,0001);
insert into compra_productos values (101,0002);
insert into compra_productos values (102,0003);
insert into compra_productos values (103,0004);
insert into compra_productos values (104,0005);
insert into compra_productos values (105,0006);
insert into compra_productos values (106,0007);
insert into compra_productos values (107,0008);
insert into compra_productos values (108,0009);
insert into compra_productos values (109,0010);

insert into calificacion values (1000,"Excelente producto",5,42645092,0001);
insert into calificacion values (1001,"Buen producto",4,447632251,0002);
insert into calificacion values (1002,"Producto funcional",3,9734108,0003);
insert into calificacion values (1003,"producto defectusoso",2,1009938213,0004);
insert into calificacion values (1004,"Producto muy mala calidad",1,58398347,0005);
insert into calificacion values (1005,"Buen precio mala funcion",3,1109467871,0006);
insert into calificacion values (1006,"Producto recomendado",5,6329019,0007);
insert into calificacion values (1007,"No recomeindo este prodcuto demora en la entrega y defectuoso",2,24789118,0008);
insert into calificacion values (1008,"Recomiendo producto",4,73940237,0009);
insert into calificacion values (1009,"Me gusto mucho",4,127365947,0010);



