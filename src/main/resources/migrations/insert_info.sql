insert into employees(name, surname, patronic, birthday, sex, telephone, git_url, contacts)
VALUES ('Петр', 'Петров', 'Петрович', '1986-12-12', 'мужчина', '+375(29)123-45-67', 'http://github.com/petya', 'petrovich@gmail.com');
insert into employees(name, surname, patronic, birthday, sex, telephone, git_url, contacts)
VALUES('Иван', 'Иванов', 'Иванович', '1997-04-04', 'M', '+375(29)87-65-43', 'http://github.com/vanya', 'skype:ivanko');
insert into employees(name, surname, patronic, birthday, sex, telephone, git_url, contacts)
VALUES('Мария', 'Морская', 'Васильевна', '1999-11-07', 'Ж', '+375(29)999-99-99', null, 'https://www.linkedin.com/in/mariya/');

insert into technology(name) values ('Git');
insert into technology(name) values ('SpringBoot');
insert into technology(name) values ('HTML');
insert into technology(name) values ('Java Core');
insert into technology(name) values ('Java EE');
insert into technology(name) values ('Maven');
insert into technology(name) values ('REST');
insert into technology(name) values ('Spring');

insert into employee_technology(employee_id, technology_id) VALUES ('4', '1');
insert into employee_technology(employee_id, technology_id) VALUES ('4', '2');
insert into employee_technology(employee_id, technology_id) VALUES ('4', '3');
insert into employee_technology(employee_id, technology_id) VALUES ('5', '1');
insert into employee_technology(employee_id, technology_id) VALUES ('5', '5');
insert into employee_technology(employee_id, technology_id) VALUES ('5', '4');
insert into employee_technology(employee_id, technology_id) VALUES ('6', '6');
insert into employee_technology(employee_id, technology_id) VALUES ('6', '7');
insert into employee_technology(employee_id, technology_id) VALUES ('6', '8');