package TbLNM.TextBlocks;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
*Important note
By looking on the previous snippets of code, we can shape a best practice for text blocks:
use text blocks only when you have a multiline string; if the string fits a single line of code
(as in the previous snippets), then use an ordinary string literal, since using text blocks
doesn’t add any significant value.
*
* */


public class StringJoiner {
    public static void main(String[] args) {
        String sql = String.join("\n"
                ,"UPDATE \"public\".\"office\""
                ,"SET (\"address_first\", \"address_second\", \"phone\") ="
                ," (SELECT \"public\".\"employee\".\"first_name\","
                ," \"public\".\"employee\".\"last_name\", ?"
                ," FROM \"public\".\"employee\""
                ," WHERE \"public\".\"employee\".\"job_title\" = ?;");

        System.out.println(sql);

        //let's use using stream
        String joiningUdingStream = joinTextBlockUsingStream();
        System.out.println("from stream");
        System.out.println(joiningUdingStream);
        //using multiline text block after jDK 13/15
        String textBlockForMultiLine = multiLineTextBlock();
        System.out.println("\n\nfro multiLine Text Block");
        System.out.println("\n"+textBlockForMultiLine);
    }

    private static String multiLineTextBlock() {
        String sql = """
                Update "public"."office"\s
                SET ("address_first", "address_second", "phone")=
                (SELECT "public"."employee"."first_name",
                "public"."employee". "last_name", ?
                FROM "public"."employee"\s
                Where "public"."employee"."job_title" = ?
                """.indent(4);

        String str = """
                Pint\s"""; //Using triple qoute in single line gives error
        String json = """
                {
                      "widget": {
                        "debug": "on",
                        "window": {
                          "title": "Sample Widget 1",
                          "name": "back_window"
                        },
                        "image": {
                          "src": "image/sw.png"
                        },
                        "text": {
                          "data": "Click Me",
                          "size": 39
                        }
                      }
                    }
                """;

        String yaml = """
                apiVersion: apps/v1
                kind: Deployment
                metadata:
                  name: example-deployment
                spec:
                  replicas: 3
                  selector:
                    matchLabels:
                      app: example
                  template:
                    metadata:
                      labels:
                        app: example
                    spec:
                      containers:
                      - name: example-container
                        image: example-image
                        ports:
                        - containerPort: 8080
                """;
        System.out.println(json);
        System.out.println(yaml);
        return sql;
    }

    private static String joinTextBlockUsingStream() {

        String sql = Stream.of("Update \"public\".\"office\" "
                , "SET (\"address_first\", \"address_second\", \"phone\")="
                , "(SELECT \"public\".\"employee\".\"first_name\","
                , "\"public\".\"employee\". \"last_name\", ?"
        , "FROM \"public\".\"employee\" "
                ,"Where \"public\".\"employee\".\"job_title\" = ?")
                .collect(Collectors.joining("\n"));
        //although IDE is giving  suggestion to convert in String.Join()
        return sql;

    }

}
