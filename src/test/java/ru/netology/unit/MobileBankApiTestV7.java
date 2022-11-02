package ru.netology.unit;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MobileBankApiTestV7 {

    @Test
    void shouldReturnDemoAccountsRUB() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200)
                // специализированные проверки - лучше
                .body("[0].currency", equalTo("RUB"))
        ;
    }

    @Test
    void shouldReturnDemoAccountsUSD() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200)
                // специализированные проверки - лучше
                .body("[1].currency", equalTo("USD"))
        ;
    }

//    @Test
//    void shouldReturnDemoAccountsRUR() {
//        // Given - When - Then
//        // Предусловия
//        given()
//                .baseUri("http://localhost:9999/api/v1")
//                // Выполняемые действия
//                .when()
//                .get("/demo/accounts")
//                // Проверки
//                .then()
//                .statusCode(200)
//                // специализированные проверки - лучше
//                .body("[1].currency", equalTo("RUR"))
//        ;
//    }
}
