# ahw44

<h3> Maven plugin to create fat jar </h3>

<h6>Add following dependency and plugin into project POM file (pom.xml)</h6>


&lt;!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-assembly-plugin --&gt;</br>
&lt;dependency&gt;</br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#09;&lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;</br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#09;&lt;artifactId&gt;maven-assembly-plugin&lt;/artifactId&gt;</br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#09;&lt;version&gt;3.1.0&lt;/version&gt;</br>
&lt;/dependency&gt;</br>
----------------</br>
&lt;build&gt;</br>
	&lt;plugins&gt;</br>
		&lt;plugin&gt;</br>
			&lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;</br>
			&lt;artifactId&gt;maven-assembly-plugin&lt;/artifactId&gt;</br>
			&lt;version&gt;3.1.0&lt;/version&gt;</br>
			&lt;configuration&gt;</br>
				&lt;descriptorRefs&gt;</br>
					&lt;descriptorRef&gt;jar-with-dependencies&lt;/descriptorRef&gt;</br>
				&lt;/descriptorRefs&gt;</br>
			&lt;/configuration&gt;</br>
			&lt;executions&gt;</br>
				&lt;execution&gt;</br>
					&lt;id&gt;assemble-all&lt;/id&gt;</br>
					&lt;phase&gt;package&lt;/phase&gt;</br>
					&lt;goals&gt;</br>
						&lt;goal&gt;single&lt;/goal&gt;</br>
					&lt;/goals&gt;</br>
				&lt;/execution&gt;</br>
			&lt;/executions&gt;</br>
		&lt;/plugin&gt;</br>
   &lt;/plugins&gt;</br>
&lt;/build&gt;
