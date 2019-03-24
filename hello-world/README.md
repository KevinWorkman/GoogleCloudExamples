This project contains a barebones example webapp.

This project contains 4 files:

- **`pom.xml`** is a Maven [POM file](https://maven.apache.org/pom.html) and defines our project.
- `src/main/` is a directory that contains our code.
- `webapp/` is a directory that contains web files.
  - **`index.html`** is an HTML file that shows static content.
- `WEB-INF/` is a directory that contains files we don't want users to access, like config files.
  - **`appengine-web.xml`** is a config file that sets up our App Engine deployment.
- `java/` is a directory that contains our server-side code.
  - `io.happycoding.servlets` is a Java package.
    - **`HelloWorldServlet.java`** is a Java servlet that runs server-side code and returns some HTML content.

You can run this locally by executing this command:

```
mvn appengine:devserver
```

Learn more at [HappyCoding.io/tutorials/google-cloud/setup](https://happycoding.io/tutorials/google-cloud/setup).