# ahw44

<h3> Maven plugin to create fat jar </h3>

<h6>Add following dependency and plugin into project POM file (pom.xml)</h6>


<h6>&lt;!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-assembly-plugin -->
&lt;dependency>
	&lt;groupId>org.apache.maven.plugins</groupId>
	&lt;artifactId>maven-assembly-plugin</artifactId>
	&lt;version>3.1.0</version>
&lt;/dependency></h6>
----------------
<build>
	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-assembly-plugin</artifactId>
			<version>3.1.0</version>
			<configuration>
				<descriptorRefs>
					<descriptorRef>jar-with-dependencies</descriptorRef>
				</descriptorRefs>
			</configuration>
			<executions>
				<execution>
					<id>assemble-all</id>
					<phase>package</phase>
					<goals>
						<goal>single</goal>
					</goals>
				</execution>
			</executions>
		</plugin>
   </plugins>
</build>
