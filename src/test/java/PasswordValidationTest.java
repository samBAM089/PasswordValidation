import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    @Test
    public void passwordLengthTester() {
        String password = "hallo";
        int minLength = 6;

        boolean result = PasswordValidationApp.longEnough(minLength, password);

        assertEquals(false, result);
    }

    @Test
    public void includeNumberTester(){
        String password = "hallo5";

        boolean result =PasswordValidationApp.includeNumber(password);

        assertEquals(true, result);
    }


}
