# NAGP Assignment 

Code Repository Link: https://github.com/Atulkush/NAGP_Assignment_3152143.git

Docker Hub URL : https://hub.docker.com/r/atulkushwaha/spring-web-nagp/tags

Docker Hub image used for Rest API: [atulkushwaha/spring-web-nagp:4.0] (https://hub.docker.com/layers/atulkushwaha/spring-web-nagp/4.0/images/sha256-36ef0ed0161fae64992af1380294c0fb37e8007245c5453591096d6c77ea2c89?context=explore)

Docker Hub image pull command: docker pull atulkushwaha/spring-web-nagp:4.0

URL Service to Fetch Database Record: http://**EXTERNALIP**:8080/projects


# Code Structure

[Web folder](https://github.com/Atulkush/NAGP_Assignment_3152143/tree/main/Web) contains code related to Web service which includes dockerfile as well.

Rest [YAML files](https://github.com/Atulkush/NAGP_Assignment_3152143) are placed outside Web folder

Scripts used to create table & insert data is placed in file [SqlScripts.sql](https://raw.githubusercontent.com/Atulkush/NAGP_Assignment_3152143/main/SqlScripts.sql)

Database password is stored in Secret & Database configuration details are added in Config Map.


