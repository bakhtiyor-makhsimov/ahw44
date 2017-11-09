# ahw44

<h3> Maven plugin to create fat jar </h3>

<h6>Add following dependency and plugin into project POM file (pom.xml)</h6>


&#60;!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-assembly-plugin -->
&#60;dependency>
	&#60;groupId>org.apache.maven.plugins</groupId>
	&#60;artifactId>maven-assembly-plugin</artifactId>
	&#60;version>3.1.0</version>
&#60;/dependency>
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
