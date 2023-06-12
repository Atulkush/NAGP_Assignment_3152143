create database nagp_assignment;
use nagp_assignment;
create table project(
project_id INT NOT NULL AUTO_INCREMENT,
project_name VARCHAR(45),
PRIMARY KEY (project_id)
);
insert into project(project_name) values('Python');
insert into project(project_name) values('AI');
insert into project(project_name) values('Big Data');
insert into project(project_name) values('JAVA');
insert into project(project_name) values('Cloud');