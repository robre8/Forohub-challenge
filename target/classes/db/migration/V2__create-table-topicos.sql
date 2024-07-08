create table topicos(
                     id SERIAL PRIMARY KEY,
                     titulo varchar(200) not null,
                     fecha timestamp not null,
                     mensaje varchar(300) not null,
                     status varchar (20) not null,
                     autor varchar not null,
                     curso varchar(100) not null

                     );


