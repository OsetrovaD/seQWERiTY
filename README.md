[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=OsetrovaD_seQWERiTY&metric=alert_status)](https://sonarcloud.io/dashboard?id=OsetrovaD_seQWERiTY)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=OsetrovaD_seQWERiTY&metric=bugs)](https://sonarcloud.io/dashboard?id=OsetrovaD_seQWERiTY)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=OsetrovaD_seQWERiTY&metric=code_smells)](https://sonarcloud.io/dashboard?id=OsetrovaD_seQWERiTY)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=OsetrovaD_seQWERiTY&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=OsetrovaD_seQWERiTY)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=OsetrovaD_seQWERiTY&metric=ncloc)](https://sonarcloud.io/dashboard?id=OsetrovaD_seQWERiTY)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=OsetrovaD_seQWERiTY&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=OsetrovaD_seQWERiTY)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=OsetrovaD_seQWERiTY&metric=security_rating)](https://sonarcloud.io/dashboard?id=OsetrovaD_seQWERiTY)

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
  - database: seQWERiTY

Also, there are files with `-standalone` suffix that will help you if you don't use Docker.
