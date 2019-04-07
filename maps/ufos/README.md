This project displays a map that shows UFO sightings.

The data is stored in the `ufo-data.csv` file, but could also come from Datastore or some other database. The data is loaded and formatted into JSON in `UfoDataServlet`, and `index.html` contains JavaScript that fetches this data and adds it to a map using the Google Maps API.

You can run this locally by executing this command:

```
mvn appengine:devserver
```

![UFO data on map](screenshot-1.png)

![UFO data on map](screenshot-2.png)

Learn more at [HappyCoding.io/tutorials/google-cloud/maps](https://happycoding.io/tutorials/google-cloud/maps).