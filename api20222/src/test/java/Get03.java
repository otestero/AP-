import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Get03 extends BaseUrls  {
@Test
    public void get01(){
    // 1.step: set the url
  //  BaseUrls baseUrls=new BaseUrls();
   // baseUrls.spec.pathParams("first","todos","second",23);
    // String url="https://jsonplaceholder.typicode.com/todos/23";
   spec.pathParams("first","todos","second",23);
    // 3. step set Send to request and get the Respons
    Response response= given().spec(spec).when().get("/{first}/{second}");

    // 4. adım: Do Assertion

    response.then().assertThat().statusCode(200).
            contentType("application/json").
            body("title",equalTo("et itaque necessitatibus maxime molestiae qui quas velit")).
            body("completed",equalTo(false)).
            body("userId",equalTo(2));
//2, yol
    response.then().assertThat().statusCode(200).
            contentType(ContentType.JSON).
            body("title",equalTo("et itaque necessitatibus maxime molestiae qui quas velit"),
                    "completed",equalTo(false),"userId",equalTo(2));

            /*
      Given
          https://jsonplaceholder.typicode.com/todos/23
      When
          User send GET Request to the URL
      Then
          HTTP Status Code should be 200
And
    Response format should be "application/json"
And
    "title" is "et itaque necessitatibus maxime molestiae qui quas velit",
And
    "completed" is false
And
    "userId" is 2
   */
}
}
