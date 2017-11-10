# ahw44

<h3> Maven plugin to create fat jar </h3>

<h6>Add following dependency and plugin into project POM file (pom.xml)</h6>


<h6>&lt;!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-assembly-plugin --&gt;</br>
&lt;dependency&gt;</br>
	&#09;&lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;</br>
	&#09;&lt;artifactId&gt;maven-assembly-plugin&lt;/artifactId&gt;</br>
	&#09;&lt;version&gt;3.1.0&lt;/version&gt;</br>
&lt;/dependency&gt;</h6>
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
