package api;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static helpers.Config.baseUrl;
import static io.restassured.RestAssured.given;

public class UserApi {
    @Step("Запрос GET | метод /users")
    public ValidatableResponse requestGetUserList() {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(baseUrl + "api/users?page=2")
                .then().log().all()
                .assertThat().statusCode(200); //вынести в спецификации
    }
}