This project contains a "hello world" translation example.

The `pom.xml` file defines a main class and some properties that allow us to run via Maven in the command line. The `TranslationHelloWorld` class fetches the translation of a hard-coded string.

```java
Translate translate = TranslateOptions.getDefaultInstance().getService();

String originalText = "Happy coding!";

Translation translation =
    translate.translate(originalText, TranslateOption.targetLanguage("es"));
String translatedText = translation.getTranslatedText();

System.out.println(translatedText);
```

To run this example, first make sure your `GOOGLE_APPLICATION_CREDENTIALS` environment variable is set and that you've enabled the [Translation API](https://console.cloud.google.com/apis/library/translate.googleapis.com), and then execute this command:

```
mvn clean compile exec:java
```

Learn more at [HappyCoding.io/tutorials/google-cloud/translation](https://happycoding.io/tutorials/google-cloud/translation).