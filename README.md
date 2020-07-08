# EmployeeRestApi

1. Download project on local file system
2. Import as existing project in eclipse
3. change path in application.properties 
	for spring.datasource.url=jdbc:h2:file:/<Your-file-system-path> e.g. C:/data/demo
	This is used to store H2 database data on file system, so that on every tomcat initialization,data won't be deleted, rather preserved on file system