import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordGeneratorTest
{
    @Test
    public void generatePasswordTest()
    {
        PasswordGenerator generator = new PasswordGenerator();
        Assertions.assertEquals(generator.generatePassword(5).getValue().length(), 5);
    }



}
