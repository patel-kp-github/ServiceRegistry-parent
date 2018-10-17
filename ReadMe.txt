#created parent pom prject
mvn archetype:generate -DgroupId=com.spring.cloud -DartifactId=ServiceRegistry-parent
#cd ServiceRegistry-parent
#crearted server project
mvn archetype:generate -DgroupId=com.spring.cloud -DartifactId=Server
#created client poject
mvn archetype:generate -DgroupId=com.spring.cloud -DartifactId=Client
#run server
#run client
