package sky.pro.homeworktest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserTest {
    @BeforeAll
    private static void beforeAll() {
        System.out.println("Тестирование начато");
    }

    @Test
    public void testUserConstructor() {
        final String LOGIN = "login";
        final String EMAIL = "email";

        User user = new User(LOGIN, EMAIL);

        String userLogin = user.getLogin();
        String userEmail = user.getEmail();

        Assertions Assert = null;
        Assert.assertEquals(LOGIN, userLogin);
        Assert.assertEquals(EMAIL, userEmail);
    }

    @AfterAll
    private static void afterAll() {
        System.out.println("Тестирование пройдено");
    }
}