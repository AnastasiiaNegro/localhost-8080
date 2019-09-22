import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void positiveResultForDivision() {
        OperationResult expectedResult = new OperationResult("division", "50.0", "5.0", "10.0");
        OperationResult actualResult = given()
                .params("one", "50")
                .params("two", "5")
                .when()
                .get("http://localhost:8080/division")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultForDivision1() {
        OperationResult expectedResult = new OperationResult("division", "-10.0", "5.0", "-2.0");
        OperationResult actualResult = given()
                .params("one", "-10")
                .params("two", "5")
                .when()
                .get("http://localhost:8080/division")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultForDivision2() {
        OperationResult expectedResult = new OperationResult("division", "-10.0", "-2.0", "5.0");
        OperationResult actualResult = given()
                .params("one", "-10")
                .params("two", "-2")
                .when()
                .get("http://localhost:8080/division")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultForDivision3() {
        OperationResult expectedResult = new OperationResult("division", "10.0", "3.0", "3.3333333333333335");
        OperationResult actualResult = given()
                .params("one", "10")
                .params("two", "3")
                .when()
                .get("http://localhost:8080/division")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultForDivision4() {
        OperationResult expectedResult = new OperationResult("division", "0.0", "10.0", "0.0");
        OperationResult actualResult = given()
                .params("one", "0")
                .params("two", "10")
                .when()
                .get("http://localhost:8080/division")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultForDivision5() {
        OperationResult expectedResult = new OperationResult("division", "-5.0", "2.3", "-2.173913043478261");
        OperationResult actualResult = given()
                .params("one", "-5")
                .params("two", "2.3")
                .when()
                .get("http://localhost:8080/division")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeResultForDivision() {
        OperationResult expectedResult = new OperationResult("division", "5.0", "0.0", "Infinity");
        OperationResult actualResult = given()
                .params("one", "5")
                .params("two", "0")
                .when()
                .get("http://localhost:8080/division")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }
 //Умножение не умножает, а выполняет деление
    @Test
    public void positiveResultForMultiply() {
        OperationResult expectedResult = new OperationResult("multiply", "5.0", "5.0", "1.0");
        OperationResult actualResult = given()
                .params("one", "5")
                .params("two", "5")
                .when()
                .get("http://localhost:8080/multiply")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormMltiply1() {
        OperationResult expectedResult = new OperationResult("multiply", "5.0", "0.0", "Infinity");
        OperationResult actualResult = given()
                .params("one", "5")
                .params("two", "0")
                .when()
                .get("http://localhost:8080/multiply")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormMltiply2() {
        OperationResult expectedResult = new OperationResult("multiply", "5.0", "2.5", "2.0");
        OperationResult actualResult = given()
                .params("one", "5")
                .params("two", "2.5")
                .when()
                .get("http://localhost:8080/multiply")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormMltiply3() {
        OperationResult expectedResult = new OperationResult("multiply", "-5.0", "-4.5", "1.1111111111111112");
        OperationResult actualResult = given()
                .params("one", "-5")
                .params("two", "-4.5")
                .when()
                .get("http://localhost:8080/multiply")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormMltiply4() {
        OperationResult expectedResult = new OperationResult("multiply", "-1.0", "0.5", "-2.0");
        OperationResult actualResult = given()
                .params("one", "-1")
                .params("two", "0.5")
                .when()
                .get("http://localhost:8080/multiply")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormAdd() {
        OperationResult expectedResult = new OperationResult("Addition", "5.0", "5.0", "10.0");
        OperationResult actualResult = given()
                .params("one", "5")
                .params("two", "5")
                .when()
                .get("http://localhost:8080/add")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormAdd1() {
        OperationResult expectedResult = new OperationResult("Addition", "-1.0", "2.0", "1.0");
        OperationResult actualResult = given()
                .params("one", "-1")
                .params("two", "2")
                .when()
                .get("http://localhost:8080/add")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormAdd2() {
        OperationResult expectedResult = new OperationResult("Addition", "-1.0", "-1.0", "-2.0");
        OperationResult actualResult = given()
                .params("one", "-1")
                .params("two", "-1")
                .when()
                .get("http://localhost:8080/add")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormAdd3() {
        OperationResult expectedResult = new OperationResult("Addition", "-1.0", "1.5", "0.5");
        OperationResult actualResult = given()
                .params("one", "-1")
                .params("two", "1.5")
                .when()
                .get("http://localhost:8080/add")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormSubstract() {
        OperationResult expectedResult = new OperationResult("substract", "5.0", "5.0", "0.0");
        OperationResult actualResult = given()
                .params("one", "5")
                .params("two", "5")
                .when()
                .get("http://localhost:8080/substract")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormSubstract1() {
        OperationResult expectedResult = new OperationResult("substract", "-1.0", "2.0", "-3.0");
        OperationResult actualResult = given()
                .params("one", "-1")
                .params("two", "2")
                .when()
                .get("http://localhost:8080/substract")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormSubstract2() {
        OperationResult expectedResult = new OperationResult("substract", "10.0", "-1.0", "11.0");
        OperationResult actualResult = given()
                .params("one", "10")
                .params("two", "-1")
                .when()
                .get("http://localhost:8080/substract")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveResultFormSubstract3() {
        OperationResult expectedResult = new OperationResult("substract", "10.0", "-15.5", "25.5");
        OperationResult actualResult = given()
                .params("one", "10")
                .params("two", "-15.5")
                .when()
                .get("http://localhost:8080/substract")
                .as(OperationResult.class);
        assertEquals(expectedResult, actualResult);
    }
}
