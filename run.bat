set projectLocation=D:/02-Projects\Hrms_POM_TestNG
cd %projectLocation%
set classpath=%projectLocation%/src;projectLocation%/lib/*
java org.testng.TestNG %projectLocation%/testng.xml