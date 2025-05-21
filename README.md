# Setting up a new Gradle Project using CLI

```
gradle init --use-defaults --type java-application
```
The above command will setup a basic gradle project.

To prepare a jar which is executable, we need to add manifest properties in `build.gradle` to identify which is the main class to execute.

```groovy
jar {
    manifest {
        attributes(
                'Main-Class': 'org.example.Main'
        )
    }
} 
```

```
gradlew build
```
The above command used to build your project.

```
gradlew jar
```
The above command used to create a new jar file of your project in `build/libs` folder.

```
java -jar ./build/libs/filename.jar
```
The above command will execute your code.