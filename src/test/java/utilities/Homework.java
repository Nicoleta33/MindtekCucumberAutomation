package utilities;
import io.restassured.response.Response;

import java.util.concurrent.ThreadLocalRandom;

import static io.restassured.RestAssured.given;

public class Homework {
    public static void main(String[] args) {



        // GET COMPANY API CALL:


//     Response response = given().baseUri("http://3.137.169.132/en-us/api/v2")
//             .and().header("Authorization", "Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
//             .and().header("Accept", "application/json")
//             .when().get("/companies/1/");
//        System.out.println(response.statusCode());
//        System.out.println(response.body().asString());


        //POST CALL:
        long mc_number = ThreadLocalRandom.current().nextLong(1000000000L, 10000000000L);
        long dot_number = ThreadLocalRandom.current().nextLong(1000000000L, 10000000000L);

       // System.out.println("MC Number: " + mc_number);
      //  System.out.println("DOT Number: " + dot_number);
        Response postResponse = given().baseUri("http://3.137.169.132/en-us/api/v2")
                .and().header("Authorization", "Token 9d3994dd2afd7d1d8ae9ecf4d77e45932bb210d6")
                .and().accept("application/json")
                .and().contentType("application/json")
                        .and().body("{\n" +
                        "  \"company_name\": \"Nicole1\",\n" +
                        "  \"company_type\": \"broker company\",\n" +
                        "  \"status\": \"active\",\n" +
                        "  \"mc_number\": \"%d\",\n" +
                        "  \"dot_number\": \"%d\",\n" +
                        "  \"ifta\": false,\n" +
                        "  \"address\": \"1262 Sunshine ave\",\n" +
                        "  \"apt_suite_company_co\": null,\n" +
                        "  \"city\": \"Chicago\",\n" +
                        "  \"state\": \"IL\",\n" +
                        "  \"zip_code\": \"56321\",\n" +
                        "  \"insurance\": \"Geico\",\n" +
                        "  \"producer_address\": \"3456 moon ave\",\n" +
                        "  \"producer_apt_suite_company_co\": null,\n" +
                        "  \"producer_city\": \"Chicago\",\n" +
                        "  \"producer_state\": \"IL\",\n" +
                        "  \"producer_zip_code\": \"89432\",\n" +
                        "  \"policy_effective_day\": null,\n" +
                        "  \"policy_expiration\": null,\n" +
                        "  \"type_of_insurance\": null,\n" +
                        "  \"automobile_liability\": \"\",\n" +
                        "  \"num_of_truck_insured\": null,\n" +
                        "  \"policy_number\": null,\n" +
                        "  \"employer_id_num\": \"95-4234622\",\n" +
                        "  \"billing_address\": null,\n" +
                        "  \"bank_name\": null,\n" +
                        "  \"routing_number\": null,\n" +
                        "  \"account_number\": null,\n" +
                        "  \"president_full_name\": null,\n" +
                        "  \"trucks_in_fleet\": null,\n" +
                        "  \"scac_code\": \"\",\n" +
                        "  \"other_licenses\": false,\n" +
                        "  \"license_name\": null,\n" +
                        "  \"incorporated_in\": null,\n" +
                        "  \"warning\": \"\",\n" +
                        "  \"notes\": null,\n" +
                        "  \"company_picture\": [],\n" +
                        "  \"company_documents\": [],\n" +
                        "  \"contacts\": [\n" +
                        "    {\n" +
                        "      \"phone\": \"895-623-9053\",\n" +
                        "      \"ext\": \"\",\n" +
                        "      \"contact_name\": \"\",\n" +
                        "      \"email\": \"sunshine@gmail.com\",\n" +
                        "      \"fax\": \"\",\n" +
                        "      \"producer_phone\": \"743-252-3421\",\n" +
                        "      \"producer_phone_ext\": \"\",\n" +
                        "      \"producer_contact_name\": \"\",\n" +
                        "      \"producer_email\": \"sunandmoon@gmail.com\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"phone_number\": [\n" +
                        "    {\n" +
                        "      \"phone\": \"895-623-9053\",\n" +
                        "      \"ext\": \"\",\n" +
                        "      \"contact_name\": \"\",\n" +
                        "      \"email\": \"sunshine@gmail.com\",\n" +
                        "      \"fax\": \"\",\n" +
                        "      \"producer_phone\": \"743-252-3421\",\n" +
                        "      \"producer_phone_ext\": \"\",\n" +
                        "      \"producer_contact_name\": \"\",\n" +
                        "      \"producer_email\": \"sunandmoon@gmail.com\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"fax_number\": [\n" +
                        "    {\n" +
                        "      \"fax\": \"\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"email_number\": [\n" +
                        "    {\n" +
                        "      \"email\": \"sunshine@gmail.com\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"producer_email_number\": [\n" +
                        "    {\n" +
                        "      \"producer_email\": \"sunandmoon@gmail.com\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"producer_phone_number\": [\n" +
                        "    {\n" +
                        "      \"producer_phone\": \"743-252-3421\",\n" +
                        "      \"producer_phone_ext\": \"\",\n" +
                        "      \"producer_contact_name\": \"\"\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}")
                        .when().post("/companies/");


        System.out.println(postResponse.statusCode());
        System.out.println(postResponse.body().asString());






    }


}
