package tests;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.path.json.JsonPath.from;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Ali on 15/12/2017.
 */
public class ApiTests {

    @Before
    public void setBaseUri(){
        RestAssured.baseURI = "https://swapi.co/api/";
    }

    @Test
    public void getFilms() {
        String response = get("people/").asString();
//        ArrayList<String> result = from(response).get("results");
        String name = from(response).get("results[0].name");

        System.out.println(name);
//        List<String> filmsList = from(response).get("results.findAll {it.name=='Luke Skywalker'}.films[0]");
//        System.out.println(filmsList);

    }



}
