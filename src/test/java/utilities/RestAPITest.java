package utilities;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RestAPITest {

    public static void main(String[] args){
        /*
         * Make get yard api call
         Request:
             1. URL --> Base Url;  Endpoint Url  --> http://3.137.169.132/en-us/api/v2/yards/1/
             2. Headers  -> Autorization(Token), Accept(application/json)
             2. Method --> GET

         Response :
           1.Status code 200OK
           2.Json Data

              */


     Response response= given().baseUri("http://3.137.169.132/en-us/api/v2")
                .and().header("Authorization", "Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().header("Accept", "application/json")
                .when().get("/yards/1/");
                   //     .then().log().all();
     System.out.println(response.statusCode());
       System.out.println(response.body().asString());

       /*
       POST call :
           Request:
                  1.URL --> Base Url;  Endpoint Url  --> http://3.137.169.132/en-us/api/v2/yards/1/
             2. Headers  -> Autorization(Token), Content- Type(application/json), Accept(application/json)
             3.Payload/Body -> json
             2. Method --> POST

  Response :
           1.Status code: 201 OK
           2.Body ->json
        */
        Response postResponse = given().baseUri("http://3.137.169.132/en-us/api/v2")
                .and().header("Authorization", "Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().accept("application/json")
                .and().contentType("application/json")
                .and().body("{\n" +
                        "    \"id\": 63,\n" +
                        "    \"contacts\": [],\n" +
                        "    \"name\": \"Y63\",\n" +
                        "    \"location\": \"Nicoleta29\",\n" +
                        "    \"status\": \"active\",\n" +
                        "    \"address\": \"23 dee\",\n" +
                        "    \"apt_suite_company_co\": \"\",\n" +
                        "    \"city\": \"Chicago\",\n" +
                        "    \"state\": \"IL\",\n" +
                        "    \"zip_code\": \"60630\",\n" +
                        "    \"spots\": 244455,\n" +
                        "    \"warning\": \"\",\n" +
                        "    \"notes\": \"\"\n" +
                        "}")
                .when().post("/yards/");

        System.out.println(postResponse.statusCode());
        System.out.println(postResponse.body().asString());


 /*
       PATCH call :
           Request:
                  1.URL --> Base Url;  Endpoint Url  --> http://3.137.169.132/en-us/api/v2/yards/1/
             2. Headers  -> Autorization(Token), Content- Type(application/json), Accept(application/json)
             3.Payload--> json
             2. Method --> PATCH

  Response :
           1.Status code: 200 OK
           2.Body ->json
        */

Response updateResponse =given().baseUri("http://3.137.169.132/en-us/api/v2")
        .and().header("Authorization", "Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
        .and().accept("application/json")
        .and().contentType("application/json")
        .and().body("{\n" +
                "    \"id\": 63,\n" +
                "    \"contacts\": [],\n" +
                "    \"name\": \"Y63\",\n" +
                "    \"location\": \"Nicoleta29\",\n" +
                "    \"status\": \"active\",\n" +
                "    \"address\": \"23 dee\",\n" +
                "    \"apt_suite_company_co\": \"\",\n" +
                "    \"city\": \"Chicago\",\n" +
                "    \"state\": \"IL\",\n" +
                "    \"zip_code\": \"60630\",\n" +
                "    \"spots\": 244455,\n" +
                "    \"warning\": \"\",\n" +
                "    \"notes\": \"\"\n" +
                "}")
        .when().patch("/yards/63/");


        System.out.println(updateResponse.statusCode());
        System.out.println(updateResponse.body().asString());


}
}