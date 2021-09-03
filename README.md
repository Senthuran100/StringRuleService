# String Rule Service
String rule service will return a string  based on the operation. Here the operations are applied in the form of rule.
In order to apply the rule on a string, need to invoke the following endpoint.

For example,

```
GET /reply/1-hello
{
    "data": "0lleh"
}
```

The input string will be comprised of two components, a rule and a string, separated by a dash (-).
Rules always contain a number/s. Each number represents a string operation.

The supported numbers are:

- `1`: reverse the string

   E.g. `kbzw9ru` becomes `ur9wzbk`

- `2`: encode the string via MD5 hash algorithm

   E.g. `kbzw9ru` becomes `0fafeaae780954464c1b29f765861fad`

The numbers are applied in sequence, i.e. the output of the first rule will
serve as the input of the second rule. The numbers can also be repeated,
i.e. a rule of 11 would mean reversing the string twice, resulting in no change to the string.

Giving a few examples,

```
GET /v2/reply/11-hello
{
    "message": "hello"
}
```

In order to find the available rules hit the following endpoint.
```
GET localhost:8080/dynamic-Rule
{"1":"Reverse a String","2":"Get the MD5 of a string"}
```
## Add a New Rule

In order to add a new rule please implement the IStringRule interface and place the configuration
in the application.properties file. Then implement the `shouldApplyRule` and `processString`
method in the newly created class.

## Build project

To build the project, simply run
```
./gradlew build
```

## Start project

To start the project, simply run
```
./gradlew bootRun
```

Once the service started, the endpoint will be available at `localhost:8080`, so you can make request to the service endpoint

```json
GET localhost:8080/dynamic-Rule
{"1":"Reverse a String","2":"Get the MD5 of a string"}
        
GET localhost:8080/reply/1-hello
{"message":"olleh"}

GET localhost:8080/reply/12-hello
{"message":"10e099145e3c91cd94ccb9bdc50d0495"}

GET localhost:8080/reply/31-hello
{"message":"RULE IS NOT VALID"}

GET localhost:8080/reply/hello
{"message":"Message should contain - "}
```

###### Happy Coding...