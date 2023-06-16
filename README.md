# NAGP Assignment 

Code Repository Link: https://github.com/Atulkush/NAGP_docker.git

Docker Hub URL : https://hub.docker.com/r/atulkushwaha/spring-web-nagp/tags

Docker Hub image used for Rest API: atulkushwaha/spring-web-nagp:4.0

Docker Hub image pull command: docker pull atulkushwaha/spring-web-nagp:4.0

URL Service to Fetch Database Record: http://**EXTERNALIP**:8080/projects


# Code Structure

Web folder contains code related to Web service which includes dockerfile as well.

Rest YAML files are placed outside Web folder

Scripts used to create table & insert data is placed in file [SqlScripts.sql](https://raw.githubusercontent.com/Atulkush/NAGP_docker/main/SqlScripts.sql)

Database password is stored in Secret & Database configuration details are added in Config Map.


