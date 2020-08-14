# EmployeeRestApi

1. Download project on local file system
2. Import as existing project in eclipse
3. change path in application.properties 
	for spring.datasource.url=jdbc:h2:file:/<Your-file-system-path> e.g. C:/data/demo
	This is used to store H2 database data on file system, so that on every tomcat initialization,data won't be deleted, rather preserved on file system
	
UserController
---------------
1. This call contains code to call dummy rest api on internet with its certificate.
2. Download certificate from browser using url https://reqres.in/.It will be stored as .cer file
3. Create a new cacerts file or use same file from installed java.Since we are using embeded tomcat, it will use eclipse's default JRE.C:\Program Files\Java\jdk-11\lib\security
4. you can use cacerts file from above location to import certificate
5. I have created new caerts file like below.I have run below com,and from "Documemnts" folder where I have kept downloaded .cer file
keytool -import -trustcacerts -file "DummyServiceCertficate.cer" -alias "SAP_cer_alias" -keystore cacerts -storepass changeit
6. It will create caerts file with password "changeit"
7. Copy that file under resources folder and connect securly to server.See this controller for more info
