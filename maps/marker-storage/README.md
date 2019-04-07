This project displays a map that shows editable markers when the user clicks.

The data is stored in Datastore. `MarkerServlet` handles requests to fetch or store data, which `index.html` uses to build the UI.

You can run this locally by executing this command:

```
mvn appengine:devserver
```

![map showing editable marker](screenshot.png)

Learn more at [HappyCoding.io/tutorials/google-cloud/maps](https://happycoding.io/tutorials/google-cloud/maps).