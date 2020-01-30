This project uses Blobstore to allow the user to upload an image.

To try this project, run this command:

```
mvn appengine:devserver
```

And then navigate to `http://localhost:8080/home`.

![form](screenshot-1.png)

![uploaded image](screenshot-2.png)

For simplicity it prints HTML directly from `HomeServlet` to demonstrate constructing a form that submits to the Blobstore URL. This is not how you'd do this in real life. (See the `blobstore/hello-world-jsp` and `blobstore/hello-world-fetch` examples for more info.)

Learn more at [HappyCoding.io/tutorials/google-cloud/blobstore](https://happycoding.io/tutorials/google-cloud/blobstore).