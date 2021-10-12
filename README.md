# seQWERiTY

The beginning of something

## Local development

### Developer tools

The application has configured automatic restart. As DevTools monitors classpath resources, 
the only way to trigger a restart is to update the classpath. The way in which you cause 
the classpath to be updated depends on the IDE that you are using:

- In Eclipse, saving a modified file causes the classpath to be updated and triggers a restart.

- In IntelliJ IDEA, building the project (`Build → Build Project` or `Meta + F9` hotkey) has the same effect.

- Running `mvn compile` will trigger a restart.

### Development environment

There is a Docker compose file in the `dev` directory that will run all the dependencies required 
to run the application. Just `cd` into the directory and run `docker-compose up --build -d`.

The compose file will run the following services:

- MongoDB 5.0.3
  - port: 27017
  - user: seQWERiTY
  - password: paSSw0rd
