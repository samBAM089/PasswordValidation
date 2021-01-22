import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class passwordValidationTest {

    @Test
    public void passwordLengthTester() {
        String password = "hallo";
        int minLength = 6;

        boolean result = passwordValidationApp.longEnough(minLength, password);

        assertEquals(false, result);
    }

    @Test
    public void includeNumberTester(){
        String password = "hallo5";

        boolean result =passwordValidationApp.includeNumber(password);

        assertEquals(true, result);
    }


}
