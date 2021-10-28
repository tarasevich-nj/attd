create table user
(
    user_id   int auto_increment primary key,
    lastname  varchar(100)                          null,
    firstname varchar(100)                          not null,
    username  varchar(100)                          not null,
    password  varchar(100)                          not null,
    created   timestamp default current_timestamp() not null,
    updated   timestamp default current_timestamp() not null on update current_timestamp(),
    constraint username
        unique (username) -- поле должно быть унимальным в рамках таблицы
) engine = InnoDB;

create table auth
(
    auth_id    int auto_increment primary key,
    user_id    int                                   null,
    auth_token varchar(100)                          not null,
    auth_time  timestamp default current_timestamp() not null,
    constraint fk__auth__user
        foreign key (user_id) references user (user_id)
) engine = InnoDB;

create table tracking
(
    tracking_id int auto_increment primary key,
    user_id     int                         null,
    date        date default current_date() not null,
    hours       int                         not null,
    constraint fk__tracking__user
        foreign key (user_id) references user (user_id)
);
