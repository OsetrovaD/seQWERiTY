# seQWERiTY

The beginning of something

## Developer tools

The application has configured automatic restart. As DevTools monitors classpath resources, 
the only way to trigger a restart is to update the classpath. The way in which you cause 
the classpath to be updated depends on the IDE that you are using:

- In Eclipse, saving a modified file causes the classpath to be updated and triggers a restart.

- In IntelliJ IDEA, building the project (`Build → Build Project` or `Meta + F9` hotkey) has the same effect.

- Running `mvn compile` will trigger a restart.
