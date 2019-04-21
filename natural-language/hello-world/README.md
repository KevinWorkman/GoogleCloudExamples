This project contains a "hello world" sentiment analysis example.

The `pom.xml` file defines a main class and some properties that allow us to run via Maven in the command line. The `NaturalLanguageHelloWorld` class fetches the sentiment analysis of a hard-coded string.

```java
String text = "I love coding!";
Document doc = Document.newBuilder()
    .setContent(text).setType(Type.PLAIN_TEXT).build();

LanguageServiceClient languageService = LanguageServiceClient.create();
Sentiment sentiment = languageService.analyzeSentiment(doc).getDocumentSentiment();
languageService.close();

System.out.println("Score: " + sentiment.getScore());
```

To run this example, first make sure your `GOOGLE_APPLICATION_CREDENTIALS` environment variable is set and that you've enabled the [Natural Language API](https://console.developers.google.com/apis/library/language.googleapis.com), and then execute this command:

```
mvn clean compile exec:java
```

Learn more at [HappyCoding.io/tutorials/google-cloud/natural-language](https://happycoding.io/tutorials/google-cloud/natural-language).

