import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get01 {
    /*
1. POSTMAN, manuel olarak API testi yapmak için kullanılır.
2. API otomasyonda ise REST Assured Library kullanacağız
   REST API kullanmamızın sebebi hem Json hem de Xml olarak kullanılabiliyor olmasıdır.
3. Otomasyon kodlarının yazımı için şu adımları izliyoruz;

    a) -->  Gereksinimleri anlama
    b) -->  Test case'leri yazma
_______ Test case yazımı için Gherkin plugin kullanılacaktır.
_______ Given, Then, And, But gibi keywodler kullanılacaktır.
_______ Given (ön koşullar)
________When (aksiyonlar)
________Then (dönütler, doğrulama, response gibi)
________And (çoklu işlemeler için)

    c) -->  Otomasyonda test kodunun yazımı yapılacak
        1) Set the URL (URl'yi kurmak)
        2) Set the expected Data (beklenen datanın oluşturulması)   """POST, PUT PATCH"""
        3) Type code to send request (talep göndermek için kod yazma)
        4) Do Assertion (doğrulama yapma)
 */
    /*
    Given
            https://restful-booker.herokuapp.com/booking/3  // end poınt
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
     */

    @Test
public void get01(){
//        1) Set the URL (URl'yi kurmak)
        String url= "https://restful-booker.herokuapp.com/booking/3";

//        2) Set the expected Data (beklenen datanın oluşturulması)   """POST, PUT PATCH"""

//        3) Type code to send request (talep göndermek için kod yazma)
       Response response= given().when().get(url);

     //  System.out.println("response = " + response); bunun yerine bunu kullanırız
      //  response.prettyPrint();
//        4) Do Assertion (doğrulama yapma)
response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");

//status code yazdırma        
System.out.println("response.statuscode = " + response.statusCode());
//Content type
        System.out.println("response.contentType() = " + response.contentType());
        System.out.println("response.statusLine() = " + response.statusLine());
        System.out.println("response.headers() = " + response.headers());
        System.out.println("response.getTime() = " + response.getTime());




    }

}
