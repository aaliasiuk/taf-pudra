package tests.api;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import pages.Objects;
import static io.restassured.RestAssured.given;

public class RestTest {
    @Test
    public void testLoginWithInvaidCreds(){
        Objects object = new Objects();
        given().
                headers(object.getHeaders()).
                formParams(object.getFormParams()).
        when().post(object.endPoint).
                then().
        assertThat().
                statusCode(200).
                body("code", equalTo(1002)).
                body("message",equalTo("ERROR"));
    }
}
